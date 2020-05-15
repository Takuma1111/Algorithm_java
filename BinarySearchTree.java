
// 二分探索
//配列aの中に引数の値があれば、そのindexを返す（複数ある場合はどれか1つを返す）
//配列aの中に引数の値がなければ-1を返す
public class BinarySearchTree {
	int[] a = {1, 14, 32, 51, 51, 51, 243, 419, 750, 910};
	
	public boolean isOK(int index, int key) {
	   if (a[index] >= key) {
		   return true;
	   }else {
		   return false;
	   }
	}
	//二分探索
	public int binarysearch(int key) {	
	   int left = -1; 
	   int right = a.length; 
	   
	   //値の存在を確認
	   if(!isA(key)) { return -1; }
	   
	   while (right - left > 1) {
		       int mid = left + (right - left) / 2;
		       if (isOK(mid, key)) {
		    	   right = mid;
		       }else {
		    	   left = mid;
		       }
	   		}
		  return right;
	}
	
	//配列に存在しない値を渡されたらfalseを返す
	public boolean isA(int value) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				return true;
			}
		}
		return false;
	}
	
}
