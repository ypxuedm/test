package ifdemo;

import com.data.DataTool;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=DataTool.inputInt();
		switch(month){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"�·���31��");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"�·���30��");
			break;
			
		case 2:
			System.out.println(month+"�·���28��");
			break;
			
		default:
			System.out.println("������·�");
		}
	}
	

}
