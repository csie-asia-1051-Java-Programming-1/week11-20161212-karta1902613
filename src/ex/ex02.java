package ex;
/*
 * Topic:�g�@�ӵ{���D�@��ƧǦC�ҧt����ƭӼƤΥ����ȡC�@��ƧǦC�H�ť���j�}�Ʀr�C�ǦC�ҧt����ƭӼƤΥ����ȡC��T�ܤp���I�� 3 ��(�Ѥp���I�� 4 ��|�ˤ��J)
 * Date: 2016/12/12
 * Author: 105021043 �B�ͤ�
 */
      import java.util.Scanner;
      public class ex02 {
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        String n = scn.nextLine();
		String data[] =n.split(" ");
		int x;
		int com;
		int t=0;
		double sum=0;
		for(int i=0;i<data.length;i++){
			x =Integer.parseInt(data[i]);
			sum+=x;
		}
		com=(int)sum/data.length;
		while(com>0){
			com=com/10;
			t++;
		}com=(int)sum/data.length;
		int intg[]=new int[t];
		int uint[]=new int[3];
		for(int j=0;j<t;j++){
		intg[j]=com%10;
		com=com/10;
		}
		sum=(sum/data.length)*10000;
		if(sum%10>=5){
			sum=sum+1;
			sum=(int)sum;
		}else{
			sum=(int)(sum/10);
		}
		for(int k=0;k<3;k++){
			uint[k]=(int) (sum%10);
			sum=sum/10;
		}
		System.out.println("Size="+data.length);
		System.out.print("Average=");
		for(int a=t-1;a>=0;a--){
			System.out.print(intg[a]);
		}System.out.print(".");
		for(int b=2;b>=0;b--){
			System.out.print(uint[b]);
		}
	}
}
	