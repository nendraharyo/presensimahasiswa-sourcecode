package com.google.android.gms.games.internal.constants;

public final class TimeSpan
{
  private TimeSpan()
  {
    AssertionError localAssertionError = new java/lang/AssertionError;
    localAssertionError.<init>("Uninstantiable");
    throw localAssertionError;
  }
  
  public static String zzgw(int paramInt)
  {
    Object localObject1;
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unknown time span " + paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      localObject1 = "DAILY";
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = "WEEKLY";
      continue;
      localObject1 = "ALL_TIME";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\constants\TimeSpan.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */