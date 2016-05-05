
import java.util.Random;

public abstract class Moto {
	private String MotoNo;
	private double fee;

	public Moto(String MotoNo) {
		MotoNo = "鲁B" + (int) ((Math.random() * 90000) + 10000);
		this.MotoNo=MotoNo;
	}

	public double rentFee(int day) {
		return day * fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getMotoNo() {
		return MotoNo;
	}

	public void setMotoNo(String motoNo) {
		MotoNo = motoNo;
	}
}
