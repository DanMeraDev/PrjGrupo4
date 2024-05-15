public class WhileHelenJarrinHJ{
    public void imprimirLetrasHJ(){
        int tam=5;
        int i=0;
        while (i < tam) {
            int j=0, cont=0;
            while (j < tam) {
                if ((j==0 || j==4 )||i==2){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                }  
                j++;
            }
            System.out.print(" ");
            while (cont< tam) {
                if ((i==0)||(cont==2||(i==4&&cont<3))){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                }  
                cont ++;
            }
            i++;
            System.out.println("");
        }
        System.out.println("");
    }

}