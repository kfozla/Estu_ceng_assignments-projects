public class Assignment_3 {
    //loop based is slower than math based
    public static int loopBasedCount (int a,int b){
        int counter =0;
        for (int i=a;i<=b;i++){
            if (i%2!=0){
                counter++;
            }
        }
        return counter;
    }
    public static int mathBasedCount(int x,int y){
        int k;
        if (x%2==0 && y%2==0){
            k=((y-1)-(x+1))/2+1;
        }
        else if (x%2!=0 && y%2==0){
            k=((y-1)-(x))/2+1;
        }
        else if (x%2==0 && y%2!=0){
            k=((y)-(x+1))/2+1;
        }
        else {
            k=((y)-(x))/2+1;
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println("loop based result: "+loopBasedCount(50,150));//slower result
        System.out.println("math based resutl: "+mathBasedCount(50,150));//faster result
    }
}
