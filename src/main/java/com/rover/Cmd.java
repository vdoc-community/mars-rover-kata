package com.rover;

public interface Cmd {
	
	Position execute(Rover rover, Grid grid);
	
}
