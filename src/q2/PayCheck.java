package q2;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class PayCheck {

    public static void main(String[] args) {

        NumberFormat money = NumberFormat.getCurrencyInstance(); 
        
        final double overtimeRate = 1.5;
        final int overtimeMark = 40;
        
        int hours;
        int again;
        
        double wage;
        double pay;
        
        String wageStr;
        String hourStr;
        String result;

        do {
            wageStr = JOptionPane.showInputDialog("Enter the wage: ");

            wage = Double.parseDouble(wageStr);

            hourStr = JOptionPane.showInputDialog("Enter the hours worked: ");

            hours = Integer.parseInt(hourStr);
            
            if(hours <= overtimeMark){
                pay = hours * wage;
            }
            else {
                pay = overtimeMark * wage;
                pay += ((hours - overtimeMark) *(wage * overtimeRate));
            }

            result = "Total pay: " + money.format(pay);

            JOptionPane.showMessageDialog(null, result);

            again = JOptionPane.showConfirmDialog(null, "Do Another?");
            
        } while (again == JOptionPane.YES_OPTION);
    }
}
