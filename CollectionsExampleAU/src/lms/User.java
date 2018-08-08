package lms;

import java.util.Scanner;
import java.util.InputMismatchException;

public class User {

	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		RequestHandler requestHandler = new RequestHandler();
		do {
			System.out.println("WHAT DO YOU WANT TO DO??");
			System.out.println("1.ADD A CHALLENGE");
			System.out.println("2.DISPLAY ALL ADDED CHALLENGES ");
			System.out.println("3.DELETE ALL CHALLENGES");
			System.out.println("4.TO KNOW THE EARNED POINTS");
			System.out.println("5.HAVE YOU COMPLETED ANY ADDED CHALLENGE? IF YES,");
			System.out.println("Enter your choice");
			int selectedOption = Integer.parseInt(scanner.nextLine());
			switch (selectedOption) {

			// 1. ADD A CHALLENGE
			case 1:
				System.out.println();
				int time;
				String identificationName, nameOfTheChallenge, category, videoLink, type;
				double rating;
				boolean seen;
				try {
					System.out.println(
							"Enter the identification name,\nAlways enter the important word from video which you can remember");
					identificationName = scanner.nextLine();
					System.out.println("Enter name of the challenge");
					nameOfTheChallenge = scanner.nextLine();
					System.out.println("Enter the time");
					time = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter the rating");
					rating = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Enter the category");
					category = scanner.nextLine();
					System.out.println("Paste the video link");
					videoLink = scanner.nextLine();
					System.out.println("Enter the type");
					type = scanner.nextLine();
					System.out.println("If you have completed the challenge type \"true\" else type \"false\"");
					seen = scanner.nextBoolean();

				}

				catch (InputMismatchException e) {
					throw new InputMismatchException("OOPS!!! YOU TYPED WRONG INPUT!!!");
				}

				requestHandler.addingChallenge(new AdaptiveU(identificationName, nameOfTheChallenge, time, rating,
						category, videoLink, type, seen));
				break;

			// 2. DISPLAY ALL ADDED CHALLENGES
			case 2:
				requestHandler.displayAllAddedChallenges();
				break;

			// 3. DELETE ALL CHALLENGES
			case 3:
				requestHandler.deleteAllAddedChallenges();
				break;

			// 4. TO KNOW THE EARNED POINTS
			case 4:
				int result = requestHandler.addingPoints();
				System.out.println("The number of points earned  are " + result);
				if(result>300)
					System.out.println("Amazing!!!Keep it up..Great!!You can get yummy snacks from AdaptiveU store..Enjoyyy");
				else if(result>=150 && result<300)
					System.out.println("Hey you crossed 150 points..Now you can get yummy snacks from AdativeU Store!!");
				else 
					System.out.println("You didn't reach the target!!Atleast try to score 150\n to get snacks from AdaptiveU store");
				break;

			// 5. HAVE YOU COMPLETED ANY ADDED CHALLENGE? IF YES,
			case 5:
				System.out.println("Enter the identification name");
				String idName = scanner.nextLine();
				requestHandler.setTrueIfSeen(idName);
				break;

			default:
				System.out.println("Enter a valid option!!!!");
			}
			scanner.nextLine();
			System.out.println("Do you want to continue?? If you want to continue type \"yes\" else \"no\"");
			ch = scanner.nextLine().trim().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		scanner.close();

	}

}
