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
    static void bisection(double a, double b)
    {
        if (func(a) * func(b) >= 0)
        {
            System.out.println("You have not assumed"
                    + " right a and b");
            return;
        }

        double c = a;
        while (Math.abs(b-a) >= EPSILON)
        {
            // Find middle point
            c = (a+b)/2;

            // Check if middle point is root
            if (func(c) == 0.0)
                break;

                // Decide the side to repeat the steps
            else if (func(c)*func(a) < 0)
                b = c;
            else
                a = c;
        }
        //prints value of c upto 4 decimal places
        System.out.printf("The value of root is : %.4f"
                ,c);
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
        System.out.println("Input the second guess: ");
        double b = scanner.nextDouble();
        //incremental(a);
        bisection(a, b);
    }
}
