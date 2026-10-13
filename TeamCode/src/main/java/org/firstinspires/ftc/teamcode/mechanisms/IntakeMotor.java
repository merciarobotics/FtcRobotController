package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class IntakeMotor {
    private DcMotor intakeMotor;

    public void init(HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotor.class, "Intake");

        // i forgot the config name of the intake motor so this will likely need to be changed later

        intakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }

    public void setIntakePower(double power) {
        intakeMotor.setPower(power);
    }
}
