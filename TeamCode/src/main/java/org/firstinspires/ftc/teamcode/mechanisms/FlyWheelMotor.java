package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "FlyWheelTest", group = "TeleOp")
public class FlyWheelMotor {
    private DcMotor flyWheelMotor;

    public void init(HardwareMap hWmap) {
        flyWheelMotor = hWmap.get(DcMotor.class, "flyWheel");
        // should  rename to flywheel in config file

        flyWheelMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void setFlyWheelMotor(double  power) {
        flyWheelMotor.setPower(power);
    }
}
