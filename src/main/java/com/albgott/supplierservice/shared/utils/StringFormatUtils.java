package com.albgott.supplierservice.shared.utils;

import org.apache.commons.lang.WordUtils;

public class StringFormatUtils {
    public static String capitalize(String text){
        return WordUtils.capitalize(text.trim());
    };
}
