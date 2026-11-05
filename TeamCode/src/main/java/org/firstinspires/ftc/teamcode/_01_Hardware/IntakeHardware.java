package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.IntakeParams;

public class IntakeHardware {
    protected final DcMotorEx intakeMotor;

    public IntakeHardware(HardwareMap hardwareMap){
        intakeMotor=hardwareMap.get(DcMotorEx.class, IntakeParams.PROFILE.MOTOR_NAMES.INTAKE);
        intakeMotor.setDirection(IntakeParams.PROFILE.MOTOR_DIRECTIONS.INTAKE);
        intakeMotor.setMode(IntakeParams.PROFILE.RUN_MODE);
        DcMotorEx[] motors = {intakeMotor};

        for (DcMotorEx motor : motors){
            motor.setPower(0);
            motor.setZeroPowerBehavior(IntakeParams.PROFILE.ZERO_POWER_BEHAVIOR);
        }
    }



}
