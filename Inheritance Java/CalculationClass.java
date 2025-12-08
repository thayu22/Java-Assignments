/**
*Description of Calculation Class
*
*@author Thayuran Logendran
*@version 1.0 - December 2025
 */
public class CalculationClass {

    /** Final velocity */
    protected double velocityTwo;
    /** Initial velocity */
    protected double veloctiyOne;
    /** Final distance */
    protected double distanceTwo;
    /** Initial Distance */
    protected double distanceOne;
    /** Final time */
    protected double timeTwo;
    /** Initial time */
    protected double timeOne;

    /**
     * This is a no-argument Constructor.
     */
    public CalculationClass() {
    }

    /**
     * This is CalculationClass Constructor
     * 
     * @param finalVelocity
     * @param finalTime
     * @param finalDistance
     * @param initialVelocity
     * @param initialTime
     * @param initialDistance
     */
    public CalculationClass(double finalVelocity, double finalTime, double finalDistance, double initialVelocity,
            double initialTime, double initialDistance) {
        this.velocityTwo = finalVelocity;
        this.timeTwo = finalTime;
        this.distanceTwo = finalDistance;
        this.veloctiyOne = initialVelocity;
        this.timeOne = initialTime;
        this.distanceOne = initialDistance;
    }

    /**
     * This gets final velocity.
     * 
     * @return double
     */
    public double getFinalVelocity() {
        return velocityTwo;
    }

    /**
     * This gets final time.
     * 
     * @return double
     */
    public double getFinalTime() {
        return timeTwo;
    }

    /**
     * This gets final distance.
     * 
     * @return double
     */
    public double getFinalDistance() {
        return distanceTwo;
    }

    /**
     * This gets initial velocity.
     * 
     * @return double
     */
    public double getInitialVelocity() {
        return veloctiyOne;
    }

    /**
     * This gets initial time.
     * 
     * @return double
     */
    public double getInitialTime() {
        return timeOne;
    }

    /**
     * This gets initial distance.
     * 
     * @return double
     */
    public double getInitialDistance() {
        return distanceOne;
    }

    /**
     * This finds the change in velocity with the help of final and initial
     * velocity.
     * 
     * @return double
     */
    public double getChangeInVelocity() {
        return getFinalVelocity() - getInitialVelocity();
    }

    /**
     * This finds the change in distance with the help of final and initial
     * distance.
     * 
     * @return double
     */
    public double getChangeInDistance() {
        return getFinalDistance() - getInitialDistance();
    }

    /**
     * This finds the change in time with the help of final and initial time.
     * 
     * @return double
     */
    public double getChangeInTime() {
        return getFinalTime() - getInitialTime();
    }
}
