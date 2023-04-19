package PracticeLoops;

public class LoopPractice {
    public static void main(String... args) {
        /*int count = 0;

        while(count<=100){
            System.out.println("Charu : "+count);
            count++;
            if(count==30)
                break;;*/
        String str = "We have large inventory of things in warehouse falling in "
                + "the category:apperal and the slightly"
                + "more in demand category:makeup along with the category:furniture and..";
        printCategory(str);
    }

    public static void printCategory(String str) {
        int i = 0;
        while(true){
            int found = str.indexOf("category:", i);
            if(found==-1)break;
            int start = found+9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start,end));
            i = end+1;

        }
        /*System.out.println(a);
        int k = str.indexOf("category",j+8);
        String b = str.substring(k);
        System.out.println(b);
        int i = str.indexOf("category",k+8);
        String c = str.substring(i);
        System.out.println(c);*/
    }
}
