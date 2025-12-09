package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class ServoTest extends LinearOpMode {
    private Servo servo1;

    @Override
    public void runOpMode() throws InterruptedException {
        // initialize
        servo1 = hardwareMap.get(Servo.class, "");



        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a) {
                servo1.setPosition(0);
            }
            if (gamepad1.b) {
                servo1.setPosition(1);
            }
        }
        //finish
    }
}
