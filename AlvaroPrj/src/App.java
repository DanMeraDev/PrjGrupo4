public class App {
    public static void main(String[] args) throws Exception {
        ForAlvaroA fA;
        ForMontalvanM fM;
        ForAlvaroMontalvanAM fAM;
        WhileAlvaroA wA;
        WhileMontalvanM wM;
        WhileAlvaroMontalvanAM wAM;
        DoWhileAlvaroA dwA;
        DoWhileMontalvanM dwM;
        DoWhileAlvaroMontalvanAM dwAM;

        fA = new ForAlvaroA();
        fM = new ForMontalvanM();
        fAM = new ForAlvaroMontalvanAM();
        wA = new WhileAlvaroA();
        wM = new WhileMontalvanM();
        wAM = new WhileAlvaroMontalvanAM();
        dwA = new DoWhileAlvaroA();
        dwM = new DoWhileMontalvanM();
        dwAM = new DoWhileAlvaroMontalvanAM();

        fA.forA();
        fM.forM();
        fAM.forAM();
        wA.whileA();
        wM.whileM();
        wAM.whileAM();
        dwA.doWhileA();
        dwM.doWhileM();
        dwAM.doWhileAM();
    }
}