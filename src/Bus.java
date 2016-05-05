
public class Bus extends Moto {
	private int seatCount;

	public Bus(String MotoNo) {
		super(MotoNo);
	}

	public double rentFee(int day) {
		// type day
		if (seatCount >= 16) {
			setFee(2000);
		} else {
			setFee(1000);
		}
		return super.rentFee(day);// ÖØÓÃ
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}

