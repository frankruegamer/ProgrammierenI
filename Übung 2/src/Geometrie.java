
public class Geometrie {
	public static void main (String[] args) {
		Kugel(5);
	}
	
	public static void Kreis (double radius) {
		double flaeche = Math.PI * radius * radius;
		double umfang = 2 * radius * Math.PI;
		System.out.println(String.format("Kreisfläche: %.3f; Kreisumfang: %.3f", flaeche, umfang));
	}
	
	public static void Kugel (double radius) {
		double volumen = (4/3) * Math.PI * Math.pow(radius, 3);
		double umfang = 2 * radius * Math.PI;
		System.out.println(String.format("Kugelvolumen: %.3f; Kugelumfang: %.3f", volumen, umfang));
	}
}
