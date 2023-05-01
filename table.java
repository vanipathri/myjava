public class table {
    public static void main(String[] args) {
        printtable(5,10);
    }

    public static void printtable(int x, int y) {
        for (int i = 1; i <= y; i++) {
            System.out.println(x + "*" + i+"="+ x*i);
        }
    }
}