package com.google.android.gms.internal;

class zzeg$2
  implements zzji.zzc
{
  zzeg$2(zzeg paramzzeg, zzeg.zze paramzze) {}
  
  public void zza(zzed paramzzed)
  {
    Object localObject1 = this.zzBe;
    synchronized (zzeg.zzc((zzeg)localObject1))
    {
      localObject1 = this.zzBe;
      Object localObject4 = null;
      zzeg.zza((zzeg)localObject1, 0);
      localObject1 = this.zzBe;
      localObject1 = zzeg.zzg((zzeg)localObject1);
      if (localObject1 != null)
      {
        localObject1 = this.zzBl;
        localObject4 = this.zzBe;
        localObject4 = zzeg.zzg((zzeg)localObject4);
        if (localObject1 != localObject4)
        {
          localObject1 = "New JS engine is loaded, marking previous one as destroyable.";
          zzin.v((String)localObject1);
          localObject1 = this.zzBe;
          localObject1 = zzeg.zzg((zzeg)localObject1);
          ((zzeg.zze)localObject1).zzeu();
        }
      }
      localObject1 = this.zzBe;
      localObject4 = this.zzBl;
      zzeg.zza((zzeg)localObject1, (zzeg.zze)localObject4);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */