package sve;

public class One0001stPrime {

	public static void main(String[] args) {

		izlaz: for (int i = 2, count = 0; i < Integer.MAX_VALUE; i++) {

			for (int j = 2; j < Integer.MAX_VALUE; j++) {

				if (i % j == 0) {

					if (j == i) {
						count++;
						if (count == 10001) {
							System.out.println(i);
							break izlaz;
						}
						break;
					}

					break;
				}
				if (j > i) {
					break;
				}

			}

		}

	}

}
