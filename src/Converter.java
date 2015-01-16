import java.util.Scanner;
import java.util.Arrays;
public class Converter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = "";
		while(!word.equals("!")){
		System.out.print("Please enter a word: ");
		word = s.next();
		String output = "";
		int wLen = word.length();
		System.out.print("|");
		for (int i = 0; i<wLen; i++){
			char letter = word.charAt(i);
			String sLetter = Character.toString(letter);
			String code = convert(sLetter);
			//output+= code;
			//output+="|";
			System.out.print(code+"|");
		}
		System.out.println("");
		}
	}
	public static String convert(String letter){
		String[] letters  = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] codes = {"+-", "-+++", "-+-+", "-++", "+", "++-+", "--+", "++++", "++", "+---", "-+-", "+-++", "--", "-+", "---", "+--+", "--+-", "+-+", "+++", "-", "++-", "+++-", "+--", "-++-", "-+--", "--++", "-----", "+----", "++---", "+++--", "++++-", "+++++", "-++++", "--+++", "---++", "----+"};
		
		int location = Arrays.binarySearch(letters, letter);
		String morse = codes[location];
		return morse;
	}

}
