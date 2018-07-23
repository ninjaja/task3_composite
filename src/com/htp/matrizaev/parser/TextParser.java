package com.htp.matrizaev.parser;

import com.htp.matrizaev.entity.Component;

public class TextParser implements MainParser {

    private ParagraphParser paragraphParser;
    private Component textComposite;

    public TextParser() {
        SymbolParser symbolParser = new SymbolParser();
        LexemeParser lexemeParser = new LexemeParser(symbolParser);
        SentenceParser sentenceParser = new SentenceParser(lexemeParser);
        this.paragraphParser = new ParagraphParser(sentenceParser);
    }

    public Component getTextComposite() {
        return textComposite;
    }

    @Override
    public void parse(Component textComposite, String text) {
        if (paragraphParser !=null){
            paragraphParser.parse(textComposite, text);
        }
        this.textComposite = textComposite;
    }
}
