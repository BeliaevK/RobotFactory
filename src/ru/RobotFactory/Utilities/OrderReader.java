package ru.RobotFactory.Utilities;

import ru.RobotFactory.Entities.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Scala on 05.11.2016.
 */
public class OrderReader {

    private static OrderReader instance;

    public static synchronized OrderReader orderReader() {
        if (instance == null) {
            instance = new OrderReader();
        }
        return instance;
    }

    public static Order orderRead() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Order order = null;
        boolean isCorrectOrder = false;
        while (!isCorrectOrder) {
            String orderText = reader.readLine();
            String[] orderFields = orderText.split("\\|");
            if (checkOrderFieldsIsCorrect(orderFields)) {
                    if (orderFields.length == 5) order = new Order(orderFields[0], orderFields[1], orderFields[2],
                            orderFields[3], orderFields[4], orderFields[5]);
            } else {
                System.out.println("Неверный формат заявки. Укажите фирму призводителя деталей работа: 'Голова|Тело|"
                        + "Левая рука|Правая рука|Левая нога|Правая нога'" +
                        "\nПример: 'Samsung|LG|0*|Sony|0*|0*'" + "\n*0 - по умолчанию Китайская 'No_name' фирма.");
            }
            if (order != null) isCorrectOrder = true;
        }
        return order;
    }

    private static boolean checkOrderFieldsIsCorrect(String[] orderFields) {
        boolean isCorrect = true;
        if (orderFields.length < 6) isCorrect = false;
        try {
            if (orderFields[0].length() == 0) isCorrect = false;
            if (orderFields[1].length() == 0) isCorrect = false;
        } catch (NumberFormatException e) {
            isCorrect = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            isCorrect = false;
        }
        return isCorrect;
    }

}
