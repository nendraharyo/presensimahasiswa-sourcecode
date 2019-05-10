package com.bumptech.glide.util;

import android.support.v4.h.a;
import android.support.v4.h.m;

public final class CachedHashCodeArrayMap
  extends a
{
  private int hashCode;
  
  public void clear()
  {
    this.hashCode = 0;
    super.clear();
  }
  
  public int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
    {
      i = super.hashCode();
      this.hashCode = i;
    }
    return this.hashCode;
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    this.hashCode = 0;
    return super.put(paramObject1, paramObject2);
  }
  
  public void putAll(m paramm)
  {
    this.hashCode = 0;
    super.putAll(paramm);
  }
  
  public Object removeAt(int paramInt)
  {
    this.hashCode = 0;
    return super.removeAt(paramInt);
  }
  
  public Object setValueAt(int paramInt, Object paramObject)
  {
    this.hashCode = 0;
    return super.setValueAt(paramInt, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\CachedHashCodeArrayMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */