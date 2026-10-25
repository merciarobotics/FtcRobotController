package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.FlyWheelMotor;

@TeleOp(name = "FlyWheel", group = "TeleOp")
public class FlyWheel extends OpMode {
    FlyWheelMotor flywheelMotor = new FlyWheelMotor();
    int c = 1;

    @Override
    public void init() {
        flywheelMotor.init(hardwareMap);
    }

    @Override
    public void loop() {

        if (gamepad1.crossWasReleased()) {
            c = -c;
        }

        if (gamepad1.circleWasReleased()) {
            flywheelMotor.setFlyWheelMotor(c);
        } else if (gamepad1.squareWasReleased()) {
            flywheelMotor.setFlyWheelMotor(0);
        } else {
            flywheelMotor.setFlyWheelMotor(gamepad1.left_trigger*c);
        }

    }
}
