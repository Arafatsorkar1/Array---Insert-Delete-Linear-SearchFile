
//C:\Users\Student.COM-11\Documents\NetBeansProjects\ArrayExample\src\cse0208\MyProgram.java

package cse0208;
import java.util.* ;
/////////////////////////////////////

 class ArrayAction {

    double [] data;
    int n;
    double item;
    int loc;
    
    ArrayAction(int total)
    {
        n = total;
        data = new double[100];
        loc = -1; 
       
    }/// end of constructor
    
    void randomInput()
    {
        Random r = new Random();
        
        for (int i = 0; i<n; i++)
        {
            data[i] = (double)r.nextInt(2000);
        }
        
    } // end of randomInput
    
    void display()
    {
        int i;
        System.out.println(" \n Current Array data are");
        for (i=0; i<n; i++)
            System.out.print(data[i] + " ");
        System.out.println();
        
    }// end of display
    
    void insert(double dataItem, int position)
    {
        item = dataItem;
        loc = position;
        
        int i;
        for (i=n-1; i>=loc; i--)
        {
         data[i+1] = data[i];
        }
        
        data[loc] = item;
        n++;
        
    }// end of insert
    
    void delete(int position)
    {
        loc = position;
        n--;
        int i;
        for (i=loc; i<n; i++)
            data[i] = data[i+1];
        
    }// end of delete
    
    void linearSearch(double dataItem)
    {
        item= dataItem;
        loc = -1;
        int i;
        for (i=0; i<n; i++)
        {
            if (data[i]== item)
            {
                loc = i;
                System.out.println("Item was found at " + loc);
                return;
            }// end of if
            
        }// end of for loop
        
      System.out.println("Item not found");
        
    } // end of linearSearch
    
    


}  // end of ArrayAction

//////////////////////////////////////

public class MyProgram {


    public static void main(String[] args) {
       
      Scanner s1 = new Scanner(System.in);
      Scanner s2 = new Scanner (System.in);
      
      int total, position;
      double dataItem;
      System.out.println("How many data? <100 ");
      total = s1.nextInt();
      
      ArrayAction a = new ArrayAction(total);
      a.randomInput();
      
      /// menu
      int choice;
      for (;;)
      { 
        System.out.println("0. Quit");
        System.out.println("1. Display");
        System.out.println("2. Insert");
        System.out.println("3. Delete");
        System.out.println("4. Linear Search");
        System.out.print("\t Enter choice ");
        choice = s2.nextInt();
        
        switch (choice)
        {
            case 0 : return;
            case 1 :
                    a.display(); 
                    break;
            case 2 :
                    System.out.println("enter data item and position");
                    dataItem = s1.nextDouble();
                    position = s2.nextInt();
                    a.insert(dataItem, position);
                    break;
            case 3 :
                    System.out.println("enter position to delete");
                    position = s1.nextInt();
                    a.delete(position);
                    break;
            case 4: 
                    System.out.println("enter data item to search");
                    dataItem = s1.nextDouble();
                    a.linearSearch(dataItem);
                    break;
         
        } // end of switch
      } // menu for loop

// TODO code application logic here
    }
    
}
