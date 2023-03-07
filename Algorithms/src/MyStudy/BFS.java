package MyStudy;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	Queue<Integer> que= new LinkedList<>();
	static boolean[] visited= new boolean[9];
	static int [][] graph = { {}, {2,3,8} ,{1,6,8}, {1,5}, {5,7} , {4,7}, {2}, {4,5}, {1,2}	};
	// < graph 세팅
	
	
	public BFS() {
		// TODO Auto-generated constructor stub
	}
	
	public void bfs(int i) {
		que.add(i);
		while(!que.isEmpty()) {
			int node=que.poll();
			visited[node]=true;
			for(int idx:graph[node]) {
				if(!visited[idx]) {
					que.add(idx);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new BFS().bfs(1);
	}
}
