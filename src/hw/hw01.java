package hw;
/*
 * Topic:寫個程式幫忙她可以直接把寫好的內容轉化成”加密”的型態。加密結果不會影響原字 母的大小寫，且數字部分亦作相同處理，
 *       但不處理符號及特殊字元及中文。(第一行為想輸入的內容，不超過 100 個字，第二行為打完你想輸入的內容之後，換 行輸入你想要往後替代的數目)    
 * Date : 2016/12/12
 * Author: 105021043 劉凱文
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