public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int towerOfHanoi(int num) {
		if (num < 3) { 
			return -1;
		}

		return moveCalc(num); 
	}

	private static int moveCalc(int i) {
		if (i == 1) { 
			return 1;
		}
		else { 
			int movesForNMinus1 = moveCalc(i - 1);
			return 2 * movesForNMinus1 + 1;
		}
	}
}