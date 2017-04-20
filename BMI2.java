package domowe;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BMI2 {
    public static void main(String[] args){

        double waga = Double.parseDouble(JOptionPane.showInputDialog("Podaj swoją wage w kg: "));
        double wzrost = Double.parseDouble(JOptionPane.showInputDialog("Podaj swój wzrost w cm: "));

        wzrost = wzrost/100;
        
        double bmi = waga/(Math.pow(wzrost, 2));
        
        bmi = Math.round(bmi*100)/100.0;
        
        JOptionPane.showMessageDialog(null, "Twoje BMI wynosi: " + bmi +
                "\n------------------------------" +
                "\nBMI wartości:" +
                "\n>Niedowaga: Poniżej 18.5" +
                "\n>Norma: 18.5-24.9" +
                "\n>Nadwaga: 25-29.9" +
                "\n>Otyłość: 30 lub więcej");
}
}
