import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		System.out.println("Welcome to game of economy");
		System.out.println("Your goal is not to reach negative balance, you will loose 20 balance everyday.");
		System.out.println("You can buy and sell stocks but you can only do one action each day, these actions are:");
		System.out.println("sell <stock-name> <amount> - Just sell will sell all your stocks, adding a name will sell only those stocks, adding an amount will sell the amount you specify from the stock you want.");
		System.out.println("buy <stock-name> <amount> - You must specify all parameters in this action, this will buy stocks.");
		System.out.println("Any other input will skip the day, so make sure you enter the names and the commands right.");
		System.out.println("Type cancel to quit the game");
		int day = 1;
		Scanner sc = new Scanner(System.in);
		while(true){
			if(Api.getBalance() <= -100){
				System.out.println("Game over");
				System.out.println("You survived "+day+" days. Git gud now.");
				break;
			}
			Api.generateStockValues();
			System.out.println("Day "+day);
			System.out.println("Your balance is: "+Api.getStringBalance());
			System.out.println("Today's stock values:");
			System.out.println(Api.getStockValues());
			System.out.println("Your current stock amounts:");
			System.out.println(Api.getStockAmounts());
			
			String input = sc.nextLine();
			if(input.equals("cancel"))
				break;
			String[] str = input.split(" ");
			if(str.length > 3)
				break;
			if(str.length == 1 && str[0].equals("sell")){
				Api.sellStock("all", 0);
			} else if(str[0].equals("sell")){
				if(str.length == 2)
					Api.sellAllStock(str[1]);
				else if(str.length == 3)
					try{
						int amount = Integer.parseInt(str[2]);
						Api.sellStock(str[1], amount);
					} catch (NumberFormatException e){
						e.printStackTrace();
					}
			} else if(str[0].equals("buy")){
				if(str.length == 3){
					try{
						int amount = Integer.parseInt(str[2]);
						Api.buyStock(str[1], amount);
					} catch (NumberFormatException e){
						e.printStackTrace();
					}
				}
			}
			Api.setBalance(Api.getBalance()-20);
			day++;
			Api.reloadStockValues();
		}
	}

}
