import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public static void main(String... args){
        //find_Solution();
        findDuplicate_integer();
        //findDuplicate_string();
        //find_IntegerDuplicate2();
    }

    public static void find_Solution (){
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Coke");
        arr.add("Pepsi");
        arr.add("Miranda");

        System.out.println("Total Array List:: "+ arr);

        String[] ws1 = new String[arr.size()];
        String[] ws2 = arr.toArray(ws1);

        System.out.println("ws1 == ws2 " + (ws1 == ws2));
        System.out.println("ws1 : " + Arrays.toString(ws1));
        System.out.println("ws2 : " + Arrays.toString(ws2));

        ws1 = new String[1];
        ws1[0] = "test data";
        ws2 = arr.toArray(ws1);

        System.out.println("ws1 == ws2 " + (ws1 == ws2));
        System.out.println("ws1 : " + Arrays.toString(ws1));
        System.out.println("ws2 : " + Arrays.toString(ws2));
    }

    public static void findDuplicate_integer(){
        int array[] = {1,2,2,2,3,4,4,5,-1,-1,0,0};
        int[][] array2 = new  int[5][2];
        System.out.println("=========Duplicate Numbers===========");
         for(int i = 0; i<array.length; i++){
             int counter = 1;
             for(int j=i+1; j<array.length; j++){
                 if(array[i] == array[j]){
                     counter++;

                     //System.out.println(array[i] + " : " + counter);
                     array[j] = 0;
                 }
             }
             if(counter>1 && array[i]!=0)
                 System.out.println(array[i] + " : " + counter);
         }
     }

    public static void findDuplicate_string() {
        String string = "This is too big and this is too too too bad";
        String lowerCaseString = string.toLowerCase();
        String splitWords[] = lowerCaseString.split(" ");

        System.out.println("=========Duplicate Words===========");
        for (int i = 0; i < splitWords.length; i++) {
            int counter = 1;

            for (int j = i + 1; j < splitWords.length; j++) {
                if (splitWords[i].equals(splitWords[j])) {
                    counter++;
                    splitWords[j] = "";
                }
            }
            if (counter > 1 && splitWords[i] != "")
                System.out.println(splitWords[i] + " : " + counter);
        }
    }

    public static void find_IntegerDuplicate2(){
        int[] array = {1,2,2,3,4,5,2,5,0,0};
        int[][] duplicate_ArrayValue = new int[5][2];
        int count = 0;
        //ArrayList<Integer> duplicate_ArrayValue = new ArrayList<>();
        for(int i=0; i< array.length;i++){
            for(int j=i+1; j< array.length;j++){
                if(array[i]==array[j]){
                    if(check_ValueIn_array(array[i], duplicate_ArrayValue) ==-1){
                        //int val = array[i];
                        duplicate_ArrayValue[count][0] = array[i];
                        duplicate_ArrayValue[count][1] = array[i];
                        count++;
                    }
                    }
                }
            }
       /* for (int k:duplicate_ArrayValue)
        System.out.println(k);*/
        }

    public static int check_ValueIn_array(int value,int[][] duplicate_ArrayValue){
       if(duplicate_ArrayValue.length == 0)
           //return false;
           return -1;

        for (int i=0; i<duplicate_ArrayValue.length;i++)
        {
            if(duplicate_ArrayValue[i][0] == value)
                //return true;
                return i;
        }
        //return false;
        return -1;
    }

}
