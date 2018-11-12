package com.company.access_modificators.default_accessor.bird;

import com.company.access_modificators.default_accessor.animal.Animal;

public class Bird extends Animal {

    public void printInheritence() {
        String text = super.text;
        printText();
    }


    public void printCurrentRefference() {
        Bird bird = new Bird();

        bird.printText();
        String text = bird.text;
    }


    public void printParentRefference() {
        Animal bird = new Bird();

         bird.printText();
         String text = bird.text;
    }
}
