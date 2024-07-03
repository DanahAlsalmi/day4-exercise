import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            1.Write a program that prints the numbers from 1 to 100 such that:
            If the number is a multiple of 3, you need to print "Fizz" instead of that number.
            If the number is a multiple of 5, you need to print "Buzz" instead of that number.
            If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
        */

//        for (int i = 1; i <=100 ; i++) {
//            if (i%3==0 && i%5==0){
//                System.out.println("-FizzBuzz");
//            } else if (i%5==0) {
//                System.out.println("-Buzz");
//            } else if (i%3==0) {
//                System.out.println("-Fizz");
//            }else {
//                System.out.println("-"+i);
//            }
//        }

        /*
            2.Write a Java program to reverse a string.
            Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT
         */


//        System.out.print("Write a sentence to revers :");
//        String sentence= input.nextLine();
//        String reversed = "";
//
//        for (int i = sentence.length() - 1; i >= 0; i--) {
//            reversed += sentence.charAt(i);
//        }
//
//        System.out.println("Reverse string: " + reversed);


        /*
        3.Write a program to find the factorial value of any number entered through the keyboard.
         */

//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        long factorial =1 ;
//
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println("Factorial of " + number + " is: " + factorial);


        /*
        4.Two numbers are entered through the keyboard. Write a program to find the value
        of one number raised to the power of another. (Do not use Java built-in method)
         */

//        System.out.print("Enter the base number: ");
//        int base = input.nextInt();
//
//        System.out.print("Enter the exponent number: ");
//        int exponent = input.nextInt();
//
//        long result = 1;
//
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        /*
             5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
         */

//        int sumEven = 0;
//        int sumOdd = 0;
//
//        System.out.println("Enter integers (type 0 to finish):");
//
//        while (true) {
//            System.out.print("-");
//            int number = input.nextInt();
//
//            if (number == 0) {
//                break;
//            }
//
//            if (number % 2 == 0) {
//                sumEven += number;
//            } else {
//                sumOdd += number;
//            }
//        }
//        System.out.println("Sum of even integers: " + sumEven);
//        System.out.println("Sum of odd integers: " + sumOdd);


        /*
            6.Write a program that prompts the user to input a positive integer.
             It should then output a message indicating whether the number is a prime number.
         */

//        System.out.print("Enter a positive integer : ");
//        int number = input.nextInt();
//
//        while (number <= 0) {
//            System.out.println("The number is not a positive integer.");
//            System.out.print("Please enter again: ");
//            number = input.nextInt();
//        }
//
//        boolean isPrime = true;
//
//        if (number == 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime && number != 1) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }



        /*
            7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for
            loop to print the days (Days 1 -7) for each week.
            Expected Output:
         */

//        for (int week = 1; week <= 4; week++) {
//            System.out.println("Week " + week);
//
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("  Day " + day);
//            }
//        }

        /*
            8.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome
            if it is the same if we start reading it from left to right or right to left.
         */
//        System.out.print("Enter a word: ");
//        String word = input.nextLine();
//
//        int left = 0;
//        int right = word.length() - 1;
//        boolean isPalindrome = true;
//
//        while (left < right) {
//            if (word.charAt(left) != word.charAt(right)) {
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        String x = (isPalindrome) ? "is a palindrome." : "is not a palindrome.";
//
//        System.out.println(word +" "+ x);
//



    }
}