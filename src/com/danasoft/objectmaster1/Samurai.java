package com.danasoft.objectmaster1;

import org.jetbrains.annotations.NotNull;

public class Samurai extends Human {
    private static int counter;

    Samurai() {
        super(3, 3, 3, 200);
        counter++;
    }

    public void dearhBlow(@NotNull Human h) {
        h.health -= h.health;
        this.health /= 2;
    }

    void meditate() {
        this.health += this.health / 2;
    }

    public static int howMany() {
        return counter;
    }
}