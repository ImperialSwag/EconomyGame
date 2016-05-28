import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to game of economy");
		System.out.println("Your goal is not to reach -100 balance, you will loose 15 balance everyday.");
		System.out.println("Type cancel to quit the game");
		int day = 1;
		Scanner sc = new Scanner(System.in);
		while(true){
			Api.setAbyss_value((Math.random()*40)-20);
			System.out.println("Day "+day);
			System.out.println("Your balance is: "+Api.getBalance());
			if(sc.nextLine().equals("cancel"))
				break;
			
		}
	}

}
