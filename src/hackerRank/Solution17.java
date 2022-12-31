package hackerRank;

public class Solution17 {
	/*
	 * Move Forward:
If cell i+1  contains a zero, you can walk to cell  i+1
If cell  i+leap contains a zero, you can jump to cell i+leap
If you're standing in cell n-1  or the value of  i+leap>n, you can walk or jump off the end of the array and win the game.

In other words, you can move from index i  to index  i+1,i-1  or i+leap  as long as the destination index is a cell containing 0.
 If the destination index is greater than n-1 , you win the game
	 */
	public boolean canWin(int leap,int[] game) { //game[0] is always 0  // [ 0 0 1 0 1 0]   leap=3
		boolean flag=false;int len=game.length;
		
		int i=0;
		while(i+1<len ) {	
			
			if(  game[i+1]==0)i++;
			if(game[i+leap]==0)i+=leap;
			else i--;
			
			if(i>=len-1) {flag=true; break;}		 
					
		}
		
		
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
