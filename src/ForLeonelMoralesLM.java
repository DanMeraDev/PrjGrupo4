public class ForLeonelMoralesLM {
    public static void ForLM(int size) {
        System.out.println("For Letras L- M :");

        for (int i = 1; i < size; i++) {
            if (i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("*");
            }
        }
        
        System.out.println(); 
        System.out.println();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
