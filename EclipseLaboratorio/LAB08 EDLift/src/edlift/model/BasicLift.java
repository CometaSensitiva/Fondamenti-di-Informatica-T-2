package edlift.model;

/**
 * Class representing a basic lift. The basic lift accepts only one call at a
 * time and serves it. While serving a call, it does not accept any other calls.
 * 
 * @author michelemazzaa
 */
public class BasicLift extends Lift {

	/**
	 * Constructor for the BasicLift class.
	 * 
	 * @param minFloor     The minimum floor the lift can reach.
	 * @param maxFloor     The maximum floor the lift can reach.
	 * @param initialFloor The initial floor of the lift.
	 * @param speed        The speed of the lift.
	 */
	public BasicLift(int minFloor, int maxFloor, int initialFloor, double speed) {
		super(minFloor, maxFloor, initialFloor, speed);
	}

	/**
	 * Requests the lift to go to a specific floor.
	 * 
	 * @param floor The floor to go to.
	 * @return The result of the request.
	 */
	@Override
	public RequestResult goToFloor(int floor) {
		RequestResult result;
		checkArrivalFloor(floor);
		if (getCurrentState().equals(LiftState.REST)) {
			setRequestedFloor(floor);
			result = RequestResult.ACCEPTED;
			result.setFloor(floor);
			result.setMsg(getMode());
		} else
			result = RequestResult.REJECTED;
		return result;
	}

	/**
	 * Gets the mode of the lift.
	 * 
	 * @return The mode of the lift.
	 */
	@Override
	public String getMode() {
		return "BASIC";
	}

}
