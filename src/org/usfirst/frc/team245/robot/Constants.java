package org.usfirst.frc.team245.robot;

public class Constants {

	// port mapping
	// CAN Ports
	// TODO: put in actual port map
	public static final int LEFT_FRONT_DRIVE_MOTOR_PORT = 0;
	public static final int RIGHT_FRONT_DRIVE_MOTOR_PORT = 2;
	public static final int LEFT_REAR_DRIVE_MOTOR_PORT = 1;
	public static final int RIGHT_REAR_DRIVE_MOTOR_PORT = 3;

	public static final boolean LEFT_FRONT_DRIVE_MOTOR_INVERTED = true;
	public static final boolean RIGHT_FRONT_DRIVE_MOTOR_INVERTED = true;
	public static final boolean LEFT_REAR_DRIVE_MOTOR_INVERTED = true;
	public static final boolean RIGHT_REAR_DRIVE_MOTOR_INVERTED = true;

	// PWM Ports
	public static final int LEFT_FLYWHEEL_PORT = 2;
	public static final int RIGHT_FLYWHEEL_PORT = 3;
	
	public static final double MIN_MOTOR_SPEED = -1.0;
	public static final double MAX_MOTOR_SPEED = 1.0;
	
	public static final double MAX_SPEED_FLYWHEEL = 1.0;
	public static final double MIN_SPEED_FLYWHEEL = -1.0;
}
