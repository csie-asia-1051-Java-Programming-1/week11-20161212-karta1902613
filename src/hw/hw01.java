package hw;
/*
 * Topic:�g�ӵ{�������o�i�H������g�n�����e��Ʀ����[�K�������A�C�[�K���G���|�v�T��r �����j�p�g�A�B�Ʀr������@�ۦP�B�z�A
 *       �����B�z�Ÿ��ίS��r���Τ���C(�Ĥ@�欰�Q��J�����e�A���W�L 100 �Ӧr�A�ĤG�欰�����A�Q��J�����e����A�� ���J�A�Q�n������N���ƥ�)    
 * Date : 2016/12/12
 * Author: 105021043 �B�ͤ�
 */
import java.util.Scanner;
public class hw01 {
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 String n=scn.nextLine();System.out.println(n);
		 char [] data = n.toCharArray();
		 for(int i=0;i<data.length;i++){
			 if((data[i]>=48&&data[i]<=57)||(data[i]>=65&&data[i]<=88)||(data[i]>=97&&data[i]<=120)){
			     data[i]=(char) (data[i]+2);
			     System.out.print(data[i]);
			 }else if(data[i]==121||data[i]==122||data[i]==89||data[i]==90){
				 data[i]=(char)(data[i]-24);
				 System.out.print(data[i]);
			 }else{
				 System.out.print(data[i]);				 
			 }
		 }
	}
}