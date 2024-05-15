public class ForDanielD extends Base{

    @Override
    public void imprimirLetra(int size, char character) {
        int width = size - 1;
        if (size > 2) {
            for (int row = 0; row < size; row++) {
                System.out.print(character);
                for (int col = 0; col < width; col++) {
                    if ((row == 0 || row == size - 1) && col < width - 1) {
                        System.out.print(character);
                    } else if (col == width - 1 && (row > 0 && row < size - 1)) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else System.out.println(super.msg);
    }

}
