package com.rover;

import com.rover.Cmd;
import com.rover.Grid;
import com.rover.Orientation;
import com.rover.Position;
import com.rover.impls.BackwardCmd;
import com.rover.impls.DummyCmd;
import com.rover.Rover;
import com.rover.impls.ForwardCmd;
import com.rover.impls.LeftCmd;
import com.rover.impls.RightCmd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
	
	public static final Position INITIAL_POSITION = new Position(0, 0, Orientation.NORTH);
	public static final Grid DEFAULT_GRID = new Grid(100, 100);
	
	private Rover rover;
	
	@BeforeEach
	public void before(){
		this.rover = new Rover();
		this.rover.land(DEFAULT_GRID, INITIAL_POSITION);
	}
	
	@Test
	public void landTest() {
		this.rover.land(DEFAULT_GRID, INITIAL_POSITION);
		assertEquals(INITIAL_POSITION, this.rover.getPosition());
	}
	
	@Test
	public void takeTest() {
		Cmd cmd = new DummyCmd();
		Position endingRoverPosition = this.rover.take(Collections.singleton(cmd));
		assertEquals(INITIAL_POSITION, endingRoverPosition);
	}
	
	@Test
	public void takeForward(){
		Cmd forwardCmd = new ForwardCmd();
		Position endingRoverPosition = this.rover.take(Collections.singleton(forwardCmd));
		assertEquals(new Position(0,1,Orientation.NORTH), endingRoverPosition);
	}
	
	@Test
	public void takeBackward(){
		Cmd backwardCmd = new BackwardCmd();
		Position endingRoverPosition = this.rover.take(Collections.singleton(backwardCmd));
		assertEquals(new Position(0,-1,Orientation.NORTH), endingRoverPosition);
	}
	
	@Test
	public void takeLeft(){
		Cmd cmd = new LeftCmd();
		Position endingRoverPosition = this.rover.take(Collections.singleton(cmd));
		assertEquals(new Position(0,0,Orientation.WEST), endingRoverPosition);
	}
	
	@Test
	public void takeRight(){
		Cmd cmd = new RightCmd();
		Position endingRoverPosition = this.rover.take(Collections.singleton(cmd));
		assertEquals(new Position(0,0,Orientation.EAST), endingRoverPosition);
	}
	
	@Test
	public void takeFFRF(){
		List<Cmd> cmds = new ArrayList<>();
		cmds.add(new ForwardCmd());
		cmds.add(new ForwardCmd());
		cmds.add(new RightCmd());
		cmds.add(new ForwardCmd());
		Position endingRoverPosition = this.rover.take(cmds);
		assertEquals(new Position(1,2,Orientation.EAST), endingRoverPosition);
	}
	
	@Test
	public void takeBBLB(){
		List<Cmd> cmds = new ArrayList<>();
		cmds.add(new BackwardCmd());
		cmds.add(new BackwardCmd());
		cmds.add(new LeftCmd());
		cmds.add(new BackwardCmd());
		Position endingRoverPosition = this.rover.take(cmds);
		assertEquals(new Position(1,-2,Orientation.WEST), endingRoverPosition);
	}
	
}