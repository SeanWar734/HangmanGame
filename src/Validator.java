

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Validator {
//COMMENTED OUT TESTING
	//private static FileHelper<Player> fileHelper = new FileHelper<>("src/Players.txt", new PlayerLineConverter());

	
//	public static void main(String[] args) {
//		List<Player> player = fileHelper.readAll();
//		fileHelper.rewrite(Arrays.asList(new Player("Jill", 462, 0)));
//		fileHelper.append(new Player("Bill", 6, 2));
//		fileHelper.append(new Player("Sean", 42, 999));
//		
//		Scanner scnr = new Scanner(System.in);
//		String userName = "";
//		System.out.println("Please enter a name:");
//		 userName = getUserName(scnr," is already in use. Please enter a different name.", player);
//	}

	public static String getUserName(Scanner scnr,String prompt,List<Player> players){
		String input = "";
		boolean isTrue = true;
				
		do {
			do {
				input = getString(scnr,"");
			for(int i = 0; i < players.size(); ++i ) {
				if(players.get(i).getName().equalsIgnoreCase(input)) {
					System.out.println(input + prompt);
					isTrue = false;
					break;
				}else {
					isTrue = true;
				}
			}
			}while(!isTrue);
			String confirmation = getYesNo(scnr,"You entered " + input + ". Is this correct?");
			if(confirmation.equalsIgnoreCase("YES")) {
				break;
			}else {
				continue;
			}
		}while(true);
		
		
		
		return input;
	}
	
	
//GET DIFFICULTY 
	public static String getDifficulty(Scanner scnr,String prompt) {
		String input = "";
		do {
			input = getString(scnr, "");
			if(input.equalsIgnoreCase("EASY")||input.equalsIgnoreCase("MEDIUM")||input.equalsIgnoreCase("HARD")) {
				break;
			}else {
				System.out.println("\nPlease enter \"EASY,\" \"MEDIUM,\" or \"HARD\"\n");
				continue;
			}
			
		}while(true);
		
		return input;
	}
	
	
	
//GET USER PIN
	public static String getPin(Scanner scnr,String prompt) {
		String input;
		String regex = "\\d\\d\\d\\d";
		do {
			input = getString(scnr, "");
			if(input.matches(regex)) {
				break;
			}else {
				System.out.println("\nPlease\n");
				continue;
			}
			
		}while(true);
		
		return input;
	}



//GET AN INTEGER
	public static int getInt(Scanner scnr, String prompt) {
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); 
			System.out.println(prompt);
		}
		int result = scnr.nextInt();
		scnr.nextLine(); 
		return result;
	}

	
	
//GET A STRING
	public static String getString(Scanner scnr, String prompt) {
	System.out.print(prompt);
		return scnr.nextLine();
	}

	
	
//GET A DOUBLE
	public static double getDouble(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine(); // clear bad line.
				System.out.println("Sorry, I can't read that. Enter a number, using digits.");
			}
		} while (!isValid);

		double number = scnr.nextDouble();
		scnr.nextLine(); // clear for next line of input.
		return number;
	}
	
	

//GET A STRING W/MATCHING REGEX
	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

	
	
//GET CORRECT COMMAND
	public static String getCommand(Scanner scnr,String prompt) {
		String input = "";
		String addRegex = "[ADDadd]{3}\\s[A-Za-z]+,[0-9]+";
		do {
			input = getString(scnr, "");
			if(input.equalsIgnoreCase("LIST")||input.matches(addRegex)||input.equalsIgnoreCase("QUIT")||input.equalsIgnoreCase("COMMANDS")) {
				break;
			}else {
				System.out.println("\nPlease enter one of the commands listed above\n");
				continue;
			}
			
		}while(true);
		
		return input;
	}



//GET MODEL NAME
	public static String getModel(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.equalsIgnoreCase("model y") || input.equalsIgnoreCase("wrx") || input.equalsIgnoreCase("fusion") || input.equalsIgnoreCase("rav4") || input.equalsIgnoreCase("equinox") || input.equalsIgnoreCase("veloster")) {
				isValid = true;
			} else {
				System.out.println("Please enter a model name only.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}
	

	
//GET YES OR NO
	public static String getYesNo(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		System.out.println(prompt);
		do {
			input = getString(scnr,"");

			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")){
				isValid = true;
			} else {
				System.out.print("\nPlease enter \"YES\" or \"NO\". ");
				isValid = false;
			}

		} while (!isValid);
		
		return input;
	}
	
	
	
//GET CORRECT MENU NUMBER
	public static int getMenuNum(Scanner scnr, String prompt,int min,int max) {
		boolean isValid = false;
		//String userInput = "";
		int num = 0;
		do {
			//try {
			num = scnr.nextInt();
			isValid = true;
//CHECKS FOR QUIT COMMAND
//			}catch(InputMismatchException im) {
//				userInput = scnr.nextLine();
//				if(userInput.equalsIgnoreCase("quit")) {
//					userInput = getYesNo(scnr, "Unsaved progress will be lost. Are you sure you wish to quit? ");
//					if(userInput.equalsIgnoreCase("yes")) {
//						num = 0;
//						return num;
//					}else {
//						System.out.print(prompt);
//					}
//				}else {
//					System.out.print(prompt);
//				}
//				
//				continue;
//			}
				
			if (num < min || num > max) {
				isValid = false;
				scnr.nextLine();
				System.out.print("Please enter a number between " + min + " and " + max + ": ");
			}else {
				scnr.nextLine();
				isValid = true;
			}
		}while(!isValid);
			
			return num;
	}

	
	
//GET PROPER DATE FORMAT
	public static String getDate(Scanner scnr, String prompt) {
		boolean isValid = false;
		String date;
		do {
			date = getString(scnr,prompt);
			isValid = true;
		try {
			Date correctDate = new SimpleDateFormat("MM/dd/yyyy").parse(date);
		}catch(ParseException pe) {
			isValid = false;
			System.out.print("");
				System.out.print("Please use [MM/DD/YYYY] formatting: ");
			}
		
		
		}while(!isValid);
		
		return date;
	}
}