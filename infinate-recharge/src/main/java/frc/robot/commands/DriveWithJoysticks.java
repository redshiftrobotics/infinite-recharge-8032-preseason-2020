/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveWithJoysticks extends Command {



	public DriveWithJoysticks() {
    	// Use requires() here to declare subsystem dependencies
		requires(Robot.m_driveTrainSubsystem);
	}

	protected void initialize(){
		
	}

	protected void excecute(){
		Robot.m_driveTrainSubsystem.differentialDrive.tankDrive(Robot.m_oi.getLeftSpeed(), Robot.m_oi.getRightSpeed());
	}

	protected void end(){
		
	}

	protected void interrupted(){

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
  
}