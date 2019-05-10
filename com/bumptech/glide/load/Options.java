package com.bumptech.glide.load;

import android.support.v4.h.a;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

public final class Options
  implements Key
{
  private final a values;
  
  public Options()
  {
    CachedHashCodeArrayMap localCachedHashCodeArrayMap = new com/bumptech/glide/util/CachedHashCodeArrayMap;
    localCachedHashCodeArrayMap.<init>();
    this.values = localCachedHashCodeArrayMap;
  }
  
  private static void updateDiskCacheKey(Option paramOption, Object paramObject, MessageDigest paramMessageDigest)
  {
    paramOption.update(paramObject, paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Options;
    a locala1;
    if (bool)
    {
      paramObject = (Options)paramObject;
      locala1 = this.values;
      a locala2 = ((Options)paramObject).values;
      bool = locala1.equals(locala2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala1 = null;
    }
  }
  
  public Object get(Option paramOption)
  {
    Object localObject = this.values;
    boolean bool = ((a)localObject).containsKey(paramOption);
    if (bool) {}
    for (localObject = this.values.get(paramOption);; localObject = paramOption.getDefaultValue()) {
      return localObject;
    }
  }
  
  public int hashCode()
  {
    return this.values.hashCode();
  }
  
  public void putAll(Options paramOptions)
  {
    a locala1 = this.values;
    a locala2 = paramOptions.values;
    locala1.putAll(locala2);
  }
  
  public Options set(Option paramOption, Object paramObject)
  {
    this.values.put(paramOption, paramObject);
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Options{values=");
    a locala = this.values;
    return locala + '}';
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    int i = 0;
    Object localObject1 = null;
    for (int j = 0;; j = i)
    {
      localObject1 = this.values;
      i = ((a)localObject1).size();
      if (j >= i) {
        break;
      }
      localObject1 = (Option)this.values.keyAt(j);
      Object localObject2 = this.values.valueAt(j);
      updateDiskCacheKey((Option)localObject1, localObject2, paramMessageDigest);
      i = j + 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\Options.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */