import java.util.*;
public class SuperArray {
    private Integer[] Arr;
    private String str;
    
    public void Length(Integer Length){
        Integer[] Arr = new Integer[Length];
        this.Arr = Arr;
    }

    public void LengthDef(){
       if(this.Arr == null){Length(10);}
    }

    /*
    N   add
    P   Append values to the Array.
    I   Integer val(value) that represents the value that the user will want the Array to append.
    R   N/A
    */
    public void add(Integer val){
       for(int e = 0; e < this.Arr.length; e++){//Iterates through the Array and checks if a element is empty. If it is then add that array, if not then the Array is full.
            if(Arr[e] == null){
                Arr[e] = val;
                break;
            }
            else if(e <= this.Arr.length){
                System.out.println("Error: Array is full");
            }
       }
    }

    /*
    N   add
    P   Append value to Array but at specific index
    I   Integers index and val(value)
    R   N/A
    */
    public void add(int index, Integer val){
        if(Arr[index] == null){//Check if the index given is already occupied
            Arr[index] = val;
        }
        else{
            System.out.println("Error: Index has existing value");
        }
    }

    /*
    N   grow
    P   Increase the size of the Array
    I   Integer n(amount)
    R   N/A
    */
    public void grow(int n){
        Integer[] ArrTemp = new Integer[this.Arr.length + n];//Create new Array with the previous length added to growth length

        for (int i = 0; i < this.Arr.length; i++){//Fill the new Array with the previous elements
            ArrTemp[i] = this.Arr[i];
        }
        this.Arr = ArrTemp;//Copy
    }
    
    /*
    N   set
    P   Sets the value of a specific index in the Array
    I   Integer i(index) and val(value)
    R   N/A
    */
    public void set(int i, Integer val){
        this.Arr[i] = val;
    }

    /*
    N   isEmpty
    P   Determines if Array is empty
    I   N/A
    R   Boolean empty
    */
    public boolean isEmpty(){
        Boolean isEmpty = false;
        if(Arr == null){
            isEmpty = true;
        }
        return isEmpty;
    }

    /*
    N   remove
    P   Remove a specific value from Array and shifts the rest of the values accordingly
    I   Integer index
    R   N/A
    */
    public void remove(Integer index){
        int j = 0;
        Integer[] ArrTemp = new Integer[this.Arr.length];//Create copy of Array
        for(int e = 0; e < this.Arr.length; e++){
            if(e != index){//If current iteration does not equal to removed index then replace temporary Array index with Array index
                ArrTemp[j] = this.Arr[e];
                j++;
            }
        }
        ArrTemp[this.Arr.length-1] = null;//Makes last index null to shift down
        this.Arr = ArrTemp;//copy
    }

    /*
    N   toString
    P   Visually displays the values of the Array
    I   N/A
    R   String 
    */
    public String toString(){
        this.str = Arrays.toString(Arr);
        System.out.println(str);
        return str;
    }
}
