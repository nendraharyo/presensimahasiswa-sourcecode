package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.List;

public class Credential
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
  private final String mName;
  final int mVersionCode;
  private final Uri zzVV;
  private final List zzVW;
  private final String zzVX;
  private final String zzVY;
  private final String zzVZ;
  private final String zzWa;
  private final String zzyv;
  
  static
  {
    zza localzza = new com/google/android/gms/auth/api/credentials/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  Credential(int paramInt, String paramString1, String paramString2, Uri paramUri, List paramList, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.mVersionCode = paramInt;
    Object localObject = ((String)zzx.zzb(paramString1, "credential identifier cannot be null")).trim();
    String str = "credential identifier cannot be empty";
    zzx.zzh((String)localObject, str);
    this.zzyv = ((String)localObject);
    if (paramString2 != null)
    {
      localObject = paramString2.trim();
      bool1 = TextUtils.isEmpty((CharSequence)localObject);
      if (bool1) {
        paramString2 = null;
      }
    }
    this.mName = paramString2;
    this.zzVV = paramUri;
    if (paramList == null) {}
    for (localObject = Collections.emptyList();; localObject = Collections.unmodifiableList(paramList))
    {
      this.zzVW = ((List)localObject);
      this.zzVX = paramString3;
      if (paramString3 == null) {
        break;
      }
      bool1 = paramString3.isEmpty();
      if (!bool1) {
        break;
      }
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("password cannot be empty");
      throw ((Throwable)localObject);
    }
    boolean bool1 = TextUtils.isEmpty(paramString4);
    if (!bool1)
    {
      localObject = Uri.parse(paramString4).getScheme();
      str = "http";
      boolean bool2 = str.equalsIgnoreCase((String)localObject);
      if (!bool2)
      {
        str = "https";
        bool1 = str.equalsIgnoreCase((String)localObject);
        if (!bool1) {
          break label275;
        }
      }
      bool1 = true;
    }
    for (;;)
    {
      zzx.zzac(bool1);
      this.zzVY = paramString4;
      this.zzVZ = paramString5;
      this.zzWa = paramString6;
      localObject = this.zzVX;
      bool1 = TextUtils.isEmpty((CharSequence)localObject);
      if (bool1) {
        break;
      }
      localObject = this.zzVY;
      bool1 = TextUtils.isEmpty((CharSequence)localObject);
      if (bool1) {
        break;
      }
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("password and accountType cannot both be set");
      throw ((Throwable)localObject);
      label275:
      bool1 = false;
      localObject = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Credential;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (Credential)paramObject;
        Object localObject1 = this.zzyv;
        Object localObject2 = ((Credential)paramObject).zzyv;
        bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (bool2)
        {
          localObject1 = this.mName;
          localObject2 = ((Credential)paramObject).mName;
          bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
          if (bool2)
          {
            localObject1 = this.zzVV;
            localObject2 = ((Credential)paramObject).zzVV;
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.zzVX;
              localObject2 = ((Credential)paramObject).zzVX;
              bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
              if (bool2)
              {
                localObject1 = this.zzVY;
                localObject2 = ((Credential)paramObject).zzVY;
                bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
                if (bool2)
                {
                  localObject1 = this.zzVZ;
                  localObject2 = ((Credential)paramObject).zzVZ;
                  bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
                  if (bool2) {
                    continue;
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public String getAccountType()
  {
    return this.zzVY;
  }
  
  public String getGeneratedPassword()
  {
    return this.zzVZ;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public List getIdTokens()
  {
    return this.zzVW;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getPassword()
  {
    return this.zzVX;
  }
  
  public Uri getProfilePictureUri()
  {
    return this.zzVV;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = this.zzyv;
    arrayOfObject[0] = localObject;
    localObject = this.mName;
    arrayOfObject[1] = localObject;
    localObject = this.zzVV;
    arrayOfObject[2] = localObject;
    localObject = this.zzVX;
    arrayOfObject[3] = localObject;
    localObject = this.zzVY;
    arrayOfObject[4] = localObject;
    localObject = this.zzVZ;
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public String zzmx()
  {
    return this.zzWa;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\Credential.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */