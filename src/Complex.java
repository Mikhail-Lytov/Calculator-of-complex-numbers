public class Complex {

    private double integer_part;
    private double imaginary_part;

    public Complex(double integer_part, double imaginary_part){
        this.integer_part = integer_part;
        this.imaginary_part = imaginary_part;

    }
    public double getModule(){
        return Math.sqrt(Math.pow(integer_part,2) + Math.pow(imaginary_part,2));
    }
    public  double Arg(){
        double arg = 0;
        if (integer_part > 0 ){
            //правая часть arctg(b/a)
            arg = Math.tan(imaginary_part / integer_part);
        }else if(integer_part < 0 && imaginary_part >= 0){
            //pi + argctg(b/a)
            arg = Math.PI + Math.tan(imaginary_part/integer_part);
        }else if(integer_part < 0 && imaginary_part <= 0){
            //-pi +argtg(b/a)
            arg = -Math.PI + Math.tan(imaginary_part/integer_part);
        }else if(integer_part == 0 && imaginary_part >= 0){
            //pi/2 else pi / 2
            arg = Math.PI / 2;
        }else if (integer_part == 0 && imaginary_part <= 0){
            arg = Math.PI / 2;
        }
        return arg;
    }

    public Complex subtraction_complex(Complex Z_1, Complex Z_2){
        return new Complex(Z_1.integer_part - Z_2.integer_part, Z_1.imaginary_part - Z_2.imaginary_part);
    }
    public Complex addition_complex(Complex Z_1, Complex Z_2){
        return new Complex(Z_1.integer_part + Z_2.integer_part, Z_1.imaginary_part + Z_2.imaginary_part);
    }
    public  double getInteger_part(){
        return integer_part;
    }
    public  double getImaginary_part(){
        return imaginary_part;
    }

}
