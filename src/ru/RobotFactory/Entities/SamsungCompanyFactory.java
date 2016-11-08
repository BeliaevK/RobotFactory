package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class SamsungCompanyFactory extends Details {

  /* Interfaces.BodyDetails s  = createBodyDetail();*/


    @Override
    public Details.HeadDetails createHeadDetail() {
        return new SamsungCompanyHead();
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
