public class ForMoralesM {
    public static void ForM(int size) {
        System.out.println("For Letra M :");
        for (int i =0 ; i < size; i++) {
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
