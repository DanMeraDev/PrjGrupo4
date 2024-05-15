public class DoWhileDanielD extends Base{
    @Override
    public void imprimirLetra(int size, char character) {
        if (size > 2) {
            int row = 0;
            do {
                System.out.print(character);
                int col = 0;
                do {
                    if ((row == 0 || row == size - 1) && col < size - 1) {
                        System.out.print(character);
                    } else if (col == size - 1 && (row > 0 && row < size - 1)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                } while (col < size);
                System.out.println();
                row++;
            } while (row < size);
        } else System.out.println(super.msg);
    }
}
