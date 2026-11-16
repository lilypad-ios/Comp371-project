

public final class Users {
	private final int user_id;
	
	private final enum UserRole = {
		STUDENT,
		STAFF,
		BOOKING_AGENT
	};
	private final String user_name;

	
	public Users(String user_id, String user_role, String user_name) {
		if (user_id == null || user_id.isBlank()) {
			throw new IllegalArguementException("User ID is required.");
		}
		if (user_role == null || user_role.isBlank()) {
			throw new IllegalArguementException("User role is required.");
		}
		if (user_name == null || user_name.isBlank()) {
			throw new IllegalArguementException("User name is required.");
		}
		this.user_id = user_id;
		this.user_role = user_role;
		this.user_name = user_name;
	}
	
	public int getUserId() {
		return user_id;
	}
	public String getUserRole() {
		return user_role;
	}
	public String getUserName() {
		return user_name;
	}

}

