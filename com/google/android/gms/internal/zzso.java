package com.google.android.gms.internal;

public abstract class zzso
  extends zzsu
{
  protected zzsq zzbuj;
  
  public void writeTo(zzsn paramzzsn)
  {
    zzsq localzzsq = this.zzbuj;
    if (localzzsq == null) {
      return;
    }
    int i = 0;
    localzzsq = null;
    for (;;)
    {
      Object localObject = this.zzbuj;
      int j = ((zzsq)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = this.zzbuj.zzmG(i);
      ((zzsr)localObject).writeTo(paramzzsn);
      i += 1;
    }
  }
  
  public zzso zzJp()
  {
    zzso localzzso = (zzso)super.clone();
    zzss.zza(this, localzzso);
    return localzzso;
  }
  
  public final Object zza(zzsp paramzzsp)
  {
    Object localObject1 = null;
    Object localObject2 = this.zzbuj;
    if (localObject2 == null) {}
    for (;;)
    {
      return localObject1;
      localObject2 = this.zzbuj;
      int i = zzsx.zzmJ(paramzzsp.tag);
      localObject2 = ((zzsq)localObject2).zzmF(i);
      if (localObject2 != null) {
        localObject1 = ((zzsr)localObject2).zzb(paramzzsp);
      }
    }
  }
  
  protected final boolean zza(zzsm paramzzsm, int paramInt)
  {
    int i = paramzzsm.getPosition();
    boolean bool = paramzzsm.zzmo(paramInt);
    if (!bool)
    {
      i = 0;
      localObject = null;
      return i;
    }
    int k = zzsx.zzmJ(paramInt);
    int m = paramzzsm.getPosition() - i;
    Object localObject = paramzzsm.zzz(i, m);
    zzsw localzzsw = new com/google/android/gms/internal/zzsw;
    localzzsw.<init>(paramInt, (byte[])localObject);
    int j = 0;
    localObject = null;
    zzsq localzzsq = this.zzbuj;
    if (localzzsq == null)
    {
      localzzsq = new com/google/android/gms/internal/zzsq;
      localzzsq.<init>();
      this.zzbuj = localzzsq;
    }
    for (;;)
    {
      if (localObject == null)
      {
        localObject = new com/google/android/gms/internal/zzsr;
        ((zzsr)localObject).<init>();
        localzzsq = this.zzbuj;
        localzzsq.zza(k, (zzsr)localObject);
      }
      ((zzsr)localObject).zza(localzzsw);
      j = 1;
      break;
      localObject = this.zzbuj.zzmF(k);
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    zzsq localzzsq = this.zzbuj;
    if (localzzsq != null)
    {
      j = 0;
      localzzsq = null;
      for (;;)
      {
        Object localObject = this.zzbuj;
        int k = ((zzsq)localObject).size();
        if (i >= k) {
          break;
        }
        localObject = this.zzbuj.zzmG(i);
        k = ((zzsr)localObject).zzz();
        j += k;
        i += 1;
      }
    }
    int j = 0;
    localzzsq = null;
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzso.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */