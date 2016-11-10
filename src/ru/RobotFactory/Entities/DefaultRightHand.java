package ru.RobotFactory.Entities;

/**
 * Created by Scala on 10.11.2016.
 */
public class DefaultRightHand implements InterfaceDetail {
    private int typeOfPart;
    private String typeOfManufactory;

    @Override
    public void test() {

    }

    public int getTypeOfPart() {
        return typeOfPart;
    }

    public void setTypeOfPart(int typeOfPart) {
        this.typeOfPart = typeOfPart;
    }

    public String getTypeOfManufactory() {
        return typeOfManufactory;
    }

    public void setTypeOfManufactory(String typeOfManufactory) {
        this.typeOfManufactory = typeOfManufactory;
    }
}
