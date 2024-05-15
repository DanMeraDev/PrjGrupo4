public class WhileLeonelL {
    public static void WhileL(int size) {
        System.out.println("While Letra L :");
        int i = 1;
        while (i < size) {
            if (i == size - 1) {
                int j = 0;
                while (j < size) {
                    System.out.print("*");
                    j++;
                }
            } else {
                System.out.println("*");
            }
            i++;
        }
    }
}
