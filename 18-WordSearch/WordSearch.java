/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
				
    }
    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH1(String w,int row, int col){
	int r = row, c = col;
	if (c+ w.length > board[0].length){
	    
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
	int c1 = c
	for (int i=0; i < w.length;i++){
	    if (board[r][c] != '.'){
		if (cl <= c){
		    c1 = c + 1;
		}
    }

    public void addWordH2(String w,int row, int col){
	int r = row, c = col;
	if (c+ w.length > board[0].length){
	    
	    for (int i=w.length;i>0();i--){
		board[r][c] = w.charAt(i);
		c++;
	    }
	}

	int c1 = c
	for (int i=0; i < w.length;i++){
	    if (board[r][c] != '.'){
		if (col <= c){
		    c1 = c + 1;
		}
	    }




    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,5);
	w.addWordH("look",3,8);
	w.addWordH("look",3,5);
				
	System.out.println(w);
    }
}
