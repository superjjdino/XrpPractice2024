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

    private static CommandXboxController xboxController;


    
    public static void initialize(){
        arm = Arm.getInstance();
        xboxController = new CommandXboxController(XBOX_CONTROLLER_PORT);
    }
    //I think I need an initialization of the classes with getinstance or whatever.
public RobotContainer(){
    //way to set the angle
    xboxController.a().onTrue(new ArmCommand(135));


}

    
}
