import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * This is the test program for 4221 HW2 MC Estimation.
 * 
 * @author W. Chen
 */
public final class HW2MCE {

	/**
	 * Default constructor--private to prevent instantiation.
	 */
	private HW2MCE() {
		// no code needed here
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            the command line arguments; unused here
	 */
	public static void main(String[] args) {
		SimpleReader input = new SimpleReader1L();
		SimpleWriter output = new SimpleWriter1L();

		output.print("Number of points: ");
		int n = input.nextInteger();

		int ptsInInterval = 0, ptsInSubinterval = 0;

		Random rnd = new Random1L();

		while (ptsInInterval < n) {
			double x = rnd.nextDouble();
			ptsInInterval++;
			if (x < 0.5) {
				ptsInSubinterval++;
			}
		}

		double estimate = 100.0 * ptsInSubinterval / ptsInInterval;
		output.println("Estimate of percentage: " + estimate + "%");

		input.close();
		output.close();
	}
}

