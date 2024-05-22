package tests;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTests {
    @Test // simple base case
    public void getSexReturnM() {
        Persoana persoana = new Persoana("Mihai", "5020123");
        assertEquals("M", persoana.getSex());
    }

    @Test // simple base case
    public void getSexReturnF() {
        Persoana persoana = new Persoana("Adriana", "60203031");
        assertEquals("F", persoana.getSex());
    }

    @Test // boundaries
    public void getSexSuperiorBoundaries() {
        Persoana persoana = new Persoana("Logaritm", "8891");
        assertEquals("F", persoana.getSex());
    }

    @Test // crosscheck
    public void getSexByParity() {
        String cnp = "123456";
        Persoana persoana = new Persoana("QWERTY", cnp);
        assertEquals(persoana.getSex(), cnp.charAt(0) % 2 == 0 ? "F" : "M");
    }

    @Test(expected = IllegalArgumentException.class) // error condition
    public void getSexErrorCondition() {
        Persoana persoana = new Persoana("QWERTY", "s0123445");
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class) // error condition
    public void getSexErrorConditionWhenCNPEmpty() {
        Persoana persoana = new Persoana("QWERTY", "");
        persoana.getSex();
    }

    @Test(timeout = 200) // performance test
    public void getSexPerformance() {
        Persoana persoana = new Persoana("Ana", "12312313213");
        persoana.getSex();
    }

    @Test() // format / conformance
    public void getSexFormat() {
        Persoana persoana = new Persoana("QWERTY", "12345678");
        assertTrue(persoana.getSex().equals("F") || persoana.getSex().equals("M"));
    }

    @Test() // order
    public void getSexOrder(){
        Persoana barbat = new Persoana("BB", "11234");
        Persoana femeie = new Persoana("AA", "222222");
        assertTrue(barbat.getSex().compareTo(femeie.getSex()) > 0);
    }

    @Test() // ref
    public void getSexRef(){}

    @Test() // range
    public void getSexRange() {}

    @Test(expected = IllegalArgumentException.class) // existance
    public void getSexExistance() {
        Persoana persoana = new Persoana("AAAA", null);
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class) // cardinalitate
    public void getSexCardinality() {
        Persoana persoana = new Persoana("AAA", "01234");
        persoana.getSex();
    }
}