import java.util.Scanner;

class Rational {
    int n, d;

    Rational() {
        n = 0;
        d = 0;
    }

    Rational(int n, int d) {
        this.n = n;
        this.d = d;
    }

    Rational add(Rational b) {
        Rational temp = new Rational();
        if (d == b.d) {
            temp.n = n + b.n;
            temp.d = d;
        } else {
            temp.n = n * b.d + b.n * d;
            temp.d = d * b.d;
        }
        return temp;
    }

    Rational sub(Rational b) {
        Rational temp = new Rational();
        if (d == b.d) {
            temp.n = n - b.n;
            temp.d = d;
        } else {
            temp.n = n * b.d - b.n * d;
            temp.d = d * b.d;
        }
        return temp;
    }

    Rational mul(Rational b) {
        Rational temp = new Rational();
        temp.n = n * b.n;
        temp.d = d * b.d;
        return temp;
    }

    Rational div(Rational b) {
        Rational temp = new Rational();
        temp.n = n * b.d;
        temp.d = d * b.n;
        return temp;
    }
}

public class RationalNumber {
    public static void main(String args[]) {

        int num1, den1, num2, den2 = 0;
        int operation;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the first numerator value: ");
        num1 = s.nextInt();

        System.out.println("enter the first denominator value: ");
        den1 = s.nextInt();

        System.out.println("enter the value of the second numerator value: ");
        num2 = s.nextInt();

        System.out.println("enter the value of the second denominator value: ");
        den2 = s.nextInt();

        System.out.println("enter the operation need to be performed ");
        System.out.println("1. Add, 2.Sub, 3.Mul, 4.Div ");
        operation = s.nextInt();

        Rational b = new Rational(num1, den1);
        Rational c = new Rational(num2, den2);
        Rational a;

        switch (operation) {
            case (1): {
                System.out.println("--Addition--");
                a = b.add(c);
                System.out.println(b.n + "/" + b.d + " +" + c.n + "/" + c.d + " = " + a.n + "/" + a.d);
                break;
            }
            case (2): {
                System.out.println("--Subtraction--");
                a = b.sub(c);
                System.out.println(b.n + "/" + b.d + " -" + c.n + "/" + c.d + " = " + a.n + "/" + a.d);
                break;
            }
            case (3): {
                System.out.println("--MULTIPLICATION--");
                a = b.mul(c);
                System.out.println(b.n + "/" + b.d + " *" + c.n + "/" + c.d + " = " + a.n + "/" + a.d);
                break;
            }
            case (4): {
                System.out.println("--DIVISION--");
                a = b.div(c);
                System.out.println(b.n + "/" + b.d + " /" + c.n + "/" + c.d + " = " + a.n + "/" + a.d);
                break;
            }
            default: {
                System.out.println("enter the correct choice !");
            }

        }
        s.close();

    }
}
