package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class LGCompanyFactory extends Details {

    @Override
    public Details.HeadDetails createHeadDetail() {
        return null;
    }

    @Override
    public HeadDetails createHeadDetail(String headDetail) {
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
