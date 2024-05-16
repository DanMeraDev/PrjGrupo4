public class ForLeonelMoralesLM {
    public static void ForLM(int size) {
        System.out.println("For Letras L- M :");

        for (int i = 0; i < size; i++) {
            // Imprimir la letra "L"
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Espacio entre las letras
            System.out.print(" ");
            
            // Imprimir la letra "M"
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Nueva línea para la siguiente fila
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        ForLM(5); // Tamaño de las letras
    }
}
