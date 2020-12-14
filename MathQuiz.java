/*
   Filename:     MathQuiz.java
   Description:  Mathematics Quiz
*/

import java.util.Scanner;
 public class MathQuiz {
	 public static void main( String[] args ) {
		 Scanner x = new Scanner(System.in);
		 String a ;
		 int userAnswer = 0;
		 int marks = 0;
		 int b = 0 ;
		 int c = 0;
		 int d = 0;
		 int noq = 0;   //number of question
		 int temp = 0;
		 int i = 1 ;
		 double percent = 0;
		 System.out.println("Welcome to Math Quiz");
		 do{
			System.out.println("-=| Main Menu |=-");
		    System.out.println("1) Addition");
		    System.out.println("2) Subtraction");
		    System.out.println("3) Multiplication");
		    System.out.println("4) Division");
		    System.out.println("5) Randoom");
		    System.out.println("");
		    System.out.println("9) Quit");
		    System.out.print(">");
		    a = x.nextLine();  // user input number
		    if( a = "1" && a = "2" && a = "3" && a = "4" && a = "5" && a = "9"){
		    	System.out.print("Error! Input accept integer only. Input 1-5 or 9.");}
		}while( a = "1" && a = "2" && a = "3" && a = "4" && a = "5" && a = "9");
			System.out.print("Number of Qusetions:");
			int n = x.nextInt();
			switch (a) {
				case "1":
					for(  i=1; i<=n;i++ ) {
					 b = (int) (Math.random() * 50 + 1);
					 c = (int) (Math.random() * 50 + 1);
					int answer = b + c;
					System.out.print("Q" + i + ":" + b + "+" + c +"=");
					 userAnswer = x.nextInt();
					if (userAnswer == answer){
						marks = marks + 1;}
				}
				break;
				case "2":
				for(  i=1; i<=n;i++ ) {
					 b = (int) (Math.random() * 9 + 1);
					 c = (int) (Math.random() * 9 + 1);
					int answer = b * c ;
					System.out.print("Q" + i + ":" + b + "*" + c +"=");
					userAnswer = x.nextInt();
					if (userAnswer == answer){
						marks = marks + 1;}
					}
					break;
				case "3":
				for(  i=1; i<=n;i++ ) {
					do{
					   b = (int) (Math.random() * 98 + 1);
					   c = (int) (Math.random() * 98 + 1);
					}while ( c < b );
					int answer = b - c ;
					System.out.print("Q" + i + ":" + b + "*" + c +"=");
					userAnswer = x.nextInt();
					if (userAnswer == answer){
						marks = marks + 1;}
				}
				break;
				case "4":
				for(  i=1; i<=n;i++ ) {
					c = (int) (Math.random() * 38 + 2);
					int answer = b - c ;
					System.out.print("Q" + i + ":" + b + "*" + c +"=");
					userAnswer = x.nextInt();
					if (userAnswer == answer){
						marks = marks + 1;}
					}
					break;
			       case "5":
			       for( i=1; i<=n;i++ ) {
					temp = (int) (Math.random() * 5);
					switch (temp){
				   	 case '1':
						for(  i=1; i<=n;i++ ) {
							 b = (int) (Math.random() * 50 + 1);
					 		 c = (int) (Math.random() * 50 + 1);
					 	         int answer = b + c;
					 		 System.out.print("Q" + i + ":" + b + "+" + c +"=");
					 		 userAnswer = x.nextInt();
					 		 if (userAnswer == answer){
					 		 	marks = marks + 1;}
					 		}
					 		break;
					case '2':
						for(  i=1; i<=n;i++ ) {
						 	b = (int) (Math.random() * 9 + 1);
							c = (int) (Math.random() * 9 + 1);
					 		int answer = b * c ;
					 		System.out.print("Q" + i + ":" + b + "*" + c +"=");
					 		userAnswer = x.nextInt();
					 		if (userAnswer == answer){
					 			marks = marks + 1;}
					 		}
					 		break;
					case '3':
						for(  i=1; i<=n;i++ ) {
							do{
							   b = (int) (Math.random() * 98 + 1);
							   c = (int) (Math.random() * 98 + 1);
							}while ( c < b );
							int answer = b - c ;
							System.out.print("Q" + i + ":" + b + "*" + c +"=");
							userAnswer = x.nextInt();
							if (userAnswer == answer){
								marks = marks + 1;}
							}
							break;
				   	case '4':
					    	for(  i=1; i<=n;i++ ) {
							c = (int) (Math.random() * 38 + 2);
							int answer = b - c ;
							System.out.print("Q" + i + ":" + b + "*" + c +"=");
							userAnswer = x.nextInt();
							if (userAnswer == answer){
		 						marks = marks + 1;}
	 					}
	 					break;}
									}
				 case "9":
					System.out.print("Good Bye!!");
					break;}
			System.out.println("You've answered" + n + "question");
			System.out.println(marks + "of them are correct");
			System.out.println("And your mark is" + percent + "%");
			}
		}
