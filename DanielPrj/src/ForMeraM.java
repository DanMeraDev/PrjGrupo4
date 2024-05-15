

public class ForMeraM extends Base {

    @Override
    public void imprimirLetra(int size, char character) {
        if(size > 2){
            int width = size -1;

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < width; col++) {
                    if (col == 0 || col == width - 1 || (row == col && col <= width / 2) || (row + col == width - 1 && col >= width / 2)) {
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
