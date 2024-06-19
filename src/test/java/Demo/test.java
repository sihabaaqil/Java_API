package test;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= {1,2,99,4,5,3,7};
		int b[] = {22,99,2,1,6,4,6};
		
		
		//merge two array and remove dupli
		
		int a1 = a.length;
		int b1 = b.length;
		int c1=a1+b1;
		int c[] = new int[c1];
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		System.out.println(Arrays.toString(c));
		
	}

}
