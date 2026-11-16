

// use builder pattern for booking

public class Main {
	public enum availability {
		AVAILABLE,
		BOOKED_BY_STUDENT,
		BOOKED_BY_STAFF,
	};

	
	public static void main(String[] args) {
//		Student student = new Student(
//			"111111"
//		);
		
		
		
		public static final class Builder {
			private final LocalDateTime start_date;
			private final LocalDateTime end_date;
			
			public Builder purpose(String purpose) {
				this.purpose = Object.requireNonNull(purpose);
				return this;
			}
			public BookingRequest build() {
				if(!start_date.isBefore(end_date) {
					throw new IllegalStateException("Start date must be before end date.")
				}
				return new BookingRequest(this);
			}
		}
		
		
		BookingRequest request = new BookingRequest.builder()
			
					
			.build();
		

	
	}
}