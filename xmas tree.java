public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			for (int j = i; j < 19; j++) {
				System.out.print(" ");
				if (i == 0 &&  j == 9) {
					System.out. print("*");
				}


				if (i == 11 && j == 9) {
					System.out.print("||");
					/* for (int c = 0; c<19;c++){
					     System.out.print("_");}*/
				}



				if (i == 1 &&  j == 10) {
					System.out. print("^");
				}



				if (i > 1 && j == 10) {
					for (int a = 1; a < i; a++) {




						System.out.print("^");
					}
				}






				if (i > 1 && j == 10) {
					for (int a = 0; a < i; a++) {
						System.out.print("^");
					}
				}
			}





			System.out.println();
		}
		System.out.println("________ || ________");
		System.out.print("Merry Christmas ⛄");



	}
}










