package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class Order  {

    private int headDetail;
    private int bodyDetail;
    private int leftHandDetail;
    private int rightHandDetail;
    private int leftLegDetail;
    private int rightLegDetail;

    public Order (int headDetail, int bodyDetail, int leftHandDetail, int rightHandDetail, int leftLegDetail,
                  int rightLegDetail){
        this.setHeadDetail(headDetail);
        this.setBodyDetail(bodyDetail);
        this.setLeftHandDetail(leftHandDetail);
        this.setRightHandDetail(rightHandDetail);
        this.setLeftLegDetail(leftLegDetail);
        this.setRightLegDetail(rightLegDetail);
    }

    public int getHeadDetail() {
        return headDetail;
    }

    public void setHeadDetail(int headDetail) {
        this.headDetail = headDetail;
    }

    public int getBodyDetail() {
        return bodyDetail;
    }

    public void setBodyDetail(int bodyDetail) {
        this.bodyDetail = bodyDetail;
    }

    public int getLeftHandDetail() {
        return leftHandDetail;
    }

    public void setLeftHandDetail(int leftHandDetail) {
        this.leftHandDetail = leftHandDetail;
    }

    public int getRightHandDetail() {
        return rightHandDetail;
    }

    public void setRightHandDetail(int rightHandDetail) {
        this.rightHandDetail = rightHandDetail;
    }

    public int getLeftLegDetail() {
        return leftLegDetail;
    }

    public void setLeftLegDetail(int leftLegDetail) {
        this.leftLegDetail = leftLegDetail;
    }

    public int getRightLegDetail() {
        return rightLegDetail;
    }

    public void setRightLegDetail(int rightLegDetail) {
        this.rightLegDetail = rightLegDetail;
    }

/*    @Override
    public String toString() {
        String headCompany = null;
        String bodyCompany = null;
        String leftHandCompany = null;
        String rightHandCompany = null;
        String leftLegCompany = null;
        String rightLegCompany = null;

        if (this.headDetail == InterfaceDetail.COMPANY_DEFAULT)
            headCompany = "Default";
        else if (this.headDetail == InterfaceDetail.COMPANY_LG)
            headCompany = "LG";
        else if (this.headDetail == InterfaceDetail.COMPANY_SAMSUNG)
            headCompany = "Samsung";
        else if (this.headDetail == InterfaceDetail.COMPANY_SONY)
            headCompany = "Sony";

        if (this.bodyDetail == InterfaceDetail.COMPANY_DEFAULT)
            bodyCompany = "Default";
        else if (this.bodyDetail == InterfaceDetail.COMPANY_LG)
            bodyCompany = "LG";
        else if (this.bodyDetail == InterfaceDetail.COMPANY_SAMSUNG)
            bodyCompany = "Samsung";
        else if (this.bodyDetail == InterfaceDetail.COMPANY_SONY)
            bodyCompany = "Sony";

        if (this.leftHandDetail == InterfaceDetail.COMPANY_DEFAULT)
            leftHandCompany = "Default";
        else if (this.leftHandDetail == InterfaceDetail.COMPANY_LG)
            leftHandCompany = "LG";
        else if (this.leftHandDetail == InterfaceDetail.COMPANY_SAMSUNG)
            leftHandCompany = "Samsung";
        else if (this.leftHandDetail == InterfaceDetail.COMPANY_SONY)
            leftHandCompany = "Sony";

        if (this.rightHandDetail == InterfaceDetail.COMPANY_DEFAULT)
            rightHandCompany = "Default";
        else if (this.rightHandDetail == InterfaceDetail.COMPANY_LG)
            rightHandCompany = "LG";
        else if (this.rightHandDetail == InterfaceDetail.COMPANY_SAMSUNG)
            rightHandCompany = "Samsung";
        else if (this.rightHandDetail == InterfaceDetail.COMPANY_SONY)
            rightHandCompany = "Sony";

        if (this.leftLegDetail == InterfaceDetail.COMPANY_DEFAULT)
            leftLegCompany = "Default";
        else if (this.leftLegDetail == InterfaceDetail.COMPANY_LG)
            leftLegCompany = "LG";
        else if (this.leftLegDetail == InterfaceDetail.COMPANY_SAMSUNG)
            leftLegCompany = "Samsung";
        else if (this.leftLegDetail == InterfaceDetail.COMPANY_SONY)
            leftLegCompany = "Sony";

        if (this.rightLegDetail == InterfaceDetail.COMPANY_DEFAULT)
            rightLegCompany = "Default";
        else if (this.rightLegDetail == InterfaceDetail.COMPANY_LG)
            rightLegCompany = "LG";
        else if (this.rightLegDetail == InterfaceDetail.COMPANY_SAMSUNG)
            rightLegCompany = "Samsung";
        else if (this.rightLegDetail == InterfaceDetail.COMPANY_SONY)
            rightLegCompany = "Sony";

        return "Голова: " + headCompany + ", тело: " + bodyCompany + ", левая рука: " + leftHandCompany +
                ", правая рука: " + rightHandCompany + ", левая нога: " + leftLegCompany + ", правая нога: " +
                rightLegCompany;
    }*/

}
