package entities;

public class dasd {
	
	
	public  static void main(String args[]) {
	
		float nota1 = 9;
		float nota2 = 9;
		float media = (nota1 + nota2) / 2;
		System.out.println("Media" + media);

		if ((media >= 0) && (media < 5)) {
			System.out.println("Conceito D");
		} else if (media < 7) {
			System.out.println("Conceito C");
		} else if (media <= 8) {
			System.out.println("Conceito B");
		} else if (media <= 10) {
			System.out.println("Conceito A");
		}

	}
}
