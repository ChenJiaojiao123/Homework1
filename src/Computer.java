
public class Computer implements ComputeWeight
{	
	public double computerWeight;				//�����������
	public Computer(double y,int num2)			//���캯����ʼ����Ա����
	{
		computerWeight=y*num2;				//�������������
	}
	public double computeWeight(){
		return computerWeight;
	}
}
