package com.company.access_modificators.protected_accessor.animal;

public class Tiger extends Animal {

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
        Tiger bird = new Tiger();

        bird.printText();
        String text = bird.text;
    }

    /*
     * Метод имеет доступ наследуемым данным через ссылку на класс родителя
     * Т.к. родитель объявлен в том же пакете, что и данный класс
     */
    public void printParentRefference() {
        Animal bird = new Tiger();

        bird.printText();
        String text = bird.text;
    }
}
