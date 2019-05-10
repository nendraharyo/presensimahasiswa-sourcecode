package com.google.android.gms.analytics.internal;

public enum zzo
{
  static
  {
    int i = 1;
    Object localObject = new com/google/android/gms/analytics/internal/zzo;
    ((zzo)localObject).<init>("NONE", 0);
    zzRu = (zzo)localObject;
    localObject = new com/google/android/gms/analytics/internal/zzo;
    ((zzo)localObject).<init>("GZIP", i);
    zzRv = (zzo)localObject;
    localObject = new zzo[2];
    zzo localzzo = zzRu;
    localObject[0] = localzzo;
    localzzo = zzRv;
    localObject[i] = localzzo;
    zzRw = (zzo[])localObject;
  }
  
  public static zzo zzbn(String paramString)
  {
    Object localObject = "GZIP";
    boolean bool = ((String)localObject).equalsIgnoreCase(paramString);
    if (bool) {}
    for (localObject = zzRv;; localObject = zzRu) {
      return (zzo)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */