
public class Api {
	public static double balance = 100;
	public static int abyss_amount = 0;
	public static double abyss_value = 5;
	public static int giant_amount = 0;
	public static double giant_value = 5;
	public static int lautrec_amount = 0;
	public static double lautrec_value = 5;
	
	public static int getAbyss_amount() {
		return abyss_amount;
	}
	public static void setAbyss_amount(int abyss_amount) {
		Api.abyss_amount = abyss_amount;
	}
	public static double getAbyss_value() {
		return abyss_value;
	}
	public static void setAbyss_value(double abyss_value) {
		Api.abyss_value = abyss_value;
	}
	public static int getGiant_amount() {
		return giant_amount;
	}
	public static void setGiant_amount(int giant_amount) {
		Api.giant_amount = giant_amount;
	}
	public static double getGiant_value() {
		return giant_value;
	}
	public static void setGiant_value(double giant_value) {
		Api.giant_value = giant_value;
	}
	public static int getLautrec_amount() {
		return lautrec_amount;
	}
	public static void setLautrec_amount(int lautrec_amount) {
		Api.lautrec_amount = lautrec_amount;
	}
	public static double getLautrec_value() {
		return lautrec_value;
	}
	public static void setLautrec_value(double lautrec_value) {
		Api.lautrec_value = lautrec_value;
	}
	public static double getBalance(){
		return balance;
	}
	public static void setBalance(double bal){
		balance = bal;
	}
	public static void addBalance(double bal){
		setBalance(getBalance()+bal);
	}
	public static void removeBalance(double bal){
		setBalance(getBalance()-bal);
	}
}
