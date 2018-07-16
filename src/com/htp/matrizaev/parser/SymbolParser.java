package com.htp.matrizaev.parser;

import com.htp.matrizaev.reader.Reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.htp.matrizaev.constant.Constant.SYMBOL_DELIMITER;

public class SymbolParser extends AbstractParser {

    @Override
    public List<String> parse(List<String> list) {
        List<String> listOfSymbol = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String [] symbolArray = list.get(i).split(SYMBOL_DELIMITER);
            Collections.addAll(listOfSymbol, symbolArray);
        }
        return listOfSymbol;
    }

    // TODO: 16.07.2018 delete
    public static void main(String[] args) {
        SymbolParser parser = new SymbolParser();
        List<String> list = parser.parse(new WordAndPunctuationParser().parse(new SentenceParser().parse(new ParagraphParser().parse(new Reader().readText()))));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
