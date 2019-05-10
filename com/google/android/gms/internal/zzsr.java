package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class zzsr
  implements Cloneable
{
  private zzsp zzbuq;
  private Object zzbur;
  private List zzbus;
  
  zzsr()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzbus = localArrayList;
  }
  
  private byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[zzz()];
    zzsn localzzsn = zzsn.zzE(arrayOfByte);
    writeTo(localzzsn);
    return arrayOfByte;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzsr;
      if (!bool2) {
        continue;
      }
      paramObject = (zzsr)paramObject;
      Object localObject2 = this.zzbur;
      if (localObject2 != null)
      {
        localObject2 = ((zzsr)paramObject).zzbur;
        if (localObject2 != null)
        {
          localObject2 = this.zzbuq;
          zzsp localzzsp = ((zzsr)paramObject).zzbuq;
          if (localObject2 != localzzsp) {
            continue;
          }
          localObject1 = this.zzbuq.zzbuk;
          bool1 = ((Class)localObject1).isArray();
          if (!bool1)
          {
            localObject1 = this.zzbur;
            localObject2 = ((zzsr)paramObject).zzbur;
            bool1 = localObject1.equals(localObject2);
            continue;
          }
          localObject1 = this.zzbur;
          bool1 = localObject1 instanceof byte[];
          if (bool1)
          {
            localObject1 = (byte[])this.zzbur;
            localObject2 = (byte[])((zzsr)paramObject).zzbur;
            bool1 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
            continue;
          }
          localObject1 = this.zzbur;
          bool1 = localObject1 instanceof int[];
          if (bool1)
          {
            localObject1 = (int[])this.zzbur;
            localObject2 = (int[])((zzsr)paramObject).zzbur;
            bool1 = Arrays.equals((int[])localObject1, (int[])localObject2);
            continue;
          }
          localObject1 = this.zzbur;
          bool1 = localObject1 instanceof long[];
          if (bool1)
          {
            localObject1 = (long[])this.zzbur;
            localObject2 = (long[])((zzsr)paramObject).zzbur;
            bool1 = Arrays.equals((long[])localObject1, (long[])localObject2);
            continue;
          }
          localObject1 = this.zzbur;
          bool1 = localObject1 instanceof float[];
          if (bool1)
          {
            localObject1 = (float[])this.zzbur;
            localObject2 = (float[])((zzsr)paramObject).zzbur;
            bool1 = Arrays.equals((float[])localObject1, (float[])localObject2);
            continue;
          }
          localObject1 = this.zzbur;
          bool1 = localObject1 instanceof double[];
          if (bool1)
          {
            localObject1 = (double[])this.zzbur;
            localObject2 = (double[])((zzsr)paramObject).zzbur;
            bool1 = Arrays.equals((double[])localObject1, (double[])localObject2);
            continue;
          }
          localObject1 = this.zzbur;
          bool1 = localObject1 instanceof boolean[];
          if (bool1)
          {
            localObject1 = (boolean[])this.zzbur;
            localObject2 = (boolean[])((zzsr)paramObject).zzbur;
            bool1 = Arrays.equals((boolean[])localObject1, (boolean[])localObject2);
            continue;
          }
          localObject1 = (Object[])this.zzbur;
          localObject2 = (Object[])((zzsr)paramObject).zzbur;
          bool1 = Arrays.deepEquals((Object[])localObject1, (Object[])localObject2);
          continue;
        }
      }
      localObject1 = this.zzbus;
      if (localObject1 != null)
      {
        localObject1 = ((zzsr)paramObject).zzbus;
        if (localObject1 != null)
        {
          localObject1 = this.zzbus;
          localObject2 = ((zzsr)paramObject).zzbus;
          bool1 = ((List)localObject1).equals(localObject2);
          continue;
        }
      }
      try
      {
        localObject1 = toByteArray();
        localObject2 = ((zzsr)paramObject).toByteArray();
        bool1 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
      }
      catch (IOException localIOException)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(localIOException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public int hashCode()
  {
    try
    {
      byte[] arrayOfByte = toByteArray();
      return Arrays.hashCode(arrayOfByte) + 527;
    }
    catch (IOException localIOException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(localIOException);
      throw localIllegalStateException;
    }
  }
  
  void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzbur;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuq;
      localObject2 = this.zzbur;
      ((zzsp)localObject1).zza(localObject2, paramzzsn);
      return;
    }
    localObject1 = this.zzbus;
    Object localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzsw)((Iterator)localObject2).next();
      ((zzsw)localObject1).writeTo(paramzzsn);
    }
  }
  
  public final zzsr zzJr()
  {
    int i = 0;
    Object localObject1 = null;
    zzsr localzzsr = new com/google/android/gms/internal/zzsr;
    localzzsr.<init>();
    boolean bool;
    Object localObject5;
    do
    {
      for (;;)
      {
        try
        {
          Object localObject2 = this.zzbuq;
          localzzsr.zzbuq = ((zzsp)localObject2);
          localObject2 = this.zzbus;
          if (localObject2 == null)
          {
            bool = false;
            localObject2 = null;
            localzzsr.zzbus = null;
            localObject2 = this.zzbur;
            if (localObject2 == null) {
              return localzzsr;
            }
          }
          else
          {
            localObject2 = localzzsr.zzbus;
            localObject4 = this.zzbus;
            ((List)localObject2).addAll((Collection)localObject4);
            continue;
          }
          localObject3 = this.zzbur;
        }
        catch (CloneNotSupportedException localCloneNotSupportedException)
        {
          localObject1 = new java/lang/AssertionError;
          ((AssertionError)localObject1).<init>(localCloneNotSupportedException);
          throw ((Throwable)localObject1);
        }
        bool = localObject3 instanceof zzsu;
        if (bool)
        {
          localObject3 = this.zzbur;
          localObject3 = (zzsu)localObject3;
          localObject3 = ((zzsu)localObject3).clone();
          localzzsr.zzbur = localObject3;
        }
        else
        {
          localObject3 = this.zzbur;
          bool = localObject3 instanceof byte[];
          if (bool)
          {
            localObject3 = this.zzbur;
            localObject3 = (byte[])localObject3;
            localObject3 = (byte[])localObject3;
            localObject3 = ((byte[])localObject3).clone();
            localzzsr.zzbur = localObject3;
          }
          else
          {
            localObject3 = this.zzbur;
            bool = localObject3 instanceof byte[][];
            if (bool)
            {
              localObject3 = this.zzbur;
              localObject3 = (byte[][])localObject3;
              localObject3 = (byte[][])localObject3;
              j = localObject3.length;
              localObject5 = new byte[j][];
              localzzsr.zzbur = localObject5;
              j = 0;
              localObject4 = null;
              for (;;)
              {
                i = localObject3.length;
                if (j >= i) {
                  break;
                }
                localObject1 = localObject3[j];
                localObject1 = ((byte[])localObject1).clone();
                localObject1 = (byte[])localObject1;
                localObject5[j] = localObject1;
                i = j + 1;
                j = i;
              }
            }
            localObject3 = this.zzbur;
            bool = localObject3 instanceof boolean[];
            if (bool)
            {
              localObject3 = this.zzbur;
              localObject3 = (boolean[])localObject3;
              localObject3 = (boolean[])localObject3;
              localObject3 = ((boolean[])localObject3).clone();
              localzzsr.zzbur = localObject3;
            }
            else
            {
              localObject3 = this.zzbur;
              bool = localObject3 instanceof int[];
              if (bool)
              {
                localObject3 = this.zzbur;
                localObject3 = (int[])localObject3;
                localObject3 = (int[])localObject3;
                localObject3 = ((int[])localObject3).clone();
                localzzsr.zzbur = localObject3;
              }
              else
              {
                localObject3 = this.zzbur;
                bool = localObject3 instanceof long[];
                if (bool)
                {
                  localObject3 = this.zzbur;
                  localObject3 = (long[])localObject3;
                  localObject3 = (long[])localObject3;
                  localObject3 = ((long[])localObject3).clone();
                  localzzsr.zzbur = localObject3;
                }
                else
                {
                  localObject3 = this.zzbur;
                  bool = localObject3 instanceof float[];
                  if (bool)
                  {
                    localObject3 = this.zzbur;
                    localObject3 = (float[])localObject3;
                    localObject3 = (float[])localObject3;
                    localObject3 = ((float[])localObject3).clone();
                    localzzsr.zzbur = localObject3;
                  }
                  else
                  {
                    localObject3 = this.zzbur;
                    bool = localObject3 instanceof double[];
                    if (!bool) {
                      break;
                    }
                    localObject3 = this.zzbur;
                    localObject3 = (double[])localObject3;
                    localObject3 = (double[])localObject3;
                    localObject3 = ((double[])localObject3).clone();
                    localzzsr.zzbur = localObject3;
                  }
                }
              }
            }
          }
        }
      }
      localObject3 = this.zzbur;
      bool = localObject3 instanceof zzsu[];
    } while (!bool);
    Object localObject3 = this.zzbur;
    localObject3 = (zzsu[])localObject3;
    localObject3 = (zzsu[])localObject3;
    int j = localObject3.length;
    Object localObject4 = new zzsu[j];
    localzzsr.zzbur = localObject4;
    for (;;)
    {
      int k = localObject3.length;
      if (i >= k) {
        break;
      }
      localObject5 = localObject3[i];
      localObject5 = ((zzsu)localObject5).clone();
      localObject4[i] = localObject5;
      i += 1;
    }
  }
  
  void zza(zzsw paramzzsw)
  {
    this.zzbus.add(paramzzsw);
  }
  
  Object zzb(zzsp paramzzsp)
  {
    Object localObject = this.zzbur;
    if (localObject != null)
    {
      localObject = this.zzbuq;
      if (localObject != paramzzsp)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Tried to getExtension with a differernt Extension.");
        throw ((Throwable)localObject);
      }
    }
    else
    {
      this.zzbuq = paramzzsp;
      localObject = this.zzbus;
      localObject = paramzzsp.zzJ((List)localObject);
      this.zzbur = localObject;
      localObject = null;
      this.zzbus = null;
    }
    return this.zzbur;
  }
  
  int zzz()
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = this.zzbur;
    if (localObject2 != null)
    {
      localObject1 = this.zzbuq;
      localObject2 = this.zzbur;
      j = ((zzsp)localObject1).zzY(localObject2);
      return j;
    }
    Iterator localIterator = this.zzbus.iterator();
    int j = 0;
    localObject2 = null;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzsw)localIterator.next();
      int i = ((zzsw)localObject1).zzz() + j;
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */