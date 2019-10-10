package xunhuanzuoye;

import com.data.DataTool;

public class zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outter: for (int i = 200; i >= 200; i++) {
			inner: for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break inner;
				}

				else if (j == i - 1) {
					System.out.println(i);
					break outter;
				}

			}
		}
	}
}