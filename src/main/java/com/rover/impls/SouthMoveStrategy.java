package com.rover.impls;

import com.rover.AbstractMoveStrategy;
import com.rover.Position;

public class SouthMoveStrategy extends AbstractMoveStrategy {
	public Position forward(Position position) {
		return new Position(position.getX(), position.getY() - 1, position.getOrientation());
	}
	
	@Override
	public Position backward(Position position) {
		return new Position(position.getX(), position.getY() + 1, position.getOrientation());
	}
}
