package com.itibo.tasks.second;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		/*
		 * This is cap
		 */
		
		// System.out.println(GratestCommonDivisor.gcd(3, 5));
		
		Packet firstPacket = new Packet(5);
		Packet secondPacket = new Packet(8);
		
		Instruction ins = new Instruction(firstPacket, secondPacket, 4);
		
		/*
		 * Block of real code
		 */
		
		/*Scanner sc = new Scanner(System.in);
		int water;
		
		Packet firstPacket = new Packet();
		Packet secondPacket = new Packet();
		
		System.out.println("Enter the space of packet.");
		
		System.out.print("First packet: ");
		firstPacket.setSpace(sc.nextInt());

		System.out.print("Second packet: ");
		secondPacket.setSpace(sc.nextInt());
		
		System.out.print("Enter the volume of water: ");
		water = sc.nextInt();
		
		Instruction(firstPacket, secondPacket, water); */
	}
}