import java.util.List;
public class Candies {
   public static void main(String[] arg){
       int [] kidswithcandies = new int[] {2,3,5,1,3};

       for(int i = 0; i<kidswithcandies.length-1;i++){
           int nextElement = kidswithcandies[i+1];
        if(kidswithcandies[i]>nextElement){
            if (kidswithcandies[i] >= 0 && kidswithcandies[i] < kidswithcandies.length &&
                    kidswithcandies[i+1] >= 0 && kidswithcandies[i+1] < kidswithcandies.length) {
                int temp = kidswithcandies[i];
                kidswithcandies[i] = kidswithcandies[i+1];
                kidswithcandies[i+1] = temp;
            }

        }
        System.out.println(kidswithcandies[i]);
       }
    }
}
