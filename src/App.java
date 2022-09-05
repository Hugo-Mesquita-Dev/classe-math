import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int contador = 0;

        JOptionPane.showMessageDialog(null, contador, "Matematica", JOptionPane.INFORMATION_MESSAGE);
        contador++;
        JOptionPane.showMessageDialog(null, contador, "Matematica", JOptionPane.INFORMATION_MESSAGE);
        contador += 3;
        JOptionPane.showMessageDialog(null, contador, "Matematica", JOptionPane.INFORMATION_MESSAGE);
        contador *= 10;
        JOptionPane.showMessageDialog(null, contador, "Matematica", JOptionPane.INFORMATION_MESSAGE);

        // Classe Match é usada para fazer operações matemáticas
        Math.abs(contador);
        Math.pow(10, 2);
        Math.sqrt(9);

    }
}
