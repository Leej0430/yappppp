class StartView {
	public static void main(String[] args) {
	
		String [][] data = new String [][]{
			{"A01","새우깡","2500","짜고고소하다"},
			{"A02","콘칩","4444","고소하다"},
			{"A03","빈츠","222","짜다"},
			{"A04","칸쵸","3333","이상하다"},
			{"A05","포켓몬","250120","신기하다"},

		
		};
		




		System.out.println("상품관리 프로그램 시작합니다.\n");

		new MenuView().printMenu(data);
		
	}
}
