  public class Driver{
      public static void main(String[] args){
  	WordSearch ws = new WordSearch();
  	ws.addWordH("candy","morning",4,3);
  	ws.addWordV("crush", "please",12,2);
  	ws.addWordD("yomama","yodada",1,2);
  	ws.addWordD("peanut","sausage",17,14);
  	ws.addWordH("gobble","ham",5,22);
  	ws.addWordV("meepit","gurgle",8,21);
  	ws.addWordD("commonapp","death",4,9);
  	System.out.println(ws);
      }
  }
