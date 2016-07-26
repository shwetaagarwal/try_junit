package gl.test;

/**
 * Created by shwetaa on 20/07/2016.
 */
public class Year {
    public static boolean isLeap(int yearParam) {
        //TODO
        if(yearParam % 100 == 0){
            return yearParam % 400 == 0;
        }
        return yearParam % 4 == 0 ;
        //return false;
    }
}
