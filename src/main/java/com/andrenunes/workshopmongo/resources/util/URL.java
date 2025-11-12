package com.andrenunes.workshopmongo.resources.util;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URL {

    public static String decodeParam(String text) {
        try{
            return URLDecoder.decode(text, StandardCharsets.UTF_8.name());
        } catch (Exception e){
            return "";
        }
    }
}
