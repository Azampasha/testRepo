
public class Test1 {

	
	public static void main(String[] args) {
		 String str=method();
			
		 System.out.println(str);
 }

public static String method() {
	String str="";
	try{
	 str="who is this";
		return str;
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{
		 str="this is azam";
		
	}
	return str;
	}

}
class A{
	void show() throws ArrayIndexOutOfBoundsException{
		
	}
}
class B extends A{
	void show() throws RuntimeException{
		
	}
}