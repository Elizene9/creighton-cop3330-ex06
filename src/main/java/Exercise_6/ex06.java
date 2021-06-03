package Exercise_6;

import java.util.Calendar;
import java.util.Scanner;

/*
Create a program that determines how many years you have left until retirement and the year you can retire.
 It should prompt for your current age and the age you want to retire
 and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
 */
public class ex06 {

    public static void main(String[] args) {

        int year = Calendar.getInstance().get(Calendar.YEAR);

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is your current age? ");

        String age = input.nextLine();

        System.out.print("\nAt what age would you like to retire? ");

        String retire = input.nextLine();

        int Age = Integer.parseInt(age);
        int Retire = Integer.parseInt(retire);

        System.out.printf("\nYou have %d years left until you can retire.\n", Retire - Age);

        System.out.printf("\nIt's %d, so you can retire in %d.", year, year + (Retire - Age));
    }
}
