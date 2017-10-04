 
public class ControlStructures {
//Tyson Lawrence Control Structures Period 2
	public static void main(String[] args) 
	{PrimePrinter(50);fooBarBaz(500);
		
		
		
		
		
	}
	   
	public static void PrimePrinter (int limit)
    { int count=0;
      int x=2;
      while (count<=limit)
    	  {if (isPrime (x))
    	  {System.out.print(x+",");
    	  count ++;
    	  if (count%10==0)
    	  {System.out.println();}
    	  }
           x++;
    	  }
	}
	
	public static boolean isPrime (int num)
	{int x=2;
	   while (x<=num/2)
	      {if (num %x==0)
	       {return false;}
	     x++;
	       }
	  return true;
	}
		
   
	
	
    public static void fooBarBaz (int a)
    { int a1=0;
      { while (a1<=500)
          if (a1%3==0)
          {System.out.print("foo");}
          if (a1%7==0)
          {System.out.print("bar");}
           if (a1%10==0)
          {System.out.print("baz");}
           a1++;
        }
	    System.out.print(a1);   
    }
    
    }

	      
	    
	
         


