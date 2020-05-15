
// 二分探索
//配列aの中に値keyがあれば、そのindexを返す（複数ある場合はどれか1つを返す）
//配列aの中に値keyがなければ-1を返す
public class BinarySearchTree {
	int[] a = {1, 14, 32, 51, 51, 51, 243, 419, 750, 910};
	
	public boolean isOK(int index, int key) {
	   if (a[index] >= key) {
		   return true;
	   }else {
		   return false;
	   }
	}
//汎用的な二分探索のテンプレ
	public int binarysearch(int key) {
   int left = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
   int right = a.length; // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()

   /* どんな二分探索でもここの書き方を変えずにできる！ */
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
}
