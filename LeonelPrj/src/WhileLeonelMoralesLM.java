public class WhileLeonelMoralesLM {
    public static void WhileLM(int size) {
        System.out.println("While Letras L- M :");

        int i = 0;
        while (i < size) {
            // Imprimir la letra "L"
            int j = 0;
            while (j < size) {
                if (j == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            
            // Espacio entre las letras
            System.out.print(" ");
            
            // Imprimir la letra "M"
            j = 0;
            while (j < size) {
                if (j == 0 || j == size - 1 || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            
            // Nueva línea para la siguiente fila
            System.out.println();
            i++;
        }
    }
}


