package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.signin.internal.zze;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class EmailSignInOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  private final Uri zzWL;
  private String zzWM;
  private Uri zzWN;
  
  static
  {
    zza localzza = new com/google/android/gms/auth/api/signin/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  EmailSignInOptions(int paramInt, Uri paramUri1, String paramString, Uri paramUri2)
  {
    zzx.zzb(paramUri1, "Server widget url cannot be null in order to use email/password sign in.");
    zzx.zzh(paramUri1.toString(), "Server widget url cannot be null in order to use email/password sign in.");
    Pattern localPattern = Patterns.WEB_URL;
    String str = paramUri1.toString();
    zzx.zzb(localPattern.matcher(str).matches(), "Invalid server widget url");
    this.versionCode = paramInt;
    this.zzWL = paramUri1;
    this.zzWM = paramString;
    this.zzWN = paramUri2;
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "serverWidgetUrl";
    try
    {
      Object localObject2 = this.zzWL;
      localObject2 = ((Uri)localObject2).toString();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = this.zzWM;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "modeQueryName";
        localObject2 = this.zzWM;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzWN;
      if (localObject1 != null)
      {
        localObject1 = "tosUrl";
        localObject2 = this.zzWN;
        localObject2 = ((Uri)localObject2).toString();
        localJSONObject.put((String)localObject1, localObject2);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localJSONException);
      throw ((Throwable)localObject1);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject == null) {}
    for (;;)
    {
      return bool1;
      try
      {
        paramObject = (EmailSignInOptions)paramObject;
        Object localObject1 = this.zzWL;
        Object localObject2 = ((EmailSignInOptions)paramObject).zzmF();
        boolean bool2 = ((Uri)localObject1).equals(localObject2);
        if (!bool2) {
          continue;
        }
        localObject1 = this.zzWN;
        if (localObject1 == null)
        {
          localObject1 = ((EmailSignInOptions)paramObject).zzmG();
          if (localObject1 != null) {
            continue;
          }
          label55:
          localObject1 = this.zzWM;
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            break label119;
          }
          localObject1 = ((EmailSignInOptions)paramObject).zzmH();
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            continue;
          }
        }
        for (;;)
        {
          bool1 = true;
          break;
          localObject1 = this.zzWN;
          localObject2 = ((EmailSignInOptions)paramObject).zzmG();
          bool2 = ((Uri)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
          break label55;
          label119:
          localObject1 = this.zzWM;
          localObject2 = ((EmailSignInOptions)paramObject).zzmH();
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
        }
      }
      catch (ClassCastException localClassCastException) {}
    }
  }
  
  public int hashCode()
  {
    zze localzze = new com/google/android/gms/auth/api/signin/internal/zze;
    localzze.<init>();
    Object localObject = this.zzWL;
    localzze = localzze.zzp(localObject);
    localObject = this.zzWN;
    localzze = localzze.zzp(localObject);
    localObject = this.zzWM;
    return localzze.zzp(localObject).zzne();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Uri zzmF()
  {
    return this.zzWL;
  }
  
  public Uri zzmG()
  {
    return this.zzWN;
  }
  
  public String zzmH()
  {
    return this.zzWM;
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\EmailSignInOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */