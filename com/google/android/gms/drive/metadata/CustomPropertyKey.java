package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class CustomPropertyKey
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int PRIVATE = 1;
  public static final int PUBLIC;
  private static final Pattern zzasJ = Pattern.compile("[\\w.!@$%^&*()/-]+");
  final int mVersionCode;
  final int mVisibility;
  final String zzvs;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/metadata/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  CustomPropertyKey(int paramInt1, String paramString, int paramInt2)
  {
    zzx.zzb(paramString, "key");
    Matcher localMatcher = zzasJ.matcher(paramString);
    boolean bool = localMatcher.matches();
    String str = "key name characters must be alphanumeric or one of .!@$%^&*()-_/";
    zzx.zzb(bool, str);
    if ((paramInt2 == 0) || (paramInt2 == i)) {}
    for (;;)
    {
      zzx.zzb(i, "visibility must be either PUBLIC or PRIVATE");
      this.mVersionCode = paramInt1;
      this.zzvs = paramString;
      this.mVisibility = paramInt2;
      return;
      i = 0;
    }
  }
  
  public CustomPropertyKey(String paramString, int paramInt)
  {
    this(1, paramString, paramInt);
  }
  
  public static CustomPropertyKey fromJson(JSONObject paramJSONObject)
  {
    CustomPropertyKey localCustomPropertyKey = new com/google/android/gms/drive/metadata/CustomPropertyKey;
    String str = paramJSONObject.getString("key");
    int i = paramJSONObject.getInt("visibility");
    localCustomPropertyKey.<init>(str, i);
    return localCustomPropertyKey;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramObject == null) {}
    do
    {
      for (;;)
      {
        return bool2;
        if (paramObject != this) {
          break;
        }
        bool2 = bool1;
      }
      bool3 = paramObject instanceof CustomPropertyKey;
    } while (!bool3);
    paramObject = (CustomPropertyKey)paramObject;
    String str1 = ((CustomPropertyKey)paramObject).getKey();
    String str2 = this.zzvs;
    boolean bool3 = str1.equals(str2);
    if (bool3)
    {
      int i = ((CustomPropertyKey)paramObject).getVisibility();
      int j = this.mVisibility;
      if (i != j) {}
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      bool1 = false;
    }
  }
  
  public String getKey()
  {
    return this.zzvs;
  }
  
  public int getVisibility()
  {
    return this.mVisibility;
  }
  
  public int hashCode()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.zzvs;
    localStringBuilder = localStringBuilder.append(str);
    int i = this.mVisibility;
    return i.hashCode();
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = getKey();
    localJSONObject.put("key", str);
    int i = getVisibility();
    localJSONObject.put("visibility", i);
    return localJSONObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("CustomPropertyKey(");
    String str = this.zzvs;
    localStringBuilder = localStringBuilder.append(str).append(",");
    int i = this.mVisibility;
    return i + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\CustomPropertyKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */