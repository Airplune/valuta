import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);

        String[] selectionValues = {"UAH", "Руб", "$", "€", "KZT"};

        String initialSelection = "Currency";

        String selection = (String) JOptionPane.showInputDialog(null, "Что вы собираетесь обменять?",
                "Обмен валют", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        String userCurrency = (String) JOptionPane.showInputDialog(null, "На какую валюту вы собираетесь обменять свою?",
                "Обмен валют", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        double cource = Double.parseDouble(JOptionPane.showInputDialog("Какой курс " + userCurrency + " относительно " + selection + " ?" + "\n" + "1" + userCurrency + " ="));

        double amount = Double.parseDouble(JOptionPane.showInputDialog("Сколько " + userCurrency + " вы собираетесь обменять?"));

        JOptionPane.showMessageDialog(null, "ППосле перевода" + amount + userCurrency + " в " + selection + " Вы получите " + (cource * amount) + selection);


    }
}

























