package com.github.adambots.powerup2018.drive;

import org.usfirst.frc.team245.robot.Actuators;
import org.usfirst.frc.team245.robot.Constants;

public class Drive {
	// Left Front  - M0
	// Left Rear   - M1
	// Right Front - M2
	// Right Rear  - M3
	/*
	 * Sets initial conditions for driving
	 * */
	// public static void init(){
	// 	Actuators.getDriveShiftPneumatic().set(false);
	// }
	
	/*
	 * Drives robot with turning ability
	 * @param speed
	 * @param turnSpeed
	 * */
	//TODO: test drive code
	public static void drive(double drive, double rotate, double strafe) {
		
		double leftFrontSpeed = drive + strafe + rotate;
		double leftRearSpeed = drive - strafe + rotate;
		double rightFrontSpeed = drive - strafe - rotate;
		double rightRearSpeed = drive + strafe - rotate;
		Actuators.getLeftFrontDriveMotor().set(leftFrontSpeed);
		Actuators.getLeftRearDriveMotor().set(leftRearSpeed);
		Actuators.getRightFrontDriveMotor().set(rightFrontSpeed);
		Actuators.getRightRearDriveMotor().set(rightRearSpeed);
		
	}
	
	
	
	/* forward
	 * 	set speed of all motors at y value
	 * backward
	 * 	set speed of all motors at -y value
	 * right
	 * 	set speed or LF and RR at x value & LR and RF at -x value
	 * left
	 * 	set speed of LR and RF at x value & LF and RR at -x value
	 * 
	 */

}

