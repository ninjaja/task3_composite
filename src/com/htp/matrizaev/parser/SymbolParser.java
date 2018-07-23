package com.htp.matrizaev.parser;

import com.htp.matrizaev.entity.Component;
import com.htp.matrizaev.entity.ComponentType;
import com.htp.matrizaev.entity.Leaf;

import static com.htp.matrizaev.constant.Constant.SYMBOL_DELIMITER;

public class SymbolParser implements MainParser {

    @Override
    public void parse(Component lexemeComposite, String lexeme) {
        for (int i = 0; i < lexeme.length(); i++) {
            String s = String.valueOf(lexeme.charAt(i));
            if (s.matches(SYMBOL_DELIMITER)) {
                Component leaf = new Leaf(s.charAt(0), ComponentType.LETTER);
                lexemeComposite.addComponent(leaf);
            } else {
                Component leaf = new Leaf(s.charAt(0), ComponentType.SYMBOL);
                lexemeComposite.addComponent(leaf);
            }
        }
    }
}
