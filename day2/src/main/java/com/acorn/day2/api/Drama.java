package com.acorn.day2.api;

import lombok.Data;

@Data
public class Drama {
	String name;
	String actor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Drama [name=" + name + ", actor=" + actor + "]";
	}

}
