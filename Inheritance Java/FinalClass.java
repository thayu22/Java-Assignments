/**
*Description of Final Class
*
*@author Thayuran Logendran
*@version 1.0 - December 2025
 */
public class FinalClass extends CalculationClass {

    /**
     * This finds the distance with the help of velocity and time.
     * 
     * @return double
     */
    public double getDistance() {
        return getChangeInTime() * getChangeInVelocity();
    }

    /**
     * This finds the time with the help of distance and velocity.
     * 
     * @return double
     */
    public double getTime() {
        return getChangeInDistance() / getChangeInVelocity();
    }

    /**
     * This finds the velocity with the help of distance and time.
     * 
     * @return double
     */
    public double getVelocity() {
        return getChangeInDistance() / getChangeInTime();
    }
}