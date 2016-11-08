package ru.RobotFactory.Entities;

/**
 * Created by Scala on 04.11.2016.
 */
public abstract class Details {

    public abstract HeadDetails createHeadDetail(String headDetail);

    public abstract BodyDetails createBodyDetail();

    public abstract LeftHandDetails createLeftHandDetail();

    public abstract RightHandDetails createRightHandDetail();

    public abstract LeftLegDetails createLeftLegDetail();

    public abstract RightLegDetails createRightLegDetail();

    public interface HeadDetails {
        public void headDetail();
    }

    public interface BodyDetails {
        public void bodyDetail();
    }

    public interface LeftHandDetails {
        public void leftHandDetail();
    }

    public interface RightHandDetails {
        public void rightHandDetail();
    }

    public interface LeftLegDetails {
        public void leftLegDetail();
    }

    public interface RightLegDetails {
        public void rightLegDetail();
    }
}
