package ExercicioRevisao;

public class testeAnimal {


		
		public static void main(String[] args) {
			
			Cachorro Smith = new Cachorro("Smith", 15);
			Cavalo Hercules = new Cavalo("Hercules", 27);
			Preguiça Gigi = new Preguiça("Gigi", 10);
			
			System.out.println("Nome: " +Smith.getNome() +" "+ Smith.somEmitido());
			System.out.println("Nome: " +Hercules.getNome() +" "+Hercules.somEmitido());
			System.out.println("Nome: " +Gigi.getNome() +" "+ Gigi.somEmitido());
			
			}	
		}
