package com.example.admin.week2daily5exam.Jungle;

import java.util.List;

public abstract class Animal {

    int energy = 10;

    abstract public Integer sleep(int energy);

    abstract public Integer eat(int energy, String food);

    abstract public Integer makeSound(int energy);

    abstract public Integer play(int energy);

}
