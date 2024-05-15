public class WhileShirleyS {

    public void whileShirleyLetra(){
        System.out.println(" ");
        System.out.println("inicial del nombre con el ciclo while");
        int comienzo = 0;
        while (comienzo< 7) {
            int colm= 0;
            while (colm < 7) {
                if ((comienzo == 0 || comienzo== 3 || comienzo == 6) && (colm > 0 && colm< 5)) {
                    System.out.print("+");
                } else if ((comienzo== 1 || comienzo == 2) && colm == 0) {
                    System.out.print("+");
                } else if ((comienzo == 4 || comienzo == 5) && colm== 5) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
                colm++;
            }
            System.out.println();
            comienzo++;
        }
    }

}