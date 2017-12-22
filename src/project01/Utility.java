/*
 * Author: Zubair Ab Aziz
 * Email: zabaziz@u.rochester.edu
 * Phone: (585) 284-1150
 * Assignment: Project01
 * Lab Section: MW, 1525-1640
 * Collaboration: I did not collaborate with anyone
 */

package project01;

public class Utility {

	public static void printf(String format, Object... obj) {
		System.out.printf(format, obj);
	}

	public static void print(String obj) {
		System.out.print(obj);
	}

	public static void println(String obj) {
		System.out.println(obj);
	}

	public static void clearScreen() {
		for (int i = 0; i < 50; i++)
			System.out.println("");
		System.out.flush();
	}

}
