package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;

@TeleOp(name = "Mecanum Drive", group = "TeleOp")
public class MecanumDrive extends OpMode {
    DriveTrain driveTrain = new DriveTrain();

    @Override
    public void init() {
        driveTrain.init(hardwareMap);
    }

    @Override
    public void loop() {
        double forward = -gamepad1.left_stick_y;  // Note: pushing stick forward gives negative value
        double right = gamepad1.left_stick_x;
        double rotate = gamepad1.right_stick_x;

        driveTrain.drive(forward, right, rotate);
    }
}
