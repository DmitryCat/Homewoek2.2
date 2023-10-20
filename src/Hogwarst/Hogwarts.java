package Hogwarst;

public abstract class Hogwarts {
    protected int magicPower;
    protected int transgression;

    public Hogwarts(int magicPower, int transgression) {
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgression() {
        return transgression;
    }
    public void compare1(Hogwarts hogwarts) {
        int magicSum = magicPower + transgression;
        int magicSum2 = hogwarts.getMagicPower() + hogwarts.getTransgression();
        if (magicSum > magicSum2) {
            System.out.println("Студент 1 сильнее 2");
        } else if (magicSum < magicSum2) {
            System.out.println("Студент 2 сильнее 1");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
