package edlift.model;

/**
 * Class representing a healthy lift. The healthy lift promotes a healthy
 * lifestyle by always making you walk at least one floor. As a result, if the
 * request is to go to the 4th floor, it leaves you at the 3rd; if it is to go
 * down from the 4th to the 1st, it leaves you at the 2nd; and so on.
 * 
 * @author michelemazzaa
 */
public class HealthyLift extends Lift {

	/**
	 * Constructor for the HealthyLift class.
	 * 
	 * @param minFloor     The minimum floor the lift can reach.
	 * @param maxFloor     The maximum floor the lift can reach.
	 * @param initialFloor The initial floor of the lift.
	 * @param speed        The speed of the lift.
	 */
	public HealthyLift(int minFloor, int maxFloor, int initialFloor, double speed) {
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
		RequestResult res;
		checkArrivalFloor(floor);
		if (getCurrentState().equals(LiftState.REST) && (Math.abs(getCurrentFloor() - floor) > 1)) {
			if (floor > getCurrentFloor())
				floor -= 1;
			if (floor < getCurrentFloor())
				floor += 1;
			setRequestedFloor(floor);
			res = RequestResult.MODIFIED;
			res.setMsg("modified to floor " + floor);
			res.setFloor(floor);
		} else {
			res = RequestResult.REJECTED;
			res.setMsg("rejected as unhealthy");
			res.setFloor(Integer.MIN_VALUE);
		}
		return res;
	}

	/**
	 * Gets the mode of the lift.
	 * 
	 * @return The mode of the lift.
	 */
	@Override
	public String getMode() {
		return "HEALTHY";
	}

}
