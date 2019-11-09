package com.class9;

public class Pattern {

	public static void main(String[] args) {

		for (int k = 1; k <= 5; k++) {
			System.out.print("*");
			{
				for (int l = 1; l < 5; l++) {
					System.out.println("*");
				}
				System.out.println("------------------------");
			}
			// ******
			// *******
			// ******
			// ******

			for (int i = 0; i < 10; i++) {// rows
				for (int y = 0; y < 10; y++) {// cols
					System.out.print("*");
				}
				System.out.println();

				System.out.println("------------------------");
			}

			/*
			 * 12345 12345 12345 12345
			 */

			for (int i = 1; i < 5; i++) {

				for (int j = 1; j < 6; j++) {

					System.out.print("j");
				}

				System.out.println();
				{

					/*
					 * 123456789 123456789 123456789 123456789
					 */

					for (int ii = 0; ii < 9; ii++) {
						for (int j = 1; j < 7; j++) {
							System.out.print("ii");
						}
						System.out.println();
					}
				}
			}
		}
	}
}
