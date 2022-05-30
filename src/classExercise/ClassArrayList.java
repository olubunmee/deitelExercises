package classExercise;

public class ClassArrayList {

    private int inputIntoList = 0;

    private int capacity = 5;

    private String [] myArray = new String[capacity];


    public boolean isEmpty() {
        return inputIntoList == 0;
    }

    public void add(String item) {
        if (inputIntoList >= myArray.length)
            myArray = new String[myArray.length * 2];
        myArray[inputIntoList] = item;
        inputIntoList++;
    }

    public int size() {
        return inputIntoList;
    }

    public void remove(String item) {
        myArray[inputIntoList] = item;
        inputIntoList--;
    }

    public void add(int index, String item){
        if (inputIntoList >= myArray.length)
            myArray = new String[myArray.length * 2];
        myArray[index] = item;
        inputIntoList++;
    }

    public void remove(int index){
        String [] newOne = new String[myArray.length - 1];
        for (int i = 0; i < myArray.length; i++) {
            if (i == index)
                inputIntoList--;
        }
        System.arraycopy(myArray, 0, newOne, 0, myArray.length - 1);
        myArray = newOne;
    }

    public String getItem(String item) {
        return myArray[inputIntoList] = item;
    }

    public String getIndex(int index) {
        return myArray[index];
    }

}

