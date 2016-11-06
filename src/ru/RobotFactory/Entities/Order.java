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
}
