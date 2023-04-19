package java_basics;

/*public class KhalidMughal {

    int planets;
    static int suns;

    public void gaze() {
       *//* -----------1----------

       int i;
        i = this.planets;
        i = this.suns;
        // this =  new KhalidMughal();
        // this.i = 4;
        this.suns = planets;*//*
    }
    void fly(int distance){ }
    int fly(int distance, int speed){
        return distance*speed;

    }

}*/
public class KhalidMughal{
   /* long var;

    public void KhalidMughal(long param) { var = param; }  // (1)

    public static void main(String[] args) {
        KhalidMughal a, b;
        a = new KhalidMughal();                              // (2)
        b = new KhalidMughal(5);                             // (3)
    }*/

   /* public static void main(String args[]){
        int minval = Calculate_min(new int[]{2, 7, 9, 5, 1, 8});
        System.out.println("minimum no. : " + minval);
    }\*/

    /*public static int Calculate_min(int[] dataseq){
        int min = dataseq[0];
        for (int i =1; i<dataseq.length; i++){
            if(dataseq[i] < min){
                min = dataseq[i];
            }
        }
        return min;
    }*/

    /*static void test(int[] a) {
        int[] b = new int[2];
        a = b;
        System.out.print(b.length);
        System.out.print(a.length);
    }
    public static void main(String[] args) {
        int[] a = new int[5];
        test(a);
        System.out.print(a.length);
    }

*/


       /* public static void main(String[] args) {
            int i = 0;
            addTwo(i++);
            System.out.println(i);
        }

         static void addTwo(int i) {
            i += 2;
             System.out.println(i);
        }*/

  /*  public static void main(String[] args) {
        int a = 0; int b = 0;
        int[] bArr = new int[1]; bArr[0] = b;

        inc1(a); inc2(bArr);

        System.out.println("a=" + a + " b=" + b + " bArr[0]=" + bArr[0]);
    }

    public static void inc1(int x) { x++; }

    public static void inc2(int[] x) { x[0]++; }*/

    public static class ParameterUse {
        static void main(String[] args) {
            int a = 0;
            final int b = 1;
            int[] c = { 2 };
            final int[] d = { 3 };
            useArgs(a, b, c, d);
        }

        static void useArgs(final int a, int b, final int[] c, int[] d) {
           // a++;
            b++;
            b=a;
            c[0]++; //why not this
            d[0]++;
            //c=d;
        }
    }


}



