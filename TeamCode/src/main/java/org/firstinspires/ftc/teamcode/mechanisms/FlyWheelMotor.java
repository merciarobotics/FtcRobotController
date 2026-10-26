package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "FlyWheelTest", group = "TeleOp")
public class FlyWheelMotor {
    private DcMotor flyWheelMotor;

    public void init(HardwareMap hwMap) {
        flyWheelMotor = hwMap.get(DcMotor.class, "flyWheel");
        // should  rename to flywheel in config file

        flyWheelMotor.setDirection(DcMotor.Direction.FORWARD);
    }

    public void setFlyWheelMotor(double  power) {
        flyWheelMotor.setPower(power);
    }

    public double getMotorPower() {
        return flyWheelMotor.getPower();
    }
}
