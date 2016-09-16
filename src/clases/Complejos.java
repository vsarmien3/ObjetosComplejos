
package clases;


public class Complejos {
    private double real;
    private double imaginario;
    
    public Complejos (double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }    

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    
    
    public Complejos suma(Complejos c2) {
        double re, imagin;
        Complejos c;
        re = (this.real + c2.real);
        imagin = this.imaginario + c2.imaginario;
        c = new Complejos(re,imagin);
        return c;
    }
    
    public Complejos resta(Complejos c2) {
        double re, imagin;
        Complejos c;
        re = (this.real - c2.real);
        imagin = this.imaginario - c2.imaginario;
        c = new Complejos(re,imagin);
        return c;
    }
    
    public Complejos multiplicacion(Complejos c2) {
        double re, imagin;
        Complejos c;
        re = (this.real * c2.real) - (this.imaginario * c2.imaginario);
        imagin = (this.real * c2.imaginario) + (this.imaginario * c2.real);
        c = new Complejos(re,imagin);
        return c;
    }
    
    public Complejos numeradordivision (Complejos c2){
        double re, imagin;
        Complejos c;
        re = (this.real * this.imaginario) + (c2.real * c2.imaginario);
        imagin = (c2.real * this.imaginario) - (this.real * c2.imaginario);
        c = new Complejos(re,imagin);
        return c;
    }
    
    public Complejos denominadordivision (Complejos c2){
        double re, imagin;
        Complejos c;
        re = (this.imaginario * this.imaginario) + (c2.imaginario * c2.imaginario);
        imagin = (this.imaginario * this.imaginario) + (c2.imaginario * c2.imaginario);
        c = new Complejos(re,imagin);
        return c;
    }
}  