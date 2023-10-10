public class Exam {
    public static void main(String[] args) {
        System.out.println(embiggen(100));
        int biggerNum = embiggen(100);
    }
    static int embiggen(int num) {
        return num*2;
    }
}
