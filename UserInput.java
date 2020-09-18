//Abby Stamper
// Period 2
import java.io.*;
import java.util.*;
 
public class UserInput{
 public static void main(String args[]){
 
   Scanner randomNum = new Scanner(System.in);
 
   String outputs = "";
 
   System.out.println("Type a Negative Number:");
   int negative = randomNum.nextInt();
   int absolute = (Math.abs(negative));
   System.out.println("Type a Positive Number greater than " + absolute);
   int positive = randomNum.nextInt();
   int multiplier = positive - absolute;
   int numbers = ((int)(Math.random() * multiplier + absolute));
   outputs += numbers;
   numbers = ((int)(Math.random() * multiplier + negative));
   outputs += " and a " + numbers;
   System.out.println("You got a " + outputs);


   Scanner madLibs = new Scanner(System.in);

   System.out.println("Facial part");
   String facialPart = madLibs.nextLine();
   System.out.println("Choose a random name");
   String name = madLibs.next();
   System.out.println("Pick a random number with a decimal to the hundredths place");
   double height = madLibs.nextDouble();
   System.out.println("Age");
   int age = madLibs.nextInt();
   System.out.println("What is your favorite whole number?");
   int favNum = madLibs.nextInt();
   System.out.println("action");
   String action = madLibs.next();
   System.out.println("Favorite food");
   String food = madLibs.next();
   System.out.println("Single digit number");
   double num1 = madLibs.nextInt();
   System.out.println("Single digit number");
   double num2 = madLibs.nextInt();
   double answer = Math.pow(num1,num2);

   System.out.println(name +  " is " + height + " feet tall. He is " + age + " years old but acts like he is " + favNum + ". When he is not " + action + ", he is shoving " + food + " down his " + facialPart + ". Maybe someday " + name + " will be able to do " + num1 + " to the power of " + num2 + " equals " + answer + ".");

  }
}
