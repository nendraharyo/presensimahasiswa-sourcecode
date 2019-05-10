package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

final class LinkedTreeMap$KeySet
  extends AbstractSet
{
  LinkedTreeMap$KeySet(LinkedTreeMap paramLinkedTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.this$0.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    LinkedTreeMap.KeySet.1 local1 = new com/google/gson/internal/LinkedTreeMap$KeySet$1;
    local1.<init>(this);
    return local1;
  }
  
  public boolean remove(Object paramObject)
  {
    LinkedTreeMap.Node localNode = this.this$0.removeInternalByKey(paramObject);
    boolean bool;
    if (localNode != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNode = null;
    }
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedTreeMap$KeySet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */