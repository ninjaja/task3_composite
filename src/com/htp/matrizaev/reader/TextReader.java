package com.htp.matrizaev.reader;


import com.htp.matrizaev.exception.TextReaderException;
import org.apache.logging.log4j.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static com.htp.matrizaev.constant.Constant.LOGGER;


public class TextReader {

    public static String readText(String filePath) throws TextReaderException {

        if (filePath == null || filePath.isEmpty() || !new File(filePath).exists()) {
            throw new TextReaderException("Invalid file path or file does not exist");
        }

        StringBuilder builder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> builder.append(s).append("\n"));
        } catch (IOException e) {
            throw new TextReaderException("Cannot read the file", e);
        }
        LOGGER.log(Level.INFO, "File has been read");
        return builder.toString();
    }
}

