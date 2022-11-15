package test;

import SoftwareGame.Constants.Labels;
import org.junit.jupiter.api.Test;

public class LabelsTests {

    @Test
    void validateInitLabelIsNotNull() {
        assert Labels.initGame != null && !Labels.initGame.equals("");
    }

    @Test
    void validateGameTitleLabelIsNotNull() {
        assert Labels.gameTitle != null && !Labels.gameTitle.equals("");
    }

    @Test
    void validateOnePlayerLabelIsNotNull() {
        assert Labels.onePlayerText != null && !Labels.onePlayerText.equals("");
    }

    @Test
    void validateTwoPlayerLabelIsNotNull() {
        assert Labels.twoPlayerText != null && !Labels.twoPlayerText.equals("");
    }
}
