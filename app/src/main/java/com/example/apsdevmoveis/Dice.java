package com.example.apsdevmoveis;

import java.util.Random;

public class Dice {
    private int amount = 1;
    private int[] rolls;
    private int hits = 0;

    public int getAmount() {
        return this.amount;
    }

    public int getHits() {
        return this.hits;
    }

    private void clearDices() {
        this.amount = 1;
    }

    private void clearRolls() {
       this.rolls = null;
    }

    private void clearHits() {
        this.hits = 0;
    }

    public void clearAll() {
        this.clearDices();
        this.clearRolls();
        this.clearHits();
    }

    public void increaseDices() {
        this.amount += 1;
    }

    public void decreaseDices() {
        this.amount -= 1;
    }

    public int[] roll() {
        this.clearHits();

        this.rolls = new int[this.amount];

        for (int i = 0; i < this.amount; i++) {
            this.rolls[i] = new Random().nextInt(10) + 1;
        }

        for (int i = 0; i < this.amount; i++) {
            if (this.rolls[i] > 7){
                this.hits += 1;
            }
        }

        return this.rolls;
    }
}
