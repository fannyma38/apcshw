public class DriverA{
    public static void main(String[] args){
	int[] a;
	a = new int[4];
	a[0] = 3;
	a[1] = 5;
	a[2]= 32;
	a[3] = 2;
	Arraystuff mm = new Arraystuff();
	System.out.println(mm.max(a));
    }
}    
