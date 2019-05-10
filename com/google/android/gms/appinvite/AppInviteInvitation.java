package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class AppInviteInvitation
{
  private static final String[] zzUK;
  
  static
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "jpg";
    arrayOfString[1] = "jpeg";
    arrayOfString[2] = "png";
    zzUK = arrayOfString;
  }
  
  public static String[] getInvitationIds(int paramInt, Intent paramIntent)
  {
    int i = -1;
    if (paramInt == i) {}
    for (String[] arrayOfString = paramIntent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS");; arrayOfString = null)
    {
      return arrayOfString;
      i = 0;
    }
  }
  
  private static Bundle zzJ(Map paramMap)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject = paramMap.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = (String)paramMap.get(localObject);
      localBundle.putString((String)localObject, str);
    }
    return localBundle;
  }
  
  private static boolean zzbE(String paramString)
  {
    boolean bool1 = false;
    int i = 0;
    for (;;)
    {
      Object localObject = zzUK;
      int j = localObject.length;
      if (i < j)
      {
        localObject = zzUK[i];
        boolean bool2 = ((String)localObject).equals(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appinvite\AppInviteInvitation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */