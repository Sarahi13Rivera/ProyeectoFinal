/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author HP1000
 */
public class nomina2 {
    
public static String leer(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            System.out.print(mensaje);
            s = br.readLine();
        } catch (IOException ex) {
            System.out.println("Hubo un error , vuelve a intentarlo");
        }
        if (s == null) {
            s = leer(mensaje);
        }
        return s;
    }
 
    public static Integer leerInt(String mensaje) {
        Integer d = null;
        try {
            d = Integer.parseInt(leer(mensaje));
        } catch (NumberFormatException ex) {
            System.out.println("Hubo un error de formato, vuelve a intentarlo");
        }
        if (d == null) {
            d = leerInt(mensaje);
        }
        return d;
    }
 
    public static Double leerDouble(String mensaje) {
        Double d = null;
        try {
            d = Double.parseDouble(leer(mensaje));
        } catch (NumberFormatException ex) {
            System.out.println("Hubo un error de formato, vuele a intentarlo");
        }
        if (d == null) {
            d = leerDouble(mensaje);
        }
        return d;
    }
 
    public static void main(String[] args) {
        int n = leerInt("1. Ingrese la cantidad de empleados: ");
        double salario = leerDouble("2. Ingrese el salario del primer empleado");
        Empleado[] empleados = new Empleado[n];
        empleados[0] = new Empleado(salario);
        for (int i = 1; i < empleados.length; i++) {
            salario *= 1.10;
            empleados[i] = new Empleado(salario);
        }
        double salariosBrutos = 0;
        double retenciones = 0;
        double salariosNetos = 0;
        for (int i = 0; i < empleados.length; i++) {
            salariosBrutos += empleados[i].getSalarioBruto();
            retenciones += empleados[i].getImpuesto();
            salariosNetos += empleados[i].getSalarioNeto();
            System.out.println("Empleado #" + (i + 1) + ":\n" + empleados[i]);
        }
        System.out.println("\n\nTotal en retenciones: " + retenciones
                + "\nTotal en salarios netos: " + salariosNetos
                + "\nTotal a pagar en nómina: " + salariosBrutos);
    }
}
 
class Empleado {
 
    private double salarioBruto;
    private double impuesto;
    private double salarioNeto;
 
    public Empleado(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        impuesto = round2Decimals(salarioBruto * 0.14);
        salarioNeto = salarioBruto - impuesto;
    }
 
    public String toString() {
        return "Salario Bruto: " + salarioBruto
                + "\nImpuestos y retenciones:" + impuesto
                + "\nSalario neto: " + salarioNeto;
    }
 
    public static Double round2Decimals(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
 
    public double getSalarioBruto() {
        return salarioBruto;
    }
 
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
 
    
    public double getImpuesto() {
        return impuesto;
    }
 
    
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
 
    
    public double getSalarioNeto() {
        return salarioNeto;
    }
 
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
}   


