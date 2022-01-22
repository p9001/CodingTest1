import java.util.Scanner;

public class ProblemStatement2{
    public static boolean convertBase (int m, int base)
    {
        int rem = m % base;
        m = m / base;
        while (m >= base && (m % base == rem)) {
            m = m / base;
        }
        return m == rem;
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt ();
        int base = 2;
        while (!convertBase(m, base)) {
            base++;
        }
        System.out.println (base);
    }
}