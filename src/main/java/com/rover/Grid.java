package com.rover;

import java.util.HashMap;
import java.util.Map;

public class Grid {
	
	public static final Integer MIN_WIDTH = 1;
	public static final Integer MIN_HEIGHT = 1;
	private final Integer width;
	private final Integer height;
	private final Map<PhysicalObject,Position> positionedObjects = new HashMap<>();
	
	public Grid(Integer width, Integer height) {
		this.width = Math.max(MIN_WIDTH, width);
		this.height = Math.max(MIN_HEIGHT,height);
	}
	
	public Integer getWidth() {
		return width;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public Position register(PhysicalObject physicalObject, Position position) {
		positionedObjects.put(physicalObject, position);
		return getPosition(physicalObject);
	}
	
	public Position getPosition(PhysicalObject physicalObject) {
		return positionedObjects.get(physicalObject);
	}

}
