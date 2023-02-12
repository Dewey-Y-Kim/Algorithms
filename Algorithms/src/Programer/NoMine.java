package Programer;

public class NoMine {

	public NoMine() {
		// TODO Auto-generated constructor stub
	}
	public int[][] map(int[][] map,int i, int j) {
		for (int r=i-1;r<=i+1;r++) {
			for(int c=j-1;c<=j+1;c++) {
				map[r][c]=1;
			}
		}
		return map;
	}
	public int solution(int[][] board) {
		int answer = 0;
		int[][] minemap = new int[board.length+2][board.length+2];
		for(int i=0; i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[i][j]==1) {
					map(minemap,i,j);
				}
				
			}
			System.out.println();
		}
		for(int i=1;i<board.length+1;i++) {
			for(int j=1;j<board.length+1;j++) {
				answer+=minemap[i][j];
			}
		}
		answer = (board.length*board.length)-answer;
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] i= {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		System.out.println(new NoMine().solution(i));
	}
	
}