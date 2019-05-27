public class FairTesting{
	
	public double calculateTotal(String[] from, String[] to)
    {
        
        if((from[0] ==  "Don Mills" && to[0] == "Leslie") || (from[0] ==  "Leslie" && to [0] == "Don Mills"))
        {
            return 2.50;
        }
        
         else if (from.length > 3 && to.length > 3 )
         {
           return 3.00;
         }
        
      
        else if((from[0] == "Finch" && to [0] == "Sheppard") )
        {
            return 3.00;
        }
     
         else if((from[0] == "Finch" && to  [0] == "Don Mills") || (from[0] ==  "Don Mills" && to[0] == "Finch"))
        {
            return 5.50;
        }
       
         else if (from[0] == "Finch" && to  [0] == "Sheppard" )
         {
            double Totalprice = 3.00;
             if(from[2] == "leslie" && to [2] == "Don Mills")
             {
                 Totalprice = Totalprice + 2.50; 
             }
             return Totalprice;
         }
        
        
        
        
        return 0;
    }
    
    
}

