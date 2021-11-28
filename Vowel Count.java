public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String[] list = str.split("");
    
    for(int i=0;i<list.length;i++){  
    if(list[i].equals("a")){
      vowelsCount++;}
    if(list[i].equals("e")||list[i].equals("i")){
      vowelsCount++;}  
      if(list[i].equals("o")||list[i].equals("u")){
      vowelsCount++;}  
    }
    return vowelsCount;
  }

}
