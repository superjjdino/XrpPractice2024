package frc.robot.Command;

import edu.wpi.first.wpilibj2.command.Command;
import static frc.robot.utility.Constants.*;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Arm;
public class ArmCommand extends Command {
    
    private Arm arm;
    private double angle;

    public ArmCommand(double angle){
        this.angle = angle;
        arm = Arm.getInstance();
        addRequirements(arm);
    }

    public void initialize(){
        arm.setAngle(angle);

    }
    
    
    
}
