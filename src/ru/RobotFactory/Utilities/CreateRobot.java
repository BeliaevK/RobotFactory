package ru.RobotFactory.Utilities;

import ru.RobotFactory.Entities.*;

import java.io.IOException;

/**
 * Created by Scala on 08.11.2016.
 */
public class CreateRobot {
    private static CreateRobot instance;

    public static  CreateRobot getInstance() {
        if (instance == null) {
            instance = new CreateRobot();
        }
        return instance;
    }

    static void testing (InterfaceDetail i) {
        i.test();
    }

    static void testingAll (InterfaceDetail[] e){
            for (InterfaceDetail i : e)
                testing(i);
        }

    public static void main(String[] args) throws IOException {
        while (true) {

            Order order = OrderReader.orderRead();

            InterfaceDetail[] i = {
                    new RobotHead(), new RobotBody(), new RobotLeftHand(), new RobotRightHand(), new RobotLeftLeg(), new RobotRightLeg()
            };

            System.out.println(order);
            testingAll(i);
        }
    }
}
