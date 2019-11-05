/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveWithJoysticks extends Command {

	// Constructor
	public DriveWithJoysticks() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.m_drivetrain);
	}

	@Override
	protected void initialize() {
		// Code...
	}

	@Override
	protected void execute() {
		// Drives the robot with left speed and right speed
		Robot.m_drivetrain.differentialDrive.tankDrive(Robot.m_oi.getLeftSpeed(), Robot.m_oi.getRightSpeed());
	}

	@Override
	protected void end() {
		// Code...
	}

	@Override
	protected void interrupted() {
		// Code...
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}