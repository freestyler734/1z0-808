package com.company.access_modificators.default_accessor.animal;

public class Tiger extends Animal {


    public void printInheritence() {
        String text = super.text;
        printText();
    }


    public void printCurrentRefference() {
        Tiger bird = new Tiger();

        bird.printText();
        String text = bird.text;
    }


    public void printParentRefference() {
        Animal bird = new Tiger();

        bird.printText();
        String text = bird.text;
    }
}
