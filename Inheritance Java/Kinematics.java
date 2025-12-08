/*
*Description of Kinematics
*
*@author Thayuran Logendran
*@version 1.0 - December 2025
 */
public class Kinematics extends FinalClass {
    /** Final velocity */
    protected double finalVelocity;
    /** Initial velocity */
    protected double initialVelocity;
    /** Acceleration */
    protected double acceleration;
    /** Final distance */
    protected double finalDistance;
    /** Initial distance */
    protected double initialDistance;
    /** Final time */
    protected double finalTime;
    /** Initial time */
    protected double initialTime;

    /**
     * This is Kinematics Method.
     */
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
    
    /**
     * This method finds the value of acceleration.
     *
     * @return double
     */
    public double getAcceleration() {
        return getVelocity() / getTime();
    }
    
    /**
     * This method finds the value of final velocity.
     * @return double
     */
    public double getVelocityFinal() {
        return getInitialVelocity() + getAcceleration() * getTime();
    }

    /**
     * This method finds the initial velocity.
     * @return double
     */
    public double getVelocityInitial() {
        return getFinalVelocity() - getAcceleration() * getTime();
    }

    /**
     * This method finds time.
     * @return double
     */
    public double time() {
        return (getFinalVelocity() - getInitialVelocity()) / getTime();
    }
    
    /**
     * This method finds distance.
     * @return double
     */
    public double distance() {
        double average = (getFinalVelocity() + getInitialVelocity()) / 2;
        return average * getTime();
    }
}
