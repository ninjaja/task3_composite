package com.htp.matrizaev.entity;

import com.htp.matrizaev.exception.TextReaderException;
import com.htp.matrizaev.parser.TextParser;
import com.htp.matrizaev.reader.TextReader;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.htp.matrizaev.constant.Constant.FILETESTNAME;
import static org.testng.Assert.*;

public class CompositeTest {

    private TextParser textParser;
    private Component textComposite;
    private String text;

    @BeforeTest
    public void setUp() {
        textParser = new TextParser();
        textComposite = new Composite(ComponentType.TEXT);
    }

    @AfterTest
    public void tearDown() {
        textParser = null;
        textComposite = null;
        text = null;
    }

    @Test
    public void test() {
        String expected = "    Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        String actual = null;

        try {
            text = TextReader.readText(FILETESTNAME);
            textParser.parse(textComposite, text);
            textComposite = textParser.getTextComposite();
            actual = textComposite.toString();
        } catch (TextReaderException e) {
            fail();
        }
        Assert.assertEquals(actual, expected);
    }
}
