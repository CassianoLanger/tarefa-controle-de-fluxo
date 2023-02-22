package program;

import java.util.Scanner;

import calculo.Media;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a primeira nota: ");
		double notaA = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double notaB = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double notaC = sc.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double notaD = sc.nextDouble();
		
		Media media = new Media(notaA, notaB, notaC, notaD);
		
		System.out.println("Sua nota media: " + media.media());
		System.out.println(media.status());
		sc.close();
	}

}
