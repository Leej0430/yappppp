
/**
��ǰ�� �Ӽ�(��ǰ�ڵ�, �̸� ,����,����)�� �����ϴ� ��ü
*/

class Goods{
	private String code;
	private String name;
	private int price;
	private String explain;

	// �Ӽ��� ��ȸ, �����Ҽ� �ִ� �޼ҵ� ����
	//setXxxx()
	public void setCode(String code){
		//��� : �μ��� ���޵� ������ ���� ��ȿ��üũ
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