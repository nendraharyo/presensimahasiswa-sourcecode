package org.apache.http.protocol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

final class ChainBuilder
{
  private final LinkedList list;
  private final Map uniqueClasses;
  
  public ChainBuilder()
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.list = ((LinkedList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.uniqueClasses = ((Map)localObject);
  }
  
  private void ensureUnique(Object paramObject)
  {
    Object localObject1 = this.uniqueClasses;
    Object localObject2 = paramObject.getClass();
    localObject1 = ((Map)localObject1).remove(localObject2);
    if (localObject1 != null)
    {
      localObject2 = this.list;
      ((LinkedList)localObject2).remove(localObject1);
    }
    localObject1 = this.uniqueClasses;
    localObject2 = paramObject.getClass();
    ((Map)localObject1).put(localObject2, paramObject);
  }
  
  public ChainBuilder addAllFirst(Collection paramCollection)
  {
    if (paramCollection == null) {
      return this;
    }
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      addFirst(localObject);
    }
  }
  
  public ChainBuilder addAllFirst(Object... paramVarArgs)
  {
    if (paramVarArgs == null) {}
    for (;;)
    {
      return this;
      int i = paramVarArgs.length;
      int j = 0;
      while (j < i)
      {
        Object localObject = paramVarArgs[j];
        addFirst(localObject);
        j += 1;
      }
    }
  }
  
  public ChainBuilder addAllLast(Collection paramCollection)
  {
    if (paramCollection == null) {
      return this;
    }
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      addLast(localObject);
    }
  }
  
  public ChainBuilder addAllLast(Object... paramVarArgs)
  {
    if (paramVarArgs == null) {}
    for (;;)
    {
      return this;
      int i = paramVarArgs.length;
      int j = 0;
      while (j < i)
      {
        Object localObject = paramVarArgs[j];
        addLast(localObject);
        j += 1;
      }
    }
  }
  
  public ChainBuilder addFirst(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return this;
      ensureUnique(paramObject);
      LinkedList localLinkedList = this.list;
      localLinkedList.addFirst(paramObject);
    }
  }
  
  public ChainBuilder addLast(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return this;
      ensureUnique(paramObject);
      LinkedList localLinkedList = this.list;
      localLinkedList.addLast(paramObject);
    }
  }
  
  public LinkedList build()
  {
    LinkedList localLinkedList1 = new java/util/LinkedList;
    LinkedList localLinkedList2 = this.list;
    localLinkedList1.<init>(localLinkedList2);
    return localLinkedList1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\ChainBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */