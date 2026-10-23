package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;
import org.firstinspires.ftc.teamcode.mechanisms.IntakeMotor;

@TeleOp(name = "Robot Orientated Mecanum Drive", group = "TeleOp")
public class MecanumDrive_DISABLED extends OpMode {
    DriveTrain driveTrain = new DriveTrain();
    IntakeMotor intakeMotor = new IntakeMotor();

    @Override
    public void init() {
        driveTrain.init(hardwareMap);
        intakeMotor.init(hardwareMap);
    }

    @Override
    public void loop() {
        double forward = -gamepad1.left_stick_y;  // Note: pushing stick forward gives negative value
        double strafe = gamepad1.left_stick_x;
        double rotate = gamepad1.right_stick_x;

        double multiplier = gamepad1.a ? 0.5 : 1;

        intakeMotor.setIntakePower(gamepad1.right_trigger);

        driveTrain.drive(forward, strafe, rotate, multiplier);
    }
}
