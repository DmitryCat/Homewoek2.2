package Hogwarst;

import Hogwarst.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty ;
    private int  fullOfCreativity;

    public Ravenclaw(int magicPower, int transgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Студент Когтеврана" +
                "Ум= " + smart +
                ", Мудрость= " + wise +
                ", Остроумие= " + witty +
                ", Креативность= " + fullOfCreativity +
                ", Магическая сила= " + magicPower +
                ", Трансгрессия= " + transgression +
                '.';
    }
    public void compare(Ravenclaw ravenclaw) {
        int magicSum = smart + wise + witty + fullOfCreativity;
        int magicSum2 = ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity();
        if (magicSum2 > magicSum) {
            System.out.println("Студент 2 сильнее студента 1");
        } else if (magicSum2 < magicSum) {
            System.out.println("Студент 1 сильнее студента 2");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
