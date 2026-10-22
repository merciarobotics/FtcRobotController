package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.DriveTrain;

public class MecanumDrive extends OpMode {
    DriveTrain driveTrain = new DriveTrain();

    boolean completed = false;

    @Override
    public void init() {
        driveTrain.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (!completed) {
            /*
            The `try-catch` blocks pauses the current thread for 3 seconds and handle any interruption,
            restoring the thread’s interrupted status and exiting the current method if interrupted.
            */

            driveTrain.drive(1,0, 0, 1);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            driveTrain.drive(-1,0,0,1);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();;
                return;
            }

            driveTrain.drive(0,0,0,0);

            completed = true;
        }
    }
}
