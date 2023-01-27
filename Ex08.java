package pc;
import java.util.*;
public class Ex08 {
	public static class Produto {
		String nome;
		double preco;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto um = new Produto();
		Produto dois = new Produto();
		Produto tres = new Produto();
		
		um.nome = "Um";
		um.preco = 5.51d;
		
		dois.nome="Dois";
		dois.preco=5.64d;
		
		tres.nome="Três";
		tres.preco=6.82d;
		
		System.out.println("Qual o preço dos produtos? ");
		System.out.println(um.nome+" "+um.preco);
		System.out.println(dois.nome+" "+dois.preco);
		System.out.println(tres.nome+" "+tres.preco);
		
		
			if(um.preco<dois.preco && um.preco<tres.preco) {
				System.out.println(um.nome+", esse é o mais barato, compre esse produto!");
			}else if(dois.preco<tres.preco && dois.preco<tres.preco) {
				System.out.println(dois.nome+", esse é o produto mais barato, compre esse!");
			}else{
				System.out.println(tres.nome+", esse é o produto mais barato, leve esse!");
			}
	
	}

}
