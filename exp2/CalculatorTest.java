/*
 * Aim:Programs on method and constructor overloading.
 *
 * Coder: Mayuresh Devrukhkar
 * Class: Computer Engineering - A Division
 * UIN/Roll No: 251P071 / 11
*/

import java.util.Scanner;

public class CalculatorTest {
public static void main(String[] args){
    Calculator c1 = new Calculator();
    System.out.println("A:" +c1.a+", B: "+c1.b);

    Calculator c2 = new Calculator();
    System.out.println("A: "+c2.a+", B:"+c2.b);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Integer: ");
    int x = sc.nextInt();
    System.out.println("Enter Second Integer: ");
    int y = sc.nextInt();
    c1.add(x, y);


    System.out.println("Enter First Integer: ");
    double p = sc.nextDouble();
    System.out.println("Enter Second Integer: ");
    double q = sc.nextDouble();
    c1.add(p,q);

    sc.close();
}

}
