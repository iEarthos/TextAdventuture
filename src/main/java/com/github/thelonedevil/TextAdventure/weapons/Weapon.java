package com.github.thelonedevil.TextAdventure.weapons;

import lombok.Getter;

public class Weapon {
	@Getter
	int Power;

	Weapon(int power) {
		this.Power = power;
	}
}
