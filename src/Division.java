import javax.swing.JOptionPane;

public class Division {
    public static void main(String[] args) {
        double dieretis = 100;
        int response = 0;
        do {
            String input = JOptionPane.showInputDialog(null,
                    "Πληκτρολογήστε έναν πραγματικό αριθμό για να διαιρέσει το 100",
                    "Είσοδος αριθμού",
                    JOptionPane.QUESTION_MESSAGE);

            double diereteos = (new Double(input)).doubleValue();
            String result = dieretis + " / " + diereteos + " = " + divide(dieretis,diereteos);
        
            result += "\n\n Θέλετε να εκτελέσετε και άλλη διαίρεση;";
                    
// response = 0 αν ο χρήστης απαντήσει 'Yes' ενώ response = 1 αν ο χρήστης 
// απαντήσει 'No'

            response = JOptionPane.showConfirmDialog(null, result, "Αποτέλεσμα διαίρεσης", JOptionPane.YES_NO_OPTION);
        }while (response == 0);       
    }

    public static double divide (double n1, double n2) {
        return n1/n2;
    }
}