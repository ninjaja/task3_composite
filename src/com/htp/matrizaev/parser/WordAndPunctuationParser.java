package com.htp.matrizaev.parser;

import com.htp.matrizaev.reader.Reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.htp.matrizaev.constant.Constant.WORD_AND_PUNCTUATION_DELIMITER;

public class WordAndPunctuationParser extends AbstractParser {

    @Override
    public List<String> parse(List<String> list) {
        List<String> listOfWordAndPunctuation = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String [] lexemeArray = list.get(i).split(WORD_AND_PUNCTUATION_DELIMITER);
            Collections.addAll(listOfWordAndPunctuation, lexemeArray);
        }
        return listOfWordAndPunctuation;
    }

    // TODO: 16.07.2018 delete
    public static void main(String[] args) {
        WordAndPunctuationParser parser = new WordAndPunctuationParser();
        List<String> list = parser.parse(new SentenceParser().parse(new ParagraphParser().parse(new Reader().readText())));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
