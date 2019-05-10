package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import org.json.JSONException;
import org.json.JSONObject;

public class SignInAccount
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  private String zzWP;
  private String zzWQ;
  private Uri zzWR;
  private String zzWk;
  private String zzXj;
  private GoogleSignInAccount zzXm;
  private String zzXn;
  private String zzrG;
  
  static
  {
    zze localzze = new com/google/android/gms/auth/api/signin/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  SignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, GoogleSignInAccount paramGoogleSignInAccount, String paramString5, String paramString6)
  {
    this.versionCode = paramInt;
    String str = zzx.zzh(paramString3, "Email cannot be empty.");
    this.zzWP = str;
    this.zzWQ = paramString4;
    this.zzWR = paramUri;
    this.zzXj = paramString1;
    this.zzWk = paramString2;
    this.zzXm = paramGoogleSignInAccount;
    str = zzx.zzcM(paramString5);
    this.zzrG = str;
    this.zzXn = paramString6;
  }
  
  public static SignInAccount zza(zzd paramzzd, String paramString1, String paramString2, String paramString3, Uri paramUri, String paramString4, String paramString5)
  {
    String str = null;
    if (paramzzd != null) {
      str = paramzzd.zzmT();
    }
    SignInAccount localSignInAccount = new com/google/android/gms/auth/api/signin/SignInAccount;
    localSignInAccount.<init>(2, str, paramString1, paramString2, paramString3, paramUri, null, paramString4, paramString5);
    return localSignInAccount;
  }
  
  public static SignInAccount zzbM(String paramString)
  {
    Object localObject1 = null;
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1) {
      return (SignInAccount)localObject1;
    }
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramString);
    Object localObject2 = localJSONObject.optString("photoUrl", null);
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool2) {}
    for (Uri localUri = Uri.parse((String)localObject2);; localUri = null)
    {
      localObject2 = zzd.zzbL(localJSONObject.optString("providerId", null));
      Object localObject3 = localJSONObject.optString("tokenId", null);
      String str1 = localJSONObject.getString("email");
      localObject1 = localJSONObject.optString("displayName", null);
      String str2 = localJSONObject.getString("localId");
      String str3 = localJSONObject.optString("refreshToken");
      localObject2 = zza((zzd)localObject2, (String)localObject3, str1, (String)localObject1, localUri, str2, str3);
      localObject3 = GoogleSignInAccount.zzbH(localJSONObject.optString("googleSignInAccount"));
      localObject1 = ((SignInAccount)localObject2).zza((GoogleSignInAccount)localObject3);
      break;
    }
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "email";
    try
    {
      Object localObject2 = getEmail();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = this.zzWQ;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "displayName";
        localObject2 = this.zzWQ;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzWR;
      if (localObject1 != null)
      {
        localObject1 = "photoUrl";
        localObject2 = this.zzWR;
        localObject2 = ((Uri)localObject2).toString();
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzXj;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "providerId";
        localObject2 = this.zzXj;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzWk;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "tokenId";
        localObject2 = this.zzWk;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzXm;
      if (localObject1 != null)
      {
        localObject1 = "googleSignInAccount";
        localObject2 = this.zzXm;
        localObject2 = ((GoogleSignInAccount)localObject2).zzmI();
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzXn;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "refreshToken";
        localObject2 = this.zzXn;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = "localId";
      localObject2 = getUserId();
      localJSONObject.put((String)localObject1, localObject2);
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
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public String getEmail()
  {
    return this.zzWP;
  }
  
  public String getIdToken()
  {
    return this.zzWk;
  }
  
  public Uri getPhotoUrl()
  {
    return this.zzWR;
  }
  
  public String getUserId()
  {
    return this.zzrG;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public SignInAccount zza(GoogleSignInAccount paramGoogleSignInAccount)
  {
    this.zzXm = paramGoogleSignInAccount;
    return this;
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  String zzmT()
  {
    return this.zzXj;
  }
  
  public zzd zzmU()
  {
    return zzd.zzbL(this.zzXj);
  }
  
  public GoogleSignInAccount zzmV()
  {
    return this.zzXm;
  }
  
  public String zzmW()
  {
    return this.zzXn;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\SignInAccount.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */