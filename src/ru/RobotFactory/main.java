package ru.RobotFactory;

import ru.RobotFactory.Entities.*;
import ru.RobotFactory.Utilities.OrderReader;

import java.io.IOException;

/**
 * Created by Scala on 05.11.2016.
 */
public class main {
    public static void main(String[] args) throws IOException {


        System.out.println(SamsungCompanyFactory.BodyDetails);
        while (true) {
            Order order = OrderReader.orderRead();
        }
    }

    public void createRobot (Details robot){
        Details.HeadDetails headDetail = robot.;

    }
}
