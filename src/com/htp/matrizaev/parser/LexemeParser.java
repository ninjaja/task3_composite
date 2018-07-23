package com.htp.matrizaev.parser;

import com.htp.matrizaev.entity.Component;
import com.htp.matrizaev.entity.ComponentType;
import com.htp.matrizaev.entity.Composite;

import static com.htp.matrizaev.constant.Constant.LEXEME_DELIMITER;


public class LexemeParser implements MainParser {

    private SymbolParser symbolParser;

    LexemeParser(SymbolParser symbolParser) {
        this.symbolParser = symbolParser;
    }

    @Override
    public void parse(Component sentenceComposite, String sentence) {
        Component lexemeComposite;
        String[] lexemeArray = sentence.split(LEXEME_DELIMITER);
        for (String lexeme : lexemeArray) {
            lexemeComposite = new Composite(ComponentType.LEXEME);
            symbolParser.parse(lexemeComposite, lexeme);
            sentenceComposite.addComponent(lexemeComposite);
        }
    }
}
