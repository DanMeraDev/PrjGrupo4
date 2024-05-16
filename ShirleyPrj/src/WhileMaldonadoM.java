public class WhileMaldonadoM {

    public void whileMLetra(){
        System.out.println(" ");
        System.out.println("inicial apellido con while");
        int tam = 0;
        while (tam< 7) {
            int colum = 0;
            while (colum < 7) {
                if (colum == 0 || colum == 6) {
                    System.out.print("@");
                } else if (colum == tam&& tam<= 3) {
                    System.out.print("@");
                } else if (colum == 6 - tam&& tam<= 3) {
                    System.out.print("@");
                } else if (tam > 2 && (colum == 1 || colum == 5)) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
                colum++;
            }
            System.out.println();
            tam++;
        }
    }
}