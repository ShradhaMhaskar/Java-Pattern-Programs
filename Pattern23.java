package nestedloop;
//5 6 15 16 25 
//4 7 14 17 24 
//3 8 13 18 23 
//2 9 12 19 22 
//1 10 11 20 21 

public class Pattern23 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%2==1) {
					System.out.print((j-1)*n+(n-i+1)+ " ");
				}else {
					System.out.print((j-1)*n+i+ " ");
				}
			}
			System.out.println();
		}
	}

}
