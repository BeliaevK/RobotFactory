package ru.RobotFactory.Entities;


/**
 * Created by Scala on 05.11.2016.
 */
public class SonyCompanyFactory extends Details {

    @Override
    public Interfaces.HeadDetails createHeadDetail() {
        return null;
    }

    @Override
    public Interfaces.BodyDetails createBodyDetail() {
        return null;
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

    class SonyCompanyHead implements Interfaces.HeadDetails {

    }

    class SonyCompanyBody implements Interfaces.BodyDetails {

    }

    class SonyCompanyLeftHand implements Interfaces.LeftHandDetails {

    }

    class SonyCompanyRightHand implements Interfaces.RightHandDetails {

    }

    class SonyCompanyLeftLeg implements Interfaces.LeftLegDetails {

    }

    class SonyCompanyRightLeg implements Interfaces.RightLegDetails {

    }

}
