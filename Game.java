import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to game of economy");
		System.out.println("Your goal is not to reach -100 balance, you will loose 15 balance everyday.");
		System.out.println("You can buy and sell stocks but you can do one action each day, these actions are:");
		System.out.println("cashout <stock-name> <amount> - Just cashout will sell all your stocks, adding a name will sell only those stocks, adding an amount will sell the amount you specify from the stock you want.");
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
			if(str.length == 1 && str[0].equals("cashout")){
				//todo
			} else if(str[0].equals("cashout")){
				//todo
			} else if(str[0].equals("buy")){
				//todo
			}
			Api.setBalance(Api.getBalance()-15);
			day++;
			
		}
	}

}
