package Class;

import java.util.Random;

public class ElecBill implements Bill{

    private double amount;
    private Random random = new Random();
    private double ElecRate = 212.15;
    private double selfUsage = random.nextDouble();

    public double getAmount(){
        amount = ElecRate * selfUsage;
        return amount;
    }




}
