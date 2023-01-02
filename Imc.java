import java.util.Scanner;
public class Imc{
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

	//Variáveis
	String nome;
	int idade;
	double peso;
	double altura;

	System.out.println("BEM VINDO A CALCULADORA DO IMC!");

	System.out.println(" ");

	System.out.println("Qual seu nome? ");
	nome = leitor.nextLine();
	System.out.println("Olá "+nome+", qual sua idade? ");
	idade = leitor.nextInt();
	System.out.println(nome+", qual seu peso?");
	peso = leitor.nextDouble();
	System.out.println("E por último sua altura em (metro ex: 1,80): ");
	altura = leitor.nextDouble();

	double imc = peso / (altura * altura);
//	int imc1 = (int) imc;
	
	System.out.println(imc);

	if (imc <= 18){
		System.out.println(nome+", você está abaixo do peso");
	} else if (imc <= 25) {
		System.out.println(nome+", você está no peso ideal");
	} else if (imc <= 30) {
		System.out.println(nome+", você está com sobrepeso");
	} else if (imc <= 40) {
		System.out.println(nome+", você está com obesidade moderada");
	} else if (imc > 40){
		System.out.println(nome+", você está com obesidade grave");
	}








	}
}