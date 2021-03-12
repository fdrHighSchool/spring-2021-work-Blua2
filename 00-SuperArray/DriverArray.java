public class DriverArray {
    public static void main(String[] args){
        SuperArray Array1 = new SuperArray(15);
        SuperMMMR SArray = new SuperMMMR();
        
        Array1.isEmpty();
        Array1.add(0, 12);
        Array1.add(1,7);
        Array1.toString();
        Array1.set(1, 14);
        Array1.add(17);
        Array1.toString();
        Array1.remove(1);
        Array1.toString();
        Array1.grow(5);
        Array1.toString();
        Array1.add(21);

        SArray.add(1);
        SArray.add(12);
        SArray.add(18);
        SArray.add(21);
        SArray.add(14);
        SArray.add(6);
        SArray.add(8);
        SArray.Average();
        SArray.Mean();
        SArray.Median();
        SArray.Mode();
        SArray.Range();
    }
}
