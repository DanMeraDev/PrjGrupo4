public class App {
    public static void main(String[] args) throws Exception {
        ForHelenH fh= new ForHelenH();
        fh.imprimirHelenH();

        ForJarrinJ fj=new ForJarrinJ();
        fj.imprimirJarrinJ();

        ForHelenJarrinHJ fHj=new ForHelenJarrinHJ();
        fHj.imprimirHelenJarrinHJ();

        WhileHelenH wh=new WhileHelenH();
        wh.imprimirLetraH();

        WhileJarrinJ wJ=new WhileJarrinJ();
        wJ.imprimirLetraJ();

        WhileHelenJarrinHJ wHj=new WhileHelenJarrinHJ();
        wHj.imprimirLetrasHJ();

        DoWhileHelenH dh=new DoWhileHelenH();
        dh.imprimirInicialH();

        DoWhileJarrinJ dj=new DoWhileJarrinJ();
        dj.imprimirInicialJ();

        DoWhileHelenJarrinHJ dHj=new DoWhileHelenJarrinHJ();
        dHj.imprimirInicialesHJ();
        
        
    }
}
