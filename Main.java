import java.net.SocketPermission;

public class Main{
    public static void main(String[] args)
    {
        Fraction F1 = new Fraction(4,2);
        Fraction F2 = new Fraction(12,8);
        Fraction F3 = new Fraction(8,4);
        
        System.err.println(F1.equalsTo(F3));
        System.err.println(F1.compareTo(F3));
        System.out.println(F1.getValeur());
        F1.getAdd(F2);
        System.out.println(F1.getNumerateur() + " / " + F1.getDenominateur());
        System.err.println(F1.getValeur());
        System.err.println(F1.equalsTo(F3));
        System.err.println(F1.compareTo(F2));
        System.err.println(F2.compareTo(F3));
    }

}