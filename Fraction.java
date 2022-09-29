public class Fraction {
    int numerateur;                                  // Entier du numerateur
    int denominateur;                                // Entier du dénominateur
    public static final Fraction ZERO = new Fraction(0,1);   // Constante ZERO
    public static final Fraction UN = new Fraction(1,1);  
    
    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur)
    {
        this(numerateur,1);
    }

    public Fraction()
    {
        this(0,1);
    }

    public int getNumerateur() 
    {
        return numerateur;
    }

    public int getDenominateur() 
    {
        return denominateur;
    }

    public double getValeur()
    {
        return (double) numerateur / denominateur;    
    }

    public Fraction getAdd(Fraction F)
    {
        this.numerateur = this.numerateur * F.denominateur + F.numerateur * this.denominateur;
        this.denominateur = this.denominateur * F.denominateur;
        return this;
    }
}
