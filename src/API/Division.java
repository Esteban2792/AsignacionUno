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
public class Division extends Operaciones{
private double numeroUno;
private double numeroDos;

public Division(double primerNumero, double segundoNumero){
    super("División");
    numeroUno = primerNumero;
    numeroDos = segundoNumero;
}
    public double operacion(){
    double resultado = numeroUno / numeroDos;
    return resultado;
}

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    
}
