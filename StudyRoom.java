

public final class StudyRoom {
	private final int room_id;
	private final int building_id;
	private final boolean status;
	
	
	public boolean isAvailable() {
		return status;
	}
	public int getRoomBuildingId() {
		return room_id, building_id;
	}
	
	
}