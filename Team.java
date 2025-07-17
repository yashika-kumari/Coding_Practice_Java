/* Team Games with Ross Geller
Ross Geller, a paleontologist and a member of the beloved group from the sitcom Friends, decides to organize a weekend full of fun and engaging team games with his friends. Eager to make the most of this gathering, he plans to split his friends into equal-sized teams. However, Ross quickly realizes that managing a large group can be tricky, especially when the number of friends doesn't evenly divide by the number of teams he wants to create.

To ensure that everyone has a fair chance to participate and to keep the games organized, Ross wants to know exactly how many friends can be placed in each team, as well as how many friends will be left without a team. This way, he can utilize the left-out friends as assistants for organizing and managing the games, ensuring that everyone still has a role to play.

You are tasked with writing a program to help Ross calculate the number of friends in each team and how many will be left out after forming the teams.



Input Format

The program will receive two integers:

The first integer represents the total number of friends Ross has.
The second integer represents the number of teams he wants to form.


Output Format

The program should output a statement indicating:

The number of friends in each team.
The number of friends left out.


Sample Input

60

8



Sample Output

The number of friends in each team is 7 and left out is 4



Explanation

Ross has 60 friends and he wants to split them into 8 teams.

If 60 friends are divided into 8 teams, each team will have 7 friends (60 // 8 = 7).

There will be 4 friends left out (60 % 8 = 4), who will assist Ross in managing the games. */

package com.company;
import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int teams = sc.nextInt();
        int number_each = friends / teams;
        int left_out = friends % teams;
        System.out.println("The number of friends in each team is "+number_each+" and left out is "+left_out);
        sc.close();
    }
}
