package org.usfirst.frc.team245.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;
import org.usfirst.frc.team245.robot.Constants;

public class Actuators {

	private static CANTalon leftFrontDriveMotor;
	private static CANTalon leftRearDriveMotor;
	private static CANTalon rightFrontDriveMotor;
	private static CANTalon rightRearDriveMotor;
	
	public static void init() {
		CANTalon leftFrontDriveMotor = new CANTalon(Constants.LEFT_FRONT_DRIVE_MOTOR_PORT);
		CANTalon leftRearDriveMotor = new CANTalon(Constants.LEFT_REAR_DRIVE_MOTOR_PORT);
		CANTalon rightFrontDriveMotor = new CANTalon(Constants.RIGHT_FRONT_DRIVE_MOTOR_PORT);
		CANTalon rightRearDriveMotor = new CANTalon(Constants.RIGHT_REAR_DRIVE_MOTOR_PORT);
	}
	public static CANTalon getLeftFrontDriveMotor() {
		return leftFrontDriveMotor;
	}
	public static CANTalon getLeftRearDriveMotor() {
		return leftRearDriveMotor;
	}
	public static CANTalon getRightFrontDriveMotor() {
		return rightFrontDriveMotor;
	}
	public static CANTalon getRightRearDriveMotor() {
		return rightRearDriveMotor;
	}
}
