package no.dervis.numbertotext.api.language;

import java.util.Map;

public interface Language {
    Map<Integer, String> getLanguageMap();

    String prefixRule(int n, int div);

    String SPACE = " ";
    String NONE = "";

    String AND();

    default String PADDING() {
        return SPACE + AND();
    }
}
