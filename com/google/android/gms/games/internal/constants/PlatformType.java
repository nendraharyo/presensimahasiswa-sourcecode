package com.google.android.gms.games.internal.constants;

public final class PlatformType
{
  public static String zzgw(int paramInt)
  {
    Object localObject1;
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown platform type: " + paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      localObject1 = "ANDROID";
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = "IOS";
      continue;
      localObject1 = "WEB_APP";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\constants\PlatformType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */