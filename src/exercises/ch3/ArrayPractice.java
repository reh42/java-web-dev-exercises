package exercises.ch3;

public class ArrayPractice {
    public static void main(String[] args){
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
    }

    public void printOddNumbers(){
        //1,1,2,2,5,8
        int[] myArrayOfInts = {1, 1, 2, 3, 5, 8 };

        for(int i = 0; i < myArrayOfInts.length; i++){
            System.out.print(myArrayOfInts[i]);
        }
    }
}
