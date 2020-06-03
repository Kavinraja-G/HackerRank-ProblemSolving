public class ComplexNumber {
    public double real;
    public double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber x){
        this.real+=x.getReal();
        this.imaginary+=x.getImaginary();
    }
    public void subtract(double real,double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber y){
        this.real-=y.getReal();
        this.imaginary-=y.getImaginary();
    }






}
