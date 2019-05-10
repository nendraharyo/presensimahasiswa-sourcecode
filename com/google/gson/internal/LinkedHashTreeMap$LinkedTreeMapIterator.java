package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class LinkedHashTreeMap$LinkedTreeMapIterator
  implements Iterator
{
  int expectedModCount;
  LinkedHashTreeMap.Node lastReturned;
  LinkedHashTreeMap.Node next;
  
  LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap paramLinkedHashTreeMap)
  {
    LinkedHashTreeMap.Node localNode = this.this$0.header.next;
    this.next = localNode;
    this.lastReturned = null;
    int i = this.this$0.modCount;
    this.expectedModCount = i;
  }
  
  public final boolean hasNext()
  {
    LinkedHashTreeMap.Node localNode1 = this.next;
    LinkedHashTreeMap.Node localNode2 = this.this$0.header;
    boolean bool;
    if (localNode1 != localNode2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNode1 = null;
    }
  }
  
  final LinkedHashTreeMap.Node nextNode()
  {
    Object localObject1 = this.next;
    Object localObject2 = this.this$0.header;
    if (localObject1 == localObject2)
    {
      localObject1 = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject2 = this.this$0;
    int i = ((LinkedHashTreeMap)localObject2).modCount;
    int j = this.expectedModCount;
    if (i != j)
    {
      localObject1 = new java/util/ConcurrentModificationException;
      ((ConcurrentModificationException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    localObject2 = ((LinkedHashTreeMap.Node)localObject1).next;
    this.next = ((LinkedHashTreeMap.Node)localObject2);
    this.lastReturned = ((LinkedHashTreeMap.Node)localObject1);
    return (LinkedHashTreeMap.Node)localObject1;
  }
  
  public final void remove()
  {
    Object localObject = this.lastReturned;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = this.this$0;
    LinkedHashTreeMap.Node localNode = this.lastReturned;
    ((LinkedHashTreeMap)localObject).removeInternal(localNode, true);
    this.lastReturned = null;
    int i = this.this$0.modCount;
    this.expectedModCount = i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap$LinkedTreeMapIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */