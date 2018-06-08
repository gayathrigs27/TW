public class FizzBuzzex {
    static void FizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            String text = "";
            text += (i % 3) == 0 ? "fizz" : "";
            text += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!text.isEmpty() ? text: i);

        }
    }
    public static void main(String arg[]){
        FizzBuzz();
    }
}
