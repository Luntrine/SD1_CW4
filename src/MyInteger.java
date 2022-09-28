class MyInteger {
  
	private int value; // The program declares a private integer variable.
	
	public MyInteger(int inputValue) 
	{
		/* This constructor takes a parameter of an integer and then sets the private
	    integer declared above to the integer passed through the parameter of this constructor. */
		
		value = inputValue;
	}
	
	public int getValue()
	{
		// This method returns the private integer value declared above.
		
		return value;
	}
	
	public boolean isEven()
	{
		if(value % 2 > 0)
		{
			/* The method returns false if the remainder when value is divided by two
			is greater than 0 */
			
			return false;
		}
		else
		{
			/* The method returns true if the remainder when value is divided by two
			is equal to 0 */
			
			return true;
		}
	}
	
	public boolean isOdd()
	{
		if(value % 2 > 0)
		{
			/* The method returns true if the remainder when value is divided by two
			is greater than 0 */
			
			return true;
		}
		else
		{
			/* The method returns false if the remainder when value is divided by two
			is equal to 0 */
			
			return false;
		}
	}
	
	public boolean isPrime()
	{
		if (value == 0 || value == 1)
		{
			/* The method returns false if value is 0 or 1 because both of these numbers
			are not prime. */
			
		    return false;
		}
		else
		{
		    for (int a = 2; a <= value / 2; a++)
		    {
		        if (value % a == 0)
		        {
		        	// The method returns false if value has more factors than 1 and itself.
		        	
		            return false;
		        }

		    }
		    
		    /* The method returns true if all preceding criteria for non-prime numbers are
		    not fulfilled. */
			
		    return true;
		}
	}
	
	public static boolean isEven(int specValue)
	{
		if(specValue % 2 > 0)
		{
			/* The method returns false if the remainder when specValue is divided by two
			is greater than 0 */
			
			return false;
		}
		else
		{
			/* The method returns true if the remainder when specValue is divided by two
			is equal to 0 */
			
			return true;
		}
	}
	
	public static boolean isOdd(int specValue)
	{
		if(specValue % 2 > 0)
		{
			/* The method returns true if the remainder when specValue is divided by two
			is greater than 0 */
			
			return true;
		}
		else
		{
			/* The method returns false if the remainder when specValue is divided by two
			is equal to 0 */
			
			return false;
		}
	}
	
	public static boolean isPrime(int specValue)
	{
		if (specValue == 0 || specValue == 1)
		{
			/* The method returns false if specValue is 0 or 1 because both of these numbers
			are not prime. */
			
		    return false;
		}
		else
		{
		    for (int a = 2; a <= specValue / 2; a++)
		    {
		        if (specValue % a == 0)
		        {
		        	// The method returns false if specValue has more factors than 1 and itself.
		        	
		            return false;
		        }

		    }
		    
		    /* The method returns true if all preceding criteria for non-prime numbers are
		    not fulfilled. */
			
		    return true;
		    
		}
	}
	
	public static boolean isEven(MyInteger specObject)
	{
		if(specObject.getValue() % 2 > 0)
		{
			/* The method returns false if the remainder when specObject's value integer
			is divided by two is greater than 0 */
				
			return false;
		}
		else
		{
			/* The method returns true if the remainder when specObject's value integer
			is divided by two is equal to 0 */
				
			return true;
		}
	}
	
	public static boolean isOdd(MyInteger specObject)
	{
		if(specObject.getValue() % 2 > 0)
		{
			/* The method returns true if the remainder when specObject's value integer
			is divided by two is greater than 0 */
			
			return true;
		}
		else
		{
			/* The method returns false if the remainder when specObject's value integer
			is divided by two is equal to 0 */
			
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger specObject)
	{
		if (specObject.getValue() == 0 || specObject.getValue() == 1)
		{
			/* The method returns false if specObject's value integer is 0 or 1 because 
			both of these numbers are not prime. */
			
		    return false;
		}
		else
		{
		    for (int a = 2; a <= specObject.getValue() / 2; a++)
		    {
		        if (specObject.getValue() % a == 0)
		        {
		        	// The method returns false if specObject's value integer has more factors than 1 and itself.
		        	
		            return false;
		        }

		    }
		    
		    /* The method returns true if all preceding criteria for non-prime numbers are
		    not fulfilled. */
			
		    return true;
		    
		}
	}
	
	public boolean equals(int specValue)
	{
		if(value == specValue)
		{
			// The program returns true if the integer value above is equal to the parameter specValue.
			
			return true;
		}
		else
		{
			// The program returns false if the integer value above is not equal to the parameter specValue.
			
			return false;
		}
	}
	
	public boolean equals(MyInteger specObject)
	{
		if(value == specObject.getValue())
		{
			// The program returns true if the integer value above is equal to the parameter specObject's value integer.
			
			return true;
		}
		else
		{
			// The program returns false if the integer value above is not equal to the parameter specObject's value integer.
			
			return false;
		}
	}
	
	public static int parseInt(char[] charArrayToConvert)
	{
		String intermediateString = "";
		
		/* Every count of the for loop adds one element from the char array to a 
		string until all elements of the char array has been completely passed 
		through and added to the string. */
		for(int count = 0; count < charArrayToConvert.length; count++)
		{
			intermediateString = intermediateString + charArrayToConvert[count];
		}
		
		// The calls the parseInt method below.
		return parseInt(intermediateString);
	}
	
	public static int parseInt(String stringToConvert)
	{
		/* The valueOf method is called because it converts a string into an integer.
		There is also a chance calling the method will produce an error. This is solved
		by having a simple try/catch error checking system. It's functionally a 
		contingency plan. */
		try 
		{
			return java.lang.Integer.valueOf(stringToConvert);
		}
			
		catch (NumberFormatException e)
		{
			return 0;
		}
	}
}
