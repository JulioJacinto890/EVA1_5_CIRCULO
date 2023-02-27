/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author hp
 */
public class Circulo {
      private double Area;
    private double Perimetro;
    private double Radio;
    
    public Circulo(){
        Area = 0;
        Perimetro = 0;
        Radio = 0;
    }
    public void setRadio(double R){
        Radio = R;
    }
    public double getRadio(){
        return Radio;
        
    }
    public double getArea(){
        double A=Math.PI*Radio*Radio;
        return A;
        
    }
    public double getPerimetro(){
        double P=Math.PI*(2*Radio);
        return P;
    }
    public void imprimrirDatos(){
        System.out.println("Area:" +getArea());
        System.out.println("Perimetro:" +getPerimetro());
        System.out.println("Radio:"+Radio);
    }
}

    
