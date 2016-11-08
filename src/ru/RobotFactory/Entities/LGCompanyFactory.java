package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class LGCompanyFactory extends Details {


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

    class LGCompanyHead implements Details.HeadDetails {

        @Override
        public void headDetail() {

        }
    }

    class LGCompanyBody implements Details.BodyDetails {

        @Override
        public void bodyDetail() {

        }
    }

    class LGCompanyLeftHand implements Details.LeftHandDetails {

        @Override
        public void leftHandDetail() {

        }
    }

    class LGCompanyRightHand implements Details.RightHandDetails {

        @Override
        public void rightHandDetail() {

        }
    }

    class LGCompanyLeftLeg implements Details.LeftLegDetails {

        @Override
        public void leftLegDetail() {

        }
    }

    class LGCompanyRightLeg implements Details.RightLegDetails {

        @Override
        public void rightLegDetail() {

        }
    }
}
