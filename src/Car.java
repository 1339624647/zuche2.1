
public class Car extends Moto {
	private String type;

	public Car(String MotoNo) {
		super(MotoNo);
	}

	public double rentFee(int day) {
		// type day
		if (type.equals("±¶¬Ì")) {
			setFee(500);
		} else if (type.equals("±º≥€")) {
			setFee(600);
		} else {
			setFee(400);
		}
		return super.rentFee(day);// ÷ÿ”√
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
