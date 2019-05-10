package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zze;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
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

public class GoogleSignInOptions
  implements Api.ApiOptions.Optional, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final GoogleSignInOptions DEFAULT_SIGN_IN;
  private static Comparator zzWV;
  public static final Scope zzWW;
  public static final Scope zzWX;
  public static final Scope zzWY;
  final int versionCode;
  private Account zzTI;
  private final ArrayList zzWZ;
  private boolean zzXa;
  private final boolean zzXb;
  private final boolean zzXc;
  private String zzXd;
  private String zzXe;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("profile");
    zzWW = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("email");
    zzWX = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("openid");
    zzWY = (Scope)localObject;
    localObject = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;
    ((GoogleSignInOptions.Builder)localObject).<init>();
    DEFAULT_SIGN_IN = ((GoogleSignInOptions.Builder)localObject).requestId().requestProfile().build();
    localObject = new com/google/android/gms/auth/api/signin/zzc;
    ((zzc)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$1;
    ((GoogleSignInOptions.1)localObject).<init>();
    zzWV = (Comparator)localObject;
  }
  
  GoogleSignInOptions(int paramInt, ArrayList paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this.versionCode = paramInt;
    this.zzWZ = paramArrayList;
    this.zzTI = paramAccount;
    this.zzXa = paramBoolean1;
    this.zzXb = paramBoolean2;
    this.zzXc = paramBoolean3;
    this.zzXd = paramString1;
    this.zzXe = paramString2;
  }
  
  private GoogleSignInOptions(Set paramSet, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this(2, localArrayList, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2);
  }
  
  public static GoogleSignInOptions zzbJ(String paramString)
  {
    Object localObject1 = null;
    int i = TextUtils.isEmpty(paramString);
    if (i != 0) {
      return (GoogleSignInOptions)localObject1;
    }
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramString);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject2 = localJSONObject.getJSONArray("scopes");
    int k = ((JSONArray)localObject2).length();
    i = 0;
    Object localObject3 = null;
    Object localObject4;
    String str1;
    while (i < k)
    {
      localObject4 = new com/google/android/gms/common/api/Scope;
      str1 = ((JSONArray)localObject2).getString(i);
      ((Scope)localObject4).<init>(str1);
      localHashSet.add(localObject4);
      int j;
      i += 1;
    }
    localObject3 = localJSONObject.optString("accountName", null);
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject3);
    String str2;
    if (!bool2)
    {
      localObject2 = new android/accounts/Account;
      str2 = "com.google";
      ((Account)localObject2).<init>((String)localObject3, str2);
    }
    for (;;)
    {
      localObject3 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions;
      str2 = "idTokenRequested";
      boolean bool1 = localJSONObject.getBoolean(str2);
      localObject4 = "serverAuthRequested";
      boolean bool3 = localJSONObject.getBoolean((String)localObject4);
      str1 = "forceCodeForRefreshToken";
      boolean bool4 = localJSONObject.getBoolean(str1);
      String str3 = localJSONObject.optString("serverClientId", null);
      String str4 = "hostedDomain";
      localObject1 = localJSONObject.optString(str4, null);
      ((GoogleSignInOptions)localObject3).<init>(localHashSet, (Account)localObject2, bool1, bool3, bool4, str3, (String)localObject1);
      localObject1 = localObject3;
      break;
      bool2 = false;
      localObject2 = null;
    }
  }
  
  private JSONObject zzmJ()
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    Object localObject2;
    try
    {
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      Object localObject3 = this.zzWZ;
      Object localObject5 = zzWV;
      Collections.sort((List)localObject3, (Comparator)localObject5);
      localObject3 = this.zzWZ;
      localObject5 = ((ArrayList)localObject3).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject5).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = ((Iterator)localObject5).next();
        localObject3 = (Scope)localObject3;
        localObject3 = ((Scope)localObject3).zzpb();
        ((JSONArray)localObject2).put(localObject3);
      }
      localObject4 = "scopes";
    }
    catch (JSONException localJSONException)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localJSONException);
      throw ((Throwable)localObject1);
    }
    ((JSONObject)localObject1).put((String)localObject4, localObject2);
    Object localObject4 = this.zzTI;
    if (localObject4 != null)
    {
      localObject4 = "accountName";
      localObject2 = this.zzTI;
      localObject2 = ((Account)localObject2).name;
      ((JSONObject)localObject1).put((String)localObject4, localObject2);
    }
    localObject4 = "idTokenRequested";
    boolean bool2 = this.zzXa;
    ((JSONObject)localObject1).put((String)localObject4, bool2);
    localObject4 = "forceCodeForRefreshToken";
    bool2 = this.zzXc;
    ((JSONObject)localObject1).put((String)localObject4, bool2);
    localObject4 = "serverAuthRequested";
    bool2 = this.zzXb;
    ((JSONObject)localObject1).put((String)localObject4, bool2);
    localObject4 = this.zzXd;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject4);
    if (!bool1)
    {
      localObject4 = "serverClientId";
      localObject2 = this.zzXd;
      ((JSONObject)localObject1).put((String)localObject4, localObject2);
    }
    localObject4 = this.zzXe;
    bool1 = TextUtils.isEmpty((CharSequence)localObject4);
    if (!bool1)
    {
      localObject4 = "hostedDomain";
      localObject2 = this.zzXe;
      ((JSONObject)localObject1).put((String)localObject4, localObject2);
    }
    return (JSONObject)localObject1;
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
        paramObject = (GoogleSignInOptions)paramObject;
        Object localObject1 = this.zzWZ;
        int i = ((ArrayList)localObject1).size();
        Object localObject2 = ((GoogleSignInOptions)paramObject).zzmN();
        int j = ((ArrayList)localObject2).size();
        if (i != j) {
          continue;
        }
        localObject1 = this.zzWZ;
        localObject2 = ((GoogleSignInOptions)paramObject).zzmN();
        boolean bool2 = ((ArrayList)localObject1).containsAll((Collection)localObject2);
        if (!bool2) {
          continue;
        }
        localObject1 = this.zzTI;
        if (localObject1 == null)
        {
          localObject1 = ((GoogleSignInOptions)paramObject).getAccount();
          if (localObject1 != null) {
            continue;
          }
          label86:
          localObject1 = this.zzXd;
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            break label207;
          }
          localObject1 = ((GoogleSignInOptions)paramObject).zzmR();
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            continue;
          }
        }
        for (;;)
        {
          bool2 = this.zzXc;
          boolean bool3 = ((GoogleSignInOptions)paramObject).zzmQ();
          if (bool2 != bool3) {
            break;
          }
          bool2 = this.zzXa;
          bool3 = ((GoogleSignInOptions)paramObject).zzmO();
          if (bool2 != bool3) {
            break;
          }
          bool2 = this.zzXb;
          bool3 = ((GoogleSignInOptions)paramObject).zzmP();
          if (bool2 != bool3) {
            break;
          }
          bool1 = true;
          break;
          localObject1 = this.zzTI;
          localObject2 = ((GoogleSignInOptions)paramObject).getAccount();
          bool2 = ((Account)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
          break label86;
          label207:
          localObject1 = this.zzXd;
          localObject2 = ((GoogleSignInOptions)paramObject).zzmR();
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
        }
      }
      catch (ClassCastException localClassCastException) {}
    }
  }
  
  public Account getAccount()
  {
    return this.zzTI;
  }
  
  public Scope[] getScopeArray()
  {
    ArrayList localArrayList = this.zzWZ;
    Scope[] arrayOfScope = new Scope[this.zzWZ.size()];
    return (Scope[])localArrayList.toArray(arrayOfScope);
  }
  
  public int hashCode()
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = this.zzWZ;
    Iterator localIterator = ((ArrayList)localObject2).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = ((Scope)localIterator.next()).zzpb();
      ((ArrayList)localObject1).add(localObject2);
    }
    Collections.sort((List)localObject1);
    localObject2 = new com/google/android/gms/auth/api/signin/internal/zze;
    ((zze)localObject2).<init>();
    localObject2 = ((zze)localObject2).zzp(localObject1);
    localObject1 = this.zzTI;
    localObject2 = ((zze)localObject2).zzp(localObject1);
    localObject1 = this.zzXd;
    localObject2 = ((zze)localObject2).zzp(localObject1);
    boolean bool2 = this.zzXc;
    localObject2 = ((zze)localObject2).zzP(bool2);
    bool2 = this.zzXa;
    localObject2 = ((zze)localObject2).zzP(bool2);
    bool2 = this.zzXb;
    return ((zze)localObject2).zzP(bool2).zzne();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public String zzmI()
  {
    return zzmJ().toString();
  }
  
  public ArrayList zzmN()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzWZ;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public boolean zzmO()
  {
    return this.zzXa;
  }
  
  public boolean zzmP()
  {
    return this.zzXb;
  }
  
  public boolean zzmQ()
  {
    return this.zzXc;
  }
  
  public String zzmR()
  {
    return this.zzXd;
  }
  
  public String zzmS()
  {
    return this.zzXe;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\GoogleSignInOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */