public class ForAlvaroMontalvanAM {
    public void forAM(){
        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 3) {
                System.out.print("██████████");
            } else {
                System.out.print("██      ██");
            }
            if (i == 2) {
                System.out.println("    ████  ████");
            } else if (i == 1 || i == 4 || i == 5) {
                System.out.println("    ██      ██");
            } else if (i == 3) {
                System.out.println("    ██  ██  ██");
            }
        }
        System.out.print("\n");
    }
}