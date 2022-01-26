/**
��ǰ�� ���� crud�۾� :b/l
��ü�˻�, ��� ,���� ���� 
*/
class GoodsService{
	private Goods [] goodsArr = new Goods[10];
	static int count ;


	/**
		�ʱ�ġ �����͸� �����ϴ� �޼ҵ� �ۼ�
	*/
	public void init(String [][] data){
		for (int i=0;i<data.length ;i++ )
		{
			goodsArr[i]=this.create( data[i] );
			GoodsService.count++;
		}
		
		
	
	
	}
	/**
		Goods�� �����ؼ� �������ִ� �޼ҵ� �ۼ�
	
	*/
	private Goods create(String [] row){ //
		Goods goods = new Goods();
		goods.setCode(row[0]);
		goods.setName(row[1]);
		goods.setPrice(Integer.parseInt(row[2]));
		goods.setExplain(row[3]);



		return goods;
	}


	/**����ϱ�
		:������� ��ǰ�ڵ尡 �ߺ������� üũ�ؼ� �ߺ��� �ƴҶ� ����Ѵ�.

		return :int �� (0�̸� ��ǰ �ڵ� �ߺ�, 1�̸� ��ϼ��� , -1 �̸� �迭�� ���̸� ����� ��Ͼȵ�
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

		//�ߺ��ƴϸ� ���
		goodsArr[GoodsService.count] = goods;
		GoodsService.count++;
	
		return 1;
	}

	/**��ü�˻�
	
	*/
	public Goods[] selectAll(){
		return goodsArr;
	
	
	}
	/**��ǰ�ڵ忡 �ش����ϴ� ��ǰ�˻�

	*/
	public Goods selectByCode(String code){

		switch (code)
		{
		case Goods:
		
		}

		return null;
	
	
	}

	/**��ǰ�ڵ忡 �ش��ϴ� ��ǰ����, ���� �����ϱ�

	*/

	public boolean update(Goods goods){
		return true;

	}


}