import org.testng.Assert;

import org.testng.annotations.Test;



public class RMathTest {


    @Test
    public void testRoman_to_arabic() {
        RMath math = new RMath();
        Assert.assertEquals(math.roman_to_arabic("DCCCXXXVII"), 837);
        Assert.assertEquals(math.roman_to_arabic("CDXXXVII"), 437);
        Assert.assertEquals(math.roman_to_arabic("asdf"), 0);
    }

    @Test
    public void testIs_greater1() {
        RMath math = new RMath();
        Assert.assertNotNull(math.is_greater(84, "XXXII"));
        Assert.assertTrue(math.is_greater(84, "XXXII"));
        Assert.assertFalse(math.is_greater(72, " LXXXIV"));
    }

    @Test
    public void testPow1() {
        RMath math = new RMath();
        Assert.assertEquals(math.pow("VII", 3), "CCCXLIII");
        Assert.assertNull(math.pow("VII", 0));
    }


    @Test
    public void testArabic_to_roman() {
        RMath math = new RMath();
        Assert.assertEquals(math.arabic_to_roman(465), "CDLXV");
        Assert.assertEquals(math.arabic_to_roman(978), "CMLXXVIII");
        Assert.assertEquals(math.arabic_to_roman(971), "CMLXXI");
    }

    @Test
    public void testSum() {
        RMath math = new RMath();
        Assert.assertEquals(math.sum(15, 63), 78);
    }

    @Test
    public void testSum1() {
        RMath math = new RMath();
        Assert.assertEquals(math.sum(15, "LXIII"), 78);
    }

    @Test
    public void testSum2() {
        RMath math = new RMath();
        Assert.assertEquals(math.sum("XV", "LXIII"), "LXXVIII");
    }

    @Test
    public void testSubtract() {
        RMath math = new RMath();
        Assert.assertEquals(math.subtract(63, 15), 48);
    }

    @Test
    public void testSubtract1() {
        RMath math = new RMath();
        Assert.assertEquals(math.subtract(63, "XV"), 48);
    }

    @Test
    public void testSubtract2() {
        RMath math = new RMath();
        Assert.assertEquals(math.subtract("LXIII", "XV"), "XLVIII");
    }

    @Test
    public void testSquare() {
        RMath math = new RMath();
        Assert.assertEquals(math.square(8), 64);
    }

    @Test
    public void testSquare1() {
        RMath math = new RMath();
        Assert.assertEquals(math.square("VIII"), "LXIV");
    }

    @Test
    public void testPow() {
        RMath math = new RMath();
        Assert.assertEquals(math.pow(8, 3), 512);
        Assert.assertEquals(math.pow(8, 0), 0);
    }


    @Test
    public void testProduct() {
        RMath math = new RMath();
        Assert.assertEquals(math.product(8, 3), 24);
    }

    @Test
    public void testProduct1() {
        RMath math = new RMath();
        Assert.assertEquals(math.product(3, "VIII"), 24);
    }

    @Test
    public void testProduct2() {
        RMath math = new RMath();
        Assert.assertNotNull(math.product("III", "VIII"));
        Assert.assertEquals(math.product("III", "VIII"), "XXIV");
    }

    @Test
    public void testIs_greater() {
        RMath math = new RMath();
        Assert.assertNotNull(math.is_greater(" LXXXIV", "XXXII"));
        Assert.assertTrue(math.is_greater(" LXXXIV", "XXXII"));
        Assert.assertFalse(math.is_greater("XXXII", " LXXXIV"));
    }


    @Test
    public void testIs_greater2() {
        RMath math = new RMath();
        Assert.assertNotNull(math.is_greater(" LXXXIV", 40));
        Assert.assertTrue(math.is_greater(" LXXXIV", 40));
        Assert.assertFalse(math.is_greater("XXXII", 61));
    }

    @Test
    public void good_test() {
        Assert.assertTrue((funkcija () || true));
    }


    public boolean funkcija (){
        return false;
    }
}