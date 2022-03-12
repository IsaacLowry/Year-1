import java.util.*;

public class LottoNum {
	
	/**
	 * Private Set created
	 */
	private List<MySet> userSet = new ArrayList<MySet>();
	/**
	 * Private Set created of MySet
	 */
	private MySet random = new MySet();
	/**
	 * Creates an integer
	 */
	private int lotteryMax = 0;
	/**
	 * Creates an integer
	 */
	private int lotteryMin = 0;
			
	/**
	 * Processes user input
	 * Sets up amount of players and the range of numbers
	 * Processes user's lottery numbers
	 */
	public void userInput() {
		
		while(true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("How many people are playing the lottery");
			String pInput = s1.nextLine();
			
			try {

				int  number = Integer.parseInt(pInput);
				if (number<1)
				{
					System.out.println("Wrong input");
					continue;
				}
				for(int i = 0; i<number; i++) {
					userSet.add(new MySet());
				}
				break;
			}
			
			catch (Exception e) {
				System.out.println("Wrong Input");
			}
		}
		
		while(true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please enter the lower boundary for the range, then press enter");
			System.out.println("and then enter the upper boundary for the range, then press enter");
			int[] range = new int[2];
			for(int c = 0; c<2; c++) {
				try {
					range[c]=s1.nextInt();
				}
				
				catch(Exception e) {
					break;
				}
			}
			if (range[0] > 0 && range[1] > range[0] && range[1] - range[0] >= 5) {
				lotteryMin = range[0];
				lotteryMax = range[1];
				break;
			}

			System.out.println("Wrong Input");

		}
		
		for(int i = 0; i<userSet.size(); i++) {
			while (true) {
				Scanner s1 = new Scanner(System.in);
				System.out.printf("\nPlayer %d\n", i+1);
				System.out.printf("Please enter 6 unique numbers between %d & %d eg - 42 5 12 32 24 16\n",lotteryMin, lotteryMax);
				String input = s1.nextLine();
				String[] userNum = input.split(" ");
				
				if (userNum.length == 6) {
					int parseCount = 0;
					for (String num : userNum) {
						try {
							int number = Integer.parseInt(num);
							parseCount++;
							if (!userSet.get(i).add(number)) {
								userSet.get(i).clear();
								break;
							}
						}
						
						catch (Exception e) {
							System.out.println("Error");
							break;
						}				
					}
					if (parseCount == 6) {
						break;
					}
				}
			}
		}	
	}
	
	
	/**
	 * Runs a lottery generating random numbers
	 */
	public void runLottery() {
		
		for(int i = 0; i<6; i++) {
			while(true) {
				
				Random r = new Random();
				int rnum = r.nextInt(lotteryMax)+lotteryMin;
				
				if(random.add(rnum)) {
					break;
				}
			}
		}
		winCheck();
	}
	/**
	 * Checks if user has won or lost in the lottery and displays appropriate message
	 */
	public void winCheck() {
		
		for(int i = 0; i<userSet.size(); i++) {
			Set<Integer> check = userSet.get(i).intersection(random);
			System.out.printf("\nPlayer %d\n", i+1);
			if (check.size() == 6) {
				System.out.println("Congratulations you have won £1,000,000");
			}
			
			else if (check.size() == 5) {
				System.out.println("Congratulations you have won £1,000");
			}
			
			else if (check.size() == 4) {
				System.out.println("Congratulations you have won £100");
			}
			
			else if (check.size() == 3) {
				System.out.println("Congratulations you have won £25");
			}
			
			else {
				System.out.println("Try again next time!");
			}
		}
	}
}