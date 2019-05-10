package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.HashMap;
import java.util.Map;

class GroupedLinkedMap
{
  private final GroupedLinkedMap.LinkedEntry head;
  private final Map keyToEntry;
  
  GroupedLinkedMap()
  {
    Object localObject = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap$LinkedEntry;
    ((GroupedLinkedMap.LinkedEntry)localObject).<init>();
    this.head = ((GroupedLinkedMap.LinkedEntry)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.keyToEntry = ((Map)localObject);
  }
  
  private void makeHead(GroupedLinkedMap.LinkedEntry paramLinkedEntry)
  {
    removeEntry(paramLinkedEntry);
    GroupedLinkedMap.LinkedEntry localLinkedEntry = this.head;
    paramLinkedEntry.prev = localLinkedEntry;
    localLinkedEntry = this.head.next;
    paramLinkedEntry.next = localLinkedEntry;
    updateEntry(paramLinkedEntry);
  }
  
  private void makeTail(GroupedLinkedMap.LinkedEntry paramLinkedEntry)
  {
    removeEntry(paramLinkedEntry);
    GroupedLinkedMap.LinkedEntry localLinkedEntry = this.head.prev;
    paramLinkedEntry.prev = localLinkedEntry;
    localLinkedEntry = this.head;
    paramLinkedEntry.next = localLinkedEntry;
    updateEntry(paramLinkedEntry);
  }
  
  private static void removeEntry(GroupedLinkedMap.LinkedEntry paramLinkedEntry)
  {
    GroupedLinkedMap.LinkedEntry localLinkedEntry1 = paramLinkedEntry.prev;
    GroupedLinkedMap.LinkedEntry localLinkedEntry2 = paramLinkedEntry.next;
    localLinkedEntry1.next = localLinkedEntry2;
    localLinkedEntry1 = paramLinkedEntry.next;
    localLinkedEntry2 = paramLinkedEntry.prev;
    localLinkedEntry1.prev = localLinkedEntry2;
  }
  
  private static void updateEntry(GroupedLinkedMap.LinkedEntry paramLinkedEntry)
  {
    paramLinkedEntry.next.prev = paramLinkedEntry;
    paramLinkedEntry.prev.next = paramLinkedEntry;
  }
  
  public Object get(Poolable paramPoolable)
  {
    GroupedLinkedMap.LinkedEntry localLinkedEntry = (GroupedLinkedMap.LinkedEntry)this.keyToEntry.get(paramPoolable);
    if (localLinkedEntry == null)
    {
      localLinkedEntry = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap$LinkedEntry;
      localLinkedEntry.<init>(paramPoolable);
      Map localMap = this.keyToEntry;
      localMap.put(paramPoolable, localLinkedEntry);
    }
    for (;;)
    {
      makeHead(localLinkedEntry);
      return localLinkedEntry.removeLast();
      paramPoolable.offer();
    }
  }
  
  public void put(Poolable paramPoolable, Object paramObject)
  {
    GroupedLinkedMap.LinkedEntry localLinkedEntry = (GroupedLinkedMap.LinkedEntry)this.keyToEntry.get(paramPoolable);
    if (localLinkedEntry == null)
    {
      localLinkedEntry = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap$LinkedEntry;
      localLinkedEntry.<init>(paramPoolable);
      makeTail(localLinkedEntry);
      Map localMap = this.keyToEntry;
      localMap.put(paramPoolable, localLinkedEntry);
    }
    for (;;)
    {
      localLinkedEntry.add(paramObject);
      return;
      paramPoolable.offer();
    }
  }
  
  public Object removeLast()
  {
    Object localObject1 = this.head.prev;
    Object localObject2 = localObject1;
    localObject1 = this.head;
    boolean bool = localObject2.equals(localObject1);
    if (!bool)
    {
      localObject1 = ((GroupedLinkedMap.LinkedEntry)localObject2).removeLast();
      if (localObject1 == null) {}
    }
    for (;;)
    {
      return localObject1;
      removeEntry((GroupedLinkedMap.LinkedEntry)localObject2);
      localObject1 = this.keyToEntry;
      Object localObject3 = ((GroupedLinkedMap.LinkedEntry)localObject2).key;
      ((Map)localObject1).remove(localObject3);
      ((Poolable)((GroupedLinkedMap.LinkedEntry)localObject2).key).offer();
      localObject1 = ((GroupedLinkedMap.LinkedEntry)localObject2).prev;
      localObject2 = localObject1;
      break;
      bool = false;
      localObject1 = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("GroupedLinkedMap( ");
    GroupedLinkedMap.LinkedEntry localLinkedEntry = this.head.next;
    int i = 0;
    for (;;)
    {
      Object localObject1 = this.head;
      boolean bool = localLinkedEntry.equals(localObject1);
      if (bool) {
        break;
      }
      i = 1;
      char c = '{';
      localObject1 = localStringBuilder.append(c);
      Object localObject2 = localLinkedEntry.key;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(':');
      int j = localLinkedEntry.size();
      localObject1 = ((StringBuilder)localObject1).append(j);
      localObject2 = "}, ";
      ((StringBuilder)localObject1).append((String)localObject2);
      localLinkedEntry = localLinkedEntry.next;
    }
    if (i != 0)
    {
      i = localStringBuilder.length() + -2;
      int k = localStringBuilder.length();
      localStringBuilder.delete(i, k);
    }
    return " )";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\GroupedLinkedMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */