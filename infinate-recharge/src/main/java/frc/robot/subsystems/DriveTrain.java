package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

public class DriveTrain extends Subsystem {

	Talon m_frontLeft = new Talon(RobotMap.m_frontLeft);
	Talon m_frontRight = new Talon(RobotMap.m_frontRight);
	SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_frontRight);


	Talon m_rearLeft = new Talon(RobotMap.m_rearLeft);
	Talon m_rearRight = new Talon(RobotMap.m_rearRight);
	SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

	public DifferentialDrive differentialDrive = new DifferentialDrive(m_left, m_right);

    public void initDefaultCommand() {
		// Do shit
		// Maybe?
    }
}
