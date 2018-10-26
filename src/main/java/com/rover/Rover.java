package com.rover;

import java.util.Collection;

public class Rover implements PhysicalObject {
	
	private Grid grid;
	
	public Rover() {
	}
	
	public Position take(Collection<Cmd> cmds) {
		cmds.forEach((cmd) -> {
			this.grid.register(this, cmd.execute(this, this.grid));
		});
		return getPosition();
	}
	
	public void land(Grid grid, Position initialPosition ) {
		this.grid = grid;
		this.grid.register(this,initialPosition);
	}
	
	public Position getPosition() {
		return this.grid.getPosition(this);
	}
}
