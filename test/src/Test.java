import org.apache.log4j.Logger;


 public class Test {
	 
	 static Logger logger = Logger.getLogger(Test.class);
	 
	 public static void main(String args[]){ 
		 
		 int a=method();
			
			 //System.out.println(a);
		 logger.info(a);
	 }

	public static int method() {
		int a=0;
		try{
			a=10;
			//return a;
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			 a=20;
			
		}
		return a;
		
	}
	
	 }  
		 
			 
	
