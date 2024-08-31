class Main
{
  public static void main(String[] args)
  {
    int[] heapArr = new int[20];
    for(int i = 0; i < heapArr.length; i++)
    {
      heapArr[i] = (int)(Math.random() * 500);
    }
    HeapTree loopTree = new HeapTree(heapArr.length);
    double linearStart = System.nanoTime();
    HeapTree linearTree = new HeapTree(heapArr);
    double linearEnd = System.nanoTime();
    double loopStart = System.nanoTime();
    for(int i = 0; i < heapArr.length; i++)
    {
      loopTree.add((int)(Math.random() * 500));
    }
    double loopEnd = System.nanoTime();
    System.out.print("Loop Heap:");
    loopTree.print();
    System.out.println("\nThis took " + (loopEnd - loopStart) + " ms and involved " + loopTree.getSwaps() + " swaps.\n");
    System.out.print("Linear Heap:");
    linearTree.print();
    System.out.println("\nThis took " + (linearEnd - linearStart) + " ms and involved " + linearTree.getSwaps() + " swaps.\n");
  }
}