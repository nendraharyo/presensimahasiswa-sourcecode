package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class LinkedHashTreeMap$EntrySet
  extends AbstractSet
{
  LinkedHashTreeMap$EntrySet(LinkedHashTreeMap paramLinkedHashTreeMap) {}
  
  public void clear()
  {
    this.this$0.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool = paramObject instanceof Map.Entry;
    Object localObject;
    if (bool)
    {
      localObject = this.this$0;
      paramObject = (Map.Entry)paramObject;
      localObject = ((LinkedHashTreeMap)localObject).findByEntry((Map.Entry)paramObject);
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public Iterator iterator()
  {
    LinkedHashTreeMap.EntrySet.1 local1 = new com/google/gson/internal/LinkedHashTreeMap$EntrySet$1;
    local1.<init>(this);
    return local1;
  }
  
  public boolean remove(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    LinkedHashTreeMap localLinkedHashTreeMap = null;
    boolean bool3 = paramObject instanceof Map.Entry;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      Object localObject = this.this$0;
      paramObject = (Map.Entry)paramObject;
      localObject = ((LinkedHashTreeMap)localObject).findByEntry((Map.Entry)paramObject);
      if (localObject != null)
      {
        localLinkedHashTreeMap = this.this$0;
        localLinkedHashTreeMap.removeInternal((LinkedHashTreeMap.Node)localObject, bool1);
        bool2 = bool1;
      }
    }
  }
  
  public int size()
  {
    return this.this$0.size;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LinkedHashTreeMap$EntrySet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */