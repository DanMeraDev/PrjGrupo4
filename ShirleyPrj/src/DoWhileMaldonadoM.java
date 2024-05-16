public class DoWhileMaldonadoM {

    public void doWhileMaldonado(){
        System.out.println(" ");
        System.out.println("inicial apellido con do-while");
        int altura = 5;
        int ancho = 5;
        int i = 0;
        do {
            int j = 0;
            do {
                if (j == 0 || j == ancho - 1 || (i == j && i <= altura / 2) || (i + j == altura - 1 && i <= altura / 2))
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