package com.rover.impls;

import com.rover.Cmd;
import com.rover.Position;

public class DummyCmd implements Cmd {
	
	@Override
	public Position execute(Position position) {
		return position;
	}
}
