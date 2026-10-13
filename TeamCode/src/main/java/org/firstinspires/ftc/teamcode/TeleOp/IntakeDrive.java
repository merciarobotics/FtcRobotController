package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.IntakeMotor;

@TeleOp
public class IntakeDrive extends OpMode {
    IntakeMotor intakeMotor = new IntakeMotor();

    @Override
    public void init() {
        intakeMotor.init(hardwareMap);
    }

    @Override
    public void loop() {
        intakeMotor.setIntakePower(gamepad1.right_trigger);

        // will set the intake power to how far the right trigger is pressed
        // it might be better to change it if it's easier to not need to hold down the right trigger

        if (gamepad1.b) {
            intakeMotor.setIntakePower(0.0);
        }

        // will turn of the intake motor if the button 'b' is pressed

    }
}
