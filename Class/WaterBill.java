package Class;

import java.util.Random;

public class WaterBill implements Bill{

    private double amount;
    private Random random = new Random();
    private double waterRate = 180.5;
    private double selfUsage = random.nextDouble();

    public double getAmount(){
        amount = waterRate * selfUsage;
        return amount;
    }



}
