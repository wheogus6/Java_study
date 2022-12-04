package ch21;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int num = 1;
		
		for (; ; num++) {
			sum += num;
			if(sum >= 100)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
