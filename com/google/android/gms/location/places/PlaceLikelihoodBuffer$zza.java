package com.google.android.gms.location.places;

public class PlaceLikelihoodBuffer$zza
{
  static int zzhP(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid source: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceLikelihoodBuffer$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */