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
public class Palindromo {

    int numeroInverso = 0, reciduo, numeroOriginal;

    public Palindromo(int numeroIngresado) {

        numeroOriginal = numeroIngresado;

        // El numero inverso es guardado en una variable
        while (numeroIngresado != 0) {

            reciduo = numeroIngresado % 10;

            numeroInverso = numeroInverso * 10 + reciduo;

            numeroIngresado /= 10;
        }
        //Palindromo si el numero original y el inverso son iguales
        if (numeroOriginal == numeroInverso) {
            System.out.println(numeroOriginal + " es palindromo");
        } else {
            System.out.println(numeroOriginal + " no es palindromo");
        }

    }

    public int getNumeroInverso() {
        return numeroInverso;
    }

    public void setNumeroInverso(int numeroInverso) {
        this.numeroInverso = numeroInverso;
    }

    public int getReciduo() {
        return reciduo;
    }

    public void setRecuerdo(int reciduo) {
        this.reciduo = reciduo;
    }

    public int getNumeroOriginal() {
        return numeroOriginal;
    }

    public void setNumeroOriginal(int numeroOriginal) {
        this.numeroOriginal = numeroOriginal;
    }

}
