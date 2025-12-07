public class Kinematics extends FinalClass {

    protected double finalVelocity;
    protected double initialVelocity;
    protected double acceleration;
    protected double finalDistance;
    protected double initialDistance;
    protected double finalTime;
    protected double initialTime;

    public Kinematics(double finalVelocity, double initialVelocity, double acceleration, double finalDistance,
            double initialDistance, double finalTime, double initialTime) {
        this.finalVelocity = velocityTwo;
        this.initialVelocity = veloctiyOne;
        this.acceleration = acceleration;
        this.finalDistance = distanceTwo;
        this.initialDistance = distanceOne;
        this.finalTime = timeTwo;
        this.initialTime = timeOne;
    }

    public double getAcceleration() {
        return getVelocity() / getTime();
    }

    public double getVelocityFinal() {
        return getInitialVelocity() + getAcceleration() * getTime();
    }

    public double getVelocityInitial() {
        return getFinalVelocity() - getAcceleration() * getTime();
    }

    public double time() {
        return (getFinalVelocity() - getInitialVelocity()) / getTime();
    }

    public double distance() {
        double average = (getFinalVelocity() + getInitialVelocity()) / 2;
        return average * getTime();
    }
}
