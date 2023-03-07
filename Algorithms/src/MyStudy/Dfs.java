package MyStudy;

import java.util.Stack;

public class Dfs {

	public Dfs() {
		// TODO Auto-generated constructor stub
	}
	Stack<Integer> stack = new Stack<>();
	static boolean[] visited= new boolean[9];
	static int [][] graph = { {}, {2,3,8} ,{1,6,8}, {1,5}, {5,7} , {4,7}, {2}, {4,5}, {1,2}
		};// < graph 세팅
	public static void main(String[] args) {
		// DFS 뜯어보기
		for (boolean b:visited) {
			System.out.println(b);
		}
		new Dfs().dfs(1);
		new Dfs().dfs2(1);
	}	
	
	public void dfs(int i) {
		visited[i]= true;
		System.out.println("node "+i+" : "+visited[i]+"\t");
		for (int node : graph[i]) {
			if(!visited[node]) {
				dfs(node);
			}
		}
	}
	public void dfs2(int i) {
		stack.push(i);
		visited[i]=true;
		while(!stack.isEmpty()) {
			i=stack.pop();
			for(int node:graph[i]) {
				if(!visited[node]) {
					stack.push(node);
					visited[node]=true;
				}
			}
		}
		for (int j=1;i<visited.length;i++) {
			System.out.println(visited[i]);
		}
	}
}
