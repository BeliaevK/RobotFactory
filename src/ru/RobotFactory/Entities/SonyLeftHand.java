package ru.RobotFactory.Entities;

/**
 * Created by Scala on 10.11.2016.
 */
public class SonyLeftHand implements InterfaceDetail {
    private int typeOfPart;
    private String typeOfManufactory;

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

    public SonyRightHand createSonyLeftHand (){

        return null;
    }

    @Override
    public void test() {
        
    }
}
