package com.htp.matrizaev.constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constant {

    public static final String FILENAME = "./input/input.txt";
    public static final String FILETESTNAME = "input/test.txt";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String PARAGRAPH_DELIMITER = "(?sm)^[^\\s]+.*?\\.\\s*$";
    public static final String SENTENCE_DELIMITER = "(?:[^!?.]|\\.(?=\\d))+[!?.]";
    public static final String LEXEME_DELIMITER = "\\s";
    public static final String SYMBOL_DELIMITER = "\\w";
}
