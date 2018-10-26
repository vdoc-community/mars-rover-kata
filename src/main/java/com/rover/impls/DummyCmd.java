package com.rover.impls;

import com.rover.Cmd;
import com.rover.Grid;
import com.rover.Position;
import com.rover.Rover;

public class DummyCmd implements Cmd {
	
	@Override
	public Position execute(Rover rover, Grid grid) {
		return grid.getPosition(rover);
	}
}
