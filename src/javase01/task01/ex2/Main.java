package javase01.task01.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char c;

		System.out.println("Enter characters, 'q' to quit.");

		do {
			c = (char) br.read();
			System.out.print(c);
		} while (c != 'z');
	}
}