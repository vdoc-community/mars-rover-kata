package com.rover.impls;

import com.rover.Cmd;
import com.rover.Grid;
import com.rover.Position;
import com.rover.Rotation;
import com.rover.Rover;

public class LeftCmd implements Cmd {
	
	@Override
	public Position execute(Rover rover, Grid grid) {
		return new Position(grid.getPosition(rover), Rotation.getLeft(grid.getPosition(rover).getOrientation()));
	}
}
