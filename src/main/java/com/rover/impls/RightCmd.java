package com.rover.impls;

import com.rover.Cmd;
import com.rover.Grid;
import com.rover.Position;
import com.rover.Rotation;
import com.rover.Rover;

public class RightCmd implements Cmd {
	
	@Override
	public Position execute(Rover rover, Grid grid) {
		return new Position(grid.getPosition(rover), Rotation.getRight(grid.getPosition(rover).getOrientation()));
	}
}
