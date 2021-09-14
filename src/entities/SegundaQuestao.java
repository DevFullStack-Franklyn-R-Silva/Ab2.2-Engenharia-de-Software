package entities;

public class SegundaQuestao {

	
	public float media(float nota1,float nota2) {
		float media = (nota1 + nota2) / 2;
		return media;
	}
	
	public String conceito(float nota1,float nota2) {
		float media = media(nota1, nota2);
		
		if((media >=0)&&(media<5)) {
			return "Conceito D";
		}else if(media < 7) {
			return "Conceito C";
		}else if(media < 8) {
			return "Conceito B";
		}else if(media <= 10) {
			return "Conceito A";
		}else {
			return "";
		}
	}
	
	
}
