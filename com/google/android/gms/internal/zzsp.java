package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class zzsp
{
  public final int tag;
  protected final int type;
  protected final Class zzbuk;
  protected final boolean zzbul;
  
  private zzsp(int paramInt1, Class paramClass, int paramInt2, boolean paramBoolean)
  {
    this.type = paramInt1;
    this.zzbuk = paramClass;
    this.tag = paramInt2;
    this.zzbul = paramBoolean;
  }
  
  private Object zzK(List paramList)
  {
    int i = 0;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int k;
    Object localObject1;
    Object localObject2;
    for (int j = 0;; j = k)
    {
      k = paramList.size();
      if (j >= k) {
        break;
      }
      localObject1 = (zzsw)paramList.get(j);
      localObject2 = ((zzsw)localObject1).zzbuv;
      int m = localObject2.length;
      if (m != 0) {
        zza((zzsw)localObject1, localArrayList);
      }
      k = j + 1;
    }
    j = localArrayList.size();
    if (j == 0)
    {
      k = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzbuk;
      localObject2 = Array.newInstance(this.zzbuk.getComponentType(), j);
      localObject1 = ((Class)localObject1).cast(localObject2);
      while (i < j)
      {
        localObject2 = localArrayList.get(i);
        Array.set(localObject1, i, localObject2);
        i += 1;
      }
    }
  }
  
  private Object zzL(List paramList)
  {
    boolean bool = paramList.isEmpty();
    if (bool) {
      bool = false;
    }
    Class localClass;
    for (Object localObject = null;; localObject = localClass.cast(localObject))
    {
      return localObject;
      int i = paramList.size() + -1;
      localObject = (zzsw)paramList.get(i);
      localClass = this.zzbuk;
      localObject = zzsm.zzD(((zzsw)localObject).zzbuv);
      localObject = zzP((zzsm)localObject);
    }
  }
  
  public static zzsp zza(int paramInt, Class paramClass, long paramLong)
  {
    zzsp localzzsp = new com/google/android/gms/internal/zzsp;
    int i = (int)paramLong;
    localzzsp.<init>(paramInt, paramClass, i, false);
    return localzzsp;
  }
  
  final Object zzJ(List paramList)
  {
    boolean bool;
    Object localObject;
    if (paramList == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      bool = this.zzbul;
      if (bool) {
        localObject = zzK(paramList);
      } else {
        localObject = zzL(paramList);
      }
    }
  }
  
  protected Object zzP(zzsm paramzzsm)
  {
    boolean bool = this.zzbul;
    Object localObject1;
    Object localObject3;
    if (bool)
    {
      localObject1 = this.zzbuk.getComponentType();
      localObject3 = localObject1;
    }
    try
    {
      int i = this.type;
      switch (i)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "Unknown type ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        int j = this.type;
        localObject4 = ((StringBuilder)localObject4).append(j);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;)
      {
        localObject4 = new java/lang/IllegalArgumentException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject3 = "Error creating instance of class " + localObject3;
        ((IllegalArgumentException)localObject4).<init>((String)localObject3, localInstantiationException);
        throw ((Throwable)localObject4);
        localObject2 = this.zzbuk;
        localObject3 = localObject2;
      }
      Object localObject2 = ((Class)localObject3).newInstance();
      localObject2 = (zzsu)localObject2;
      int k = this.tag;
      k = zzsx.zzmJ(k);
      paramzzsm.zza((zzsu)localObject2, k);
      for (;;)
      {
        return localObject2;
        localObject2 = ((Class)localObject3).newInstance();
        localObject2 = (zzsu)localObject2;
        paramzzsm.zza((zzsu)localObject2);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject4 = new java/lang/IllegalArgumentException;
      Object localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject3 = "Error creating instance of class " + localObject3;
      ((IllegalArgumentException)localObject4).<init>((String)localObject3, localIllegalAccessException);
      throw ((Throwable)localObject4);
    }
    catch (IOException localIOException)
    {
      localObject3 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject3).<init>("Error reading extension field", localIOException);
      throw ((Throwable)localObject3);
    }
  }
  
  int zzY(Object paramObject)
  {
    boolean bool = this.zzbul;
    if (bool) {}
    for (int i = zzZ(paramObject);; i = zzaa(paramObject)) {
      return i;
    }
  }
  
  protected int zzZ(Object paramObject)
  {
    int i = 0;
    int j = Array.getLength(paramObject);
    int k = 0;
    while (k < j)
    {
      Object localObject = Array.get(paramObject, k);
      if (localObject != null)
      {
        localObject = Array.get(paramObject, k);
        int m = zzaa(localObject);
        i += m;
      }
      k += 1;
    }
    return i;
  }
  
  protected void zza(zzsw paramzzsw, List paramList)
  {
    Object localObject = zzsm.zzD(paramzzsw.zzbuv);
    localObject = zzP((zzsm)localObject);
    paramList.add(localObject);
  }
  
  void zza(Object paramObject, zzsn paramzzsn)
  {
    boolean bool = this.zzbul;
    if (bool) {
      zzc(paramObject, paramzzsn);
    }
    for (;;)
    {
      return;
      zzb(paramObject, paramzzsn);
    }
  }
  
  protected int zzaa(Object paramObject)
  {
    int i = zzsx.zzmJ(this.tag);
    int j = this.type;
    switch (j)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Unknown type ");
      int k = this.type;
      localObject = k;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    case 10: 
      paramObject = (zzsu)paramObject;
    }
    for (i = zzsn.zzb(i, (zzsu)paramObject);; i = zzsn.zzc(i, (zzsu)paramObject))
    {
      return i;
      paramObject = (zzsu)paramObject;
    }
  }
  
  protected void zzb(Object paramObject, zzsn paramzzsn)
  {
    try
    {
      i = this.tag;
      paramzzsn.zzmB(i);
      i = this.type;
      switch (i)
      {
      default: 
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Unknown type ";
        localObject = ((StringBuilder)localObject).append(str);
        int j = this.type;
        localObject = ((StringBuilder)localObject).append(j);
        localObject = ((StringBuilder)localObject).toString();
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
      }
    }
    catch (IOException localIOException)
    {
      Object localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(localIOException);
      throw ((Throwable)localObject);
    }
    paramObject = (zzsu)paramObject;
    int i = this.tag;
    i = zzsx.zzmJ(i);
    paramzzsn.zzb((zzsu)paramObject);
    int k = 4;
    paramzzsn.zzE(i, k);
    for (;;)
    {
      return;
      paramObject = (zzsu)paramObject;
      paramzzsn.zzc((zzsu)paramObject);
    }
  }
  
  protected void zzc(Object paramObject, zzsn paramzzsn)
  {
    int i = Array.getLength(paramObject);
    int j = 0;
    while (j < i)
    {
      Object localObject = Array.get(paramObject, j);
      if (localObject != null) {
        zzb(localObject, paramzzsn);
      }
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */