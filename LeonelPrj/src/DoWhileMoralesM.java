public class DoWhileMoralesM {
    public static void DoM(int size) {
        System.out.println("Do-While Letra M :");
        int i = 0;
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
