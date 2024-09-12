package q1;

public class ConversaoDeUnidadesDeArea {
	
	public static double metroPe(double pe){
        double metro = pe * 10.76;
        return metro;
    }
	
	public static double peCentimetros(double centimetros){
        double pe = centimetros * 1.609;
        return pe;
    }
	
	public static double milhaAcre(double acre){
        double milha = acre * 1.609;
        return milha;
    }
	
	public static double acrePe(double pe){
        double acre = pe * 1.609;
        return acre;
    }

}
