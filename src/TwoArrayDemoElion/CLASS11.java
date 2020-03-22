package TwoArrayDemoElion;

public class CLASS11 {
	public static void main(String[] args) {
int [][] numbers=new int[3][4];


System.out.println();
numbers [0][0]=7;
numbers [0][1]=1;
numbers [0][2]=6;
numbers [0][3]=12;

numbers [1][0]=9;
numbers [1][1]=6;
numbers [1][2]=2;
numbers [1][3]=8;

numbers[2][0]=3;
numbers[2][1]=0;
numbers[2][2]=8;
numbers[2][3]=5;


int [][] numbers2 = { {7,1,6,12},  {9,6,2,8}, {3,0,8,5} };

System.out.println("3 elementli ikinci row "+numbers2[0][2]);
int row= numbers2.length;
System.out.println("row = "+ row);


int[][] numbers3=new int[3][];
numbers3[0]=new int[4];
numbers3[1]=new int[4];
numbers3[2]=new int[4];


System.out.println();

	}
}
