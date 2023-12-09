package Q3;
import java.lang.Math;
class Point2D{
  
    private int X_abscissa; 
    private int Y_ordinate; 

    Point2D(int x ,int y){
       X_abscissa = x;
       Y_ordinate = y;
    }  
  
    String getDetails(){
        return "The point has Co-ordinates as X:"+X_abscissa+" Y:"+Y_ordinate+" .";
    }  

    boolean isEqual(Point2D p){
        if( (this.X_abscissa==p.X_abscissa) && (this.Y_ordinate==p.Y_ordinate) ) return true;
        else return false;   
    }

    Point2D createNewPoint(int x_off ,int y_off){
        Point2D newobj=new Point2D( (X_abscissa+x_off) , (Y_ordinate+y_off));
        return newobj;    
   }

   double calculateDistance(Point2D P){

    double distance=Math.sqrt( Math.pow((this.X_abscissa-P.X_abscissa),2) + Math.pow((this.Y_ordinate-P.Y_ordinate),2) );
    return distance;
   }




}