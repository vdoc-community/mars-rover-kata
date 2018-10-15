package com.rover;

import java.util.Collection;

public class Rover {
	
	private Position position;
	
	public Rover(Position position) {
		this.position = position;
	}
	
	public Position take(Collection<Cmd> cmds) {
		cmds.forEach((cmd) -> {
			this.position = cmd.execute(this.position);
		});
		return position;
	}
	
}
