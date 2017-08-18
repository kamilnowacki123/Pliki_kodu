import org.joda.time.DateTime;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        DateTime time = new DateTime();
        int month = time.getMonthOfYear();
        int year = time.getYear();
        String stringMonth = null;
        switch (month){
            case 8:
            stringMonth = "Sierpień";
            break;
            case 7:
            stringMonth = "Lipiec";
            break;
            case 9:
            stringMonth = "Wrzesień";
            break;
        }
        JOptionPane.showMessageDialog(null, "Dzisiaj jest " +time.getDayOfMonth()+" "+stringMonth+" "+year);
    }
}
