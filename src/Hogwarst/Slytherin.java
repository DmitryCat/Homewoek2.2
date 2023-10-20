package Hogwarst;

import Hogwarst.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return "Студент Слизерина: " +
                "Хитрость= " + cunning +
                ", Целеустремленность= " + determination +
                ", Амбиции= " + ambition +
                ", Находчивость= " + resourcefulness +
                ", Жажда власти= " + thirstForPower +
                ", Магическая силаr= " + magicPower +
                ", Трансгрессия= " + transgression +
                '.';
    }

    public void compare(Slytherin slytherin) {
        int magicSum = cunning + determination + ambition + resourcefulness + thirstForPower;
        int magicSum2 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getThirstForPower() + slytherin.getResourcefulness();
        if (magicSum2 > magicSum) {
            System.out.println("Студент 2 сильнее студента 1");
        } else if (magicSum2 < magicSum) {
            System.out.println("Студент 1 сильнее студента 2");
        } else {
            System.out.println("Студенты равны ");
        }
    }
}
