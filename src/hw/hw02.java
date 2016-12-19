package hw;
/*
 * Topic:一個含 N 個整數的序列中，出現頻率超過 N/2 的整數稱為『過半元素』。寫一個程式求一整數序列是否有過半元素
 *(一整數序列以空白鍵隔開數字;0 < N < 11; 序列中的數字都是 integer; 輸入包含多 行，一行為一筆測資。若有 過半元素， 輸出該數; 否則輸出 NO)     
 * Date: 2016/12/12
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int time=11;
        String data[]=new String[time];
        int x;
        int t=0;
        while(time>10){
    	time=0;
        String n=scn.nextLine();
        String data1[]=n.split(" ");
        time=data1.length;
         if(time>10){
    	     System.out.println("只能輸入11個數字以下");
           }
           for(int i=0;i<data1.length;i++){
  	    	 data[i]=data1[i];
  	       }
        }   
        for(int i=0;i<time;i++){
        	x=Integer.parseInt(data[i]);
        }
      
        		for(int i=0;i<time;i++){
        			for(int j=i+1;j<time;j++){
        		        	if(data[i].equals(data[j])){
        		        		t++;
        		        		if(t+1>time/2){
        		        			System.out.println(data[i]);
        		        			i=87;
        		        			j=87;
        		        		}
        		            }
        		        	if(j==time-1){
        		        		t=0;
        		        	}
        		         }
        		     }    
        		if(t<time/2){
        			System.out.println("NO");
        		}
        }
}