package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class DefaultChinaCompanyFactory extends Details {
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

    class DefaultChinaCompanyHead implements Interfaces.HeadDetails {

    }

    class DefaultChinaCompanyBody implements Interfaces.BodyDetails {

    }

    class DefaultChinaCompanyLeftHand implements Interfaces.LeftHandDetails {

    }

    class DefaultChinaCompanyRightHand implements Interfaces.RightHandDetails {

    }

    class DefaultChinaCompanyLeftLeg implements Interfaces.LeftLegDetails {

    }

    class DefaultChinaCompanyRightLeg implements Interfaces.RightLegDetails {

    }
}
