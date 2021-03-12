import java.util.*;
public class SuperMMMR {
    private SuperArray Arr;
    private Integer[] Arry;

    public SuperMMMR(){
        this.Arr = new SuperArray(15);
        this.Arry = Arr.getArr();
    }

    public void add(Integer val){
        this.Arr.add(val);
        this.Arry.add(val);
    }

    /*
    N   Average
    P   Generates average of the Array
    I   N/A
    R   Integer Average
    */
    public Integer Average(){
        Integer Average = 0;
        for(int i = 0; i < this.Arry.length; i++){
            Average += this.Arry[i];
        }
        Average = Average / this.Arry.length;
        return Average;
    }

    /*
    N   Mean
    P   Remove a specific value from Array and shifts the rest of the values accordingly
    I   Integer index  
    R   N/A
    */
    public Integer Mean(){
        Integer Mean = 0;

        for (int i = 0; i < Arry.length; i++) {
            Mean += Arry[i];
        }
        return Mean / Arry.length;
    }

    /*
    N   Median
    P   Generates median of the Array
    I   N/A
    R   Integer Median 
    */
    public Integer Median(){
        Integer median;
        if (Arry.length % 2 == 0){//median
            median = Arry[Arry.length/2] + Arry[Arry.length/2 - 1]/2;
        }
        else{//median if array isn't even length
            median = Arry[Arry.length/2];
        }
        return median;
    }

    /*
    N   Mode
    P   Generates mode of the Array
    I   N/A
    R   Integer Mode
    */
    public Integer Mode(){
        int maxv = 0, maxc = 0, i, j;

      for (i = 0; i < Arry.length; i++) {
         int count = 0;
         for (j = 0; j < Arry.length; ++j) {//Nested loop to count the elements of the array and store them in maxv which represents the current mode.
             if (Arry[j] == Arry[i])
             count++;
         }
         if (count > maxc) {
             maxc = count;
             maxv = Arry[i];
         }
      }//end of for loop
      return maxv;
    }

    /*
    N   Range
    P   Remove a specific value from Array and shifts the rest of the values accordingly
    I   N/A
    R   Integer Range
    */
    public Integer Range(){
        int max = Arry[0];
        int min = Arry[0];
        for (final int i : Arry) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        return (max - min) + 1;
    }
}
