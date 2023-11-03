package excercise;

public class PagesNumbering {
	static int pagesNumbering(int n) {
		int k = 1;
		int v1 = 0;
		int v2 =0;
		int m = String.valueOf(n).length();

		if(n<10 && n>0){
			v1 = n;
			v2 =0;
		}else{
			v1 = (n - (int) Math.pow(10, m-1) + 1) * m;
			for (int i = 1; i <= m - 1; i++){
				v2 = v2 + (9 * i) * k;
				k = k * 10;
			}
		}
		return (v1 + v2);
	}

	public static void main(String[] args) {
		System.out.println("pagesNumbering(555) = " + pagesNumbering(11));
	}
}
