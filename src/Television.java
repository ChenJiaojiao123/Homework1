
public class Television implements ComputeWeight
{
	double televisionWeight;   	  		   //电视的重量
	public Television(double x,int num1)   //构造函数初始化成员变量
	{
		televisionWeight=x*num1;     //电视机的总重量
	}
	public double computeWeight(){
		return televisionWeight;
	}
}
