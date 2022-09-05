import java.util.Random;

import javax.swing.JOptionPane;

public class teste {

    public static void main(String[] args) throws Exception {

        // double numeroAle = Math.random() * 8; // numero aleatório entre 0 a 8;
        // int numeroalea = 1 + (int) (Math.random() * 6); // numero aleatório inteiro
        // entre 1 a 6

        // JOptionPane.showMessageDialog(null, numeroalea);

        // Random gerador = new Random(5);
        // int numero = gerador.nextInt(6) + 1; // contagem de 6 a 1
        // JOptionPane.showMessageDialog(null, numero);

        Random gerador = new Random();
        String faceString = JOptionPane.showInputDialog(" Quantas faces tem o dado? ");
        int FacesDados = Integer.parseInt(faceString);

        int Resultado = 1 + gerador.nextInt(FacesDados);

        JOptionPane.showMessageDialog(null, "Você tioru: " + Resultado + " no dado. ");

    }
}
