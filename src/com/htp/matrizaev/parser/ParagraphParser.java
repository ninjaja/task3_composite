package com.htp.matrizaev.parser;

import com.htp.matrizaev.entity.Component;
import com.htp.matrizaev.entity.ComponentType;
import com.htp.matrizaev.entity.Composite;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.htp.matrizaev.constant.Constant.PARAGRAPH_DELIMITER;


public class ParagraphParser implements MainParser {

    private SentenceParser sentenceParser;

    ParagraphParser(SentenceParser sentenceParser) {
        this.sentenceParser = sentenceParser;
    }

    @Override
    public void parse(Component textComposite, String text) {

        Pattern paragraphPattern = Pattern.compile(PARAGRAPH_DELIMITER);
        Matcher matcher = paragraphPattern.matcher(text);
        String[] paragraphArray = text.split(PARAGRAPH_DELIMITER);

        for (String paragraph : paragraphArray) {
            paragraph = paragraph.trim();
            if (matcher.find()) {
                paragraph = paragraph + " " + matcher.group();
            }

            if (sentenceParser != null) {
                Component paragraphComposite = new Composite(ComponentType.PARAGRAPH);
                sentenceParser.parse(paragraphComposite, paragraph);
                textComposite.addComponent(paragraphComposite);
            }
        }
    }
}
