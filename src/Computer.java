
public class Computer implements ComputeWeight
{	
	public double computerWeight;				//计算机的重量
	public Computer(double y,int num2)			//构造函数初始化成员变量
	{
		computerWeight=y*num2;				//计算机的总重量
	}
	public double computeWeight(){
		return computerWeight;
	}
}
