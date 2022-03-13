package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

    @Test
    void testEquals() {
        TelephoneNumber telephoneNumber = new TelephoneNumber("123","1234");
        TelephoneNumber telephoneNumber2 = new TelephoneNumber("123","1234");
        assertEquals(telephoneNumber, telephoneNumber2);
    }

}