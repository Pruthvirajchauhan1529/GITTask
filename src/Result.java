public class Result {

    public void add(int i, int j){
        int c = i + j;
        System.out.println("Addition of two number: "+c);
    }
    public void sub(int i, int j){
        int c = i - j;
        System.out.println("Subtraction of two number: "+c);
    }
    public static void main(String[] args) {
        Result result = new Result();
        result.add(200,100);
        result.sub(200,100);
    }
}
