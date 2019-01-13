public class MyClass {
    public void printMsg(String msg) {
        System.out.println(msg);
    }
    public static int count = 0;
    public void guessMyNumber(int num) {
        int random = (int)(Math.random() * 10 + 1);
        if (num == random) {
            System.out.println(random);
            System.out.println("Congratulation!! You win!!");
        } else {
            count++;
            System.out.println(random);
        }
        if (count == 3) {
            System.out.println("Game Over!!");
        }
    }
}
