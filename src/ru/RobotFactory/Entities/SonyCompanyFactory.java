package ru.RobotFactory.Entities;


import ru.RobotFactory.Utilities.OrderReader;

/**
 * Created by Scala on 05.11.2016.
 */
public class SonyCompanyFactory extends Details {

    @Override
    public HeadDetails createHeadDetail(String headDetail) {
        if ("Sony".equals(OrderReader.orderRead()))
        return null;
    }

    @Override
    public Details.BodyDetails createBodyDetail() {
        return null;
    }

    @Override
    public Details.LeftHandDetails createLeftHandDetail() {
        return null;
    }

    @Override
    public Details.RightHandDetails createRightHandDetail() {
        return null;
    }

    @Override
    public Details.LeftLegDetails createLeftLegDetail() {
        return null;
    }

    @Override
    public Details.RightLegDetails createRightLegDetail() {
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
