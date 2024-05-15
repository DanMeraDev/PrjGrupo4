public class WhileJarrinJ{
    public void imprimirLetraJ(){
        int tam=5;
        int i=0;
        while (i < tam) {
            int j=0;
            while (j < tam) {
                if ((i==0)||(j==2||(i==4&&j<3))){
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