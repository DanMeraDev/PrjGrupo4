public class ForHelenH{
    public void imprimirHelenH(){
        int tam=5;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((j==0 || j==4 )||i==2){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println("");
        }
        System.out.println("");
    }

}