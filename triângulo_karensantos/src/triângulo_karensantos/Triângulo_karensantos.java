/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triângulo_karensantos;
import java.util.Scanner;

public class Triângulo_karensantos {

    
    public static void main(String[] args) {
     Scanner input =  new Scanner(System.in);
     int a,b,c;
     System.out.print("Digite o valor do lado A: ");
     a= input.nextInt();
     System.out.print("Digite o valor do labo B: ");
     b= input.nextInt();
     System.out.print("Digite o valor do labo C: ");
     c= input.nextInt();

    if ((a+b)>c && (a+c)>b && (b+c)>a){
        System.out.print("Forma um triângulo");
    }
    else if ((a==b)&&(a==b)&&(b==c)){
        System.out.print("Forma um triângulo equilatero");
    }
    if ((a!=b)&&(a!=c)&&(b!=c)){
        System.out.print("Forma um triângulo escaleno");
    }
    if((a==b)&&(a!=c)|| (a==c)&&(b!=c)|| (b==c)&&(b!=a)){
        System.out.print("Forma um triângulo isosceles");
    }
    else{
        System.out.print("Não forma um triângulo");}
    }
}