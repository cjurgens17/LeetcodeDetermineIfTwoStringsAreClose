import static org.junit.Assert.*;

public class LC1567Test {

    @org.junit.Test
    public void stringsClose() {

        boolean one = LC1567.stringsClose("abc","bca");
        boolean two = LC1567.stringsClose("a","aa");
        boolean three = LC1567.stringsClose("cabbba","abbccc");

        assertTrue(one);
        assertFalse(two);
        assertTrue(three);
    }
}