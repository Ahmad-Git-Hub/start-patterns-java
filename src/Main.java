

public class Main {

	public static void main(String[] args) {

	    	createShape1(10);
	    	createShape2(10);
	    	createShape3(9);



	}

	public static void createShape3(int lines) {

		for (int i = 0; i < lines; i++) {
			if (i < lines / 2) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = lines; j > (i * 2) + 1; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else if (i == lines / 2) {
				for(int j = 0; j <= lines/2+1 ; j++) {
				System.out.print(" ");
				}
				System.out.print("*");
			}

			else {

				for (int j = lines; j >= i; j--) {

					System.out.print(" ");
				}
				System.out.print("*");

				for (int j = lines / 2; j < (i * 2) - 5; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void createShape2(int lines) {

		for (int i = 0; i < lines / 2; i++) {

			if (i == 0 || i == (lines - 1) / 2) {
				for (int j = 0; j < lines; j++) {
					System.out.print(" *");
				}

				System.out.println();
			} else {
				System.out.print("*");
				for (int j = 0; j < lines; j++) {
					System.out.print("  ");
				}
				System.out.println("*");
			}

		}

	}

	public static void createShape1(int lines) {

		for (int i = 0; i < lines; i++) {

			if (i < lines / 2) {
				for (int j = lines / 2; j > i + 1; j--) {
					System.out.print("-");
				}
				if (i != 0 && i != 8) {
					System.out.print("*");
				}

				for (int j = 0; j < (i * 2) - 1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");

				for (int j = lines / 2; j > i + 1; j--) {
					System.out.print("-");
				}
			}

			// i = 5

			else {
				if (i != lines - 1)
					for (int j = lines / 2; j <= i; j++) {
						System.out.print("-");
					}
				if (i != 9)
					System.out.print("*");

				for (int j = (lines * 2) - 1; j > (i * 2) + 4; j--) {
					System.out.print(" ");
				}
				if (i < 8) {
					System.out.print("*");
				}

				if (i != (lines - 1))
					for (int j = lines / 2; j <= i; j++) {
						System.out.print("-");
					}

			}
			System.out.println();
		}
	}
}