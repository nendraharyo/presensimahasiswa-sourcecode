package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Uri zzajZ;
  private final int zzoG;
  private final int zzoH;
  
  static
  {
    zzb localzzb = new com/google/android/gms/common/images/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  WebImage(int paramInt1, Uri paramUri, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzajZ = paramUri;
    this.zzoG = paramInt2;
    this.zzoH = paramInt3;
  }
  
  public WebImage(Uri paramUri)
  {
    this(paramUri, 0, 0);
  }
  
  public WebImage(Uri paramUri, int paramInt1, int paramInt2)
  {
    this(i, paramUri, paramInt1, paramInt2);
    IllegalArgumentException localIllegalArgumentException;
    if (paramUri == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("url cannot be null");
      throw localIllegalArgumentException;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("width and height must not be negative");
      throw localIllegalArgumentException;
    }
  }
  
  public WebImage(JSONObject paramJSONObject)
  {
    this(localUri, i, j);
  }
  
  private static Uri zzj(JSONObject paramJSONObject)
  {
    Uri localUri = null;
    String str = "url";
    boolean bool = paramJSONObject.has(str);
    if (bool) {
      str = "url";
    }
    try
    {
      str = paramJSONObject.getString(str);
      localUri = Uri.parse(str);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return localUri;
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
      if (paramObject != null)
      {
        bool2 = paramObject instanceof WebImage;
        if (bool2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (WebImage)paramObject;
      Uri localUri1 = this.zzajZ;
      Uri localUri2 = ((WebImage)paramObject).zzajZ;
      boolean bool2 = zzw.equal(localUri1, localUri2);
      if (bool2)
      {
        int i = this.zzoG;
        int j = ((WebImage)paramObject).zzoG;
        if (i == j)
        {
          i = this.zzoH;
          j = ((WebImage)paramObject).zzoH;
          if (i == j) {
            continue;
          }
        }
      }
      bool1 = false;
    }
  }
  
  public int getHeight()
  {
    return this.zzoH;
  }
  
  public Uri getUrl()
  {
    return this.zzajZ;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int getWidth()
  {
    return this.zzoG;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzajZ;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzoG);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzoH);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str = "url";
    try
    {
      Object localObject = this.zzajZ;
      localObject = ((Uri)localObject).toString();
      localJSONObject.put(str, localObject);
      str = "width";
      int i = this.zzoG;
      localJSONObject.put(str, i);
      str = "height";
      i = this.zzoH;
      localJSONObject.put(str, i);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    return localJSONObject;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzoG);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzoH);
    arrayOfObject[1] = localObject;
    localObject = this.zzajZ.toString();
    arrayOfObject[2] = localObject;
    return String.format("Image %dx%d %s", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\WebImage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */