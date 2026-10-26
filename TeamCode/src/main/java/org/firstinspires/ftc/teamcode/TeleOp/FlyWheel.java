package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.FlyWheelMotor;

@TeleOp(name = "FlyWheel", group = "TeleOp")
public class FlyWheel extends OpMode {
    FlyWheelMotor flywheelMotor = new FlyWheelMotor();

    @Override
    public void init() {
        flywheelMotor.init(hardwareMap);
    }

    @Override
    public void loop() {

    }
}
