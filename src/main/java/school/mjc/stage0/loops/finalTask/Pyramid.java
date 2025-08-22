package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            for (int s = 1; s <= cathetusLength - i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            for (int s = 1; s <= cathetusLength - i; s++) {
                System.out.print(" ");
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
