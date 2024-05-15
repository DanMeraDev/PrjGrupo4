public class DoWhileMontalvanM {
    public void doWhileM() {
        int i = 1;
        do {
            if (i == 2) {
                System.out.println("████  ████");
            } else if (i == 1 || i == 4 || i == 5) {
                System.out.println("██      ██");
            } else if (i == 3) {
                System.out.println("██  ██  ██");
            }
            i++;
        } while (i <= 5);
        System.out.print("\n");
    }
}
