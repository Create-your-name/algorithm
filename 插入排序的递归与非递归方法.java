
public class ��������ĵݹ���ǵݹ鷽�� {
	final static int N=10;//���峣��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[N];
		for( int i=0;i<N;i++) {
			a[i]=(int) (Math.random()*10);//�����ֵ
		}
		for( int i=0;i<N;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		//insertionSort(a);
		System.out.println(" ");
		insertionSort2(a,a.length);
	}
	static void insertionSort(int []b) {//���������㷨
		int number=b.length;
		for(int i=1;i<number;i++) {
			int j=i;
			while(j>0&&b[j-1]>b[j]) {//����j-1<j�ҵ�λ���� ��a[j-1]<a[j]��a[j]λ�ø�ֵ��a[i]
				if(j-1==0) {//����0��������� ��������Խ���һ�������ж�
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
	static void insertionSort2(int []b,int number) {//�ݹ��㷨
		if(number==1) return;//ֻ��һ���� ����
		insertionSort2(b,number-1);//�ݹ鵽 �ڶ�λ���һλ�Ƚ�Ȼ�󷵻�
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
