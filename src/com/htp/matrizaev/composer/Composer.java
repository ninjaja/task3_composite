package com.htp.matrizaev.composer;

import java.util.List;

public class Composer {

    List<String> listToCompose;

    public String composeText(List<String> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
        }
        return builder.toString();
    }

}
