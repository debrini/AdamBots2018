package org.usfirst.frc.team245.robot;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Solenoid;
import org.usfirst.frc.team245.robot.Constants;

public class Actuators {

	private static VictorSP leftFrontDriveMotor;
	private static VictorSP leftRearDriveMotor;
	private static VictorSP rightFrontDriveMotor;
	private static VictorSP rightRearDriveMotor;
	
	public static void init() {
		VictorSP leftFrontDriveMotor = new VictorSP(Constants.LEFT_FRONT_DRIVE_MOTOR_PORT);
		VictorSP leftRearDriveMotor = new VictorSP(Constants.LEFT_REAR_DRIVE_MOTOR_PORT);
		VictorSP rightFrontDriveMotor = new VictorSP(Constants.RIGHT_FRONT_DRIVE_MOTOR_PORT);
		VictorSP rightRearDriveMotor = new VictorSP(Constants.RIGHT_REAR_DRIVE_MOTOR_PORT);
	}
	public static VictorSP getLeftFrontDriveMotor() {
		return leftFrontDriveMotor;
	}
	public static VictorSP getLeftRearDriveMotor() {
		return leftRearDriveMotor;
	}
	public static VictorSP getRightFrontDriveMotor() {
		return rightFrontDriveMotor;
	}
	public static VictorSP getRightRearDriveMotor() {
		return rightRearDriveMotor;
	}
}
