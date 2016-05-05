
import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		int sel;
		int day;
		int num=0;
		double allFee=0;
		String[] carType={"宝马","奔驰","奥迪"};
		int[] busType={16,32};
		String[] motos=new String[12];//把所有的车存在一个数组中
		String[] motoNo=new String[12];//车牌号
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("编号     车型       车牌号                 日租金");
		//罗列出所有的车
		  for (int j = 0; j < 3; j++) {//共有3种轿车
			for (int k = 0; k < 2; k++) {//每种有2辆
				motoNo[num]= "鲁B" + (int) ((Math.random() * 90000) + 10000);
				double[] carFee={500,600,400};
				//存放车辆信息
				motos[num]=(num+1)+"    "+carType[j]+"        " +motoNo[num]+"   "+carFee[j];
				System.out.println(motos[num]);
				num=num+1;
			}
		}
		  num=6;
		System.out.println("编号     车型      车牌号                  日租金");
		for (int j = 0; j < 2; j++) {//共有2种客车
			for (int k = 0; k <3; k++) {//每种有3辆
				motoNo[num]= "鲁B" + (int) ((Math.random() * 90000) + 10000);
				double[] busFee={2000,1000};
				motos[num]=(num+1)+"    "+busType[j]+"      " +motoNo[num]+"   "+busFee[j];
				System.out.println(motos[num]);
				num=num+1;
			}
		}
		System.out.println("共租几辆车？");
		int n=input.nextInt();
		for (int i = 0; i < n; i++) {
		System.out.println("1,轿车  2,客车");
		 sel = input.nextInt();
		if (sel == 1) {
			Moto moto =new Car("123");//父类有参构造函数  子类Car调用有参构造函数
			System.out.println("请选择要租的车：");
			sel=input.nextInt();
			System.out.println("请输入天数:");
			 day = input.nextInt();
			 ((Car) moto).setType(carType[(sel-1)/2]);
			double totalFee=moto.rentFee(day);
			System.out.println("已选择："+motos[sel-1]+"共租"+day+"天  需"+totalFee+"元");
			allFee=allFee+totalFee;
			
			
		} else {
			Moto moto =new Bus("123");//父类有参构造函数  子类Car调用有参构造函数
			System.out.println("请选择要租的车：");
			sel=input.nextInt();
			System.out.println("请输入天数:");
			 day = input.nextInt();
			 ((Bus) moto).setSeatCount(busType[(sel-7)/3]);
				double totalFee=moto.rentFee(day);
				System.out.println("已选择："+motos[sel-1]+"共租"+day+"天  需"+totalFee+"元");
				allFee=allFee+totalFee;
		}
		}
		System.out.println("共需租金"+allFee);
		}
	public static void main(String[] args) {
		Sys s=new Sys();
		s.rentMoto();
	}
}
