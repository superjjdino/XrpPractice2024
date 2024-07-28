package frc.robot.utility;

import frc.robot.Subsystem.*;
import frc.robot.utility.*;
import frc.robot.XRPDrivetrain;
import frc.robot.Command.*;

import static frc.robot.utility.Constants.*;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {

    private static Arm arm;
    private static XRPDrivetrain drivetrain;

    private XboxController xboxController = new XboxController(XBOX_CONTROLLER_PORT);

    //I think I need an initialization of the classes with getinstance or whatever.
public RobotContainer(){
    arm.setDefaultCommand(null);


}

    
}
