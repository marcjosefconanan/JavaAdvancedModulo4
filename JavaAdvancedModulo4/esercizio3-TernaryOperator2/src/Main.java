//Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario
//public class Module01 {
//    public static void main(String[] args) {
//        System.out.println(checkString("Questa è una stringa"));
//    }
//
//    private static String checkString(String value) {
//        String result;
//        if (value.length() >= 10) {
//            result = "Lunghezza maggiore o uguale di 10";
//        } else {
//            result = "Lunghezza minore di 10";
//        }
//        return result;
//    }
//}
public class Main {
    public static void main(String[] args) {
        String string = "Questa è una stringa";
        System.out.println(checkStringTern(string));                   //System.out.println(checkString("Questa è una stringa"));
    }
    static String checkStringTern(String value) {                       //    private static String checkString(String value) {
        return value.length() >= 10 ?                                   //        String result;
                "Lunghezza maggiore o uguale di 10" :                   //        if (value.length() >= 10) {
                "Lunghezza minore di 10";                               //            result = "Lunghezza maggiore o uguale di 10";
        //        } else {
        //            result = "Lunghezza minore di 10";
        //        }
        //        return result;
        //    }
        //}
    }
}
