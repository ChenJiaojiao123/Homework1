/**
 *@ClassName:Car
 *@Description:
 *@author Chenjiao
 *@date:2017��11��11��
 */
public class Car 
{
	static ComputeWeight[] weight=new ComputeWeight[3];
	public static void main(String[] aigs)
	{
		weight[0]=new Television(40,5);   //���õ��ӵĵ�������������
		weight[1]=new Computer(60,6);	  //���ü�����ĵ�������������
		weight[2]=new WashMachine(70,7);  //����ϴ�»��ĵ�������������
		double allWeight=weight[0].computeWeight()+weight[1].computeWeight()+weight[2].computeWeight();
		System.out.println("������װ�صĻ����������Ϊ:"+allWeight+"kg");
	}
}
