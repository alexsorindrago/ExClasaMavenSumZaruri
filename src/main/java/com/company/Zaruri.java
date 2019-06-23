package com.company;

import java.util.Random;

public class Zaruri {

    private Random random;

    public Zaruri (Random random){
        this.random=random;
    }

    public int sum(){
        return Zar() + Zar();
    }

    private int Zar() {
        return random.nextInt(6)+1;
    }
}
