
public class Television implements ComputeWeight
{
	double televisionWeight;   	  		   //���ӵ�����
	public Television(double x,int num1)   //���캯����ʼ����Ա����
	{
		televisionWeight=x*num1;     //���ӻ���������
	}
	public double computeWeight(){
		return televisionWeight;
	}
}
