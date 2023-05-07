package edlift.model;

import edlift.model.util.Queue;

/**
 * Represents a multi-floor lift that extends the Lift class. The lift has a
 * queue to keep track of the floors it needs to visit.
 */
public class MultiFloorLift extends Lift {

	private Queue queue;

	/**
	 * Constructs a new MultiFloorLift object with the specified minimum floor,
	 * maximum floor, initial floor, and speed. A new Queue object with a capacity
	 * of 4 is also created.
	 *
	 * @param minFloor     The minimum floor the lift can reach.
	 * @param maxFloor     The maximum floor the lift can reach.
	 * @param initialFloor The initial floor the lift starts on.
	 * @param speed        The speed of the lift in floors per second.
	 */
	public MultiFloorLift(int minFloor, int maxFloor, int initialFloor, double speed) {
		super(minFloor, maxFloor, initialFloor, speed);
		queue = new Queue(4);
	}

	/**
	 * Requests the lift to go to the specified floor. Unlike other lifts, this type
	 * of lift accepts requests even while it is moving. If the lift is not at rest,
	 * the floor is added to the queue of floors to be visited. If the queue is
	 * full, the request is rejected and a RequestResult object with a status of
	 * REJECTED and a message indicating that there are too many pending requests is
	 * returned. Otherwise, the request is accepted and a RequestResult object with
	 * a status of ACCEPTED is returned. If the lift is at rest, the requested floor
	 * is set and a RequestResult object with a status of ACCEPTED is returned.
	 *
	 * @param floor The floor to go to.
	 * @return A RequestResult object indicating if the request was accepted or
	 *         rejected.
	 */
	@Override
	public RequestResult goToFloor(int floor) {
		checkArrivalFloor(floor);
		if (getCurrentState() != LiftState.REST) {
			if (!queue.insert(floor)) {
				RequestResult result = RequestResult.REJECTED;
				result.setMsg("rejected because of too many pending requests");
				result.setFloor(Integer.MIN_VALUE);
				return result;
			}
			return RequestResult.ACCEPTED;
		} else {
			setRequestedFloor(floor);
			return RequestResult.ACCEPTED;
		}
	}

	/**
	 * Checks if the lift has any pending floors to visit.
	 *
	 * @return True if the lift has pending floors to visit, false otherwise.
	 */
	public boolean hasPendingFloors() {
		return queue.hasItems();
	}

	/**
	 * Returns the next pending floor to be visited by the lift. The floor is
	 * removed from the queue of pending floors.
	 *
	 * @param state The current state of the lift.
	 * @return The next pending floor to be visited by the lift.
	 */
	public int nextPendingFloor(LiftState state) {
		return queue.extract();
	}

	/**
	 * Gets the mode of the lift.
	 * 
	 * @return The mode of the lift.
	 */
	@Override
	public String getMode() {
		return "MULTI";
	}

}
