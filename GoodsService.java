/**
상품에 대한 crud작업 :b/l
전체검색, 등록 ,수정 삭제 
*/
class GoodsService{
	private Goods [] goodsArr = new Goods[10];
	static int count ;


	/**
		초기치 데이터를 세팅하는 메소드 작성
	*/
	public void init(String [][] data){
		for (int i=0;i<data.length ;i++ )
		{
			goodsArr[i]=this.create( data[i] );
			GoodsService.count++;
		}
		
		
	
	
	}
	/**
		Goods를 생성해서 리턴해주는 메소드 작성
	
	*/
	private Goods create(String [] row){ //
		Goods goods = new Goods();
		goods.setCode(row[0]);
		goods.setName(row[1]);
		goods.setPrice(Integer.parseInt(row[2]));
		goods.setExplain(row[3]);



		return goods;
	}


	/**등록하기
		:등록전에 상품코드가 중복인지를 체크해서 중복이 아닐때 등록한다.

		return :int 형 (0이면 상품 코드 중복, 1이면 등록성공 , -1 이면 배열의 길이를 벗어나서 등록안됨
	*/
	public int insert(Goods goods){
		if (goodsArr.length == GoodsService.count)
		{
			return -1;
		}
		if (this.selectByCode(goods.getCode()) != null)
		{
			return 0;
		}

		//중복아니면 등록
		goodsArr[GoodsService.count] = goods;
		GoodsService.count++;
	
		return 1;
	}

	/**전체검색
	
	*/
	public Goods[] selectAll(){
		return goodsArr;
	
	
	}
	/**상품코드에 해당해하는 상품검색

	*/
	public Goods selectByCode(String code){

		switch (code)
		{
		case Goods:
		
		}

		return null;
	
	
	}

	/**상품코드에 해당하는 상품가격, 설명 수정하기

	*/

	public boolean update(Goods goods){
		return true;

	}


}