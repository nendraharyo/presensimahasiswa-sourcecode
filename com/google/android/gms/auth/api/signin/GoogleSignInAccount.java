package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static zzmq zzWO;
  private static Comparator zzWV;
  final int versionCode;
  List zzVs;
  private String zzWP;
  private String zzWQ;
  private Uri zzWR;
  private String zzWS;
  private long zzWT;
  private String zzWU;
  private String zzWk;
  private String zzyv;
  
  static
  {
    Object localObject = new com/google/android/gms/auth/api/signin/zzb;
    ((zzb)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    zzWO = zzmt.zzsc();
    localObject = new com/google/android/gms/auth/api/signin/GoogleSignInAccount$1;
    ((GoogleSignInAccount.1)localObject).<init>();
    zzWV = (Comparator)localObject;
  }
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List paramList)
  {
    this.versionCode = paramInt;
    this.zzyv = paramString1;
    this.zzWk = paramString2;
    this.zzWP = paramString3;
    this.zzWQ = paramString4;
    this.zzWR = paramUri;
    this.zzWS = paramString5;
    this.zzWT = paramLong;
    this.zzWU = paramString6;
    this.zzVs = paramList;
  }
  
  public static GoogleSignInAccount zza(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, Long paramLong, String paramString5, Set paramSet)
  {
    if (paramLong == null)
    {
      localObject1 = zzWO;
      long l1 = ((zzmq)localObject1).currentTimeMillis();
      long l2 = 1000L;
      l1 /= l2;
      paramLong = Long.valueOf(l1);
    }
    Object localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInAccount;
    long l3 = paramLong.longValue();
    String str = zzx.zzcM(paramString5);
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject2 = (Collection)zzx.zzz(paramSet);
    localArrayList.<init>((Collection)localObject2);
    localObject2 = paramString1;
    ((GoogleSignInAccount)localObject1).<init>(2, paramString1, paramString2, paramString3, paramString4, paramUri, null, l3, str, localArrayList);
    return (GoogleSignInAccount)localObject1;
  }
  
  public static GoogleSignInAccount zzbH(String paramString)
  {
    GoogleSignInAccount localGoogleSignInAccount = null;
    int i = TextUtils.isEmpty(paramString);
    if (i != 0) {
      return localGoogleSignInAccount;
    }
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramString);
    Object localObject1 = localJSONObject.optString("photoUrl", null);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool) {}
    for (Uri localUri = Uri.parse((String)localObject1);; localUri = null)
    {
      long l = Long.parseLong(localJSONObject.getString("expirationTime"));
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      Object localObject2 = localJSONObject.getJSONArray("grantedScopes");
      int k = ((JSONArray)localObject2).length();
      i = 0;
      localObject1 = null;
      while (i < k)
      {
        localObject3 = new com/google/android/gms/common/api/Scope;
        localObject4 = ((JSONArray)localObject2).getString(i);
        ((Scope)localObject3).<init>((String)localObject4);
        localHashSet.add(localObject3);
        int j;
        i += 1;
      }
      localObject1 = localJSONObject.optString("id");
      localObject2 = localJSONObject.optString("tokenId", null);
      String str1 = localJSONObject.optString("email", null);
      Object localObject3 = localJSONObject.optString("displayName", null);
      Object localObject4 = Long.valueOf(l);
      String str2 = localJSONObject.getString("obfuscatedIdentifier");
      localObject1 = zza((String)localObject1, (String)localObject2, str1, (String)localObject3, localUri, (Long)localObject4, str2, localHashSet);
      localObject2 = localJSONObject.optString("serverAuthCode", null);
      localGoogleSignInAccount = ((GoogleSignInAccount)localObject1).zzbI((String)localObject2);
      break;
    }
  }
  
  private JSONObject zzmJ()
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    Object localObject3;
    try
    {
      Object localObject2 = getId();
      if (localObject2 != null)
      {
        localObject2 = "id";
        localObject3 = getId();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = getIdToken();
      if (localObject2 != null)
      {
        localObject2 = "tokenId";
        localObject3 = getIdToken();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = getEmail();
      if (localObject2 != null)
      {
        localObject2 = "email";
        localObject3 = getEmail();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = getDisplayName();
      if (localObject2 != null)
      {
        localObject2 = "displayName";
        localObject3 = getDisplayName();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = getPhotoUrl();
      if (localObject2 != null)
      {
        localObject2 = "photoUrl";
        localObject3 = getPhotoUrl();
        localObject3 = ((Uri)localObject3).toString();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = getServerAuthCode();
      if (localObject2 != null)
      {
        localObject2 = "serverAuthCode";
        localObject3 = getServerAuthCode();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = "expirationTime";
      long l = this.zzWT;
      ((JSONObject)localObject1).put((String)localObject2, l);
      localObject2 = "obfuscatedIdentifier";
      localObject3 = zzmL();
      ((JSONObject)localObject1).put((String)localObject2, localObject3);
      localObject3 = new org/json/JSONArray;
      ((JSONArray)localObject3).<init>();
      localObject2 = this.zzVs;
      Object localObject4 = zzWV;
      Collections.sort((List)localObject2, (Comparator)localObject4);
      localObject2 = this.zzVs;
      localObject4 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (Scope)localObject2;
        localObject2 = ((Scope)localObject2).zzpb();
        ((JSONArray)localObject3).put(localObject2);
      }
      str = "grantedScopes";
    }
    catch (JSONException localJSONException)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localJSONException);
      throw ((Throwable)localObject1);
    }
    String str;
    ((JSONObject)localObject1).put(str, localObject3);
    return (JSONObject)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof GoogleSignInAccount;
    String str1;
    if (!bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (GoogleSignInAccount)paramObject;
      str1 = ((GoogleSignInAccount)paramObject).zzmI();
      String str2 = zzmI();
      bool = str1.equals(str2);
    }
  }
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public String getEmail()
  {
    return this.zzWP;
  }
  
  public Set getGrantedScopes()
  {
    HashSet localHashSet = new java/util/HashSet;
    List localList = this.zzVs;
    localHashSet.<init>(localList);
    return localHashSet;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getIdToken()
  {
    return this.zzWk;
  }
  
  public Uri getPhotoUrl()
  {
    return this.zzWR;
  }
  
  public String getServerAuthCode()
  {
    return this.zzWS;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzb()
  {
    zzmq localzzmq = zzWO;
    long l1 = localzzmq.currentTimeMillis() / 1000L;
    long l2 = this.zzWT;
    long l3 = 300L;
    l2 -= l3;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzmq = null;
    }
  }
  
  public GoogleSignInAccount zzbI(String paramString)
  {
    this.zzWS = paramString;
    return this;
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  public long zzmK()
  {
    return this.zzWT;
  }
  
  public String zzmL()
  {
    return this.zzWU;
  }
  
  public String zzmM()
  {
    JSONObject localJSONObject = zzmJ();
    localJSONObject.remove("serverAuthCode");
    return localJSONObject.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\GoogleSignInAccount.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */