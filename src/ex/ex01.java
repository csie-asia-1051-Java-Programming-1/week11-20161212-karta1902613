package ex;
/*
 * Topic:公司尾牙預定購買一批獎品給員工抽獎，而且人人有獎。在有限的經費、固定員工數、每份獎品均不相同的限制下，該如何選購獎品，使得總花費最少且不超過預算?
 *       說明: 程式輸入的第一行包含一個正整數 n ， 1 ≤ n ≤ 10 ，代表接下來有 n 筆測試資料。 每筆測試資料包含兩行數據，
 *       第一行包含三個正整數 T, m 和 k ， m ≤ k ≤ 100 ; T 代表總預算， m 代表員工數(禮物數量)， k 代表有 k 件物品可供選購。第二 行包含 k 個正整數，分別代表 k 種物品的售價，正整數間以空白隔開。 
 *       對於每一筆測試資料，輸出一行結果，該行結果列印禮品總花費。倘若預算內無法購 買足夠量的禮物，則列印 “Impossible”，最後必須有換行字元
 * Date: 2016/12/12
 * Author: 105021043 劉凱文
 */
       import java.util.Scanner;
       public class ex01 {
	   public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Scanner scn=new Scanner(System.in);
		        System.out.println("資料比數");
		        int n=scn.nextInt();
		        int m,p,g;
		        int v;
		        for(int i=0;i<n;i++){
		        System.out.println("金額/人數 /數量");
		        m=scn.nextInt();
		        p=scn.nextInt();
		        g=scn.nextInt();
		        System.out.println("獎品價格");
		        int data[]=new int [g];
		    for(int j=0;j<g;j++){
		   data[j]=scn.nextInt();
		    }		    
		     for(int x=0;x<g-1;x++){
		    	 for(int y=0;y<g-1;y++){
		    		 if(data[y]>data[y+1]){
		    		v=data[y];
		    		data[y]=data[y+1];
		    		data[y+1]=v;
		    		 }
		    	 }
		     }  
		     int sum=0;
		     for(int t=0;t<p;t++){ 
		    	sum+=data[t]; 
		     }
		     if(sum<=m){
		    	  System.out.println(sum);
		      }else{
		    	  System.out.println("Impossible");
		      }
		      }
		 }
	}
