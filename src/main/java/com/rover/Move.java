package com.rover;

import com.rover.impls.EastMoveStrategy;
import com.rover.impls.NorthMoveStrategy;
import com.rover.impls.SouthMoveStrategy;
import com.rover.impls.WestMoveStrategy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Move {
	
	private static final Map<Orientation,AbstractMoveStrategy> MOVE;

	
	static {
		Map<Orientation,AbstractMoveStrategy> moveForward = new HashMap<>();
		moveForward.put(Orientation.NORTH, new NorthMoveStrategy());
		moveForward.put(Orientation.WEST, new WestMoveStrategy());
		moveForward.put(Orientation.SOUTH, new SouthMoveStrategy());
		moveForward.put(Orientation.EAST, new EastMoveStrategy());
		MOVE = Collections.unmodifiableMap(moveForward);
	}
	
	public static Position getForward(Position position){
		return MOVE.get(position.getOrientation()).forward(position);
	}
	
	public static Position getBackward(Position position){
		return MOVE.get(position.getOrientation()).backward(position);
	}

}
