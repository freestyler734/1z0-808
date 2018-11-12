package com.company.access_modificators.default_accessor.bird;

import com.company.access_modificators.default_accessor.animal.Animal;

public class Bird extends Animal {

    /*
     * члены родительского класса не доступны,
     * потому что родительский класс расположен в другом пакете пакете
     */
    public void printInheritence() {
     //   String text = super.text;
     //   printText();
    }


    /*
     * родительские свойства объекта текущего класса не доступны
     */
    public void printCurrentRefference() {
        Bird bird = new Bird();

       // bird.printText();
       // String text = bird.text;
    }

    /*
     * свойства объекта родительского класса не доступны в этом классе,
     * потому что он в другом пакете
     */
    public void printParentRefference() {
        Animal bird = new Bird();

        // bird.printText();
        // String text = bird.text;
    }
}
