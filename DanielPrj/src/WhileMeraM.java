public class WhileMeraM extends Base{

    public WhileMeraM() {
        super();
    }

    @Override
    public void imprimirLetra(int size, char character) {
        if (size > 2) {
            int row = 0;
            while (row < size) {
                int col = 0;
                while (col < size) {
                    if (col == 0 || col == size - 1 || (row == col && col <= size / 2) || (row + col == size - 1 && col >= size / 2)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                }
                System.out.println();
                row++;
            }

            System.out.println();
        } else System.out.println(super.msg);
    }
}
