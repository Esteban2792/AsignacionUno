/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.Scanner;
/**
 *
 * @author Esteban Mendez <ejmendezd@gmail.com>
 */
public class Menu {

    public static void main(String[] args) {
        int opcion;
        double primerNumero;
        double segundoNumero;
        boolean salir = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la tarea numero uno de CleanCode");

        while (!salir) {
            System.out.println();
            System.out.println("********************************");
            System.out.println("Por favor elija una opción:");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("5 - Verificación de número primo");
            System.out.println("6 - Verificación de número palíndromo");
            System.out.println("7 - Salir");
            System.out.println("*******************************");
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Digite el primer numero: ");
                        primerNumero = leer.nextDouble();
                        System.out.println("Digite el segundo numero: ");
                        segundoNumero = leer.nextDouble();
                        Suma sumar = new Suma(primerNumero, segundoNumero);
                        System.out.println(sumar);
                        break;
                    case 2:
                        System.out.println("Digite el primer numero: ");
                        primerNumero = leer.nextDouble();
                        System.out.println("Digite el segundo numero: ");
                        segundoNumero = leer.nextDouble();
                        Resta restar = new Resta(primerNumero, segundoNumero);
                        System.out.println(restar);
                        break;
                    case 3:
                        System.out.println("Digite el primer numero: ");
                        primerNumero = leer.nextDouble();
                        System.out.println("Digite el segundo numero: ");
                        segundoNumero = leer.nextDouble();
                        Multiplicacion multiplicar = new Multiplicacion(primerNumero, segundoNumero);
                        System.out.println(multiplicar);
                        break;
                    case 4: 
                        System.out.println("Digite el primer numero: ");
                        primerNumero = leer.nextDouble();
                        System.out.println("Digite el segundo numero: ");
                        segundoNumero = leer.nextDouble();
                        Division dividir = new Division(primerNumero, segundoNumero);
                        System.out.println(dividir);
                        break;
                    case 5:
                        System.out.println("Digite un numero para verificar si es primo o no:");
                        primerNumero = leer.nextDouble();
                        ValidarPrimo esPrimo;
                        esPrimo = new ValidarPrimo(primerNumero);
                        break;
                    case 6:
                        System.out.println("Digite un número para verificar si es Palindromo: ");
                        primerNumero = leer.nextDouble();
                        Palindromo esPalindromo;
                        esPalindromo = new Palindromo((int) primerNumero);
                    break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Esa opcion no existe, por favor elija un numero de las opciones ");
                        break;

                }
            } catch (Exception error) {
                System.out.println("Solo se permiten el ingreso de números, intentelo de nuevo");                
            leer.next();
            }

        }

    }
}
