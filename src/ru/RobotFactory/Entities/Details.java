package ru.RobotFactory.Entities;

/**
 * Created by Scala on 04.11.2016.
 */
public abstract class Details {

    public abstract HeadDetails createHeadDetail(String headDetail);

    public abstract BodyDetails createBodyDetail(String bodyDetail);

    public abstract LeftHandDetails createLeftHandDetail(String leftHandDetail);

    public abstract RightHandDetails createRightHandDetail(String rightHandDetail);

    public abstract LeftLegDetails createLeftLegDetail(String leftLegDetail);

    public abstract RightLegDetails createRightLegDetail(String rightLegDetail);

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
