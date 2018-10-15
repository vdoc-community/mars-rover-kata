package com.rover.impls;

import com.rover.Cmd;
import com.rover.Move;
import com.rover.Position;

public class BackwardCmd implements Cmd {
	
	@Override
	public Position execute(Position position) {
		return Move.getBackward(position);
	}
}
