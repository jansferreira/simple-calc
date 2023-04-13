public class Calc{
    
    private double num1;
    private double num2;

    public void setNumeros(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public double getNumero1(){
        return num1;
    }
    
    public double getNumero2(){
        return num2;
    }

    public double Soma(){
        return getNumero1() + getNumero2();
    }

    public double Subtracao(){
        return getNumero1() - getNumero2();
    }

    public double Multiplicacao(){
        return getNumero1() * getNumero2();
    }

    public double Divisao(){
        return getNumero1() / getNumero2();
    }
}