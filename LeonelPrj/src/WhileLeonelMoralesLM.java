public class WhileLeonelMoralesLM {
    public static void WhileLM(int size) {
        System.out.println("While Letras L- M :");

        int i = 1;
        while (i < size) {
            if (i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("*");
            }
            i++;
        }

        System.out.println();
        System.out.println(); 

        i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                if (j == 0 || j == size - 1 || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

