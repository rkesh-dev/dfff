package com.dp.demos.model.pet;

import java.math.BigDecimal;

public class Pet {

	private BigDecimal cost;

	private String name;

	private PetType type;

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

}
