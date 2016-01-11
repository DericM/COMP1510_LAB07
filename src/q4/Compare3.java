package q4;

public class Compare3 {

    
    
    public static Comparable Largest(Comparable c1,Comparable c2,Comparable c3){
        
        if(0 < c1.compareTo(c2) && 0 < c1.compareTo(c3)){
            return c1;
        }
        if(0 < c2.compareTo(c1) && 0 < c2.compareTo(c3)){
            return c2;
        }
        else{
            return c3;
        }

    }

}
