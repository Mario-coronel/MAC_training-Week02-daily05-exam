package com.example.admin.week2daily5exam.Jungle;

import java.util.ArrayList;
import java.util.List;

public class Jungle {

    List<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {
        Jungle jungle = new Jungle();
        jungle.animals.add(new Monkey());
        jungle.animals.add(new Tiger());
        jungle.animals.add(new Monkey());
        jungle.animals.add(new Monkey());
        jungle.jungleSound();
    }


    public void jungleSound(){

        for (Animal a: animals
             ) {
            System.out.println(a.getClass().getSimpleName()+"Energy's is :"+a.makeSound(a.energy));
        }
    }


}
