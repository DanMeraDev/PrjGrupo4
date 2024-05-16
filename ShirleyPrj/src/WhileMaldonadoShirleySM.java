public class WhileMaldonadoShirleySM {
    public void whileLetrasSM(){
        System.out.println("  ");
        System.out.println("iniciales S y M con el ciclo while");
        int size = 5;
        int row = 1;
        while (row <= size) {
            int col = 1;
            while (col <= size) {
                if (row == 1 || row == size || row == size / 2 + 1) {
                    System.out.print("*");
                } else if (col == 1 && row < size / 2 + 1) {
                    System.out.print("*");
                } else if (col == size && row > size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
        row = 1;
        System.out.println("\nLetra M:");
        int height = 5;
        int width = height; 
        while (row <= height) {
            int col = 1;
            while (col <= width) {
                if (col == 1 || col == width || (row == col && col <= height / 2 + 1) || (col == width - row + 1 && col >= height / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
    