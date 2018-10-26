package com.rover;

import java.util.Objects;

public class Position {
	
	private final Integer x;
	private final Integer y;
	private final Orientation orientation;
	
	public Position(Integer x, Integer y, Orientation orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	
	public Position(Position position, Orientation orientation){
		this(position.getX(), position.getY(), orientation);
	}
	
	public Integer getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Position position = (Position)o;
		return Objects.equals(x, position.x) && Objects.equals(y, position.y) && orientation == position.orientation;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(x, y, orientation);
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Position{");
		sb.append("x=").append(x);
		sb.append(", y=").append(y);
		sb.append(", orientation=").append(orientation);
		sb.append('}');
		return sb.toString();
	}
}
