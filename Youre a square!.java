public class Square {    
    public static boolean isSquare(int n) {       

      if(Math.sqrt(n)==Math.round(Math.sqrt(n))){
      return true;
      }
      return false;
    }
}
