package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class zzq
  extends zzk
{
  public zzq(String paramString, int paramInt)
  {
    super(paramString, localCollection, localList, paramInt);
  }
  
  private static String zzB(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return paramString1 + "." + paramString2;
  }
  
  private String zzdf(String paramString)
  {
    return zzB(getName(), paramString);
  }
  
  private static Collection zzdg(String paramString)
  {
    String[] arrayOfString = new String[5];
    String str = zzB(paramString, "permissionId");
    arrayOfString[0] = str;
    str = zzB(paramString, "displayName");
    arrayOfString[1] = str;
    str = zzB(paramString, "picture");
    arrayOfString[2] = str;
    str = zzB(paramString, "isAuthenticatedUser");
    arrayOfString[3] = str;
    str = zzB(paramString, "emailAddress");
    arrayOfString[4] = str;
    return Arrays.asList(arrayOfString);
  }
  
  protected boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    String str = zzdf("permissionId");
    boolean bool = paramDataHolder.zzcz(str);
    if (bool)
    {
      str = zzdf("permissionId");
      bool = paramDataHolder.zzi(str, paramInt1, paramInt2);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  protected UserMetadata zzj(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Object localObject = zzdf("permissionId");
    String str1 = paramDataHolder.zzd((String)localObject, paramInt1, paramInt2);
    boolean bool1;
    if (str1 != null)
    {
      localObject = zzdf("displayName");
      String str2 = paramDataHolder.zzd((String)localObject, paramInt1, paramInt2);
      localObject = zzdf("picture");
      String str3 = paramDataHolder.zzd((String)localObject, paramInt1, paramInt2);
      localObject = zzdf("isAuthenticatedUser");
      bool1 = paramDataHolder.zze((String)localObject, paramInt1, paramInt2);
      Boolean localBoolean = Boolean.valueOf(bool1);
      localObject = zzdf("emailAddress");
      String str4 = paramDataHolder.zzd((String)localObject, paramInt1, paramInt2);
      localObject = new com/google/android/gms/drive/UserMetadata;
      boolean bool2 = localBoolean.booleanValue();
      ((UserMetadata)localObject).<init>(str1, str2, str3, bool2, str4);
    }
    for (;;)
    {
      return (UserMetadata)localObject;
      bool1 = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */