package MyStudy;

public class Dfs {

	public Dfs() {
		// TODO Auto-generated constructor stub
	}

	static boolean[] visited= new boolean[9];
	static int [][] graph = { {}, {2,3,8} ,{1,6,8}, {1,5}, {5,7} , {4,7}, {2}, {4,5}, {1,2}
		};// < graph 세팅
	public st atic void main(String[] args) {
		// DFS 뜯어보기
		for (boolean b:visited) {
			System.out.println(b);
		}
		new Dfs().dfs(1);
	}	
	
	public void dfs(int nodI) {
		visited[nodI]= true;
		
		for (int i : graph[nodI]) {
			System.out.println(visited[nodI]);
			if(!visited[nodI]) {
				new Dfs().dfs(i);
				System.out.println(i);
			}
		}
	}
}
