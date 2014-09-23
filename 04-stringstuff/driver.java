public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String Part = str.substring(1,3);
  if (Part.equals("ix")) {return true; 
  }
    return false;
 } 

public String makeOutWord(String out, String word) {
  String Left = out.substring(0,2);
  String Right = out.substring(2,4);
  String Woo = Left + word + Right;
  return Woo;
}

public String firstHalf(String str) {
 int r = str.length(); 
 String what = str.substring(0,r/2);
 return what;
}
