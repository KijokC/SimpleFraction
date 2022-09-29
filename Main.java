import java.net.SocketPermission;

public class Main{
    public static void main(String[] args)
    {
        Fraction F1 = new Fraction(4,2);
        Fraction F2 = new Fraction(12,8);
        System.out.println(F1.getValeur());
        F1.getAdd(F2);
        System.out.println(F1.getNumerateur() + " / " + F1.getDenominateur());
        System.err.println(F1.getValeur());
    }

}