package calculation;

import java.util.ArrayList;
import java.util.Scanner;

public class Reduction {
	private int molecule; //分子
	private int denominator; //分母
	private int result_Int;
	private int result_Molecule;
	private int result_Denominator;

	public Reduction(){
		molecule=24; //分子
		denominator=64; //分母

	}

// 入力された数値のセッティングとその値の取得
	public void setReduction(int m, int d){
		this.molecule=m;
		this.denominator=d;
	}
	public int getMolecule(){
		return this.molecule;
	}
	public int getDenominator(){
		return this.denominator;
	}

// 以下、計算結果をセットし取得

	public int getResultInt(){
		this.result_Int =molecule/denominator;
		return this.result_Int;
	}

	public int getResultMolecule(){
		ArrayList<Integer> result=reductionList();
		this.result_Molecule=result.get(0);
		return this.result_Molecule;
	}
	public int getResultDenominator(){
		ArrayList<Integer> result=reductionList();
		this.result_Denominator=result.get(1);
		return this.result_Denominator;
	}

	//コンソールから値をセット
	public void inputKey() {
		try(Scanner scanner=new Scanner(System.in)){;
			System.out.println("分子を入力してください >");
			int m=scanner.nextInt();
			this.molecule=m;
			System.out.println("分母を入力してください >");
			int d=scanner.nextInt();
			this.denominator=d;
		}
	}

	public ArrayList<ArrayList<Integer>> reductionMethod(){
		int reduced_Molecule, reduced_Denominator;
		ArrayList<ArrayList<Integer>> arrays=new ArrayList<>();
		 for(int i=1, j=1; i<=molecule & j<=denominator;i++,j++){
			 ArrayList<Integer> list=new ArrayList<>();
			 if(denominator%i == 0 & molecule%j==0){

				 reduced_Denominator = denominator/i;
				 reduced_Molecule = molecule/j;

				 list.add(reduced_Molecule);
				 list.add(reduced_Denominator);
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

	public ArrayList<Integer> reductionList(){
		ArrayList<ArrayList<Integer>> arrays=reductionMethod();
		ArrayList<Integer> results=new ArrayList<Integer>();
		for(int i= 0; i < 3; i++ ){
			Integer number = arrays.get(arrays.size()-1).get(i);
			results.add(number);
		}

	/*
	 * 	System.out.println(results);   出力: [3, 8, 8]
	 */
		return results;

	}



	public void result(){
		if(molecule>denominator & molecule%denominator==0){
			System.out.println(getMolecule()+"/"+getDenominator()+" を約分した数は、"+getResultInt());
		}else{
		System.out.println(getMolecule()+"/"+getDenominator()+" を約分した数は、"+getResultMolecule()+"/"+getResultDenominator());
		}
	}

}
