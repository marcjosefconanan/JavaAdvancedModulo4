//Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario
//
// public class Main {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             System.out.println("Valore: " + i);
//             System.out.println(checkValue(i));
//         }
//     }
//
//     private static String checkValue(int value) {
//         String result = "";
//
//         if (value % 5 == 0) {
//             result = "FizzBuzz";
//         } else  {
//             result = "Buzz";
//         }
//         return result;
//     }
//
// }
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {                    //for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);             //System.out.println("Valore: " + i);
            System.out.println(check(i));                   //System.out.println(checkValue(i));
        }
    }

    static String check(int value) {                        //private static String checkValue(int value) {
        return value % 5 == 0 ?                             //String result = "";
                "FizzBuzz" :                                //if (value % 5 == 0) {
                "Buzz";                                     //result = "FizzBuzz";
        //} else  {
        //result = "Buzz";
        //}
        //return result;
    }
}