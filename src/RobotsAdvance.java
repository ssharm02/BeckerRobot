import java.util.ArrayList;

import becker.robots.Direction;
import becker.robots.Intersection;
import becker.robots.Robot;

public class RobotsAdvance {
    public static void main (String [] args){
    }
    
	public static int calculateNextAvenue(Robot robot) {
		Direction direction;
		int modifier;
		
		direction = robot.getDirection();
		if (direction == Direction.EAST) {
			modifier = 1;
		} else if (direction == Direction.WEST) {
			modifier = -1;
		} else {
			modifier = 0;
		}
		return robot.getAvenue() + modifier;	
	}
	
	public static int calculateNextStreet(Robot robot) {
		Direction direction;
		int modifier;
		
		direction = robot.getDirection();
		if (direction == Direction.SOUTH) {
			modifier = 1;
		} else if (direction == Direction.NORTH) {
			modifier = -1;
		} else {
			modifier = 0;
		}
		return robot.getStreet() + modifier;
	}

	public static void turnRobot(Robot robot, Direction direction) {
		while (robot.getDirection() != direction) {
			robot.turnLeft();
		}
	}

	public static boolean isVisited(ArrayList<Intersection> locations,
			int street, int avenue) {
		Intersection element;
		boolean found;
		int size;
		int i;

		found = false;
		size = locations.size();
		i = 0;
		while (i < size && !found) {
			element = locations.get(i);
			if (element.getStreet() == street &&
				element.getAvenue() == avenue) {
				found = true;
			} else {
				i = i + 1;
			}
		}
		return found;
	}

	public static void retrieveLight(Robot robot) {
		ArrayList<Direction> path;
		ArrayList<Intersection> visited;
		Direction direction;
		Intersection current;
		boolean found;
		boolean foundPlace;
		boolean stop;
		int i;

		path = new ArrayList<Direction>();
		visited = new ArrayList<Intersection>();

		found = false;
		stop = false;
		while (!found && !stop) {
			current = robot.getIntersection();
			if (!isVisited(visited, current.getStreet(),
				current.getAvenue())) {
				visited.add(current);
			}
			
			if (robot.canPickThing()) {
				robot.pickThing();
				found = true;
			} else {
				foundPlace = false;
				i = 0;
				while (i < 4 && !foundPlace) {
					if (robot.frontIsClear() &&
						!isVisited(visited,
						calculateNextStreet(robot),
						calculateNextAvenue(robot))) {
						foundPlace = true;
					} else {
						i++;
						robot.turnLeft();
					}
				}

				if (foundPlace) {
					path.add(robot.getDirection());
					robot.move();
				} else if (path.isEmpty()) {
					stop = true;
				} else {
					direction = path.remove(path.size() - 1);
					turnRobot(robot, direction.opposite());
					robot.move();
				}
			}
		}
		
		for (i = path.size() - 1; i >= 0; i--) {
			turnRobot(robot, path.get(i).opposite());
			robot.move();
		}
        }
	}