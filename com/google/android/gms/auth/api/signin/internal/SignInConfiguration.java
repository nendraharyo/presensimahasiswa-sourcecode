package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.EmailSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import org.json.JSONException;
import org.json.JSONObject;

public final class SignInConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  private final String zzXL;
  private EmailSignInOptions zzXM;
  private GoogleSignInOptions zzXN;
  private String zzXO;
  private String zzXd;
  
  static
  {
    zzp localzzp = new com/google/android/gms/auth/api/signin/internal/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  SignInConfiguration(int paramInt, String paramString1, String paramString2, EmailSignInOptions paramEmailSignInOptions, GoogleSignInOptions paramGoogleSignInOptions, String paramString3)
  {
    this.versionCode = paramInt;
    String str = zzx.zzcM(paramString1);
    this.zzXL = str;
    this.zzXd = paramString2;
    this.zzXM = paramEmailSignInOptions;
    this.zzXN = paramGoogleSignInOptions;
    this.zzXO = paramString3;
  }
  
  public SignInConfiguration(String paramString)
  {
    this(2, paramString, null, null, null, null);
  }
  
  private JSONObject zzmJ()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "consumerPackageName";
    try
    {
      Object localObject2 = this.zzXL;
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = this.zzXd;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "serverClientId";
        localObject2 = this.zzXd;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzXM;
      if (localObject1 != null)
      {
        localObject1 = "emailSignInOptions";
        localObject2 = this.zzXM;
        localObject2 = ((EmailSignInOptions)localObject2).zzmI();
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzXN;
      if (localObject1 != null)
      {
        localObject1 = "googleSignInOptions";
        localObject2 = this.zzXN;
        localObject2 = ((GoogleSignInOptions)localObject2).zzmI();
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = this.zzXO;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = "apiKey";
        localObject2 = this.zzXO;
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
        paramObject = (SignInConfiguration)paramObject;
        Object localObject1 = this.zzXL;
        Object localObject2 = ((SignInConfiguration)paramObject).zznk();
        boolean bool2 = ((String)localObject1).equals(localObject2);
        if (!bool2) {
          continue;
        }
        localObject1 = this.zzXd;
        bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool2)
        {
          localObject1 = ((SignInConfiguration)paramObject).zzmR();
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            continue;
          }
          label69:
          localObject1 = this.zzXO;
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            break label169;
          }
          localObject1 = ((SignInConfiguration)paramObject).zznn();
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            continue;
          }
          label101:
          localObject1 = this.zzXM;
          if (localObject1 != null) {
            break label196;
          }
          localObject1 = ((SignInConfiguration)paramObject).zznl();
          if (localObject1 != null) {
            continue;
          }
          label119:
          localObject1 = this.zzXN;
          if (localObject1 != null) {
            break label223;
          }
          localObject1 = ((SignInConfiguration)paramObject).zznm();
          if (localObject1 != null) {
            continue;
          }
        }
        for (;;)
        {
          bool1 = true;
          break;
          localObject1 = this.zzXd;
          localObject2 = ((SignInConfiguration)paramObject).zzmR();
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
          break label69;
          label169:
          localObject1 = this.zzXO;
          localObject2 = ((SignInConfiguration)paramObject).zznn();
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
          break label101;
          label196:
          localObject1 = this.zzXM;
          localObject2 = ((SignInConfiguration)paramObject).zznl();
          bool2 = ((EmailSignInOptions)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
          break label119;
          label223:
          localObject1 = this.zzXN;
          localObject2 = ((SignInConfiguration)paramObject).zznm();
          bool2 = ((GoogleSignInOptions)localObject1).equals(localObject2);
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
    Object localObject = this.zzXL;
    localzze = localzze.zzp(localObject);
    localObject = this.zzXd;
    localzze = localzze.zzp(localObject);
    localObject = this.zzXO;
    localzze = localzze.zzp(localObject);
    localObject = this.zzXM;
    localzze = localzze.zzp(localObject);
    localObject = this.zzXN;
    return localzze.zzp(localObject).zzne();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
  
  public SignInConfiguration zzj(GoogleSignInOptions paramGoogleSignInOptions)
  {
    GoogleSignInOptions localGoogleSignInOptions = (GoogleSignInOptions)zzx.zzb(paramGoogleSignInOptions, "GoogleSignInOptions cannot be null.");
    this.zzXN = localGoogleSignInOptions;
    return this;
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  public String zzmR()
  {
    return this.zzXd;
  }
  
  public String zznk()
  {
    return this.zzXL;
  }
  
  public EmailSignInOptions zznl()
  {
    return this.zzXM;
  }
  
  public GoogleSignInOptions zznm()
  {
    return this.zzXN;
  }
  
  public String zznn()
  {
    return this.zzXO;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\SignInConfiguration.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */