public class HeapTree
{
  private int swaps = 0;
  private int size = 0;
  private int[] heap;

  public HeapTree(int length)
  {
    heap = new int[length];
  }

  public HeapTree(int[] arr)
  {
    heap = new int[arr.length];
    for(int i = 0; i < arr.length; i++)
    {
      heap[i] = arr[i];
      int transportIndex = i;
      int newNum = heap[transportIndex];
      while(0 < transportIndex && newNum < heap[(transportIndex - 1) / 2])
      {
        heap[transportIndex] = heap[(transportIndex - 1) / 2];
        transportIndex = (transportIndex - 1) / 2;
        swaps++;
      }
      heap[transportIndex] = newNum;
    }
  }

  public void add(int num)
  {
    heap[size] = num;
    int transportIndex = size;
    int newNum = heap[transportIndex];
    while(0 < transportIndex && newNum < heap[(transportIndex - 1) / 2])
    {
      heap[transportIndex] = heap[(transportIndex - 1) / 2];
      transportIndex = (transportIndex - 1) / 2;
      swaps++;
    }
    heap[transportIndex] = newNum;
    size++;
  }

  public void print()
  {
    int lineCounter = 0;
    for(int i = 0 ; i < heap.length; i++)
    {
      if(i + 1 == Math.pow(2, lineCounter))
      {
        System.out.print("\nLine " + (lineCounter + 1));
        lineCounter++;
      }
      System.out.print(": " + heap[i]);
    }
  }

  public int getSwaps()
  {
    return swaps;
  }
}