import java.time.LocalDateTime;
import java.util.Objects;

public final class Timeslot {
	private final int timeslot_id;
	private final int room_id;
//	private final String building_id;
	private final LocalDateTime start_date;
	private final LocalDateTime end_date;
	private final boolean status;
	
	
	public Timeslot(LocalDateTime start_date, LocalDateTime end_date) {
		this.start_date = Objects.requireNonNull(start_date,"Start time is required.");
		this.end_date = Objects.requireNonNull(end_date,"End time is required.");
		
		if(!end_date.isAfter(start_date)) {
			throw new IllegalArguementException("End time must be after start time.");
		}
	}
	public boolean overlaps(Timeslot other) {
		Objects.requireNonNull(other,"Other period is required.");
		return start_date.isBefore(other.end_date) && other.start_date.isBefore(end_date);
	}
	
	public boolean isAvailable() {
		return status;
	}
	public int getTimeslotId() {
		return timeslot_id;
	}
	public int getRoomId() {
		return room_id;
	}
//	public String getBuildingId() {
//		return building_id;
//	}
	public LocalDateTime getStartDate() {
		return start_date;
	}
	public LocalDateTime getEndDate() {
		return end_date;
	}
	

}