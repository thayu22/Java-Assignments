public class CalculationClass {

    protected double velocityTwo;
    protected double veloctiyOne;
    protected double distanceTwo;
    protected double distanceOne;
    protected double timeTwo;
    protected double timeOne;

    public CalculationClass() {
    }

    public CalculationClass(double finalVelocity, double finalTime, double finalDistance, double initialVelocity,
            double initialTime, double initialDistance) {
        this.velocityTwo = finalVelocity;
        this.timeTwo = finalTime;
        this.distanceTwo = finalDistance;
        this.veloctiyOne = initialVelocity;
        this.timeOne = initialTime;
        this.distanceOne = initialDistance;
    }

    public double getFinalVelocity() {
        return velocityTwo;
    }

    public double getFinalTime() {
        return timeTwo;
    }

    public double getFinalDistance() {
        return distanceTwo;
    }

    public double getInitialVelocity() {
        return veloctiyOne;
    }

    public double getInitialTime() {
        return timeOne;
    }

    public double getInitialDistance() {
        return distanceOne;
    }

    public double getChangeInVelocity() {
        return getFinalVelocity() - getInitialVelocity();
    }

    public double getChangeInDistance() {
        return getFinalDistance() - getInitialDistance();
    }

    public double getChangeInTime() {
        return getFinalTime() - getInitialTime();
    }
}
