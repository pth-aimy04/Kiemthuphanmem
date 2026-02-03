package fploy;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {

    // TC_PERSON_01: ExpectedException Rule - PASS
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void TC_PERSON_01_expectedExceptionRule_ageMinus1() {
        exception.expect(IllegalArgumentException.class);
        new Person("Fpoly", -1);
    }

    // TC_PERSON_02: @Test(expected=...) - PASS
    @Test(expected = IllegalArgumentException.class)
    public void TC_PERSON_02_testExpected_ageMinus1() {
        new Person("Fpoly", -1);
    }

    // TC_PERSON_03: try-catch - PASS
    @Test
    public void TC_PERSON_03_tryCatch_ageMinus1() {
        try {
            new Person("Fpoly", -1);
            fail("Should have thrown IllegalArgumentException because age is invalid!");
        } catch (IllegalArgumentException e) {
            // PASS
        }
    }

    // TC_PERSON_04: age = 0 - FAIL (đúng theo Excel)
    // Excel: Expected = ném IllegalArgumentException
    // Actual = không ném => test này sẽ FAIL khi chạy
    @Test(expected = IllegalArgumentException.class)
    public void TC_PERSON_04_ageZero_expectedExceptionButActualNoThrow() {
        new Person("Fpoly", 0);
    }

    // TC_PERSON_05: age = 20 - PASS
    @Test
    public void TC_PERSON_05_validAge20() {
        Person p = new Person("Fpoly", 20);
        assertEquals("Fpoly", p.getName());
        assertEquals(20, p.getAge());
    }
}
