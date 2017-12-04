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
            try {
                double diereteos = (new Double(input)).doubleValue();
                String result = dieretis + " / " + diereteos + " = " + 
                divide(dieretis,diereteos);

                result += "\n\n Θέλετε να εκτελέσετε και άλλη διαίρεση;";

                response = JOptionPane.showConfirmDialog(null,
                        result,
                        "Αποτέλεσμα διαίρεσης",
                        JOptionPane.YES_NO_OPTION);
            }
            catch (NullPointerException np) { 
            response = 1; //  Έτσι θα προκαλέσουμε την έξοδο του προγράμματος   
            }
            catch (NumberFormatException nfe) {
                // Ο χρήστης πληκτρολόγησε κάτι που ΔΕΝ είναι πραγματικός αριθμός
                JOptionPane.showMessageDialog(null,
                        "Το " + input + " δεν είναι δεκαδικός αριθμός!!",
                        "Λάθος είσοδος",
                        JOptionPane.ERROR_MESSAGE);
            }
            catch (IllegalArgumentException iae) {
                //Διαχειρίζεται την εξαίρεση από την μέθοδο divide
                JOptionPane.showMessageDialog(null, 
                        iae.toString(),
                        "Λάθος είσοδος",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (response == 0);      
}


    /* Σε περίπτωση που η δεύτερη παράμετρος (ο διαιρετέος) είναι μηδέν τότε
    δε θα εκτελεστεί η διαίρεση αλλά θα "πετάξει" μια IllegalArgumentException
    */

    public static double divide (double n1, double n2) throws IllegalArgumentException {
        if (n2 != 0)
            return n1/n2;
        else
            throw new IllegalArgumentException("Αδύνατη η διαίρεση με το μηδέν");
        }
}
