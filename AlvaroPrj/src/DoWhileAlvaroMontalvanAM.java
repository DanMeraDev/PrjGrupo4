public class DoWhileAlvaroMontalvanAM {
    public void doWhileAM() {
        int i = 1;
        do {
            if (i == 1 || i == 3) {
                System.out.print("██████████");
            } else {
                System.out.print("██      ██");
            }
            if (i == 2) {
                System.out.print("    ████  ████");
            } else if (i == 1 || i == 4 || i == 5) {
                System.out.print("    ██      ██");
            } else if (i == 3) {
                System.out.print("    ██  ██  ██");
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
