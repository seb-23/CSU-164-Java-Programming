
public class R15Room implements R15Interface {
	
	private int roomBeds;
	private boolean roomMonitor;

	@Override
	public void R15Init(int roomType) {
		
		if (0<=roomType && roomType <=2) {
			if (roomType == 0) {
				roomBeds = 1;
				roomMonitor = true;
			}
			else if (roomType == 1) {
				roomBeds = 2;
				roomMonitor = true;
			}
			else if (roomType == 2) {
				roomBeds = 1;
				roomMonitor = false;
			}
			else {
				return;
			}
		}

	}

	@Override
	public boolean checkRoom(boolean needsMonitor, boolean needsSingle) {
		if (needsMonitor == roomMonitor && needsSingle && roomBeds == 1) {
			return true;
		}
		else if (roomBeds == 2 && needsMonitor == roomMonitor) {
			return true;
		}
	
		return false;
	}

	@Override
	public int getRoomBeds() {
		return roomBeds;
	}

	@Override
	public void setRoomBeds(int numBeds) {
		roomBeds = numBeds;

	}

	@Override
	public boolean getRoomMonitor() {
		if (roomMonitor) {
			return true;
		}
		return false;
	}

	@Override
	public void setRoomMonitor(boolean hasMonitor) {
		roomMonitor = hasMonitor;

	}

}
