
import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		int sel;
		int day;
		int num=0;
		double allFee=0;
		String[] carType={"����","����","�µ�"};
		int[] busType={16,32};
		String[] motos=new String[12];//�����еĳ�����һ��������
		String[] motoNo=new String[12];//���ƺ�
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("���     ����       ���ƺ�                 �����");
		//���г����еĳ�
		  for (int j = 0; j < 3; j++) {//����3�ֽγ�
			for (int k = 0; k < 2; k++) {//ÿ����2��
				motoNo[num]= "³B" + (int) ((Math.random() * 90000) + 10000);
				double[] carFee={500,600,400};
				//��ų�����Ϣ
				motos[num]=(num+1)+"    "+carType[j]+"        " +motoNo[num]+"   "+carFee[j];
				System.out.println(motos[num]);
				num=num+1;
			}
		}
		  num=6;
		System.out.println("���     ����      ���ƺ�                  �����");
		for (int j = 0; j < 2; j++) {//����2�ֿͳ�
			for (int k = 0; k <3; k++) {//ÿ����3��
				motoNo[num]= "³B" + (int) ((Math.random() * 90000) + 10000);
				double[] busFee={2000,1000};
				motos[num]=(num+1)+"    "+busType[j]+"      " +motoNo[num]+"   "+busFee[j];
				System.out.println(motos[num]);
				num=num+1;
			}
		}
		System.out.println("���⼸������");
		int n=input.nextInt();
		for (int i = 0; i < n; i++) {
		System.out.println("1,�γ�  2,�ͳ�");
		 sel = input.nextInt();
		if (sel == 1) {
			Moto moto =new Car("123");//�����вι��캯��  ����Car�����вι��캯��
			System.out.println("��ѡ��Ҫ��ĳ���");
			sel=input.nextInt();
			System.out.println("����������:");
			 day = input.nextInt();
			 ((Car) moto).setType(carType[(sel-1)/2]);
			double totalFee=moto.rentFee(day);
			System.out.println("��ѡ��"+motos[sel-1]+"����"+day+"��  ��"+totalFee+"Ԫ");
			allFee=allFee+totalFee;
			
			
		} else {
			Moto moto =new Bus("123");//�����вι��캯��  ����Car�����вι��캯��
			System.out.println("��ѡ��Ҫ��ĳ���");
			sel=input.nextInt();
			System.out.println("����������:");
			 day = input.nextInt();
			 ((Bus) moto).setSeatCount(busType[(sel-7)/3]);
				double totalFee=moto.rentFee(day);
				System.out.println("��ѡ��"+motos[sel-1]+"����"+day+"��  ��"+totalFee+"Ԫ");
				allFee=allFee+totalFee;
		}
		}
		System.out.println("�������"+allFee);
		}
	public static void main(String[] args) {
		Sys s=new Sys();
		s.rentMoto();
	}
}
