public class DoWhileShirleyS {

    public void doWhileShirley(){
        System.out.println(" ");
        System.out.println("inicial nombre en do-while");
        int altura = 7;
        int ancho = 5;
        int i = 0;
        do {
            int j = 0;
            do {
                if ((i == 0 || i == altura/ 2 || i ==altura- 1) && j < ancho- 1)
                    System.out.print("*");
                else if (j == 0 && (i > 0 && i < altura/ 2))
                    System.out.print("*");
                else if (j == ancho- 1 && (i > altura/ 2 && i < altura- 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            } while (j < ancho);
            System.out.println();
            i++;
        } while (i < altura);
    }

}