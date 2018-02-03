package com.github.adambots.powerup2018.flywheels;

import org.usfirst.frc.team245.robot.Actuators;
import org.usfirst.frc.team245.robot.Constants;
import org.usfirst.frc.team245.robot.Gamepad;

public class Flywheels {
	
	public static void main (String args[]) {
		
		// TODO: check if it is max and min for each wheel during intake and outtake
		// intake
		if (Gamepad.secondary.getRT()) {
			Actuators.getLeftArmWheel().set(Constants.MAX_SPEED_FLYWHEEL);
			Acutators.getRightArmWheel().set(Constants.MIN_SPEED_FLYWHEEL);
		}
		
		if (Gamepad.secondary.getLT()) {
			Actuators.getLeftArmWheel().set(Constants.MIN_SPEED_FLYWHEEL);
			Actuators.getRightArmWheel().set(Constants.MAX_SPEED_FLYWHEEL);
		}
	}
}
