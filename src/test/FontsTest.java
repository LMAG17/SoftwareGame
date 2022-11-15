package test;

import SoftwareGame.Constants.Fonts;
import org.junit.jupiter.api.Test;

public class FontsTest {

    @Test
    void validateTitleFontIsNotNull() {
        assert Fonts.title != null;
    }

    @Test
    void validateTitleFontSize() {
        assert Fonts.title.getSize() == 24;
    }

    @Test
    void validateSubtitleFontIsNotNull() {
        assert Fonts.subTitle != null;
    }

    @Test
    void validateSubtitleFontSize() {
        assert Fonts.subTitle.getSize() == 20;
    }

    @Test
    void validateDescriptionFontIsNotNull() {
        assert Fonts.description != null;
    }

    @Test
    void validateDescriptionFontSize() {
        assert Fonts.description.getSize() == 16;
    }
}
