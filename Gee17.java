public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];
    //Populate with sequential numbers
    int num = 0;
    for(int row = 0; row < ray.length; row++)
    {
      for(int col = 0; col < ray[row].length; col++)
      {
        num++;
        ray[row][col] = num;
      }
    }
    

    ArrayAverages twoDee = new ArrayAverages(ray);
    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
