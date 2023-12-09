package tester;

public class A {
	
  // @Override //remove comment to see error
   public String toString(String S)
  {
	  return "in A's toString:"+S;
  }
   //above toString is considered overloaded  & not overridden by javac
}
