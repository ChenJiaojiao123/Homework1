
public class WashMachine implements ComputeWeight
{
	public double washMachineWeight;         		 //ϴ�»�������
	public WashMachine(double z,int num3)			 //���캯����ʼ����Ա����
	{
		washMachineWeight=z*num3;        //ϴ�»���������
	}
	public double computeWeight()
	{
		return washMachineWeight;
	}
}
