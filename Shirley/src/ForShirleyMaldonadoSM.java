public  class ForShirleyMaldonadoSM {
    public void dibujarNombreApellido(){
        System.out.println("se presenta iniciales de nombre y apellido");
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 || i == 3 || i == 6) && (j > 0 && j < 5))
                    System.out.print("-");
                else if ((i == 1 || i == 2) && (j == 0))
                    System.out.print("-");
                else if ((i == 4 || i == 5) && (j == 5))
                    System.out.print("-");
                else
                    System.out.print(" ");
            }
            System.out.print("  ");
            for (int j = 0; j < 7; j++) {
                if (j == 0 || j == 6)
                    System.out.print("+");
                else if (j == i && i <= 3)
                    System.out.print("+");
                else if (j == 6 - i && i <= 3)
                    System.out.print("+");
                else if (i > 3 && (j == 1 || j == 5))
                    System.out.print(" ");
                else
                    System.out.print(" ");;
            }
            System.out.println();
        }   
    }
}    