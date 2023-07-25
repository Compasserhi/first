import java.util.ArrayList;
import java.util.List;

public class test003 {
	public static void main(String[] args) {
		Order x = new Order();
		x.orders=11001;
		x.OrderNum=50;
		x.Price=20;
		x.CustomID=1002;
		x.commodityID=5004;
		x.TransactionDate="2023.7.10";
		System.out.println("���׺ţ�"+x.TSNo()+"�������ƣ�"+x.CustomID+""+x.commodityID+"����������"+x.OrderNum+"�ܶ"+x.count()+"�������ڣ�"+x.TransactionDate);
		
		
		Order x1 = new Order();
		x1.orders=11002;
		x1.OrderNum=20;
		x1.Price=500;
		x1.CustomID=1004;
		x1.commodityID=5003;
		x1.TransactionDate="2023.7.11";
		System.out.println("���׺ţ�"+x1.TSNo()+"�������ƣ�"+x1.CustomID+""+x1.commodityID+"����������"+x1.OrderNum+"�ܶ"+x1.count()+"�������ڣ�"+x1.TransactionDate);
		
		Order x2 = new Order();
		x2.orders=11003;
		x2.OrderNum=30;
		x2.Price=50;
		x2.CustomID=1005;
		x2.commodityID=5001;
		x2.TransactionDate="2023.7.12";
		System.out.println("���׺ţ�"+x2.TSNo()+"�������ƣ�"+x2.CustomID+""+x2.commodityID+"����������"+x2.OrderNum+"�ܶ"+x2.count()+"�������ڣ�"+x2.TransactionDate);
		
		Order x3 = new Order();
		x3.orders=11001;
		x3.OrderNum=46;
		x3.Price=50;
		x3.CustomID=1001;
		x3.commodityID=5001;
		x3.TransactionDate="2023.7.15";
		System.out.println("���׺ţ�"+x3.TSNo()+"�������ƣ�"+x3.CustomID+""+x3.commodityID+"����������"+x3.OrderNum+"�ܶ"+x3.count()+"�������ڣ�"+x3.TransactionDate);
		
		/* shop c = new shop();
		c.shops=11001;
		c.OrderNO=100;
		c.dollarConsumption=100;
		c.jpnConsumption=10000; */
		List<Order> list1 = new ArrayList();
		list1.add(x);
		list1.add(x1);
		list1.add(x2);
		list1.add(x3);
		// System.out.println(x1);
		List<Integer> flag = new ArrayList<>();		//构建一个list，用来存放已经输出过的结
		for (int i = 0; i < list1.size(); i++) {		//遍历所有数据
			int temp = list1.get(i).orders;		//暂存数据orders
			int sum = 0;					//一个sum用来储存结果

			if(flag.contains(temp)){		//如果输出的结果表里包括了这个数据，就不在输出，跳到下一个
				continue;
			}
			flag.add(temp);				//没输出过的数据，添加到flag  List中
			for (int j = i; j < list1.size(); j++) {		//二层循环去找剩下的数据中和orders相同的
				if (list1.get(j).orders == temp){			//判断orders是否相同
					sum += list1.get(j).count();
				}
			}
			System.out.println(list1.get(i).orders+":"+sum);
		}


		
	
	
		
		
		
		
		
		
	}
}
