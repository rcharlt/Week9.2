package com.company;

/**
 * Created by 027937 on 3/12/2019.
 */
public class Cena extends Wrestler {
    @Override
    public void entranceMusic() {
        System.out.println("Final Countdown");
    }

    @Override
    public void finishingMove() {
        System.out.println("John Cena's muscle show");
    }

    @Override
    public void combo1() {
        System.out.println("Punch Punch Slap");
    }

    @Override
    public void combo2() {
        System.out.println("*Kills*");

    }
}
