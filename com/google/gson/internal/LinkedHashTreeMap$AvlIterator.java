package com.google.gson.internal;

class LinkedHashTreeMap$AvlIterator
{
  private LinkedHashTreeMap.Node stackTop;
  
  public LinkedHashTreeMap.Node next()
  {
    Object localObject1 = null;
    LinkedHashTreeMap.Node localNode1 = this.stackTop;
    if (localNode1 == null) {}
    for (;;)
    {
      return (LinkedHashTreeMap.Node)localObject1;
      Object localObject2 = localNode1.parent;
      localNode1.parent = null;
      LinkedHashTreeMap.Node localNode2;
      for (localObject1 = localNode1.right; localObject1 != null; localObject1 = localNode2)
      {
        ((LinkedHashTreeMap.Node)localObject1).parent = ((LinkedHashTreeMap.Node)localObject2);
        localNode2 = ((LinkedHashTreeMap.Node)localObject1).left;
        localObject2 = localObject1;
      }
      this.stackTop = ((LinkedHashTreeMap.Node)localObject2);
      localObject1 = localNode1;
    }
  }
  
  void reset(LinkedHashTreeMap.Node paramNode)
  {
    LinkedHashTreeMap.Node localNode1 = null;
    while (paramNode != null)
    {
      paramNode.parent = localNode1;
      LinkedHashTreeMap.Node localNode2 = paramNode.left;
      localNode1 = paramNode;
      paramNode = localNode2;
    }
    this.stackTop = localNode1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap$AvlIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */