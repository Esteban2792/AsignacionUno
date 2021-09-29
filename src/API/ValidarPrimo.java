/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

/**
 *
 * @author Esteban Mendez <ejmendezd@gmail.com>
 */
public class ValidarPrimo {

    int numerosDivisibles = 0;
    int numerosDivisiblesParaUnPrimo = 2;

    public ValidarPrimo(double numeroIngresado) {
        for (double numeroIndice = 1; numeroIndice <= numeroIngresado; numeroIndice++) {
            if (numeroIngresado % numeroIndice == 0) {
                numerosDivisibles++;
            }
        }
        if (numerosDivisibles == numerosDivisiblesParaUnPrimo) {
            System.out.println("El numero " + numeroIngresado + " es Primo");
        } else {
            System.out.println("El numero " + numeroIngresado + " no es Primo");
        }
    }

    public int getNumerosDivisibles() {
        return numerosDivisibles;
    }

    public void setNumerosDivisibles(int numerosDivisibles) {
        this.numerosDivisibles = numerosDivisibles;
    }

    public int getNumerosDivisiblesParaUnPrimo() {
        return numerosDivisiblesParaUnPrimo;
    }

    public void setNumerosDivisiblesParaUnPrimo(int numerosDivisiblesParaUnPrimo) {
        this.numerosDivisiblesParaUnPrimo = numerosDivisiblesParaUnPrimo;
    }

}
