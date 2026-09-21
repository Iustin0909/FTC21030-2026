package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.ShooterParams;

public class ShooterHardware {
    protected final DcMotorEx shooterMotor;

    public ShooterHardware(HardwareMap hardwareMap) {
        shooterMotor = hardwareMap.get(DcMotorEx.class, ShooterParams.PROFILE.MOTOR_NAMES.SHOOTER);
        shooterMotor.setDirection(ShooterParams.PROFILE.MOTOR_DIRECTIONS.SHOOTER);
        shooterMotor.setMode(ShooterParams.PROFILE.RUN_MODE);
        DcMotorEx[] motors = {shooterMotor};

     for (DcMotorEx motor : motors) {
         motor.setPower(0);
         motor.setZeroPowerBehavior(ShooterParams.PROFILE.ZERO_POWER_BEHAVIOR);
     }
    }

}
