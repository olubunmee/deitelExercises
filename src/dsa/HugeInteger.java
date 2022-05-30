package dsa;

public class HugeInteger {

    private static int [] arrayIntegers = new int[40];

    public static int getArrayIntegers(int arrayInteger) {
        return arrayIntegers[arrayInteger];
    }

    public static void parse(String string){
        for (int i = 0; i < string.length(); i++) {
            string.charAt(i);
        }
    }

    public static HugeInteger add(){

        return null;
    }

    public static HugeInteger subtract(){

        return null;
    }







    public static boolean isEqualTo(){
        for (int i = arrayIntegers.length - 1; i >= 0; i--) {
            if (arrayIntegers[i] != getArrayIntegers(i))
                return false;
        }
        return true;
    }
    public static boolean isEqualNotTo(){
        for (int i = arrayIntegers.length - 1; i >= 0; i--) {
            if (arrayIntegers[i] != getArrayIntegers(i))
                return true;
        }
        return false;
    }
    public static boolean isGreaterThan(){
        for (int i = 0; i < arrayIntegers.length; i++){
            if (arrayIntegers[i] != getArrayIntegers(i)){
                if (arrayIntegers[i] > getArrayIntegers(i))
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
    public static boolean isLessThan(){
        for (int i = 0; i < arrayIntegers.length; i++){
            if (arrayIntegers[i] != getArrayIntegers(i)){
                if (arrayIntegers[i] < getArrayIntegers(i))
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
    public static boolean isGreaterThanOrEqualTo(){
        for (int i = 0; i < arrayIntegers.length; i++){
            if (arrayIntegers[i] != getArrayIntegers(i)){
                if (arrayIntegers[i] > getArrayIntegers(i))
                    return true;
                else
                    return false;
            }
        }
        return true;
    }
    public static boolean isZero(){
        for (int i = arrayIntegers.length - 1; i >= 0; i--){
            if (arrayIntegers[i] != 0)
                return false;
        }
        return true;
    }
}
