package task04.base;

/**
 * Created by Vaas on 17.11.2015.
 */
public class Check extends Buy {
    public Check(String name, int cost, int weight, int number) {
        super(name, cost, weight, number);
    }

    public Check() {
        this("pelmeni", 12, 1, 30);
    }

    @Override
    public String toString() {
        return "\nName: " + super.getName() +
                "\nCost: " + super.getCost() + " rub " +
                "\nWeigth: " + super.getWeight() + " kg " +
                "\nNumber: " + super.getNumber() + " pcs " +
                "\nCommon cost: " + super.getCommonCost() + " rub " +
                "\nCommon weigth: " + super.getCommonWeight() + " kg ";
    }
}