
public class PqFormel {

	public static void main(String[] args) {
		double p = 4;
		double q = 4;
		double[] pq = pqFormel(p, q);
		System.out.printf("x1: %.3f; x2: %.3f", pq[0], pq[1]);
	}

	public static double[] pqFormel (double p, double q) {
		double[] rueckgabe = new double[2];
		double f1 = -(p/2);
		double f2 = Math.sqrt(f1*f1-q);
		rueckgabe[0] = f1 - f2;
		rueckgabe[1] = f1 + f2;
		return rueckgabe;
	}
}
