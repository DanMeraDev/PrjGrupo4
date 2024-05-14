public class WhileMoralesM {
    public static void WhileM(int size) {
        System.out.println(" ");
        System.out.println("While Letra M");
        int i = 0;
        while (i < size) {
            int j =0;
            while (j<size) {  
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