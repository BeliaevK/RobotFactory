package ru.RobotFactory.Entities;

/**
 * Created by Scala on 05.11.2016.
 */
public class LGCompanyFactory extends Details {

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

    class LGCompanyHead implements Interfaces.HeadDetails {

    }

    class LGCompanyBody implements Interfaces.BodyDetails {

    }

    class LGCompanyLeftHand implements Interfaces.LeftHandDetails {

    }

    class LGCompanyRightHand implements Interfaces.RightHandDetails {

    }

    class LGCompanyLeftLeg implements Interfaces.LeftLegDetails {

    }

    class LGCompanyRightLeg implements Interfaces.RightLegDetails {

    }
}
