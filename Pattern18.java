package nestedloop;
//Number Pattern
//2 4 6 8 10
//12 14 16 18 20
//22 24 26 28 30
//32 34 36 38 40
//42 44 46 48 50
public class Pattern18 {
	public static void main(String[] args) {
		int n=5;
		int num=2;
		
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(num +" " );
				num+=2;
				
			}
			System.out.println();
		}
	}

}
