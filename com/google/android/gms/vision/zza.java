package com.google.android.gms.vision;

import android.util.SparseArray;

public class zza
{
  private static int zzbnl = 0;
  private static final Object zzqy;
  private SparseArray zzbnm;
  private SparseArray zzbnn;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  public zza()
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.zzbnm = localSparseArray;
    localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.zzbnn = localSparseArray;
  }
  
  public int zzkr(int paramInt)
  {
    synchronized (zzqy)
    {
      Object localObject2 = this.zzbnm;
      localObject2 = ((SparseArray)localObject2).get(paramInt);
      localObject2 = (Integer)localObject2;
      if (localObject2 != null)
      {
        i = ((Integer)localObject2).intValue();
        return i;
      }
      int i = zzbnl;
      int j = zzbnl + 1;
      zzbnl = j;
      SparseArray localSparseArray = this.zzbnm;
      Integer localInteger = Integer.valueOf(i);
      localSparseArray.append(paramInt, localInteger);
      localSparseArray = this.zzbnn;
      localInteger = Integer.valueOf(paramInt);
      localSparseArray.append(i, localInteger);
    }
  }
  
  public int zzks(int paramInt)
  {
    synchronized (zzqy)
    {
      Object localObject2 = this.zzbnn;
      localObject2 = ((SparseArray)localObject2).get(paramInt);
      localObject2 = (Integer)localObject2;
      int i = ((Integer)localObject2).intValue();
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */