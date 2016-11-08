package ru.RobotFactory.Entities;


import ru.RobotFactory.Utilities.OrderReader;

/**
 * Created by Scala on 05.11.2016.
 */
public class SonyCompanyFactory extends Details {

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

    class SonyCompanyHead implements Details.HeadDetails {


        @Override
        public void headDetail() {

        }
    }

    class SonyCompanyBody implements Details.BodyDetails {

        @Override
        public void bodyDetail() {

        }
    }

    class SonyCompanyLeftHand implements Details.LeftHandDetails {

        @Override
        public void leftHandDetail() {

        }
    }

    class SonyCompanyRightHand implements Details.RightHandDetails {

        @Override
        public void rightHandDetail() {

        }
    }

    class SonyCompanyLeftLeg implements Details.LeftLegDetails {

        @Override
        public void leftLegDetail() {

        }
    }

    class SonyCompanyRightLeg implements Details.RightLegDetails {

        @Override
        public void rightLegDetail() {

        }
    }

}
