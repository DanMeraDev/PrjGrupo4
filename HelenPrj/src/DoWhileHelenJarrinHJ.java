public class DoWhileHelenJarrinHJ{
    public void imprimirInicialesHJ(){
        int tam=5;
        int i=0;
        do{
            int j=0, cont=0;
            do{
                if ((j==0 || j==4 )||i==2){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                }  
                j++;
            }while (j < tam);
            System.out.print(" ");
            do{
                if ((i==0)||(cont==2||(i==4&&cont<3))){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                }  
                cont ++;
            }while (cont< tam);
            i++;
            System.out.println("");
        }while (i < tam);
        System.out.println("");
    }

}