package intern;

public class TestIntern {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String(s1);
		String s4=s3.intern(); //important
		String s5="he"+"llo";
		String s6="he".concat("llo");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s1==s6);

	}

}
