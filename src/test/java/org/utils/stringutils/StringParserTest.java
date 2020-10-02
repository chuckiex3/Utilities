package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {
    // three part name for a test: methodUnderTest_inputGiven_expectedOutput
    @Test // annotation
    void splitString_oneSeparator_returnsTwoStrings() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello|world";
        List<String> stringParts = sp.splitString(inputString, "\\|"); // in java, escape character is \\
        assertEquals(stringParts.size(),2);
    }

    /*@Test
    void splitString_nullInput_expectException() {
        StringParser sp = new StringParser();
        String inputString = null;
        List<String> stringParts = sp.splitString(inputString, "@"); // in java, escape character is \\
        assertEquals(stringParts.size(),0);
    } */

    @Test
    void splitString_nullInput_expectException() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = null;
        assertThrows(InvalidStringInputException.class, () ->
        {
            sp.splitString(inputString, "@");
        });
    }
}