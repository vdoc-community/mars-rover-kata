package com.rover;

import com.rover.impls.DummyCmd;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

class GridTest {
	
	public static final int DEFAULT_GRID_WIDTH = 10;
	public static final int DEFAULT_GRID_HEIGHT = 10;
	private Grid grid;
	
	@BeforeEach
	public void before(){
		this.grid = new Grid(DEFAULT_GRID_WIDTH, DEFAULT_GRID_HEIGHT);
	}
	
	@Test
	public void constructorTest() {
		new Grid(1,1);
	}
	
	@Test
	public void constructorFailTest() {
		Grid grid = new Grid(0,-1);
		Assert.assertEquals(Grid.MIN_WIDTH, grid.getWidth());
		Assert.assertEquals(Grid.MIN_HEIGHT, grid.getHeight());
	}
	
	@Test
	public void registerTest() {
		PhysicalObject physicalObject = new Rover();
		Assert.assertEquals(RoverTest.INITIAL_POSITION, grid.register(physicalObject, RoverTest.INITIAL_POSITION));
	}
	

}