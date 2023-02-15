package Programer;

public class Ractangle {

	public Ractangle() {
		// TODO Auto-generated constructor stub
	}
	public int solution(int[][] dots) {
        int Mx=-256,My=-256,mx=256,my=256;
        for (int i=0;i<3;i++){
            if (dots[i][0]>Mx) Mx=dots[i][0];
            if (dots[i][0]<mx) mx=dots[i][0];
            if (dots[i][1]>My) My=dots[i][1];
            if (dots[i][1]<my) my=dots[i][1];
        }
        int answer=(Mx-mx)*(My-my);
        return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
