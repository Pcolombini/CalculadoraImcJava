/*
Exercício 1, criar uma calculadora usando
entrada de dados para fazer operações com dois
números
fonte gith java4noobs
*/

import java.util.Scanner;
public class Calc{
    
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("BEM-VINDO A CALCULADORA!");
         System.out.println(" ");
        System.out.println("Entre com dois números: ");
        int x = ler.nextInt();
        int y = ler.nextInt();
        
        int soma = x + y;
        int sub = x - y;
        int mult = x * y;
        double div = x / y;
        
        System.out.println("Para somar escolha 1, para subtrair escolha 2, para multiplicar escolha 3 e para dividir escolha 4: ");
        int caso = ler.nextInt();
        
        switch (caso){
            
            case 1:
                System.out.println("A soma dos números é: "+soma);
                break;
            case 2:
                System.out.println("A subtração dos números é: "+sub);
                break;
            case 3:
                System.out.println("A multiplicação dos números é: "+mult);
                break;
            case 4:
                System.out.println("A divisão dos números é: "+div);
                break;
            
            
        }  
        
    }
    
    /*
    
    SOLUÇÃO SUGERIDA
    
    
    import java.util.Scanner; 
  
	public class Exercicio1 { 
     	public static void main(String args[]) { 
         Scanner leitor = new Scanner(System.in); 
          
         System.out.println("BEM-VINDO A CALCULADORA!"); 
  
         System.out.println("Digite o primeiro valor: "); 
         int num1 = leitor.nextInt(); 
  
         System.out.println("Digite o segundo valor: "); 
         int num2 = leitor.nextInt(); 
  
         System.out.println("Digite soma para somar, subtracao para subtrair, divisao para dividir, multiplicacao, para multiplicar e mod para tirar o resto: "); 
         String caso = leitor.next(); 
         int resultado = 0; 
  
  
         switch (caso) { 
  
             case "soma": 
                 resultado = num1 + num2; 
                 System.out.println("A soma é " + resultado ); 
             break; 
  
             case "subtracao": 
                 resultado = num1 - num2; 
                 System.out.println("A subtracao é " + resultado ); 
             break; 
  
             case "divisao": 
                 resultado = num1 / num2; 
                 System.out.println("A divisao é " + resultado ); 
             break; 
  
             case "multiplicacao": 
                 resultado = num1 * num2; 
                 System.out.println("A multiplicação é " + resultado ); 
             break; 
  
             case "mod": 
                 resultado = num1 % num2; 
                 System.out.println("O resto é " + resultado ); 
             break; 
  
             default: 
                 System.out.println("Digite algo válido"); 
  
         } 
  
  
     } 
 }
    
    */
}
