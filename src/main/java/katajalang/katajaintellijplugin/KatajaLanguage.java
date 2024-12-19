package katajalang.katajaintellijplugin;

import com.intellij.lang.Language;

public class KatajaLanguage extends Language {

    public static final KatajaLanguage INSTANCE = new KatajaLanguage();

    private KatajaLanguage() {
        super("Kataja");
    }

}
