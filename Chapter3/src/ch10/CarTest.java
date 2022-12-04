package ch10;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCAr = new AICar();
		aiCAr.run();
		
		System.out.println("=======================");
		
		Car mCar = new ManualCar();
		mCar.run();
	}

}
