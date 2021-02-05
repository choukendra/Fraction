class Fraction {
    //instance variables / fields
    public int num, den; 
    
    public Fraction() {
        this.num = 1;
        this.den = 3;
    }
    
    public Fraction(int num, int den) {
        this.num = num;
        if (den == 0){
            System.out.println("Error: denominator was 0");
            this.den = 1;
        } else{
            this.den = den;
        }
    }
    
    //str.substring(start, end)
    //str.indexOf("/");
    //int x = Integer.parseInt("2"); 
    public Fraction(String str){
        int slash = str.indexOf("/");
        String n = str.substring(0, slash);
        String d = str.substring(slash+1);
        this.num = Integer.parseInt(n);
        int tempd = Integer.parseInt(d);
        if(tempd == 0){
            System.out.println("Error: denominator was 0");
            this.den = 1;
        } else {
            this.den = tempd;
        }
    }
    
    public Fraction(Fraction f){
        this.num = f.num;
        this.den = f.den;
    }
    
    //accessor methods 
    public int getNum(){
        return this.num;
    }
    
    public int getDen(){
        return this.den;
    }
    
    public double toDouble(){
        return ((double) num)/den;
    }
    
    public String toString(){
        return this.num + "/" + this.den; 
    }
    
    //mutators
    public void setNum(int num){
        this.num = num;
    }
    
    public void setDenom(int den){
        if(den == 0){
            System.out.println("error"); 
        } else{
            this.den = den;
        }
    }
    
    public void reduce(){
        //big number - small and smaller number
        //cant work with 0
        //use Math.abs 
        
        /*int big;
        int small;
        
        while (big - small != small){
            
        }
        */
    }
    
    //static methods
    public static Fraction multiply(Fraction a, Fraction b){
        //cant use this. in static 
        int newNum = a.num * b.num;
        int newDen = a.den * b.num;
        if(newDen == 0){
            System.out.println("Error: denominator was 0");
            newDen = 1;            
        } 
        Fraction f = new Fraction(newNum, newDen);     
        //f.reduce();
        return f; 
    }
    
    public static Fraction divide(Fraction a, Fraction b){
        int newNum = a.num * b.den;
        int newDen = a.den * b.num;
        if(newDen == 0){
            System.out.println("Error: denominator was 0");
            newDen = 1;            
        } 
        Fraction f = new Fraction(newNum, newDen);
        //f.reduce();
        return f;         
    }
    
    public static Fraction add(Fraction a, Fraction b){
        int newNum = a.num * b.den + b.num * a.den;
        int newDen = a.den * b.den;
        if(newDen == 0){
            System.out.println("Error: denominator was 0");
            newDen = 1;            
        } 
        Fraction f = new Fraction(newNum, newDen);
        //f.reduce();
        return f; 
    }
    
    public static Fraction subtract(Fraction a, Fraction b){
        int newNum = a.num * b.den - b.num * a.den;
        int newDen = a.den * b.den;
        if(newDen == 0){
            System.out.println("Error: denominator was 0");
            newDen = 1;            
        } 
        Fraction f = new Fraction(newNum, newDen);
        //f.reduce();
        return f; 
    }
}
