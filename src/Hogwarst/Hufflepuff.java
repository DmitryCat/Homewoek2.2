package Hogwarst;

import Hogwarst.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(int magicPower, int transgression, int hardworking, int loyal, int honest) {
        super(magicPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Студент Пуффендуя " +
                "Трудолюбие= " + hardworking +
                ", Верность= " + loyal +
                ", Честность= " + honest +
                ", Магическая сила= " + magicPower +
                ", Трансгрессия= " + transgression +
                '.';
    }

    public void compare(Hufflepuff hufflepuff) {
        int magicSum = hardworking + loyal + honest;
        int magicSum2 = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
        if (magicSum2 > magicSum) {
            System.out.println("Студент 2 сильнее студента 1");
        } else if (magicSum2 < magicSum) {
            System.out.println("Студент 1 сильнее студента 2");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
