package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ShootingMotor {
    private DcMotor shootingMotor;

    public void init(HardwareMap hWmap) {
        shootingMotor = hWmap.get(DcMotor.class, "Shooter");

        shootingMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void setShootingMotor(int  power) {
        shootingMotor.setPower(power);
    }
}
