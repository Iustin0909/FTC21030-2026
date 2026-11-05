package org.firstinspires.ftc.teamcode._02_Actions;
import com.qualcomm.robotcore.hardware.HardwareMap;


import org.firstinspires.ftc.teamcode._00_Parameters.IntakeParams;
import org.firstinspires.ftc.teamcode._01_Hardware.IntakeHardware;

public class IntakeActions extends IntakeHardware {
    public IntakeActions(HardwareMap hardwareMap) { super(hardwareMap);}
    public void stop() { intakeMotor.setPower(0);}
    public double getMotorsPower() {
        double power = intakeMotor.getPower();
        return power;
    }
    public void initialize(){stop();}
    public void intake() {
        intakeMotor.setPower(IntakeParams.SPEED.NORMAL);
    }

}
