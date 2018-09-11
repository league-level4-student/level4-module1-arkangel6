package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
		
	
	
	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public static void main(String[] args) {
		
		Zodiac data = Zodiac.LIBRA;
		
		
		
		
		int input = JOptionPane.showOptionDialog(null, "Choose one", "Zodiac", 0, -1, null, Zodiac.values(), 0);
		
		
		
		switch(input) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;	
		case 3:
			System.out.println("c");
			break;
		case 4:
			System.out.println("d");
			break;
		case 5:
			System.out.println("e");
			break;		
		case 6:
			System.out.println("f");
			break;
		case 7:
			System.out.println("g");
			break;
		case 8:
			System.out.println("h");
			break;	
		case 9:
			System.out.println("i");
			break;
		case 10:
			System.out.println("j");
			break;
		case 11:
			System.out.println("k");
			break;	
		
		
		}
		
		
	}
	
	
	// 3. Make a main method to test your method
	
}
