
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        
        return greater(number1, greater(number2, number3));
    }
    
    private static int greater(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
