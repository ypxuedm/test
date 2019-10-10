package xunhuanzuoye;

import com.data.DataTool;

public class n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=1;
		int i=DataTool.inputInt();
		while(n<=i){
			
			sum=sum*n++;
		}
		System.out.println(sum);
	}

}
