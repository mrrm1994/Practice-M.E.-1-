public class QuadraticPolynomial

{
    private double a; // quadratic coefficient
    private double b; // linear coefficient
    private double c; // constant coefficient
    
    //Getters
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    
    // Setters
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    
    //Constructors
    public QuadraticPolynomial(double a, double b, double c) 
    
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        public QuadraticPolynomial(double abc) 
        
    {
       
        	 this.a = abc;
             this.b = abc;
             this.c = abc;	
    }
        public double eval(double x) 
        
        {
        return x;
        
        }
}