package com.htp.matrizaev.constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constant {

    public static final String FILENAME = "./input/input.txt";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String PARAGRAPH_DELIMITER = "/n";
    public static final String SENTENCE_DELIMITER = "(?<=\\.)\\s|(?<=\\!)\\s|(?<=\\?)\\s|(?<=\\...)\\s";
    public static final String WORD_AND_PUNCTUATION_DELIMITER = "(?<=\\s)";
    public static final String SYMBOL_DELIMITER = "";
}
