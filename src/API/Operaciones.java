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
public abstract class Operaciones {

    private String nombreOperacion;

    public Operaciones(String nombreDeOperacion) {
        nombreOperacion = nombreDeOperacion;
    }

    public abstract double operacion();
    
    @Override
    public String toString() {
        return "El resultado de la " + nombreOperacion + " es: " + operacion();
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }
}
