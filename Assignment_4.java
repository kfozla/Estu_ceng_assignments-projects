import java.util.Arrays;
public class Assignment_4 {
    public static String[] sortByHeight(String names[],int heights []){
        //need to find algorithm to sort values
        //checking every index with other indexes if small index number value has smaller value swap values
        for (int i=0;i< heights.length-1;i++){
            for(int j=0;j<heights.length;j++){
                if (i+j>= heights.length){
                    break;
                }
                if(heights[i]<heights[i+j]){
                    //swapping values
                    String temp=names[i+j];
                    names[i+j]=names[i];
                    names[i]=temp;

                    int temp_1=heights[i+j];
                    heights[i+j]=heights[i];
                    heights[i]=temp_1;
                }
            }
        }
        return names;

    }
    public static void main(String[] args) {
        String names[] = new String[4];
        int heights[] = new int[4];

        names[0]="Dilara";
        names[1]="Yusuf";
        names[2]="Zeynep";
        names[3]="Ali";

        heights[0]=162;
        heights[1]=167;
        heights[2]=112;
        heights[3]=160;

        System.out.println(Arrays.toString(sortByHeight(names,heights)));
    }
}