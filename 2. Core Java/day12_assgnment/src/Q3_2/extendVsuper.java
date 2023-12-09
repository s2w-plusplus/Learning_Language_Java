package Q3_2;
import java.util.ArrayList;
import java.util.Collections;


class twoD{
	int x,y;

	public twoD(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "\npoint:[x=" + x + " y=" + y ;
	}
}

class threeD extends twoD{
	int z;

	public threeD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return super.toString()+" z=" + z ;
	}
	
}

class fourD extends threeD{
	int t;

	public fourD(int x, int y, int z, int t) {
		super(x, y, z);
		this.t = t;
	}

	@Override
	public String toString() {
		return super.toString()+" t=" + t + "]";
	}
	
}




public class extendVsuper {

	public static void main(String[] args) {
		
	ArrayList<twoD> graph2d=new ArrayList<>();	 
	ArrayList<threeD> graph3d=new ArrayList<>();	
	ArrayList<fourD> graph4d=new ArrayList<>();	

	graph2d.add(new twoD(7,9));
	graph2d.add(new twoD(27,17));
	graph2d.add(new twoD(37,49));
	graph2d.add(new twoD(0,12));
	graph2d.add(new twoD(0,0));
	
	graph3d.add(new threeD(8,19,8));
	graph3d.add(new threeD(17,70,5));
	graph3d.add(new threeD(87,79,4));
	graph3d.add(new threeD(8,12,6));
	graph3d.add(new threeD(0,1,0));
	
	graph4d.add(new fourD(22,9,7,8));
	graph4d.add(new fourD(7,1,3,45));
	graph4d.add(new fourD(37,49,7,44));
	graph4d.add(new fourD(10,12,8,6));
	graph4d.add(new fourD(32,89,0,1));
	
	// 3.2 Use Collections.copy to understand extends vs super
		/*
		 *  public static <T> void copy​(List<? super T> dest, List<? extends T> src)
			
			Copies all of the elements from one list into another. After the operation,
	 		the index of each copied element in the destination list will be identical to its index in the source list.
	  		The destination list's size must be greater than or equal to the source list's size. 
			If it is greater, the remaining elements in the destination list are unaffected.	
		 */
			
		//remove comments to see error:-
		//Collections.copy(graph4d, graph3d);//not allowed
		//Collections.copy(graph4d, graph2d);//not allowed
		//Collections.copy(graph3d, graph2d);//not allowed
	
	   	 Collections.copy(graph3d, graph4d);// allowed
	     Collections.copy(graph2d, graph3d);// allowed
	     Collections.copy(graph2d, graph4d);// allowed
	  
	     
	     System.out.println("ArrayList of 2d points:-\n"+graph2d+"\n");
	     System.out.println("ArrayList of 3d points:-\n"+graph3d+"\n");
	     System.out.println("ArrayList of 4d points:-\n"+graph4d+"\n");
	
	}

}
