public class WhileDanielMeraDM extends Base {

    public WhileDanielMeraDM() {
        super();
    }

    @Override
    public void imprimirLetra(int size, char character) {
        if (size > 2) {
            int width = size -1;

            int row = 0;
            while (row < size) {
                int col = 0;
                System.out.print(character);
                while (col < width) {
                    if ((row == 0 || row == size - 1) && col < width - 1) {
                        System.out.print(character);
                    } else if (col == width - 1 && (row > 0 && row < size - 1)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                }
                System.out.print(" ");
                col = 0;
                while (col < width) {
                    if (col == 0 || col == width - 1 || (row == col && col <= width / 2) || (row + col == width - 1 && col >= width / 2)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                }
                System.out.println();
                row++;
            }
            System.out.println(super.msg);
        }
    }
}
