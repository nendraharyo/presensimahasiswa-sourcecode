package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class PrettyPrintTreeMap
  extends TreeMap
{
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("( ");
    Object localObject1 = entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    Object localObject2;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      char c1 = '{';
      localObject2 = localStringBuilder.append(c1);
      Object localObject3 = ((Map.Entry)localObject1).getKey();
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      char c2 = ':';
      localObject2 = ((StringBuilder)localObject2).append(c2);
      localObject1 = ((Map.Entry)localObject1).getValue();
      localObject1 = ((StringBuilder)localObject2).append(localObject1);
      localObject2 = "}, ";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    boolean bool = isEmpty();
    if (!bool)
    {
      int i = localStringBuilder.length() + -2;
      int j = localStringBuilder.length();
      localObject2 = "";
      localStringBuilder.replace(i, j, (String)localObject2);
    }
    return " )";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\PrettyPrintTreeMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */