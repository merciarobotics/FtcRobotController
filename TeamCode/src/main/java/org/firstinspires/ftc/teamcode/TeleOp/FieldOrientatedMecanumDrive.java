package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;
import org.firstinspires.ftc.teamcode.mechanisms.IntakeMotor;

@TeleOp(name = "Field Orientated Mecanum Drive", group = "TeleOp")
public class FieldOrientatedMecanumDrive extends OpMode {
    DriveTrain driveTrain = new DriveTrain();
    IntakeMotor intakeMotor = new IntakeMotor();

    @Override
    public void init() {
        driveTrain.init(hardwareMap);
        intakeMotor.init(hardwareMap);
    }
    double forward, strafe, rotate, multiplier;
    int c = 1; // constant used for revering the motor intake

    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        strafe = -gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        multiplier = gamepad1.square ? 0.5 : 1;


        driveTrain.driveFieldRelative(forward, strafe, rotate, multiplier);

        if (gamepad1.crossWasReleased()) {
            c = -c;
        }


        if (gamepad1.right_trigger_pressed)
            intakeMotor.setIntakePower(c);
        else {
            intakeMotor.setIntakePower(0);
        }

    }
}
