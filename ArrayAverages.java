import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double average=0; 
    for(int row=0; row < ray.length; row++)
      {
        average =0;
        for(int col =0; col < ray[row].length; col++)
        {
          average += ray[row][col]; 
        }
        average = average / ray[row].length;
        System.out.println("The average for row " + row + " is: " + average);
      }
  }

  public void columnAverages(){
    // row on isnide column on outside
    // condition for column is now [0] not [ray]
    double average =0;
    for(int col =0; col < ray[0].length; col++)
    {
      average =0;
      for(int row=0; row <ray.length; row++)
      {
        average += ray[row][col];
      }
      average = average / ray.length;
      System.out.println("The average for column " + col + " is: " + average);
    }
  }

  public void arrayAverage(){
    double average =0;
    int numbersAdded =0;
    for(int row =0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length;col++)
      {
        average += ray[row][col];
        numbersAdded++;
      }
    }
    average = average / numbersAdded;
    System.out.println("The average of array is: " + average);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return ""; 
  }
}
