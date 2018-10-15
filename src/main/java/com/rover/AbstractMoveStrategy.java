package com.rover;

public abstract class AbstractMoveStrategy {
	public abstract Position forward(Position position);
	
	public abstract Position backward(Position position);
}
