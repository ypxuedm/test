package breakdemo;

import com.data.DataTool;

public class zuoye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(;;)	{
		System.out.println("1.���������Ϲ���");
		System.out.println("2.������ƷƷ�ƹ���");
		System.out.println("3.��Ʒ������");
		System.out.println("4.��Ʒ��ϸ��Ϣ����");
		System.out.println("0.�˳�����");
		
//		int b=0;
		int b=DataTool.inputInt();
		if(b==0){
			
			System.out.println("��ӭʹ�ñ�������ټ���");
			break;
		}
		else if(b==1){
			
			System.out.println("1.�鿴���в�Ʒ������");
			System.out.println("2.���Ӳ�Ʒ������");
			System.out.println("0.����������");
			int c=DataTool.inputInt();
			if(c==0){
//				continue;
			}
			else{
				
				System.out.println("ϵͳ��������������");
				break;
			}

		}
		else{
			System.out.println("ϵͳ��������������");
			break;
		}
		
		}
		
		
	}

}
