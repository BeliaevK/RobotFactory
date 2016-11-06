package ru.RobotFactory.Entities;

import static ru.RobotFactory.Entities.Interfaces.*;

/**
 * Created by Scala on 04.11.2016.
 */
public abstract class Details {

    public abstract HeadDetails createHeadDetail();

    public abstract BodyDetails createBodyDetail();

    public abstract LeftHandDetails createLeftHandDetail();

    public abstract RightHandDetails createRightHandDetail();

    public abstract LeftLegDetails createLeftLegDetail();

    public abstract RightLegDetails createRightLegDetail();

}
