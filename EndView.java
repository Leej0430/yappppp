/**
	요청된 결과를 화면 출력 담당하는 클래스

*/


class EndView{
	/**
		성공 여부 메시지를 출력하는 메소드
	*/
	public static void printMessage(String message){
		System.out.println(message);
	}
	/**
		전체검색의 결과를 출력하는 메소드
	*/
	public static void printSelectAll(Goods [] goodsArr){
		System.out.println("상품 list ("+GoodsService.count+")개");
		for (int i = 0 ;i < GoodsService.count ; i++)
		{
			System.out.println(goodsArr[i].getCode());
		}
		System.out.println();
	
	}

	/**
		상품코드에 해당하는 정보 출력하는 메소드
	*/
	public static void printSelectByCode(Goods goods){
		System.out.println(goods.getCode()+"에 해당하는 정보 ----- ");
		//정보를 출력해주세요
	
	}


}