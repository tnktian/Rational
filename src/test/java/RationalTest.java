import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 4;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 6;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(6, x.denominator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 4;
        y.denominator = 2;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }
    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;
        x.divide(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }
    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertFalse(x.equals(y));
    }
    @Test
    public void testCompareTo(){
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 4;
        y.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 2;
        Assert.assertEquals("2/2", x.toString());
    }
}
