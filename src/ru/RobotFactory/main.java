package ru.RobotFactory;

import ru.RobotFactory.Entities.Order;
import ru.RobotFactory.Utilities.OrderReader;

import java.io.IOException;

/**
 * Created by Scala on 05.11.2016.
 */
public class main {
    public static void main(String[] args) throws IOException {
        while (true) {
            Order order = OrderReader.orderRead();
        }
    }
}
