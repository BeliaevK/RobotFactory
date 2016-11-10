package ru.RobotFactory.Entities;

public class RobotHead implements InterfaceDetail{

    @Override
    public void test() {
        System.out.println(this + ": тест пройден");
    }

    public String toString(){
        return "Голова";
    }
}
