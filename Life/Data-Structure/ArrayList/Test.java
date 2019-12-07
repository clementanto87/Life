import java.util.Arrays;

public class Test{
	
	public static void main(String[] args){
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		//list.delete(2);
		
		list.insert(1, 100);
		
		list.show();
	}

}

interface List{
	public void add(int value);
	public void show();
	public void delete(int index);
	public void insert(int index,int data);
}

class ArrayList implements List{
	
	int capacity = 10;
	int[] arrayList = new int[capacity];
	int size = 0;
	
	public void add(int value){
		
		arrayList[size] = value;
		size++;
	}
	
	public void show(){
		
		Arrays.stream(arrayList).forEach(System.out::println);
	}
	
	public void delete(int index){
		
		for(int i = index;i<capacity;i++){
			if((capacity-1) == i)
				break;
			arrayList[i] = arrayList[i+1]; 
		}
	}

	@Override
	public void insert(int index, int data) {
		// TODO Auto-generated method stub
		
		for(int i = index;i<capacity;i++){
			if((capacity-1) == i)
				break;
			arrayList[i+1] = arrayList[i]; 
		}
		arrayList[index] = data;
		
	}
}

