package org.usfirst.frc.team245.robot;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Solenoid;
import org.usfirst.frc.team245.robot.Constants;

public class Actuators {

	private static VictorSP leftFrontDriveMotor;
	private static VictorSP leftRearDriveMotor;
	private static VictorSP rightFrontDriveMotor;
	private static VictorSP rightRearDriveMotor;
	
	public static void init(){
		VictorSP leftFrontDriveMotor = new VictorSP(0);
		VictorSP leftRearDriveMotor = new VictorSP(1);
		VictorSP rightFrontDriveMotor = new VictorSP(2);
		VictorSP rightRearDriveMotor = new VictorSP(3);
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
