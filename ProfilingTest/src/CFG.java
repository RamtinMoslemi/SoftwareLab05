import java.util.Scanner;

// solving equations
class GFG{
    static final float EPSILON = (float) 0.01;
    static final float STEP = (float) 0.0001;

    // The function is x^3 - x^2 + 2
    static double func(double x)
    {
        return x*x*x - x*x + 2;
    }

    // Prints root of func(x) with error of EPSILON
    static void incremental(double a)
    {
        while (Math.abs(func(a)) >= EPSILON)
        {
            if (func(a) < 0)
                a += STEP;
            else
                a -= STEP;
        }
        //prints value of c upto 4 decimal places
        System.out.printf("The value of root is : %.4f"
                ,a);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first guess: ");
        double a = scanner.nextDouble();
        incremental(a);
    }
}
