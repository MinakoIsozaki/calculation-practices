package calculation;

import java.util.ArrayList;
import java.util.Scanner;

public class Experiment1 {
	private int a;
	private int b;

	public Experiment1(){
		a=24; //分子
		b=64; //分母

	}
	public void setExperiment1(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}

	public int inputKeyB() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("分母を入力してください >");
		int b=scanner.nextInt();
		return this.b=b;
	}

	public int inputKeyA(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("分子を入力してください >");
		int a=scanner.nextInt();
		return this.a=a;
	}
	public ArrayList<ArrayList<Integer>> hoge1(){
		int answerA,answerB;
		ArrayList<ArrayList<Integer>> arrays=new ArrayList<>();
		 for(int i=1, j=1; i<=a & j<=b;i++,j++){
			 ArrayList<Integer> list=new ArrayList<>();
			 if(b%i == 0 & a%j==0){
				 this.b = b;
				 answerB = b/i;
				 this.a = a;
				 answerA = a/j;

				 list.add(answerA);
				 list.add(answerB);
				 list.add(i);
				 arrays.add(list);

			/*	 System.out.println(list);
			 * 	 listに格納したデータの順番
			 *   [約分された分子, 約分された分母, 約分する際の割る数]
			 */
			 }

		 }
		 	/*   System.out.println(arrays);
		 	 *   arraysに格納されたlistデータ一覧
		 	 */
		 return arrays;
	}

	public ArrayList<Integer> hoge2(){
		ArrayList<ArrayList<Integer>> arrays=hoge1();
		ArrayList<Integer> results=new ArrayList();
		for(int i= 0; i < 3; i++ ){
			Integer number = arrays.get(arrays.size()-1).get(i);
			results.add(number);
		}

	/*
	 * 	System.out.println(results);   出力: [3, 8, 8]
	 */
		return results;

	}

	public void hoge3(){
		ArrayList<Integer> result=hoge2();
		System.out.println(getA()+"/"+getB()+" を約分した数は、"+result.get(0)+"/"+result.get(1));
	}

}
