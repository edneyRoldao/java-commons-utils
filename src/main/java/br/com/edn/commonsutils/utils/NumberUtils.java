package br.com.edn.commonsutils.utils;

import java.util.Objects;
import java.util.regex.Pattern;

public class NumberUtils {

    private NumberUtils() {}

    public static String removeAllUnlessNumbers(String value) {
        return value.replaceAll("[^\\d]", "");
    }

    public static boolean isNumber(String value) {
        if (Objects.isNull(value)) return false;
        return Pattern.compile("-?\\d+(\\.\\d+)?").matcher(value).matches();
    }

}
