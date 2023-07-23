package converter;
import java.lang.Math;
import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
// assigns the currency worth in respect to USD
		final double PESO = 0.059;
		final double EURO = 1.11;
		final double FRANC = 1.15;
		final double YUAN = 0.14;
		boolean X = true;
	
		System.out.println("Hello, welcome to the currencey converter.");
//loop begins	
	while(X) {
		System.out.println("Please enter the number corresponding with the currency you with to convert");
		System.out.println("1. US Dollar\n2. Mexican Peso\n3. Euro\r4. Swiss Franc\n5. Chinese yuan\n");
		
		int Cur1= myObj.nextInt();
		
		System.out.println("How much of this currency do you have: ");
		double Amount= myObj.nextDouble();
		double IntAmount = Amount;
		System.out.println("Which currency would you like to convert to?");
		System.out.println("1. US Dollar\n2. Mexican Peso\n3. Euro\r4. Swiss Franc\n5. Chinese yuan\n");
		int Cur2 = myObj.nextInt();
		
		
		String First="";
// Converts the initial currency to USD
		switch(Cur1) {
		case 1:
			First = "US Dollars";
			break;
		case 2:
			Amount = Amount*PESO;
		    First = "Pesos";
			break;
		case 3:
			Amount = Amount*EURO;
			First = "Euros";
			break;
		case 4:
			Amount = Amount*FRANC;
			First = "Francs";
			break;
		case 5:
			Amount = Amount*YUAN;
			First = "Yuan";
			break;
		}
//rounds the amount to 1 or 2 decimal places.
		Amount = Math.round(Amount*100.0)/100.0;
//converts the USD equivalent of the initial amount to the second currency
		String Second="";
		switch(Cur2) {
			case 1:
				Second = "US Dollars";
				break;
			case 2:
				Amount = Amount/PESO;
				Second = "Pesos";
				break;
			case 3:
				Amount = Amount/EURO;
				Second = "Euros";
				break;
			case 4:
				Amount = Amount/FRANC;
				Second = "Francs";
				break;
			case 5:
				Amount = Amount/YUAN;
				Second = "Yuan";
				break;
			}
//gives user their desired information, and asks if they wish to do it again
		System.out.println(IntAmount+" " + First +" Converts to " + Math.round(Amount*100.0)/100.0+" "+ Second);
		
		System.out.println("Would you like to test another currency? Enter y for yes or n for no.");
		//clears scanner
		myObj.nextLine();
		//checks if user wishes to repeat loop
		String Answer = myObj.nextLine();
		
		if(Answer.equalsIgnoreCase("y")) {
			X=true;
		}else if(Answer.equalsIgnoreCase("n")) {
			X=false;
		}
		
	}
	//goodbye message
	System.out.println("Thanks for using Evan's currency converter!");
	myObj.close();
	
		}
		
		
		
		

	}


