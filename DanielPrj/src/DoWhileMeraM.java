public class DoWhileMeraM extends Base{
    @Override
    public void imprimirLetra(int size, char character) {
        if(size > 2) {
            int row = 0;
            do {
                int col = 0;
                do {
                    if (col == 0 || col == size - 1 || (row == col && col <= size / 2) || (row + col == size - 1 && col >= size / 2)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                } while (col < size);
                System.out.println();
                row++;
            } while (row < size);

            System.out.println();
        } else System.out.println(super.msg);
    }
}
