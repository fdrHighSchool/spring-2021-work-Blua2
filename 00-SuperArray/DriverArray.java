public class DriverArray {
    public static void main(String[] args){
        SuperArray Array1 = new SuperArray();
        Array1.SuperArr(15);

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
    }
}
