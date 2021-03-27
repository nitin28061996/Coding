package commons;

public class buildHeap {
	//https://www.geeksforgeeks.org/building-heap-from-array/
	//bottom-up
	//O(N) to build the heap, heapify takes O(LOG N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{16,3,4,5,6,13,10,9,8,15,17};
		buildTheHeap(arr, arr.length,true);
		for(int n:arr)System.out.println(n);
		buildTheHeap(arr, arr.length,false);
		for(int n:arr)System.out.println(" "+n);

	}
	static void maxheapify(int arr[],int n,int i){
		int largest =i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[largest]<arr[l]){//first condition lets to stop the heapification of leaf nodes and always l & r if they point currently to leaf nodes, will be less than n(BECAUSE of 0 indexing)
			largest=l;
		}
		if(r<n && arr[largest]<arr[r]){
			largest=r;
		}
		if(i!=largest){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxheapify(arr,n,largest);
		}
		
		
		
	}
	
	static void minheapify(int arr[],int n,int i){
		int minimum=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[minimum]>arr[l])minimum=l;
		if(r<n && arr[minimum]>arr[r])minimum=r;
		if(i!=minimum){
			int temp=arr[i];
			arr[i]=arr[minimum];
			arr[minimum]=temp;
			minheapify(arr, n, minimum);
		}
	}
	static void buildTheHeap(int arr[],int n,boolean buildMax){
		int startIndex=(n/2)-1;
		if(buildMax){		
			for(int i=startIndex;i>=0;i--){
			maxheapify(arr, n, i);
		}
		}else{
			for(int i=startIndex;i>=0;i--){
				minheapify(arr, n, i);
		}
		}
		
	}
}
