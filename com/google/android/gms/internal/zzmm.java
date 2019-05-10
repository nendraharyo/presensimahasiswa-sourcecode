package com.google.android.gms.internal;

import android.support.v4.h.a;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class zzmm
  extends AbstractSet
{
  private final a zzanZ;
  
  public zzmm()
  {
    a locala = new android/support/v4/h/a;
    locala.<init>();
    this.zzanZ = locala;
  }
  
  public zzmm(int paramInt)
  {
    a locala = new android/support/v4/h/a;
    locala.<init>(paramInt);
    this.zzanZ = locala;
  }
  
  public zzmm(Collection paramCollection)
  {
    this(i);
    addAll(paramCollection);
  }
  
  public boolean add(Object paramObject)
  {
    a locala = this.zzanZ;
    boolean bool = locala.containsKey(paramObject);
    if (bool)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = this.zzanZ;
      locala.put(paramObject, paramObject);
      bool = true;
    }
  }
  
  public boolean addAll(Collection paramCollection)
  {
    boolean bool = paramCollection instanceof zzmm;
    if (bool) {
      paramCollection = (zzmm)paramCollection;
    }
    for (bool = zza(paramCollection);; bool = super.addAll(paramCollection)) {
      return bool;
    }
  }
  
  public void clear()
  {
    this.zzanZ.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.zzanZ.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    return this.zzanZ.keySet().iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    a locala = this.zzanZ;
    boolean bool = locala.containsKey(paramObject);
    if (!bool)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = this.zzanZ;
      locala.remove(paramObject);
      bool = true;
    }
  }
  
  public int size()
  {
    return this.zzanZ.size();
  }
  
  public boolean zza(zzmm paramzzmm)
  {
    int i = size();
    a locala1 = this.zzanZ;
    a locala2 = paramzzmm.zzanZ;
    locala1.putAll(locala2);
    int k = size();
    if (k > i) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */