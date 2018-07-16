package com.htp.matrizaev.parser;

import com.htp.matrizaev.reader.Reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.htp.matrizaev.constant.Constant.PARAGRAPH_DELIMITER;


public class ParagraphParser extends AbstractParser {

    @Override
    public List<String> parse(List<String> list) {

        List<String> listOfParagraph = new ArrayList<>();
        String[] paragraphArray = list.get(0).split(PARAGRAPH_DELIMITER);
        Collections.addAll(listOfParagraph, paragraphArray);
        return listOfParagraph;
    }

    // TODO: 16.07.2018 delete
    public static void main(String[] args) {
        ParagraphParser parser = new ParagraphParser();
        System.out.println(parser.parse(new Reader().readText()));
    }
}
