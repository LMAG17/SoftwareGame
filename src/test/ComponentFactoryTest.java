package test;

import SoftwareGame.Factory.ComponentFactory;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Objects;

public class ComponentFactoryTest {

    @Test
    void validateComponentFactoryJLabel() {
        assert ComponentFactory.getTitle("Buen dia") instanceof JLabel;
    }

    @Test
    void validateTitleComponentDoesntCrash (){
        assert ComponentFactory.getTitle(null) instanceof JLabel;
    }

    @Test
    void labelTextIsCorrect() {
        assert Objects.equals(ComponentFactory.getTitle("Titulo").getText(), "Titulo");
    }

    @Test
    void labelDescriptionTypeTest() {
        assert ComponentFactory.getDescription("Descripcion") instanceof JLabel;
    }

    @Test
    void labelDescriptionTextIsCorrect() {
        assert ComponentFactory.getDescription("Desc").getText().equals("Desc");
    }

    @Test
    void presentInIframeWorks (){
        assert ComponentFactory.presentInNewFrame(null) instanceof  JFrame;
    }

}
