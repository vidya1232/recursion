class Ray15
{
public static void main(String[]args)
{
Ray15 cc = new Ray15();

cc.printNumbers(1);

}
public void printNumbers(int i)
{
	System.out.print(i+" ");//5,4
	i++;
	if(i<6)//4>0,3>0
		printNumbers(i);//method call
}
}

	
