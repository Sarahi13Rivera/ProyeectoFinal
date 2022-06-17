/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina1;

/**
 *
 * @author HP1000
 */
public class EmpleadoConHijos extends Empleado {
    private int cantidadHijos;

    public EmpleadoConHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public EmpleadoConHijos(int cantidadHijos, String nombre, String apellido, int edad, int horasTrabajadas, int pagoHoras) {
        super(nombre, apellido, edad, horasTrabajadas, pagoHoras);
        this.cantidadHijos = cantidadHijos;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }
    
}
