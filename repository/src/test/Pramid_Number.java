package test;

public class Pramid_Number {
	
	    public static void main( String[] args )
	    {
	   int input =17;
	   int num=1;
	   for(int i=1;i<input;i++) {
		   for(int j=0;j<i;j++) {
			   System.out.print(num+" ");
			   if(num==input)
				   break;
			   num=num+1;
		   }
		   System.out.println();
		   if(num==input)
			   break;
	   }
	        	
	        		
	        }
	    }


