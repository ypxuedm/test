package breakdemo;

import com.data.DataTool;

public class zuoye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(;;)	{
		System.out.println("1.制造商资料管理");
		System.out.println("2.销售商品品牌管理");
		System.out.println("3.商品类别管理");
		System.out.println("4.商品详细信息管理");
		System.out.println("0.退出程序");
		
//		int b=0;
		int b=DataTool.inputInt();
		if(b==0){
			
			System.out.println("欢迎使用本软件，再见！");
			break;
		}
		else if(b==1){
			
			System.out.println("1.查看已有产品制造商");
			System.out.println("2.增加产品制造商");
			System.out.println("0.返回主界面");
			int c=DataTool.inputInt();
			if(c==0){
//				continue;
			}
			else{
				
				System.out.println("系统出错，请重启程序！");
				break;
			}

		}
		else{
			System.out.println("系统出错，请重启程序！");
			break;
		}
		
		}
		
		
	}

}
