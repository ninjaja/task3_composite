package com.htp.matrizaev.parser;

import java.util.List;

public abstract class AbstractParser {

    private AbstractParser parser;

    public AbstractParser linkWithParser(AbstractParser nextParser){
        parser = nextParser;
        return parser;
    }

    public abstract List<String> parse(List<String> list);

    /*protected void nextParser(List<String> list) {
        if (parser != null) {
            parser.parse(list);
        }
    }*/
}
