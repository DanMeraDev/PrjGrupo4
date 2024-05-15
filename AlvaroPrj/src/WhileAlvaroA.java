public class WhileAlvaroA {
    public void whileA(){
        int i = 1;
        while (i <= 5) {
            if (i == 1 || i == 3) {
                System.out.print("██████████\n");
            } else {
                System.out.print("██      ██\n");
            }
            i++;
        }
        System.out.print("\n");
    }
}