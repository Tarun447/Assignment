package capgemini.a3;

public class StringOperation {
public static void main(String[] args) {
	String str = "Java String pool refers to collection of Strings which are store in heap memory ";
	
	// print all are in lower case
	System.out.println(str.toLowerCase());
	
	// print all in upper case
	System.out.println(str.toUpperCase());
	
	//replace all 'a' with '$'
	System.out.println(str.replace('a', '$'));
	
	// check "world" present in the string or not 
	System.out.println(str.contains("collection"));
	
	String str2 = "java string pool refers to collection of strings which are store in heap memory";
	// check equal or not 
	System.out.println(str.equals(str2));
	
	System.out.println(str.equalsIgnoreCase(str2));
	
	
	System.out.println("---------------------------String Buffer Classs------------------------");
	// String buffer Class
	StringBuffer sb = new StringBuffer("StringBuffer");
	StringBuffer sb2 = new StringBuffer("is a peer class of String");
	StringBuffer sb3 = new StringBuffer("that provides much of");
	StringBuffer sb4 = new StringBuffer("the funcionality of strings");
	
	sb.append(sb2);
	sb.append(sb3);
	sb.append(sb4);
	
	System.out.println(sb.toString());
	
	// string replacement in stringBuffer
	StringBuffer sb5 =new StringBuffer("it is used to at _ specific index position");
	sb5.replace(16,18," insert text");
	System.out.println(sb5.toString());
	
	StringBuffer sb6 = new StringBuffer("This method returns the reverse object on which it was called");
	System.out.println(sb6.reverse().toString());
	
	
	
	
	System.out.println("---------------------------String Builder Classs------------------------");
	// String Builder Class
	StringBuilder s = new StringBuilder("StringBuffer");
	StringBuilder s2 = new StringBuilder("is a peer class of String");
	StringBuilder s3 = new StringBuilder("that provides much of");
	StringBuilder s4 = new StringBuilder("the funcionality of strings");
	
	s.append(s2);
	s.append(s3);
	s.append(s4);
	
	System.out.println(s.toString());
	
	// string replacement in stringBuffer
	StringBuilder s5 =new StringBuilder("it is used to at _ specific index position");
	s5.replace(16,18," insert text");
	System.out.println(s5.toString());
	
	StringBuilder s6 = new StringBuilder("This method returns the reverse object on which it was called");
	System.out.println(s6.reverse().toString());
}
}
