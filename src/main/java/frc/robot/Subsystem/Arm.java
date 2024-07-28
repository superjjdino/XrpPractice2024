package frc.robot.Subsystem;

import static frc.robot.utility.Constants.*;

import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Arm extends SubsystemBase {
    // make the objects for the arm 
    public static XRPServo armServo;
    private static Arm arm;

    public Arm(){
        armServo = new XRPServo(ARM_SERVO_PORT);

    }
// figure out how to do
    public void setArmVelocity(DoubleSupplier velocity){
        // armServo.
    }
    //do I need 

    public void setAngle(double angle){
        armServo.setAngle(angle);
        
    }

    public static Arm getInstance(){
        if (arm==null){
            arm = new Arm();

        }
        return arm;
    }





    
}
