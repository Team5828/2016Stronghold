// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5828.RoboPats.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5828.RoboPats.Robot;
import org.usfirst.frc5828.RoboPats.RobotMap;

/**
 *
 */
public class DriveReverseAuto extends Command {
	RobotMap robotmap;
	public DriveReverseAuto(RobotMap robotmap){
		this.robotmap = robotmap;
	}
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	double AutonTimer;
	double MotorSpeed;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DriveReverseAuto() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		 AutonTimer = 1;
		 MotorSpeed = -.75;
    }
    
// Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	MotorSpeed = -.75;
    	RobotMap.driveTrainSpeedController1.set(MotorSpeed);
    	RobotMap.driveTrainSpeedController2.set(-MotorSpeed);
    	RobotMap.driveTrainSpeedController3.set(MotorSpeed);
    	RobotMap.driveTrainSpeedController4.set(-MotorSpeed);
	
    	AutonTimer ++;
    }

// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(AutonTimer > 20){
    		return true;
    	} else {
    	return false;
    	}
    }

// Called once after isFinished returns true
    protected void end() {
    	RobotMap.driveTrainSpeedController1.set(-.75);
    	RobotMap.driveTrainSpeedController2.set(-.75);
    	RobotMap.driveTrainSpeedController3.set(-.75);
    	RobotMap.driveTrainSpeedController4.set(-.75);
    }

// Called when another command which requires one or more of the same
// subsystems is scheduled to run
    protected void interrupted() {
    	}
	}
