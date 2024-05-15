public class WhileMontalvanM {
    public void whileM() {
        int i = 1;
        while (i <= 5) {
            if (i == 2) {
                System.out.println("████  ████");
            } else if (i == 1 || i == 4 || i == 5) {
                System.out.println("██      ██");
            } else if (i == 3) {
                System.out.println("██  ██  ██");
            }
            i++;
        }
        System.out.print("\n");
    }
}
