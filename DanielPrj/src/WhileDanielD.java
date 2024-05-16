public class WhileDanielD extends Base{

    @Override
    public void imprimirLetra(int size, char character) {
        if(size > 2) {
            int row = 0;
            while (row < size) {
                System.out.print(character);
                int col = 0;
                while (col < size) {
                    if ((row == 0 || row == size - 1) && col < size - 1) {
                        System.out.print(character);
                    } else if (col == size - 1 && (row > 0 && row < size - 1)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                }
                System.out.println();
                row++;
            }
        } else System.out.print(super.msg);
    }
}
