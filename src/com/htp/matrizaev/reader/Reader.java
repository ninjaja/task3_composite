package com.htp.matrizaev.reader;


import org.apache.logging.log4j.Level;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.htp.matrizaev.constant.Constant.FILENAME;
import static com.htp.matrizaev.constant.Constant.LOGGER;


public class Reader {

    public List<String> readText() {
        List<String> inputText = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(FILENAME))) {
            inputText.add(stream.collect(Collectors.joining("/n")));
        } catch (IOException e) {
            LOGGER.log(Level.WARN, "file reading failure");
        }
        return inputText;
    }

    // TODO: 15.07.2018 delete
    /*public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.println(reader.readText());
    }*/
}

