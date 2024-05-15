public class DoWhileJarrinJ{
    public void imprimirInicialJ(){
        int tam=5;
        int i=0;
        do{
            int j=0;
            do{
                if ((i==0)||(j==2||(i==4&&j<3))){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                }  
                j++;
            }while (j < tam);
            System.out.println("");
            i++;
        }while (i < tam);
        System.out.println("");
    }

}