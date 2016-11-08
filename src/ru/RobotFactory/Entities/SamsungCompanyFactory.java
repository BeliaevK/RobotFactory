package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class SamsungCompanyFactory extends Details {

    @Override
    public HeadDetails createHeadDetail(String headDetail) {
        return null;
    }

    @Override
    public BodyDetails createBodyDetail(String bodyDetail) {
        return null;
    }

    @Override
    public LeftHandDetails createLeftHandDetail(String leftHandDetail) {
        return null;
    }

    @Override
    public RightHandDetails createRightHandDetail(String rightHandDetail) {
        return null;
    }

    @Override
    public LeftLegDetails createLeftLegDetail(String leftLegDetail) {
        return null;
    }

    @Override
    public RightLegDetails createRightLegDetail(String rightLegDetail) {
        return null;
    }

    class SamsungCompanyHead implements Details.HeadDetails {

        @Override
        public void headDetail() {

        }
    }

    class SamsungCompanyBody implements Details.BodyDetails {

        @Override
        public void bodyDetail() {

        }
    }

    class SamsungCompanyLeftHand implements Details.LeftHandDetails {


        @Override
        public void leftHandDetail() {

        }
    }

    class SamsungCompanyRightHand implements Details.RightHandDetails {

        @Override
        public void rightHandDetail() {

        }
    }

    class SamsungCompanyLeftLeg implements Details.LeftLegDetails {


        @Override
        public void leftLegDetail() {

        }
    }

    class SamsungCompanyRightLeg implements Details.RightLegDetails {


        @Override
        public void rightLegDetail() {

        }
    }

}
