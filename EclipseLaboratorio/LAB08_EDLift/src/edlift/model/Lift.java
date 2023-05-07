package edlift.model;

/**
 * Abstract class representing a lift. The lift has a minimum and maximum floor,
 * a current floor and a requested floor. It also has a current state and a
 * speed.
 */
public abstract class Lift {

	private int currentFloor, requestedFloor;
	private final int minFloor, maxFloor;
	private LiftState currentState;
	private final double speed;

	/**
	 * Constructor for the Lift class.
	 * 
	 * @param minFloor     The minimum floor the lift can reach.
	 * @param maxFloor     The maximum floor the lift can reach.
	 * @param initialFloor The initial floor of the lift.
	 * @param speed        The speed of the lift.
	 * @throws IllegalArgumentException if minFloor >= maxFloor, initialFloor <
	 *                                  minFloor, initialFloor > maxFloor or speed
	 *                                  <= 0.
	 */
	protected Lift(int minFloor, int maxFloor, int initialFloor, double speed) {
		// Check input arguments: if illegal, an alarm is triggered
		// through the exception mechanism (which we will see better later)
		// NB: this functionality is tested, so it must not be deleted. Do not touch!
		if (minFloor >= maxFloor)
			throw new IllegalArgumentException("min floor >= max floor");
		if (initialFloor < minFloor)
			throw new IllegalArgumentException("current floor < min floor");
		if (maxFloor < initialFloor)
			throw new IllegalArgumentException("current floor > max floor");
		if (speed <= 0)
			throw new IllegalArgumentException("speed must be positive");
		this.maxFloor = maxFloor;
		this.minFloor = minFloor;
		this.currentFloor = initialFloor;
		this.requestedFloor = initialFloor;
		this.currentState = LiftState.REST;
		this.speed = speed;
	}

	/**
	 * Gets the current floor of the lift.
	 * 
	 * @return The current floor of the lift.
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * Sets the current floor of the lift.
	 * 
	 * @param current The new current floor of the lift.
	 */
	public void setCurrentFloor(int current) {
		if (current != this.currentFloor) {
			this.currentFloor = current;
		}
	}

	/**
	 * Gets the minimum floor the lift can reach.
	 * 
	 * @return The minimum floor the lift can reach.
	 */
	public int getMinFloor() {
		return minFloor;
	}

	/**
	 * Gets the maximum floor the lift can reach.
	 * 
	 * @return The maximum floor the lift can reach.
	 */
	public int getMaxFloor() {
		return maxFloor;
	}

	/**
	 * Gets the speed of the lift.
	 * 
	 * @return The speed of the lift.
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * Gets the current state of the lift.
	 * 
	 * @return The current state of the lift.
	 */
	public LiftState getCurrentState() {
		return currentState;
	}

	/**
	 * Sets the current state of the lift.
	 * 
	 * @param newState The new current state of the lift.
	 */
	public void setCurrentState(LiftState newState) {
		if (this.currentState != newState) {
			this.currentState = newState;
		}
	}

	/**
	 * Gets the next pending floor for a multi-floor lift.
	 * 
	 * @param state The current state of the lift.
	 * @return The next pending floor for a multi-floor lift.
	 */
	public int nextPendingFloor(LiftState state) {
		// useful for multi-floor lift, in the future
		return Integer.MIN_VALUE;
	}

	/**
	 * Checks if there are any pending floors for a multi-floor lift.
	 * 
	 * @return true if there are pending floors, false otherwise.
	 */
	public boolean hasPendingFloors() {
		// useful for multi-floor lift, in the future
		return false;
	}

	/**
	 * Gets the mode of the lift.
	 * 
	 * @return The mode of the lift.
	 */
	public abstract String getMode();

	/**
	 * Requests the lift to go to a specific floor.
	 * 
	 * @param floor The floor to go to.
	 * @return The result of the request.
	 */
	public abstract RequestResult goToFloor(int floor);

	/**
	 * Sets the requested floor of the lift.
	 * 
	 * @param floor The new requested floor of the lift.
	 */
	public void setRequestedFloor(int floor) {
		this.requestedFloor = floor;
	}

	/**
	 * Gets the requested floor of the lift.
	 * 
	 * @return The requested floor of the lift.
	 */
	public int getRequestedFloor() {
		return this.requestedFloor;
	}

	/**
	 * Returns a string representation of the lift.
	 * 
	 * @return A string representation of the lift.
	 */
	@Override
	public String toString() {
		return getMode() + " lift serving floor " + minFloor + " to " + maxFloor;
	}

	/**
	 * Creates a new Lift object of the specified mode.
	 * 
	 * @param mode     The mode of the lift.
	 * @param minFloor The minimum floor the lift can reach.
	 * @param maxFloor The maximum floor the lift can reach.
	 * @param speed    The speed of the lift.
	 * @return A new Lift object of the specified mode.
	 * @throws IllegalArgumentException if the mode is not supported.
	 */
	public static Lift of(String mode, int minFloor, int maxFloor, double speed) {
		int initialFloor = (minFloor <= 0 && maxFloor >= 1) ? 0 : minFloor;
		return switch (mode) {
		case "BASIC" -> new BasicLift(minFloor, maxFloor, initialFloor, speed);
		case "HEALTHY" -> new HealthyLift(minFloor, maxFloor, initialFloor, speed);
		case "MULTIFLOOR" -> new MultiFloorLift(minFloor, maxFloor, initialFloor, speed);
		// NB: the default case also uses the exception mechanism (which
		// we will see later)
		// to trigger an alarm related to the presence of an illegal argument
		default -> throw new IllegalArgumentException("Unsupported lift mode");
		};
	}

	/**
	 * Checks if the arrival floor is within the range of the lift.
	 * 
	 * @param floor The arrival floor to check.
	 * @throws IllegalArgumentException if the arrival floor is out of range.
	 */
	protected void checkArrivalFloor(int floor) {
		// Here too, the exception mechanism (which we will see later) is used
		// to trigger an alarm related to the presence of an illegal argument
		if (floor > getMaxFloor() || floor < getMinFloor())
			throw new IllegalArgumentException("Arrival floor out of range");
	}
}
