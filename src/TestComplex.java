import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args){
        double integer_part_first_number;
        double imaginary_part_first_number;

        double integer_part_second_number;
        double imaginary_part_second_number;
        int action;

        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие");
            System.out.println("1 - вычисление модуля числа");
            System.out.println("2 - вычисление аргумента числа");
            System.out.println("3 - сложение");
            System.out.println("4 - вычитание");
            System.out.println("0 - чтобы завершить выполнение программы");
            System.out.print("Введите номер действия: ");

            action = read.nextInt();


            switch (action) {
                case 1:
                    System.out.print("Введите действительную часть: ");
                    integer_part_first_number = read.nextDouble();
                    System.out.print("Введите мнимую часть: ");
                    imaginary_part_first_number = read.nextDouble();
                    Complex module = new Complex(integer_part_first_number, imaginary_part_first_number);
                    System.out.println("|z| = " + module.getModule());
                    //module.do_something();
                    break;

                case 2:
                    System.out.print("Введите действительную часть: ");
                    integer_part_first_number = read.nextDouble();
                    System.out.print("Введите мнимую часть: ");
                    imaginary_part_first_number = read.nextDouble();
                    Complex arg = new Complex(integer_part_first_number, imaginary_part_first_number);
                    System.out.println("arg = " + arg.Arg());
                    break;

                case 3:
                    System.out.print("Введите действительную часть первого числа: ");
                    integer_part_first_number = read.nextDouble();
                    System.out.print("Введите мнимую часть первого числа: ");
                    imaginary_part_first_number = read.nextDouble();

                    System.out.print("Введите действительную часть второго числа: ");
                    integer_part_second_number = read.nextDouble();
                    System.out.print("Введите мнимую часть второго числа: ");
                    imaginary_part_second_number = read.nextDouble();

                    Complex namber_1 = new Complex(integer_part_first_number, imaginary_part_first_number);
                    Complex namber_2 = new Complex(integer_part_second_number, imaginary_part_second_number);
                    namber_1 = namber_1.addition_complex(namber_1, namber_2);
                    System.out.println("Z_1 + Z_2 = " + namber_1.getInteger_part() + "+" + namber_1.getImaginary_part() + "i");
                    break;

                case 4:
                    System.out.print("Введите действительную часть первого числа: ");
                    integer_part_first_number = read.nextDouble();
                    System.out.print("Введите мнимую часть первого числа: ");
                    imaginary_part_first_number = read.nextDouble();

                    System.out.print("Введите действительную часть второго числа: ");
                    integer_part_second_number = read.nextDouble();
                    System.out.print("Введите мнимую часть второго числа: ");
                    imaginary_part_second_number = read.nextDouble();

                    Complex namber_1_subtraction = new Complex(integer_part_first_number, imaginary_part_first_number);
                    Complex namber_2_subtraction = new Complex(integer_part_second_number, imaginary_part_second_number);
                    namber_1_subtraction = namber_1_subtraction.subtraction_complex(namber_1_subtraction, namber_2_subtraction);
                    System.out.println("Z_1 - Z_2 = " + namber_1_subtraction.getInteger_part() + "+" + namber_1_subtraction.getImaginary_part() + "i");
                    break;
                case 0:
                    read.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Вы вели не правильную комбинацию, выберите другую");


            }
        }
    }
}
