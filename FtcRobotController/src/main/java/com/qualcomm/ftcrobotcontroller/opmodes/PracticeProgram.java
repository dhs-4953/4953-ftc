package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Anna_ on 10/3/2015.
 */
public class PracticeProgram extends K9TankDrive{
    DcMotor frontleftmotor;
    DcMotor backleftmotor;
    DcMotor frontrightmotor;
    DcMotor backrightmotor;
    TouchSensor touchSensor;


    public () throws InterruptedException {
        // Get references to the motors from the hardware map
        frontleftmotor = hardwareMap.dcMotor.get("left_drive");
        frontrightmotor = hardwareMap.dcMotor.get("right_drive");

        // Reverse the right motor
        frontrightmotor.setDirection(DcMotor.Direction.REVERSE);

        // Get references to the motors from the hardware map
        frontleftmotor = hardwareMap.dcMotor.get("left_drive");
        frontrightmotor = hardwareMap.dcMotor.get("right_drive");

        // Reverse the right motor
        frontrightmotor.setDirection(DcMotor.Direction.REVERSE);
        // Get a reference to the touch sensor
        touchSensor = hardwareMap.touchSensor.get("sensor_touch");}

    public runOpMode() throws InterruptedException {
        // Get references to the motors from the hardware map
        backleftmotor = hardwareMap.dcMotor.get("left_drive");
        backrightmotor = hardwareMap.dcMotor.get("right_drive");

        // Reverse the right motor
        backrightmotor.setDirection(DcMotor.Direction.REVERSE);

        // Get references to the motors from the hardware map
        backleftmotor = hardwareMap.dcMotor.get("left_drive");
        backrightmotor = hardwareMap.dcMotor.get("right_drive");

        // Reverse the right motor
        frontrightmotor.setDirection(DcMotor.Direction.REVERSE);
        // Get a reference to the touch sensor
        touchSensor = hardwareMap.touchSensor.get("sensor_touch");
        // Wait for the start button to be pressed
        waitForStart();

        while(K9TankDrive()) {
            if(touchSensor.isPressed()) {
                //Stop the motors if the touch sensor is pressed
                frontleftmotor.setPower(0);
                frontrightmotor.setPower(0);
            } else {
                //Keep driving if the touch sensor is not pressed
                frontleftmotor.setPower(0.5);
                frontrightmotor.setPower(0.5);
            }

            telemetry.addData("isPressed", String.valueOf(touchSensor.isPressed()));

            // Wait for a hardware cycle to allow other processes to run
            waitOneFullHardwareCycle();
        }
        while(opModeIsActive()) {
            if(touchSensor.isPressed()) {
                //Stop the motors if the touch sensor is pressed
                backleftmotor.setPower(0);
                backrightmotor.setPower(0);
            } else {
                //Keep driving if the touch sensor is not pressed
                backleftmotor.setPower(0.5);
                backrightmotor.setPower(0.5);
            }

            telemetry.addData("isPressed", String.valueOf(touchSensor.isPressed()));

            // Wait for a hardware cycle to allow other processes to run
            waitOneFullHardwareCycle();
    }
}


}
