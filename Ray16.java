class Ray16
{
	int total=0;
public static void main(String[]args)
{
Ray16 cc = new Ray16();

cc.printNumbers(1);

}
public void printNumbers(int i)
{
	
	System.out.print(i+" ");
	total =total+i;
	i++;
	
	if(i<6)
		printNumbers(i);
	else
		System.out.println("total "+total);
	
}
}