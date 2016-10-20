/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema5;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int num;
        //Resolución
        num=getInf();
        print(calc(num),num);
    }
    public static int getInf () //Se recibe el número.
    {
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ al programa ****");
        System.out.println("Ingrese el número que desea determinar si es primo o no:  ");
        return in.nextInt();
    }
    public static String calc (int n)
    {
        String result ="";
        if(n==2 || n==3) //Se checa si es el número 2 o 3. Debido a que estos son primos.
        {
            result="es un número primo";
        }
        else
        {
            if(n%2!=0) //En caso de no serlo, se checa que el número no sea divisible entre 2
            {
                if(n%3!=0) //Si no lo es, se intenta dividir entre 3, si no lo es...
                {
                    result="es un número primo"; //Es un número primo!
                }
                else
                {
                    result="no es un número primo"; 
                }
            }
            else
            {
                result="no es un número primo";
            }
        }
        return result; //Si resulta ser divisible entre 2 y 3, se regresa que no es un número primo.
    }
    public static void print (String r, int n) //Se imprime.
    {
        System.out.println("El número "+n+" "+r);
    }
}
