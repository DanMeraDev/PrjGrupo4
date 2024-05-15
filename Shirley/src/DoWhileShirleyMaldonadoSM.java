public class DoWhileShirleyMaldonadoSM {

    public void doWhileShirleyMaldonado(){
        System.out.println(" ");
        System.out.println("iniciales de Shirley Maldonado con do-while");
        int altoS = 7;
        int anchoS = 5;
        int altoM = 5;
        int anchoM = 5;
        int i = 0;
        do {
            int j = 0;
            do {
                if ((i == 0 || i == altoS / 2 || i == altoS - 1) && j < anchoS - 1)
                    System.out.print("*");
                else if (j == 0 && (i > 0 && i < altoS/ 2))
                    System.out.print("*");
                else if (j == anchoS - 1 && (i > altoS / 2 && i < altoS- 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            } while (j < anchoS);
            System.out.print(" ");
            j = 0;
            do {
                if (j == 0 || j == anchoM- 1 || (i == j && i <= altoM / 2) || (i + j == altoM - 1 && i <= altoM / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
                j++;
            } while (j < anchoM);
            System.out.println();
            i++;
        } while (i < altoS || i < altoM);
    }
}