
public class WashMachine implements ComputeWeight
{
	public double washMachineWeight;         		 //洗衣机的重量
	public WashMachine(double z,int num3)			 //构造函数初始化成员变量
	{
		washMachineWeight=z*num3;        //洗衣机的总重量
	}
	public double computeWeight()
	{
		return washMachineWeight;
	}
}
