package org.firstinspires.ftc.teamcode._02_Actions;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.ShooterParams;
import org.firstinspires.ftc.teamcode._01_Hardware.ShooterHardware;

public class ShooterActions extends ShooterHardware {
    public ShooterActions(HardwareMap hardwareMap) { super(hardwareMap);}
    public void stop(){
        shooterMotor.setPower(0);
    }
    public double getMotorsPower() {
        double power = shooterMotor.getPower();
        return power;
    }
    public void initialize(){stop();}
    public void shoot() {
        shooterMotor.setPower(ShooterParams.SPEED.NORMAL);
    }

}
