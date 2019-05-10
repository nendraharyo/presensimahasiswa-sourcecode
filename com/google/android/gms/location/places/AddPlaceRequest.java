package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddPlaceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  final int mVersionCode;
  private final LatLng zzaPc;
  private final List zzaPd;
  private final String zzaPe;
  private final Uri zzaPf;
  private final String zzawc;
  
  static
  {
    zzb localzzb = new com/google/android/gms/location/places/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  AddPlaceRequest(int paramInt, String paramString1, LatLng paramLatLng, String paramString2, List paramList, String paramString3, Uri paramUri)
  {
    this.mVersionCode = paramInt;
    Object localObject1 = zzx.zzcM(paramString1);
    this.mName = ((String)localObject1);
    localObject1 = (LatLng)zzx.zzz(paramLatLng);
    this.zzaPc = ((LatLng)localObject1);
    localObject1 = zzx.zzcM(paramString2);
    this.zzawc = ((String)localObject1);
    Object localObject2 = new java/util/ArrayList;
    localObject1 = (Collection)zzx.zzz(paramList);
    ((ArrayList)localObject2).<init>((Collection)localObject1);
    this.zzaPd = ((List)localObject2);
    localObject1 = this.zzaPd;
    boolean bool3 = ((List)localObject1).isEmpty();
    if (!bool3) {
      bool3 = bool1;
    }
    for (;;)
    {
      localObject2 = "At least one place type should be provided.";
      zzx.zzb(bool3, localObject2);
      bool3 = TextUtils.isEmpty(paramString3);
      if ((!bool3) || (paramUri != null)) {
        bool2 = bool1;
      }
      zzx.zzb(bool2, "One of phone number or URI should be provided.");
      this.zzaPe = paramString3;
      this.zzaPf = paramUri;
      return;
      bool3 = false;
      localObject1 = null;
    }
  }
  
  public AddPlaceRequest(String paramString1, LatLng paramLatLng, String paramString2, List paramList, Uri paramUri)
  {
    this(paramString1, paramLatLng, paramString2, paramList, null, localUri);
  }
  
  public AddPlaceRequest(String paramString1, LatLng paramLatLng, String paramString2, List paramList, String paramString3)
  {
    this(paramString1, paramLatLng, paramString2, paramList, str, null);
  }
  
  public AddPlaceRequest(String paramString1, LatLng paramLatLng, String paramString2, List paramList, String paramString3, Uri paramUri)
  {
    this(0, paramString1, paramLatLng, paramString2, paramList, paramString3, paramUri);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress()
  {
    return this.zzawc;
  }
  
  public LatLng getLatLng()
  {
    return this.zzaPc;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getPhoneNumber()
  {
    return this.zzaPe;
  }
  
  public List getPlaceTypes()
  {
    return this.zzaPd;
  }
  
  public Uri getWebsiteUri()
  {
    return this.zzaPf;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.mName;
    localzza = localzza.zzg("name", localObject);
    localObject = this.zzaPc;
    localzza = localzza.zzg("latLng", localObject);
    localObject = this.zzawc;
    localzza = localzza.zzg("address", localObject);
    localObject = this.zzaPd;
    localzza = localzza.zzg("placeTypes", localObject);
    localObject = this.zzaPe;
    localzza = localzza.zzg("phoneNumer", localObject);
    localObject = this.zzaPf;
    return localzza.zzg("websiteUri", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\AddPlaceRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */