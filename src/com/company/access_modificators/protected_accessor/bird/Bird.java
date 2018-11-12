package com.company.access_modificators.protected_accessor.bird;

import com.company.access_modificators.protected_accessor.animal.Animal;

public class Bird extends Animal {
    /*
     * Метод имеет доступ наследуемым данным через механизм наследования
     */
    public void printInheritence() {
        String text = super.text;
        printText();
    }

    /*
     * Метод имеет доступ наследуемым данным через ссылку на свой класс
     * Т.к. он объявлен в текущем пакете
     */
    public void printCurrentRefference() {
        Bird bird = new Bird();

        bird.printText();
        String text = bird.text;
    }

    /*
     * Метод НЕ имеет доступ наследуемым данным через ссылку на класс родителя
     * Т.к. родитель объявлен в другом пакете
     */
    public void printParentRefference() {
        Animal bird = new Bird();

        // bird.printText();
        // String text = bird.text;
    }
}
