package WhizLabs;


public class TestSquare {
    public static void main(String[] args) {
       /* Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4*/
        /* int x=0;
        do{
            System.out.println(x);
        }while (x++<2);

        for(x=0;x++<2;)
            System.out.println(x);*/
       /* int[] a1 = {2,-1,4,5,3};
        int[] a2 = {2,-1,4,5,3};
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(Arrays.equals(a1,a2));*/
        // System.out.println(Arrays.deepEquals(a1,a2));

       /* int array[][] = {{3,2,1},{5,4,2},{0,8,7}};
        outer:for(int x=0,k=0;x<3;x++){
            k=0;
            inner:while (true){
                int y;
                System.out.println(y =array[x][k++]);
                if(k==3)
                    break;
            }
        }*/

      /*  int a[]={1,2,3,4};
        for(int j:a){
            if(j==2)
                continue;
            for(int x=0;x<3;System.out.println(x)){
                x++;
            }
        }*/

       /* Loop1:for(int x=0; x<3;x++){
          for(int y =0;y<3;y++){
              if(y==2)continue ;
              if(y==2 && x==2)
                  break Loop1;
              System.out.println(y);
          }*/

       /* livera s = new livera("livera", 22);
        person p = s;
        s.read();
        p.read();;*/

        int b=3;
        for(int a=1; b!=1; System.out.println("iterate"+b)){
            b=b-a;
        }

        String s="big surprise";
        System.out.println(s.toString());

        int array[] = new int[]{};
        array[0] = 3;
        array[1] = 5;
        System.out.println(array[0]+array[1]);
    }
}

        class person{
          int age;
          String name;
          public void read(){
              System.out.println("person is reading");
          }
          private void other(){

          }
        }
        class  livera extends person{
          livera(String n, int i){
            age=i;
            name=n;
          }
            public void read(){
                System.out.println(name +"is reading");
            }
          public void other()throws Exception{

            }
        }


