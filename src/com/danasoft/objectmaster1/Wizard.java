package com.danasoft.objectmaster1;

import com.danasoft.objectmaster1.Human;

public class Wizard extends Human {

    public Wizard() {
        super(3, 3, 8, 50);
    }

    public void heal(Human h) {
        h.health += this.intelligence;
    }

    public void fireball(Human h) {
        h.health -= (this.intelligence * 3);
    }
}
