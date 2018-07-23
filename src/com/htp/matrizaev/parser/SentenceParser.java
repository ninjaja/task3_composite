package com.htp.matrizaev.parser;

import com.htp.matrizaev.entity.Component;
import com.htp.matrizaev.entity.ComponentType;
import com.htp.matrizaev.entity.Composite;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.htp.matrizaev.constant.Constant.SENTENCE_DELIMITER;

public class SentenceParser implements MainParser {

    private LexemeParser lexemeParser;

    SentenceParser(LexemeParser lexemeParser) {
        this.lexemeParser = lexemeParser;
    }

    @Override
    public void parse(Component paragraphComposite, String paragraph) {
        String sentence;
        Pattern pattern = Pattern.compile(SENTENCE_DELIMITER);
        Matcher matcher = pattern.matcher(paragraph);
        while (matcher.find()) {
            if (lexemeParser != null) {
                sentence = matcher.group().replaceAll("\\s+", " ").trim();
                Component sentenceComposite = new Composite(ComponentType.SENTENCE);
                lexemeParser.parse(sentenceComposite, sentence);
                paragraphComposite.addComponent(sentenceComposite);
            }
        }
    }
}
