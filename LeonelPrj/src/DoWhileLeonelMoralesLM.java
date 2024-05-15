public class DoWhileLeonelMoralesLM {
    public static void DoLM(int size) {
        System.out.println("Do-While Letras L- M :");

        int i = 1;
        do {
            if (i == 4 || i == size) {
                System.out.println("*****");
            } else {
                System.out.println("*");
            }
            i++;
        } while (i < size);
        System.out.println();

        i = 0; 
        do {
            int j = 0;
            do {
                if (j == 0 || j == size - 1 || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < size);
            System.out.println();
            i++;
        } while (i < size);
    }
}


