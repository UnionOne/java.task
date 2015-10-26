package javase01.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		System.out.println("Enter lines of text: ");
		System.out.println("Enter 'quit' to quit.");

		do {
			str = br.readLine();

			/*try {
				System.out.println(Integer.parseInt(str) + 10);	
			} catch(Exception e) {
			}*/
			
			if(str.matches("[-+]?\\d+")) {
				System.out.println(Integer.parseInt(str) + 10);
			} else {
				System.out.println(str);
			}

			if (str.equals("quit")) {
				System.out.println("The End.");
			}
		} while (!str.equals("quit"));
	}
}