class Twins {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		for(int i=x; i>1; i--){
			System.out.println(i+"���Դϴ�.");
			for(int j=1; j<=9; j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("");
		}
	}
}
