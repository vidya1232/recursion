class Ray17
{
	int total=1;
public static void main(String[]args)
{
Ray17 cc = new Ray17();

cc.printNumbers(1);

}
public void printNumbers(int i)
{
	
	System.out.print(i+" ");
	total =total*i;
	i++;
	
	if(i<6)
		printNumbers(i);
	else
		System.out.println("factorial of 5 is "+total);
	
}
}