package com.rover.impls;

import com.rover.Cmd;
import com.rover.Grid;
import com.rover.Move;
import com.rover.Position;
import com.rover.Rover;

public class ForwardCmd implements Cmd {
	
	@Override
	public Position execute(Rover rover, Grid grid) {
		return Move.getForward(grid.getPosition(rover));
	}
}
