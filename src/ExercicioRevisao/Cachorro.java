package ExercicioRevisao;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	
	public String oQueFaz() {
		return "ele corre !";
	}
	public String somEmitido() {
		return "Au Au";
	}
}
