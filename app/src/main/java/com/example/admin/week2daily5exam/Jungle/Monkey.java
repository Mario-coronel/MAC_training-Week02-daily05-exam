package com.example.admin.week2daily5exam.Jungle;

import java.util.ArrayList;
import java.util.List;

public class Monkey extends Animal {

    public static final int EAT_FOOD = 2;
    public static final int SLEEP = 10;
    public static final int PLAY = 8;
    public static final int MAKE_A_SOUND = 4;


    int energy = 10;
    List<String> canEat;
    String sound,playSound;
    boolean canPlay;


    public Monkey() {
        this.canEat = new ArrayList();
        this.canEat.add("FISH");
        this.canEat.add("MEAT");
        this.canEat.add("BUGS");
        this.canEat.add("GRAIN");
        this.sound = "Ooou";
        this.playSound = "Ooo Ooo Ooo";
        this.canPlay = true;
    }

    public Integer sleep(int energy) {
        this.energy = energy + SLEEP;
        return this.energy;
    }

    public Integer eat(int energy, String food) {
        this.energy = energy;
        if(canEat.contains(food)){
            this.energy = energy+EAT_FOOD;
        }else{
            System.out.println(this.getClass().getSimpleName() + "Cant eat : " + food);
        }

        return this.energy;

    }

    public Integer makeSound(int energy)  {

        if(energy - MAKE_A_SOUND < 0 ){
            System.out.println("Too tired to make a Sound");
        }else {
            System.out.println(this.getClass().getSimpleName() + "Says : "+ sound);
            this.energy = energy - MAKE_A_SOUND ;
        }
        return this.energy;
    }

    public Integer play(int energy)  {
        if(canPlay){
            if(energy - PLAY < 0){
                System.out.println("Too tired to play");
            }else{
                System.out.println("Is playing");
                this.energy =  energy - PLAY;
            }
        }else {
            System.out.println("Cant Play");
        }
        return this.energy;
    }

}
