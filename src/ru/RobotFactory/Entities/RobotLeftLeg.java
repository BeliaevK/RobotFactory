package ru.RobotFactory.Entities;

/**
 * Created by Scala on 08.11.2016.
 */
public class RobotLeftLeg implements InterfaceDetail {
    @Override
    public void test() {
        System.out.println(this + ": тест пройден");
    }

    public String toString(){
        return "Левая нога";
    }
}
