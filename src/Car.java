/**
 *@ClassName:Car
 *@Description:
 *@author Chenjiao
 *@date:2017年11月11日
 */
public class Car 
{
	static ComputeWeight[] weight=new ComputeWeight[3];
	public static void main(String[] aigs)
	{
		weight[0]=new Television(40,5);   //设置电视的单个重量及个数
		weight[1]=new Computer(60,6);	  //设置计算机的单个重量及个数
		weight[2]=new WashMachine(70,7);  //设置洗衣机的单个重量及个数
		double allWeight=weight[0].computeWeight()+weight[1].computeWeight()+weight[2].computeWeight();
		System.out.println("卡车所装载的货物的总重量为:"+allWeight+"kg");
	}
}
