package com.htp.matrizaev.parser;

import com.htp.matrizaev.reader.Reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.htp.matrizaev.constant.Constant.SENTENCE_DELIMITER;

public class SentenceParser extends AbstractParser {

    @Override
    public List<String> parse(List<String> list) {
        List<String> listOfSentence = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] sentenceArray = list.get(i).split(SENTENCE_DELIMITER);
            Collections.addAll(listOfSentence, sentenceArray);
        }
        return listOfSentence;
    }


    // TODO: 16.07.2018 delete
    public static void main(String[] args) {
        SentenceParser parser = new SentenceParser();
        List<String> list = parser.parse(new ParagraphParser().parse(new Reader().readText()));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
