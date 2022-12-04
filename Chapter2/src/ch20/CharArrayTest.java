package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] alpahabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alpahabets.length; i++) {
			alpahabets[i] = ch++;
		}
		
		for(char alpha : alpahabets) {
			System.out.println(alpha + "," + (int)alpha);
		}
	}

}
