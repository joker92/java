import java.util.Scanner;


public class Ciclo {

	public static void main(String args[]) {
		String s = "Strings are immutable";
		char result;
		int c= 0;
		int l = s.length();
		for (int i = 0; i < l; i++) {
			 result = s.charAt(i);
			if(result == 'a'){
				c+=1;	
			}
			
			
		}
		System.out.println( c );

}
}