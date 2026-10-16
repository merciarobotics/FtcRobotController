package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;
import org.firstinspires.ftc.teamcode.mechanisms.IntakeMotor;

@TeleOp(name = "Field Orientated Mecanum Drive", group = "TeleOp")
public class FieldOrientatedMecanumDrive extends OpMode {
    DriveTrain driveTrain = new DriveTrain();
    IntakeMotor intakeMotor = new IntakeMotor();
    double forward, strafe, rotate, multiplier;
    int c;

    @Override
    public void init() {
        driveTrain.init(hardwareMap);
        intakeMotor.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        multiplier = gamepad1.a ? 0.5 : 1;

        driveTrain.driveFieldRelative(forward, strafe, rotate, multiplier);


        if ((c == 1)&&gamepad1.crossWasReleased()) {
            c = -1;
        }else if ((c == -1)&&gamepad1.crossWasReleased()) {
            c = 1;
        }

        intakeMotor.setIntakePower(c*gamepad1.right_trigger);

    }
}
