import static org.junit.Assert.*;

import org.junit.Test;

public class QuadraticPolynomialTest

{

	@Test
	 public void settersGettersTest ()
	
	{
        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 2.0, 3.0);
        p.setA(p.getA()+1.0);
        p.setB(p.getB()*3.0);
        p.setC(p.getC()/3.0);
        assertEquals("settersGettersTest: Wrong quadratic coefficient", 2.0, p.getA(), 1e-10);
        assertEquals("settersGettersTest: Wrong linear coefficient", 6.0, p.getB(), 1e-10);
        assertEquals("settersGettersTest: Wrong constant coefficient", 1.0, p.getC(), 1e-10);
        
    }
	
    @Test
    public void constructorTest1 ()
    
    {
        QuadraticPolynomial p1 = new QuadraticPolynomial(1.0, 2.0, 3.0);
        assertEquals("constructorTest1: Wrong quadratic coefficient", 1.0, p1.getA(), 1e-10);
        assertEquals("constructorTest1: Wrong linear coefficient", 2.0, p1.getB(), 1e-10);
        assertEquals("constructorTest1: Wrong constant coefficient", 3.0, p1.getC(), 1e-10);
        
    }

    @Test
    public void constructorTest2 ()
    
    {
        QuadraticPolynomial p2 = new QuadraticPolynomial(1.0);
        assertEquals("Wrong quadratic coefficient", 1.0, p2.getA(), 1e-10);
        assertEquals("Wrong linear coefficient", 1.0, p2.getB(), 1e-10);
        assertEquals("Wrong constant coefficient", 1.0, p2.getC(), 1e-10);
        QuadraticPolynomial p3 = new QuadraticPolynomial(2.0);
        assertEquals("Wrong quadratic coefficient", 2.0, p3.getA(), 1e-10);
        assertEquals("Wrong linear coefficient", 2.0, p3.getB(), 1e-10);
        assertEquals("Wrong constant coefficient", 2.0, p3.getC(), 1e-10);
        
    }
    
    @Test
    public void evalTest () 
    
    {
        QuadraticPolynomial p = new QuadraticPolynomial(1.0, 1.0, 1.0);
        assertEquals("Wrong result in eval method" , 3.0, p.eval(1.0), 1e-10);
        QuadraticPolynomial q = new QuadraticPolynomial(2.0, 2.0, 2.0);
        assertEquals("Wrong result in eval method" , 6.0, q.eval(1.0), 1e-10);
        
    }
    
}
