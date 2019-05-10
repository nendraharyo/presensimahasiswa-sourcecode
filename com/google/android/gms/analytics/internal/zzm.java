package com.google.android.gms.analytics.internal;

public enum zzm
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/google/android/gms/analytics/internal/zzm;
    ((zzm)localObject).<init>("NONE", 0);
    zzRk = (zzm)localObject;
    localObject = new com/google/android/gms/analytics/internal/zzm;
    ((zzm)localObject).<init>("BATCH_BY_SESSION", m);
    zzRl = (zzm)localObject;
    localObject = new com/google/android/gms/analytics/internal/zzm;
    ((zzm)localObject).<init>("BATCH_BY_TIME", k);
    zzRm = (zzm)localObject;
    localObject = new com/google/android/gms/analytics/internal/zzm;
    ((zzm)localObject).<init>("BATCH_BY_BRUTE_FORCE", j);
    zzRn = (zzm)localObject;
    localObject = new com/google/android/gms/analytics/internal/zzm;
    ((zzm)localObject).<init>("BATCH_BY_COUNT", i);
    zzRo = (zzm)localObject;
    localObject = new com/google/android/gms/analytics/internal/zzm;
    ((zzm)localObject).<init>("BATCH_BY_SIZE", 5);
    zzRp = (zzm)localObject;
    localObject = new zzm[6];
    zzm localzzm1 = zzRk;
    localObject[0] = localzzm1;
    localzzm1 = zzRl;
    localObject[m] = localzzm1;
    localzzm1 = zzRm;
    localObject[k] = localzzm1;
    localzzm1 = zzRn;
    localObject[j] = localzzm1;
    localzzm1 = zzRo;
    localObject[i] = localzzm1;
    zzm localzzm2 = zzRp;
    localObject[5] = localzzm2;
    zzRq = (zzm[])localObject;
  }
  
  public static zzm zzbm(String paramString)
  {
    Object localObject = "BATCH_BY_SESSION";
    boolean bool = ((String)localObject).equalsIgnoreCase(paramString);
    if (bool) {
      localObject = zzRl;
    }
    for (;;)
    {
      return (zzm)localObject;
      localObject = "BATCH_BY_TIME";
      bool = ((String)localObject).equalsIgnoreCase(paramString);
      if (bool)
      {
        localObject = zzRm;
      }
      else
      {
        localObject = "BATCH_BY_BRUTE_FORCE";
        bool = ((String)localObject).equalsIgnoreCase(paramString);
        if (bool)
        {
          localObject = zzRn;
        }
        else
        {
          localObject = "BATCH_BY_COUNT";
          bool = ((String)localObject).equalsIgnoreCase(paramString);
          if (bool)
          {
            localObject = zzRo;
          }
          else
          {
            localObject = "BATCH_BY_SIZE";
            bool = ((String)localObject).equalsIgnoreCase(paramString);
            if (bool) {
              localObject = zzRp;
            } else {
              localObject = zzRk;
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */