public class WhileHelenH{
    public void imprimirLetraH(){
        int tam=5;
        int i=0;
        
        while (i < tam) {
            int j=0;
            while(j < tam) {
                if ((j==0 || j==4 )||i==2){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                } 
                j++; 
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
    }

}