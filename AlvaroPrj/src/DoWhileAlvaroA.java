public class DoWhileAlvaroA {
    public void doWhileA() {
        int i = 1;
        do {
            if (i == 1 || i == 3) {
                System.out.print("██████████\n");
            } else {
                System.out.print("██      ██\n");
            }
            i++;
        } while (i <= 5);
        System.out.print("\n");
    }
}
