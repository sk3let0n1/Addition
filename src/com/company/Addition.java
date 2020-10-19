package com.company;
import java.util.Scanner;


public class Addition {

    public static void main(String[] args) {
		int z1;
		int z2;
		while(true) {
			System.out.print("Zahl 1 eingeben: ");
			Scanner zahl1 = new Scanner(System.in);
			z1 = zahl1.nextInt();
			System.out.print("Zahl 2 eingeben: ");
			Scanner zahl2 = new Scanner(System.in);
			z2 = zahl2.nextInt();
			System.out.print("Operand x oder + oder - eingeben ");
			Scanner operand = new Scanner(System.in);
			String o = operand.next();

			switch (o) {
				case "+":
					int erg;
					erg = z1 + z2;
					System.out.println(z1 + " plus " + z2 + " = " + erg);
					break;
				case "x":
					erg = z1 * z2;
					System.out.println(z1 + " mal " + z2 + " = " + erg);
					break;
				case "-":
					erg = z1 - z2;
					System.out.println(z1 + " minus " + z2 + " = " + erg);
					break;
				default:
					System.out.println("Nicht unterstützter Operand");
					break;
			}

		}
	}

}
