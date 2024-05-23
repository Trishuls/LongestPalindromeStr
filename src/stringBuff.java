package learn;

public class stringBuff {

	public static void main(String[] args) {
 
			StringBuffer sb=new StringBuffer("Hello ");
			System.out.println(sb.capacity());
			sb.insert(6,"Java");//now original string is changed  
			sb.reverse();
			System.out.println(sb.capacity());
			System.out.println(sb);//prints HJavaello  
	}

}
