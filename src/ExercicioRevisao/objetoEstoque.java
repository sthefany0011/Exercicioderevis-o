package ExercicioRevisao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

public class objetoEstoque {
	
	public static void main(String[] args) throws ParseException {
		
		Estoque Goiaba = new Estoque("goiaba", 4, 800,"24/11/2020");
		Estoque Suco = new Estoque("Suco", 0.99, 80, "24/11/2020");
		Estoque Iorgute = new Estoque("Iorgute", 2.50, 150, "24/11/2020");
		
		Collection<Estoque> produto = new ArrayList<>();
		
		produto.add(Goiaba);
		produto.add(Iorgute);
		produto.add(Suco);
		
		for(Estoque e: produto) {
			System.out.println(e);
		}
		produto.remove(Iorgute);
		System.out.println("\n"+"removendo item do estoque: "+ "\n");
		for(Estoque e: produto) {
			System.out.println(e);
			}
		}
	}


