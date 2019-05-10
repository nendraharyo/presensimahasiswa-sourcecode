package com.google.android.gms.games.internal.constants;

public final class LeaderboardCollection
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
      localObject2 = "Unknown leaderboard collection: " + paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      localObject1 = "PUBLIC";
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = "SOCIAL";
      continue;
      localObject1 = "SOCIAL_1P";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\constants\LeaderboardCollection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */