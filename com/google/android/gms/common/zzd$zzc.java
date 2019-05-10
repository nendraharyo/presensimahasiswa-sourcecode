package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzd$zzc
  extends zzd.zza
{
  private static final WeakReference zzafJ;
  private WeakReference zzafI;
  
  static
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(null);
    zzafJ = localWeakReference;
  }
  
  zzd$zzc(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
    WeakReference localWeakReference = zzafJ;
    this.zzafI = localWeakReference;
  }
  
  byte[] getBytes()
  {
    try
    {
      Object localObject1 = this.zzafI;
      localObject1 = ((WeakReference)localObject1).get();
      localObject1 = (byte[])localObject1;
      if (localObject1 == null)
      {
        localObject1 = zzoL();
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(localObject1);
        this.zzafI = localWeakReference;
      }
      return (byte[])localObject1;
    }
    finally {}
  }
  
  protected abstract byte[] zzoL();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\zzd$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */