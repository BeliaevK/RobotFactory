package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class DefaultChinaCompanyFactory extends Details {


    @Override
    public HeadDetails createHeadDetail() {
        return null;
    }

    @Override
    public BodyDetails createBodyDetail() {
        return null;
    }

    @Override
    public LeftHandDetails createLeftHandDetail() {
        return null;
    }

    @Override
    public RightHandDetails createRightHandDetail() {
        return null;
    }

    @Override
    public LeftLegDetails createLeftLegDetail() {
        return null;
    }

    @Override
    public RightLegDetails createRightLegDetail() {
        return null;
    }

    class DefaultChinaCompanyHead implements Details.HeadDetails {

        @Override
        public void headDetail() {
        }
    }

    class DefaultChinaCompanyBody implements Details.BodyDetails {

        @Override
        public void bodyDetail() {

        }
    }

    class DefaultChinaCompanyLeftHand implements Details.LeftHandDetails {

        @Override
        public void leftHandDetail() {

        }
    }

    class DefaultChinaCompanyRightHand implements Details.RightHandDetails {

        @Override
        public void rightHandDetail() {

        }
    }

    class DefaultChinaCompanyLeftLeg implements Details.LeftLegDetails {

        @Override
        public void leftLegDetail() {

        }
    }

    class DefaultChinaCompanyRightLeg implements Details.RightLegDetails {

        @Override
        public void rightLegDetail() {

        }
    }
}
