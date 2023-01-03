/*

Leia um vetor de 12 posições 
e em seguida ler também dois valores X e Y quaisquer 
correspondentes a duas posições no vetor. 
Ao final seu programa deverá escrever a 
soma dos valores encontrados nas respectivas posições X e Y.

*/

import java.util.Scanner;
public class Ex01{
    public static void main(String[] args){
        Scanner leitor=new Scanner(System.in);
        
        int [] dozep = {1,2,3,4,5,6,7,8,9,10,11,12};
        
        System.out.println("Index 5 do array: "+dozep[5]);
        
        //Faz a leitura do array for each
        for(int i : dozep){
            System.out.println(i);
        }
        
        for(int i = 0; i < dozep.length; i++){
            System.out.println("Percorrendo array com for: "+dozep[i]);
        }
        
        int x = dozep[3];
        int y = dozep[7];
        
        System.out.println("x recebeu index 3 do array "+x);
        System.out.println("y recebeu index 7 do array "+y);
        
        int soma = x + y;
        
        System.out.println("A soma dos index do array dozep é: "+soma);

    }
}