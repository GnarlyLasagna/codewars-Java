public class Kata {
  public static String highAndLow(String numbers) {
    String[] list = numbers.split(" ");
    int low = Integer.parseInt(list[0]);
    int high = Integer.parseInt(list[0]);  
      for(int i=0;i<list.length;i++){
       if(Integer.parseInt(list[i]) < low){low=Integer.parseInt(list[i]);}
       if(Integer.parseInt(list[i]) > high){high=Integer.parseInt(list[i]);}  
    }
    return String.valueOf(high) +" "+ String.valueOf(low);
  }
}
