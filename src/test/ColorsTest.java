package test;

import SoftwareGame.Constants.Colors;
import org.junit.jupiter.api.Test;

public class ColorsTest {
    @Test
    void testBackgroundColor (){
        assert Colors.backgroundColor != null;
    }
}
