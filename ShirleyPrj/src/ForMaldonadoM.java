public class ForMaldonadoM{
    public void dibujarM(){
        System.out.println("la inicial del apellido");
        int tamano= 7;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j == 0 || j == tamano - 1 || (i == j && i <= tamano / 2) || (i + j == tamano - 1 && i <= tamano/ 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}                           
