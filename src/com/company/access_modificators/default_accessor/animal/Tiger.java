package com.company.access_modificators.default_accessor.animal;

import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Tiger extends Animal {

    /*
     * члены родительского класса доступны,
     * потому что классы расположены в одном пакете
     */
    public void printInheritence() {
        String text = super.text;
        printText();
    }

    /*
     * родительские свойства объекта текущего класса доступны
     */
    public void printCurrentRefference() {
        Tiger bird = new Tiger();

        bird.printText();
        String text = bird.text;
    }

    /*
     * свойства объекта родительского класса доступны в этом классе
     */
    public void printParentRefference() {
        Animal bird = new Tiger();

        bird.printText();
        String text = bird.text;
    }
}
