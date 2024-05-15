public class ForMontalvanM {
    public void forM() {
        for (int i = 1; i <= 5; i++) {
            if ( i == 2 ){
                System.out.println("████  ████");
            } else if ( i == 1 || i == 4 || i == 5){
                System.out.println("██      ██");
            } else if ( i == 3){
                System.out.println("██  ██  ██");
            }
        }
        System.out.print("\n");
    }
}