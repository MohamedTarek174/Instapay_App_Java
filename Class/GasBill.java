package Class;

import java.util.Random;

public class GasBill implements Bill{

    private double amount;
    private Random random = new Random();
    private double GasRate = 115.2;
    private double selfUsage = random.nextDouble();

    public double getAmount(){
        amount = GasRate * selfUsage;
        return amount;
    }




}
