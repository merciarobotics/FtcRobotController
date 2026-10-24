package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ShootingMotor;

@TeleOp(name = "Shooting Motor Test", group = "TeleOp")
public class ShootingMotorTest extends OpMode {
    ShootingMotor shootingMotor = new ShootingMotor();
    int c = 1;


    @Override
    public void init() {
        shootingMotor.init(hardwareMap);
    }

    @Override
    public void loop() {

        if ((c == 1)&&gamepad1.crossWasReleased()) {
            c = -1;
        }else if ((c == -1)&&gamepad1.crossWasReleased()) {
            c = 1;
        }

        shootingMotor.setShootingMotor(c);
    }
}
