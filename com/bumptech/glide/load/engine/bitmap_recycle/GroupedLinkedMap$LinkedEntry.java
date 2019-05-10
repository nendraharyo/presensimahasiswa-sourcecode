package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.List;

class GroupedLinkedMap$LinkedEntry
{
  final Object key;
  LinkedEntry next = this;
  LinkedEntry prev = this;
  private List values;
  
  GroupedLinkedMap$LinkedEntry()
  {
    this(null);
  }
  
  GroupedLinkedMap$LinkedEntry(Object paramObject)
  {
    this.key = paramObject;
  }
  
  public void add(Object paramObject)
  {
    Object localObject = this.values;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.values = ((List)localObject);
    }
    this.values.add(paramObject);
  }
  
  public Object removeLast()
  {
    int i = size();
    List localList;
    if (i > 0)
    {
      localList = this.values;
      i += -1;
    }
    for (Object localObject = localList.remove(i);; localObject = null)
    {
      return localObject;
      i = 0;
    }
  }
  
  public int size()
  {
    List localList = this.values;
    int i;
    if (localList != null)
    {
      localList = this.values;
      i = localList.size();
    }
    for (;;)
    {
      return i;
      i = 0;
      localList = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\GroupedLinkedMap$LinkedEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */