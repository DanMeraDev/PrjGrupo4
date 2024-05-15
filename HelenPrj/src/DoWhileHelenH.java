public class DoWhileHelenH{
    public void imprimirInicialH(){
        int tam=5;
        int i=0;
        
        do {
            int j=0;
            do{
                if ((j==0 || j==4 )||i==2){
                    System.out.print('+');
                }else{
                    System.out.print(" ");
                } 
                j++; 
            }while(j < tam);
            System.out.println("");
            i++;
        }while (i < tam);
        System.out.println("");
    }

}