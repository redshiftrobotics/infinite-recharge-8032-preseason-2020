package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithJoysticks;

public class DriveTrain extends Subsystem {	

	// Master speed
	double m_speed = -0.5;

	// Left motor group
	Talon m_frontLeft = null;
	Talon m_rearLeft = null;
	SpeedControllerGroup m_left = null;

	// Right motor group
	Talon m_frontRight = null;
	Talon m_rearRight = null;
	SpeedControllerGroup m_right = null;

	// Initialize differential drive
	public DifferentialDrive differentialDrive = null;

	public DriveTrain() {

		// Left motor group
		m_frontLeft = new Talon(RobotMap.m_frontLeft);
		m_rearLeft = new Talon(RobotMap.m_rearLeft);
		m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

		// Right motor group
		m_frontRight = new Talon(RobotMap.m_frontRight);
		m_rearRight = new Talon(RobotMap.m_rearRight);
		m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

		// Initialize differential drive
		differentialDrive = new DifferentialDrive(m_left, m_right);
	}

	public void Drive() {
		differentialDrive.tankDrive(Robot.m_oi.getLeftSpeed() * m_speed, Robot.m_oi.getRightSpeed() * m_speed);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoysticks());
	}
}
