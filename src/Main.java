

public class Main {
    public static void main(String[] args){


        int modulusRemainder3 = 0;
        int modulusRemainder5 = 0;





        for(int i = 1; i <=100; i++) {

            modulusRemainder3 = i % 3;
            modulusRemainder5 = i % 5;
            if (modulusRemainder3 == 0) {
                System.out.print("Fizz");
            }
            if (modulusRemainder5 == 0){
                System.out.print("Buzz");
            }
            if (modulusRemainder3 != 0 && modulusRemainder5 != 0) {
                System.out.print(i);
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
    }

}
