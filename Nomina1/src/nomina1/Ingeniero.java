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
public class Ingeniero extends Empleado {
    private  String FormacionAcademica;
   private int añosDeExperiencia;

    public Ingeniero(String FormacionAcademica, int añosDeExperiencia) {
        this.FormacionAcademica = FormacionAcademica;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public Ingeniero(String FormacionAcademica, int añosDeExperiencia, String nombre, String apellido, int edad, int horasTrabajadas, int pagoHoras) {
        super(nombre, apellido, edad, horasTrabajadas, pagoHoras);
        this.FormacionAcademica = FormacionAcademica;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public String getFormacionAcademica() {
        return FormacionAcademica;
    }

    public void setFormacionAcademica(String FormacionAcademica) {
        this.FormacionAcademica = FormacionAcademica;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    }

