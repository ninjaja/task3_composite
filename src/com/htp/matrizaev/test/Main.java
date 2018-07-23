package com.htp.matrizaev.test;

import com.htp.matrizaev.entity.Component;
import com.htp.matrizaev.entity.ComponentType;
import com.htp.matrizaev.entity.Composite;
import com.htp.matrizaev.exception.TextReaderException;
import com.htp.matrizaev.parser.TextParser;
import com.htp.matrizaev.reader.TextReader;

import static com.htp.matrizaev.constant.Constant.FILENAME;

public class Main {

    public static void main(String[] args) throws TextReaderException {

        String text = TextReader.readText(FILENAME);
        Component composite = new Composite(ComponentType.TEXT);
        TextParser textParser = new TextParser();

        textParser.parse(composite, text);
        composite = textParser.getTextComposite();
        String result = composite.toString();

        System.out.println(result);
    }
}
