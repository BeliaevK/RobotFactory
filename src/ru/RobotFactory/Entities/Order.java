package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class Order {

    private String headDetail;
    private String bodyDetail;
    private String leftHandDetail;
    private String rightHandDetail;
    private String leftLegDetail;
    private String rightLegDetail;

    public Order (String headDetail, String bodyDetail, String leftHandDetail, String rightHandDetail, String leftLegDetail, String rightLegDetail){
        this.headDetail = headDetail;
        this.bodyDetail = bodyDetail;
        this.leftHandDetail = leftHandDetail;
        this.rightHandDetail = rightHandDetail;
        this.leftLegDetail = leftLegDetail;
        this.rightLegDetail = rightLegDetail;
    }

    public String getHeadDetail() {
        return headDetail;
    }

    public void setHeadDetail(String headDetail) {
        this.headDetail = headDetail;
    }

    public String getBodyDetail() {
        return bodyDetail;
    }

    public void setBodyDetail(String bodyDetail) {
        this.bodyDetail = bodyDetail;
    }

    public String getLeftHandDetail() {
        return leftHandDetail;
    }

    public void setLeftHandDetail(String leftHandDetail) {
        this.leftHandDetail = leftHandDetail;
    }

    public String getRightHandDetail() {
        return rightHandDetail;
    }

    public void setRightHandDetail(String rightHandDetail) {
        this.rightHandDetail = rightHandDetail;
    }

    public String getLeftLegDetail() {
        return leftLegDetail;
    }

    public void setLeftLegDetail(String leftLegDetail) {
        this.leftLegDetail = leftLegDetail;
    }

    public String getRightLegDetail() {
        return rightLegDetail;
    }

    public void setRightLegDetail(String rightLegDetail) {
        this.rightLegDetail = rightLegDetail;
    }

    @Override
    public String toString() {
        String orderCompany;
       if (Integer.parseInt(this == toString(InterfaceDetail.COMPANY_DEFAULT))
/*    @Override
    public String toString() {
        String orderedCar = (this.carReserver == null) ? ", машина не назначена" : ", " + this.carReserver.toString();
        String orderedType;
        if (this.needCarClass == Car.TYPE_OF_CLASS_BUSYNESS) orderedType = "Бизнес класс";
        else if (this.needCarClass == Car.TYPE_OF_CLASS_ECONOMIC) orderedType = "Эконом класс";
        else orderedType = "Не присвоен";
        return "Пункт отправки: " + this.startPoint + ", конечная точка: " + this.endPoint + ", необходимо детское сидение: " + this.isNeedBabySeat + ", необходим салон для курящих: " + this.isNeedSmokeCar + ", класс машины: " + orderedType + orderedCar;
    }*/
}



}
