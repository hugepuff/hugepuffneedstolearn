
/**
 * 
 * @author W.Chen
 * 
 */
public final class HW23 {

	/**
	 * HW2_1 is a utility class.
	 */
	private HW23() {
	}

	/**
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		int i = 3, j = 4, n = 0;
		while (i != 0) {
			n += j;
			System.out.println("i= " + i);
			System.out.println("j= " + j);
			System.out.println("n= " + n + "\n");

			i--;
			System.out.println("i= " + i);
			System.out.println("j= " + j);
			System.out.println("n= " + n + "\n");

		}

	}

}
