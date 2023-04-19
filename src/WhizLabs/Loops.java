package WhizLabs;

/*public class Loops {
    public static  void main(String... args){
        L1:for(int i=5,j=0; i>0;i--){
        L2:for(;j<5;j--){
            System.out.println(i+""+j);
            if(j==0)
                continue L1;
        }
        }
    }
}*/

public class Loops {
    public static void main(String... args){
        int arr[][] = {{1,3,5},{7,8}};
        out:for(int[]a: arr){
            for (int i:a){

            if(i==7)
                continue ;
                System.out.println(i+"");
                if(i==3)
                    break ;
            }
        }
    }
}
