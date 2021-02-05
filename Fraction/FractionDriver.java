public class FractionDriver {
    public static void main(String [] args) {
        //Fraction myFraction = new Fraction();
        //Fraction yourFraction = new Fraction(1,0);  
        //Fraction stringFraction = new Fraction("1/10"); 
        Fraction f1 = new Fraction(0,4); 
        Fraction f2 = new Fraction(-1,4);
        Fraction answer = Fraction.subtract(f1,f2);
        System.out.println(answer); 
        //System.out.println(stringFraction.num);
        //System.out.println(stringFraction.den);
    }
}
