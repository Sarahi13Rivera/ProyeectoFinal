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
public class Nomina1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("Sarahi"); 
        empleado.setApellido("Rivera Castillo");
        empleado.setEdad(19);
        empleado.setHorasTrabajadas(12);
        empleado.setPagoHoras(300);
        
        
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Dahaira Narahi"); 
        empleado2.setApellido("Gonzalez Zavala");
        empleado2.setEdad(19);
        empleado2.setHorasTrabajadas(10);
        empleado2.setPagoHoras(200);
        
        System.out.println("Nombre:" + empleado2.getNombre());
        System.out.println("Apelldio:" + empleado2.getApellido());
        System.out.println("Edad:" + empleado2.getEdad());
        System.out.println("Horas trabajadas:" + empleado2.getHorasTrabajadas());
        System.out.println("Pago de horas: " + empleado2.getPagoHoras());
        
        Mostrar m = empleado;
        m.mostrarMensaje();
        
       
    }
    
}

class  Empleado implements Mostrar{
private String nombre;
private String apellido;
private int edad;
private int horasTrabajadas;
private int pagoHoras;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, int horasTrabajadas, int pagoHoras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHoras = pagoHoras;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(int pagoHoras) {
        this.pagoHoras = pagoHoras;
    }

    public void mostrarMensaje() {
        System.out.println("Nombre: " + nombre);   
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad:" +edad);
        System.out.println("Horas trabajadas: " +horasTrabajadas);
        System.out.println("Pago de horas: " +pagoHoras);
    }
   
} 
    
    

