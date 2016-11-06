package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class SamsungCompanyFactory extends Details {

    @Override
    public Interfaces.HeadDetails createHeadDetail() {
        return new SamsungCompanyHead("1");
    }

    @Override
    public Interfaces.BodyDetails createBodyDetail() {
        return new SamsungCompanyBody("1");
    }

    @Override
    public Interfaces.LeftHandDetails createLeftHandDetail() {
        return null;
    }

    @Override
    public Interfaces.RightHandDetails createRightHandDetail() {
        return null;
    }

    @Override
    public Interfaces.LeftLegDetails createLeftLegDetail() {
        return null;
    }

    @Override
    public Interfaces.RightLegDetails createRightLegDetail() {
        return null;
    }

    private class SamsungCompanyHead implements Interfaces.HeadDetails {

        public SamsungCompanyHead(String s) {
        }


    }

    class SamsungCompanyBody implements Interfaces.BodyDetails {

        public SamsungCompanyBody(String s) {
        }
    }

    class SamsungCompanyLeftHand implements Interfaces.LeftHandDetails {

    }

    class SamsungCompanyRightHand implements Interfaces.RightHandDetails {

    }

    class SamsungCompanyLeftLeg implements Interfaces.LeftLegDetails {

    }

    class SamsungCompanyRightLeg implements Interfaces.RightLegDetails {

    }

}
