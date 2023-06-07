package utils;

public class Utils {
    public static boolean verificarSeContemString(String[] vetor, String texto) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(texto)) {
                return true;
            }
        }
        return false;
    }
}
