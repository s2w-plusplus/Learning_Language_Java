package Q2.com.geometry;
import java.lang.Math;
public class Point2D{
  
    private int X_abscissa; 
    private int Y_ordinate; 

    public Point2D(int x ,int y){
       X_abscissa = x;
       Y_ordinate = y;
    }  
  
    public String getDetails(){
        return "The point has Co-ordinates as X:"+X_abscissa+" Y:"+Y_ordinate+" .";
    }  

    public int getXco() 
    {
    	return  X_abscissa;
    }
    public int getYco() 
    {
    	return  Y_ordinate;
    }
    
    public boolean isEqual(Point2D p){
        if( (this.X_abscissa==p.X_abscissa) && (this.Y_ordinate==p.Y_ordinate) ) return true;
        else return false;   
    }

    public Point2D createNewPoint(int x_off ,int y_off){
        Point2D newobj=new Point2D( (X_abscissa+x_off) , (Y_ordinate+y_off));
        return newobj;    
   }

    public double calculateDistance(Point2D P){

        double distance=Math.sqrt( Math.pow((this.X_abscissa-P.X_abscissa),2) + Math.pow((this.Y_ordinate-P.Y_ordinate),2) );
        return distance;
   }




}