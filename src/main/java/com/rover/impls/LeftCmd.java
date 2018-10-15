package com.rover.impls;

import com.rover.Cmd;
import com.rover.Position;
import com.rover.Rotation;

public class LeftCmd implements Cmd {
	
	@Override
	public Position execute(Position position) {
		return new Position(position.getX(), position.getY(), Rotation.getLeft(position.getOrientation()));
	}
}
