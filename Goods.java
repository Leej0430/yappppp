
/**
상품의 속성(상품코드, 이름 ,가격,설명)을 관리하는 객체
*/

class Goods{
	private String code;
	private String name;
	private int price;
	private String explain;

	// 속성을 조회, 수정할수 있는 메소드 제공
	//setXxxx()
	public void setCode(String code){
		//기능 : 인수로 전달된 정보에 대한 유효성체크
		this.code =code;

	}

	//getXxxx()
	public String getCode(){
	
		return code;
	}


	public void setName(String code){
		this.name =name;
	}
	public String getName(){
		return name;
	}

	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}

	public void setExplain(String explain){
		this.explain = explain;
	}
	public String getExplain(){
		return explain;
	}
	

	public static void main(String [] args){

	}


	
	
}