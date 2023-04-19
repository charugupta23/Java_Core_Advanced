package WhizLabs;

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Bird extends Animal{
    @Override
    void eat() {
        super.eat();
        System.out.println("Birds eat");
    }
    void print(){
        super.eat();
    }
}
public class Whiz {
    public static void main(String... args){
        Animal ab = new Bird();
        ab.eat();

       // for(int i=0;i<5;i++,System.out.println(i+ ".Hi"));

        /*L1: for(int i=5,j=0;i>0;i--){
            L2:for(;j<5;j++){
                System.out.println(i+""+j+"");
                //if(j==0)continue L1;
                //if(j==0)break L2;
                if(j==0)break L1;
            }
        }*/

       /* int arr[][] = {{1,3,5},{7,8}};
        out:for (int []a:arr){
         out1:   for (int i : a){
                if(i==7)
                    continue;
                System.out.println(i+"");
                if(i==3)
                    break out1;
            }
        }*/


    }
}
