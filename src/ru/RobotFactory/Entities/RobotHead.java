package ru.RobotFactory.Entities;

/**
 * Created by k.beliaev on 09.11.2016.
 */
public class RobotHead implements InterfaceDetail {
    @Override
    public void test() {
        System.out.println(this + ": тест пройден");
    }

    public String toString(){
        return "Голова";
    }
}
