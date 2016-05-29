import java.text.DecimalFormat;

public class Api {
	public static DecimalFormat df = new DecimalFormat("#.##");
	public static double balance = 200;
	public static int abyss_amount = 0;
	public static double abyss_value = 50;
	public static int giant_amount = 0;
	public static double giant_value = 50;
	public static int lautrec_amount = 0;
	public static double lautrec_value = 50;

	public static String getStockValues() {
		return "Abyss: " + df.format(abyss_value) + " - Giant: " + df.format(giant_value) + " - Lautrec: "
				+ df.format(lautrec_value);
	}

	public static String getStockAmounts() {
		return "Abyss: " + abyss_amount + " - Giant: " + giant_amount + " - Lautrec: " + lautrec_amount;
	}

	public static void generateStockValues() {
		setAbyss_value(getAbyss_value()+((Math.random() * 40) - 20));
		setGiant_value(getGiant_value()+((Math.random() * 40) - 20));
		setLautrec_value(getLautrec_value()+((Math.random() * 40) - 20));
	}
	public static void reloadStockValues(){
		setAbyss_value(30);
		setGiant_value(30);
		setLautrec_value(30);
	}
	public static boolean buyStock(String st, int amount) {
		if (st.equalsIgnoreCase("abyss")) {
			if (amount * abyss_value > balance)
				return false;
			removeBalance(amount * abyss_value);
			abyss_amount += amount;
			return true;
		} else if (st.equalsIgnoreCase("giant")) {
			if (amount * giant_value > balance)
				return false;
			removeBalance(amount * giant_value);
			giant_amount += amount;
			return true;
		} else if (st.equalsIgnoreCase("lautrec")) {
			if (amount * lautrec_value > balance)
				return false;
			removeBalance(amount * lautrec_value);
			lautrec_amount += amount;
			return true;
		}
		return false;
	}
	public static void sellStock(String st, int amount){
		if(st.equalsIgnoreCase("abyss")){
			if(amount>getAbyss_amount())
				amount=getAbyss_amount();
			addBalance(amount*getAbyss_value());
			setAbyss_amount(getAbyss_amount()-amount);
		}else if(st.equalsIgnoreCase("giant")){
			if(amount>getGiant_amount())
				amount=getGiant_amount();
			addBalance(amount*getGiant_value());
			setGiant_amount(getGiant_amount()-amount);
		}else if(st.equalsIgnoreCase("lautrec")){
			if(amount>getLautrec_amount())
				amount=getLautrec_amount();
			addBalance(amount*getLautrec_value());
			setLautrec_amount(getLautrec_amount()-amount);
		}else if(st.equalsIgnoreCase("all")){
			if(amount>getAbyss_amount())
				amount=getAbyss_amount();
			addBalance(getAbyss_amount()*getAbyss_value());
			setAbyss_amount(getAbyss_amount()-amount);
			if(amount>getGiant_amount())
				amount=getGiant_amount();
			addBalance(getGiant_amount()*getGiant_value());
			setGiant_amount(getGiant_amount()-amount);
			if(amount>getLautrec_amount())
				amount=getLautrec_amount();
			addBalance(getLautrec_amount()*getLautrec_value());
			setLautrec_amount(getLautrec_amount()-amount);
		}
	}
	public static void sellAllStock(String st){if(st.equalsIgnoreCase("abyss")){
		addBalance(getAbyss_amount()*getAbyss_value());
		setAbyss_amount(0);
	}else if(st.equalsIgnoreCase("giant")){
		addBalance(getGiant_amount()*getGiant_value());
		setGiant_amount(0);
	}else if(st.equalsIgnoreCase("lautrec")){
		addBalance(getLautrec_amount()*getLautrec_value());
		setLautrec_amount(0);
	}else if(st.equalsIgnoreCase("all")){
		addBalance(getAbyss_amount()*getAbyss_value());
		setAbyss_amount(0);
		addBalance(getGiant_amount()*getGiant_value());
		setGiant_amount(0);
		addBalance(getLautrec_amount()*getLautrec_value());
		setLautrec_amount(0);
	}
	}
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

	public static double getBalance() {
		return balance;
	}

	public static String getStringBalance() {
		return df.format(balance);
	}

	public static void setBalance(double bal) {
		balance = bal;
	}

	public static void addBalance(double bal) {
		setBalance(getBalance() + bal);
	}

	public static void removeBalance(double bal) {
		setBalance(getBalance() - bal);
	}
}
