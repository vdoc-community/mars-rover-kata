package com.rover.impls;

import com.rover.AbstractMoveStrategy;
import com.rover.Position;

public class WestMoveStrategy extends AbstractMoveStrategy {
	
	public Position forward(Position position) {
		return new Position(position.getX() - 1, position.getY(), position.getOrientation());
	}
	
	@Override
	public Position backward(Position position) {
		return new Position(position.getX() + 1, position.getY(), position.getOrientation());
	}
}
