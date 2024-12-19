package katajalang.katajaintellijplugin.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import katajalang.katajaintellijplugin.KatajaIcons;
import katajalang.katajaintellijplugin.KatajaLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class KtjFileType extends LanguageFileType {

    public static final KtjFileType INSTANCE = new KtjFileType();

    private KtjFileType() {
        super(KatajaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Kataja File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Kataja language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ktj";
    }

    @Override
    public Icon getIcon() {
        return KatajaIcons.KTJFILE;
    }

}
