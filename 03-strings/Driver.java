public class Driver {
    public static void main(String[] args){
        String str="Sean Kingston";
	int a = str.indexOf(" ");
	String first = str.substring (0,a);
	System.out.println(first);
	String last = str.substring(a+1);
        System.out.println(last);
    }
}
