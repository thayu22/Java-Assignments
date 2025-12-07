public class FinalClass extends CalculationClass {

    public double getDistance() {
        return getChangeInTime() * getChangeInVelocity();
    }

    public double getTime() {
        return getChangeInDistance() / getChangeInVelocity();
    }

    public double getVelocity() {
        return getChangeInDistance() / getChangeInTime();
    }
}