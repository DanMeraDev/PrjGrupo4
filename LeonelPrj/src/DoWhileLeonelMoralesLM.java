public class DoWhileLeonelMoralesLM {
    public static void DoLM(int size) {
        System.out.println("Do-While Letras L y M:");

        int i = 0;
        do {
            // Imprimir la letra "L"
            int j = 0;
            do {
                if (j == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < size);

            // Espacio entre las letras
            System.out.print(" ");

            // Imprimir la letra "M"
            j = 0;
            do {
                if (j == 0 || j == size - 1 || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < size);
            
            // Nueva línea para la siguiente fila
            System.out.println();
            i++;
        } while (i < size);
    }
}



