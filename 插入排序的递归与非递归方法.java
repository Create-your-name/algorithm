
public class 插入排序的递归与非递归方法 {
	final static int N=10;//定义常量
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[N];
		for( int i=0;i<N;i++) {
			a[i]=(int) (Math.random()*10);//随机赋值
		}
		for( int i=0;i<N;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		//insertionSort(a);
		System.out.println(" ");
		insertionSort2(a,a.length);
	}
	static void insertionSort(int []b) {//正常函数算法
		int number=b.length;
		for(int i=1;i<number;i++) {
			int j=i;
			while(j>0&&b[j-1]>b[j]) {//就是j-1<j找到位置了 即a[j-1]<a[j]将a[j]位置赋值上a[i]
				if(j-1==0) {//考虑0的特殊情况 以免数组越界的一个条件判断
					int temp=b[0];
					b[0]=b[j];
					b[j]=temp;
				}else {
					int temp=b[j-1];
					b[j-1]=b[j];
					b[j]=temp;
				}
				j--;
			}
		}
		for( int i=0;i<N;i++) {
			System.out.print(b[i]+" ");
		}
	}
	static void insertionSort2(int []b,int number) {//递归算法
		if(number==1) return;//只有一个数 返回
		insertionSort2(b,number-1);//递归到 第二位与第一位比较然后返回
		int x=b[number-1];
		int index =number-2;
		int y=b[index];
		while(x<y) {
			int temp=y;
			b[index]=x;
			b[index+1]=temp;
			if(index==0)break;
			index--;
			x=b[index+1];
			y=b[index];
		}
		if(number==b.length) {
		for( int i=0;i<N;i++) {
			System.out.print(b[i]+" ");
		}
		}
	}
}
