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

    public static  OrderReader getInstance() {
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
            int[]intOrderFields = new int[6];
            for (int i = 0; i < orderFields.length; i++) {
               intOrderFields[i] =  Integer.parseInt(orderFields[i]);
            }

                    if (orderFields.length == 6) order = new Order(intOrderFields[0], intOrderFields[1], intOrderFields[2],
                            intOrderFields[3], intOrderFields[4], intOrderFields[5]);
            } else {
                System.out.println("Неверный формат заявки. Укажите фирму призводителя деталей работа: 'Голова|Тело|"
                        + "Левая рука|Правая рука|Левая нога|Правая нога'" +
                        "\nКомпании: Default = 0, Sony = 1, LG = 2, Samsung = 3");
            }
            if (order != null) isCorrectOrder = true;
        }
        return order;
    }

    private static boolean checkOrderFieldsIsCorrect(String[] orderFields) {
        boolean isCorrect = true;
        if (orderFields.length < 6) isCorrect = false;
        if (orderFields.length > 6) isCorrect = false;
            for (String orderField : orderFields) {
                if (!orderField.equals("0") & !orderField.equals("1") & !orderField.equals("2") & !orderField.equals("3")) isCorrect = false;
            }
        return isCorrect;
    }
}
