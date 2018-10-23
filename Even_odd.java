public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=121;
  int rev=0,rem;
  int temp=num;
 
  while(num!=0)
  {
	  rem=num%10;
	  rev=rev*10+rem;
	  num=num/10;
	  System.out.println("rem="+rem);
	  System.out.println("num="+num);
	  System.out.println("rev="+rev);
  }
  
if(temp==rev)
{
	System.out.println("The number is Palindrome");
}
else
{
	
System.out.println("The number is not Palindrome");
}
		
		
		
		
		
		
	}

}
