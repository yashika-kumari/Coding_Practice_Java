/* Opening the Enchanted Door
In a magical adventure reminiscent of classic tales, Harry Potter, Albus Dumbledore, and Severus Snape find themselves on a quest to locate the Sorcerer's tomb. After overcoming various mystical creatures and spells, they stumble upon a mysterious room with an imposing door adorned with a four-digit number. The door stands as the final barrier before them, but it is enchanted in a way that requires specific knowledge to unlock.

As they approach the door, they see an inscription above it that reads:

"I will be always four."
"I can only be opened when you add my first and last digit and enter it."
"If you find a sign, you should not consider it."
Snape, known for his keen observation skills, takes a moment to analyze the clues. He realizes that the first statement suggests that the four-digit number itself is crucial to solving the riddle. The second statement implies that the key to opening the door lies in the first and last digits of this number. Finally, the last statement warns them to ignore any non-numeric characters, which might be present in their current situation.

The trio quickly concludes that they need to extract the first and last digits of the four-digit number and calculate their sum. This sum is the code they must enter to unlock the door.

You are tasked with writing a program to help Snape calculate the sum of the first and last digits of a given four-digit number so that they can enter the correct code to open the enchanted door.



Input Format

The program will receive a single integer representing the four-digit number on the door.



Output Format

The program will output a single integer, which is the sum of the first and last digits.



Sample Input

1001



Sample Output

2



Explanation

The four-digit number on the door is 1110.

The first digit is 1, and the last digit is 0.

Sum of the first and last digit: 1 + 0 = 1.

So, the door unlocks when they enter 1. */

package com.company;
import java.util.Scanner;
public class Wizarding {
    public static void main(String[] args) {
        int integer;
        Scanner sc = new Scanner(System.in);
        integer = sc.nextInt();
        int firstDigit = integer / 1000;
        int lastDigit = integer % 10;
        int sum = firstDigit + lastDigit;
        System.out.println(sum);
        sc.close();
    }
}
