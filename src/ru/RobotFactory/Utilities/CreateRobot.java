package ru.RobotFactory.Utilities;

import ru.RobotFactory.Entities.Details;
import ru.RobotFactory.Entities.InterfaceDetail;
import ru.RobotFactory.Entities.Order;

import java.io.IOException;

/**
 * Created by Scala on 08.11.2016.
 */
public class CreateRobot {
        static void testing (InterfaceDetail i) {
            i.test();
        }
    public static void main(String[] args) throws IOException {
        while (true) {
            Order order = OrderReader.orderRead();
        }
    }
}
