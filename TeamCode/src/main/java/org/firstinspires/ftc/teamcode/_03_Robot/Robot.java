package org.firstinspires.ftc.teamcode._03_Robot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode._02_Actions.ArmActions;
import org.firstinspires.ftc.teamcode._02_Actions.ClawActions;
import org.firstinspires.ftc.teamcode._02_Actions.DrivetrainActions;
import org.firstinspires.ftc.teamcode._02_Actions.ExtensionActions;
import org.firstinspires.ftc.teamcode._02_Actions.HookActions;
import org.firstinspires.ftc.teamcode._02_Actions.ShooterActions;

public class Robot {
    private final LinearOpMode opMode;

    public DrivetrainActions drivetrain;
    public ArmActions arm;
    public ExtensionActions extension;
    public ClawActions claw;
    public HookActions hook;
    public ShooterActions shooter;

    public Robot(LinearOpMode opMode) {
        this.opMode = opMode;
    }
    public void construct() {
        drivetrain = new DrivetrainActions(opMode.hardwareMap);
        arm = new ArmActions(opMode.hardwareMap);
        extension = new ExtensionActions(opMode.hardwareMap);
        claw = new ClawActions(opMode.hardwareMap);
        hook = new HookActions(opMode.hardwareMap);
        shooter = new ShooterActions(opMode.hardwareMap);
    }
    public void initialize() {
        drivetrain.initialize();
        arm.initialize();
        extension.initialize();
        claw.initialize();
        hook.initialize();
        shooter.initialize();
    }
    public void start() {
        construct();
        initialize();
    }
}
