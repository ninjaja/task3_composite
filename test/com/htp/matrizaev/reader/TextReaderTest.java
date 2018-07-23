package com.htp.matrizaev.reader;

import com.htp.matrizaev.exception.TextReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.htp.matrizaev.constant.Constant.FILETESTNAME;

public class TextReaderTest {

    @Test
    public void testTextReader() throws TextReaderException {
        String expected = "    Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n";
        String actual = TextReader.readText(FILETESTNAME);
        Assert.assertEquals(actual, expected);
    }
}
