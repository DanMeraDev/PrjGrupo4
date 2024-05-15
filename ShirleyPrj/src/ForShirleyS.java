public class ForShirleyS {
    public void dibujarS(){
        System.out.println("la inicial del nombre");
        int altura=7;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i == 0 || i == altura / 2 || i == altura - 1) && j < altura - 1)
                    System.out.print("*");
                else if (j == 0 && (i > 0 && i < altura / 2))
                    System.out.print("*");
                else if (j == altura - 1 && (i > altura / 2 && i < altura - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
