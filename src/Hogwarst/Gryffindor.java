package Hogwarst;

public class Gryffindor extends Hogwarts {
    private int bravery;
    private int honour;
    private int nobility;

    public Gryffindor(int magicPower, int transgression, int bravery, int honour, int nobility) {
        super(magicPower, transgression);
        this.bravery = bravery;
        this.honour = honour;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonour() {
        return honour;
    }

    public int getNobility() {
        return nobility;
    }

    @Override
    public String toString() {
        return "Студент Гриффирдора: " +
                "Храбрость= " + bravery +
                ", Честь= " + honour +
                ", Благородство=" + nobility +
                ", Магическая числа= " + magicPower +
                ", Трансгрессия=" + transgression +
                '.';
    }

    public void compare(Gryffindor Gryffindor) {
        int magicSum = nobility + bravery + honour;
        int magicSum2 = Gryffindor.getBravery() + Gryffindor.getHonour() + Gryffindor.getNobility();
        if (magicSum2 > magicSum) {
            System.out.println("Студент 2 сильнее студента 1");
        } else if (magicSum2 < magicSum) {
            System.out.println("Студент 1 сильнее студента 2");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
