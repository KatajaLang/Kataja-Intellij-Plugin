package katajalang.katajaintellijplugin.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import katajalang.katajaintellijplugin.KatajaIcons;
import katajalang.katajaintellijplugin.KatajaLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class KppFileType extends LanguageFileType {

    public static final KppFileType INSTANCE = new KppFileType();

    private KppFileType() {
        super(KatajaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Kataja Parsed Program File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Kataja parsed program file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "kpp";
    }

    @Override
    public Icon getIcon() {
        return KatajaIcons.KPPFILE;
    }

}
