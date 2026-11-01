package nestedloop;

public class Pattern29 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(((j*i)%2)+" ");
			}
			System.out.println();
		}
	}

}
