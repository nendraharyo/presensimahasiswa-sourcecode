package com.google.gson.internal;

final class LinkedHashTreeMap$AvlBuilder
{
  private int leavesSkipped;
  private int leavesToSkip;
  private int size;
  private LinkedHashTreeMap.Node stack;
  
  void add(LinkedHashTreeMap.Node paramNode)
  {
    int i = 1;
    LinkedHashTreeMap.Node localNode1 = null;
    paramNode.right = null;
    paramNode.parent = null;
    paramNode.left = null;
    paramNode.height = i;
    int j = this.leavesToSkip;
    if (j > 0)
    {
      j = this.size & 0x1;
      if (j == 0)
      {
        j = this.size + 1;
        this.size = j;
        j = this.leavesToSkip + -1;
        this.leavesToSkip = j;
        j = this.leavesSkipped + 1;
        this.leavesSkipped = j;
      }
    }
    localNode1 = this.stack;
    paramNode.parent = localNode1;
    this.stack = paramNode;
    j = this.size + 1;
    this.size = j;
    j = this.leavesToSkip;
    if (j > 0)
    {
      j = this.size & 0x1;
      if (j == 0)
      {
        j = this.size + 1;
        this.size = j;
        j = this.leavesToSkip + -1;
        this.leavesToSkip = j;
        j = this.leavesSkipped + 1;
        this.leavesSkipped = j;
      }
    }
    j = 4;
    int k = this.size;
    int m = j + -1;
    k &= m;
    m = j + -1;
    if (k == m)
    {
      k = this.leavesSkipped;
      LinkedHashTreeMap.Node localNode2;
      LinkedHashTreeMap.Node localNode3;
      if (k == 0)
      {
        localNode2 = this.stack;
        localNode3 = localNode2.parent;
        LinkedHashTreeMap.Node localNode4 = localNode3.parent;
        LinkedHashTreeMap.Node localNode5 = localNode4.parent;
        localNode3.parent = localNode5;
        this.stack = localNode3;
        localNode3.left = localNode4;
        localNode3.right = localNode2;
        int n = localNode2.height + 1;
        localNode3.height = n;
        localNode4.parent = localNode3;
        localNode2.parent = localNode3;
      }
      for (;;)
      {
        j *= 2;
        break;
        k = this.leavesSkipped;
        if (k == i)
        {
          localNode2 = this.stack;
          localNode3 = localNode2.parent;
          this.stack = localNode3;
          localNode3.right = localNode2;
          int i1 = localNode2.height + 1;
          localNode3.height = i1;
          localNode2.parent = localNode3;
          this.leavesSkipped = 0;
        }
        else
        {
          k = this.leavesSkipped;
          m = 2;
          if (k == m) {
            this.leavesSkipped = 0;
          }
        }
      }
    }
  }
  
  void reset(int paramInt)
  {
    int i = Integer.highestOneBit(paramInt) * 2 + -1 - paramInt;
    this.leavesToSkip = i;
    this.size = 0;
    this.leavesSkipped = 0;
    this.stack = null;
  }
  
  LinkedHashTreeMap.Node root()
  {
    Object localObject = this.stack;
    LinkedHashTreeMap.Node localNode = ((LinkedHashTreeMap.Node)localObject).parent;
    if (localNode != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (LinkedHashTreeMap.Node)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap$AvlBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */