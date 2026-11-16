import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public final class Booking {
	private final int booking_id;
	private final int timeslot_id;
	private final int user_id;
	private final int room_id;
	private final String booking_status;
	public enum bookingStatus {
		BOOKED,
		CANCELLED,
		OVERRIDDEN
	};
	private final List<Loan> loans = new ArrayList<>();
    private int nextLoanNumber = 1;

	
	public Booking(int booking_id, int timeslot_id, int user_id, int room_id, String booking_status) {
//		int booking_id;		
		this.booking_id = booking_id;
		this.timeslot_id = timeslot_id;
		this. user_id = user_id;
		this.room_id = room_id;
		this.booking_status = booking_status;
	
	}
	
	
	public boolean isAvailable() {
		if (booking_status != AVAILABLE) {
            System.out.println("Booking " + this.bookingId + " is not available.");
        }
		return status;
	}
	

}