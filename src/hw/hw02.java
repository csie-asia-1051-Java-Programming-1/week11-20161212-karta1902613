package hw;
/*
 * Topic:�@�ӧt N �Ӿ�ƪ��ǦC���A�X�{�W�v�W�L N/2 ����ƺ٬��y�L�b�����z�C�g�@�ӵ{���D�@��ƧǦC�O�_���L�b����
 *(�@��ƧǦC�H�ť���j�}�Ʀr;0 < N < 11; �ǦC�����Ʀr���O integer; ��J�]�t�h ��A�@�欰�@������C�Y�� �L�b�����A ��X�Ӽ�; �_�h��X NO)     
 * Date: 2016/12/12
 * Author: 105021043 �B�ͤ�
 */
import java.util.Scanner;
public class hw02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int time=11;
        String data[]=new String[time];
        int x;
        int t=1;
        while(time>10){
    	time=0;
        String n=scn.nextLine();
        String data1[]=n.split(" ");
        time=data1.length;
         if(time>10){
    	     System.out.println("�u���J11�ӼƦr�H�U");
           }
           for(int i=0;i<data1.length;i++){
  	    	 data[i]=data1[i];
  	       }
        }   
        for(int i=0;i<time;i++){
        	x=Integer.parseInt(data[i]);
        }
       
        		
     
        }
}