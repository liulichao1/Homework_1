public class DaffodilsNum {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i == (i % 10) * (i % 10) * (i % 10) + (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10) + (i / 100) * (i / 100) * (i / 100)) {
                System.out.println("水仙花数：" + i);
            }
        }

    }
}


