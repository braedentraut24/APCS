//Braeden Trautz p5
package towers.of.hanoi;

import java.util.Scanner;

public class TowersOfHanoi {

public static void main(String[] args) {
    // Player selects number of discs
    // First play will be play(disks, tower1, tower3, tower2)
    String from, to, extra;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    Scanner scan4 = new Scanner(System.in);
    System.out.println("Please enter number of disks.");
    int numDisks = scan.nextInt();
    System.out.println("Enter the name of your origin peg (ex: Peg One).");
    from = scan2.nextLine();
    System.out.println("Enter the name of your destination peg.");
    to = scan3.nextLine();
    System.out.println("Enter the name of your extra peg.");
    extra = scan4.nextLine();
    play(numDisks, from, to, extra);
}

public static void play(int numDisks, String from, String to, String extra) {
    if (numDisks == 0){
        //System.out.println("Move from " +from+ " to " +to+ ".");
        return;
    } else {
        play(numDisks - 1, from, to, extra);
        System.out.println("Move from " +from+ " to " +to+ ".");
        play(numDisks - 1, extra, from, to);
    }
}

}
