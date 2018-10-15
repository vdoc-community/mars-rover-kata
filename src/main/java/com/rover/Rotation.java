package com.rover;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Rotation {
	
	private static final Map<Orientation,Orientation> LEFT_TURN;
	private static final Map<Orientation,Orientation> RIGHT_TURN;

	
	static {
		Map<Orientation,Orientation> leftTurn = new HashMap<>();
		leftTurn.put(Orientation.NORTH, Orientation.WEST);
		leftTurn.put(Orientation.WEST, Orientation.SOUTH);
		leftTurn.put(Orientation.SOUTH, Orientation.EAST);
		leftTurn.put(Orientation.EAST, Orientation.NORTH);
		LEFT_TURN = Collections.unmodifiableMap(leftTurn);
		
		RIGHT_TURN = Collections.unmodifiableMap(leftTurn.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, HashMap.Entry::getKey)));
	}
	
	public static Orientation getLeft(Orientation orientation){
		return LEFT_TURN.get(orientation);
	}
	
	public static Orientation getRight(Orientation orientation) {
		return RIGHT_TURN.get(orientation);
	}
}
