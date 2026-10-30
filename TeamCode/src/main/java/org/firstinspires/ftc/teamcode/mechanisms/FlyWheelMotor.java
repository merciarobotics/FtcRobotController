package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "FlyWheelTest", group = "TeleOp")
public class FlyWheelMotor {
    private DcMotor flyWheelMotor;

    public void init(HardwareMap hwMap) {
        flyWheelMotor = hwMap.get(DcMotor.class, "fly_wheel");

        flyWheelMotor.setDirection(DcMotor.Direction.FORWARD);
    }

    public void setFlyWheelMotor(double  power) {
        flyWheelMotor.setPower(power);
    }
}
