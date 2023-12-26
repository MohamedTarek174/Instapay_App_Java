package Class;

import java.util.ArrayList;
import java.util.List;

public class BillFactory implements lBillFactory{

    private List<String> PaidBills = new ArrayList<>();
    private List<String> UnPaidBills = new ArrayList<>();

    private String b1 = "123"; //for water
    private String b2 = "124"; // for Gas
    private String b3 = "125"; // for elec
//-------------------------------------------------------------------------
    private String b4 = "126"; // for water
    private String b5 = "127"; // for gas
    private String b6 = "128"; // for elec

    public BillFactory(){
        PaidBills.add(b1);
        PaidBills.add(b2);
        PaidBills.add(b3);
//---------------------------------
        UnPaidBills.add(b4);
        UnPaidBills.add(b5);
        UnPaidBills.add(b6);
    }







    @Override
    public Bill getbill(String billName, double Balance) {

        for(int i=0 ; i<PaidBills.size();i++){
            if(billName.equals(PaidBills.get(i)) ){
                System.out.println("Bill already Paid");
                return null;
            }
        }
        for(int i=0 ; i<UnPaidBills.size();i++){
            if(billName.equals(UnPaidBills.get(i)) ){
                if(billName.charAt(2)=='6') {
                    Bill waterBill = new WaterBill();
                    if (waterBill.getAmount() > Balance) {
                        System.out.println("Water Bill = " + waterBill.getAmount());
                        System.out.println("Balance = " + Balance);
                        System.out.println("No Enough Balance");
                        return null;
                    } else {
//                        waterBill.create();
                        System.out.println("Bill created");
                        return waterBill;
                    }
                }
                else if(billName.charAt(2)=='7') {
                    Bill gasBill = new GasBill();
                    if (gasBill.getAmount() > Balance) {
                        System.out.println("Gas Bill = " + gasBill.getAmount());
                        System.out.println("Balance = " + Balance);
                        System.out.println("No Enough Balance");
                        return null;
                    } else {
//                        gasBill.create();
                        System.out.println("Bill created");
                        return gasBill;
                    }
                }
                else if(billName.charAt(2)=='8') {
                    Bill elecBill = new ElecBill();
                    if (elecBill.getAmount() > Balance) {
                        System.out.println("Elec Bill = " + elecBill.getAmount() );
                        System.out.println("Balance = " + Balance);
                        System.out.println("No Enough Balance");
                        return null;
                    } else {
//                        elecBill.create();
                        System.out.println("Bill created");
                        return elecBill;
                    }
                }
            }
        }
        System.out.println("No specified Bill");
        return null;
    }


}
