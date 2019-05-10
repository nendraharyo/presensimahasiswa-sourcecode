package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceImpl
  implements SafeParcelable, Place
{
  public static final zzl CREATOR;
  private final String mName;
  final int mVersionCode;
  private final LatLng zzaPc;
  private final List zzaPd;
  private final String zzaPe;
  private final Uri zzaPf;
  private final String zzaQA;
  private final boolean zzaQB;
  private final float zzaQC;
  private final int zzaQD;
  private final long zzaQE;
  private final List zzaQF;
  private final String zzaQG;
  private final List zzaQH;
  private final Map zzaQI;
  private final TimeZone zzaQJ;
  private Locale zzaQr;
  private final Bundle zzaQw;
  private final PlaceLocalization zzaQx;
  private final float zzaQy;
  private final LatLngBounds zzaQz;
  private final String zzawc;
  private final String zzyv;
  
  static
  {
    zzl localzzl = new com/google/android/gms/location/places/internal/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  PlaceImpl(int paramInt1, String paramString1, List paramList1, List paramList2, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5, List paramList3, LatLng paramLatLng, float paramFloat1, LatLngBounds paramLatLngBounds, String paramString6, Uri paramUri, boolean paramBoolean, float paramFloat2, int paramInt2, long paramLong, PlaceLocalization paramPlaceLocalization)
  {
    this.mVersionCode = paramInt1;
    this.zzyv = paramString1;
    Object localObject = Collections.unmodifiableList(paramList1);
    this.zzaPd = ((List)localObject);
    this.zzaQF = paramList2;
    if (paramBundle != null)
    {
      this.zzaQw = paramBundle;
      this.mName = paramString2;
      this.zzawc = paramString3;
      this.zzaPe = paramString4;
      this.zzaQG = paramString5;
      if (paramList3 == null) {
        break label190;
      }
      label72:
      this.zzaQH = paramList3;
      this.zzaPc = paramLatLng;
      this.zzaQy = paramFloat1;
      this.zzaQz = paramLatLngBounds;
      if (paramString6 == null) {
        break label198;
      }
    }
    for (;;)
    {
      this.zzaQA = paramString6;
      this.zzaPf = paramUri;
      this.zzaQB = paramBoolean;
      this.zzaQC = paramFloat2;
      this.zzaQD = paramInt2;
      this.zzaQE = paramLong;
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
      localObject = Collections.unmodifiableMap((Map)localObject);
      this.zzaQI = ((Map)localObject);
      this.zzaQJ = null;
      this.zzaQr = null;
      this.zzaQx = paramPlaceLocalization;
      return;
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
      break;
      label190:
      paramList3 = Collections.emptyList();
      break label72;
      label198:
      paramString6 = "UTC";
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
      boolean bool2 = paramObject instanceof PlaceImpl;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (PlaceImpl)paramObject;
        Object localObject1 = this.zzyv;
        Object localObject2 = ((PlaceImpl)paramObject).zzyv;
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.zzaQr;
          localObject2 = ((PlaceImpl)paramObject).zzaQr;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            long l1 = this.zzaQE;
            long l2 = ((PlaceImpl)paramObject).zzaQE;
            bool2 = l1 < l2;
            if (!bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public String getAddress()
  {
    return this.zzawc;
  }
  
  public CharSequence getAttributions()
  {
    return zzc.zzj(this.zzaQH);
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public LatLng getLatLng()
  {
    return this.zzaPc;
  }
  
  public Locale getLocale()
  {
    return this.zzaQr;
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
  
  public int getPriceLevel()
  {
    return this.zzaQD;
  }
  
  public float getRating()
  {
    return this.zzaQC;
  }
  
  public LatLngBounds getViewport()
  {
    return this.zzaQz;
  }
  
  public Uri getWebsiteUri()
  {
    return this.zzaPf;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzyv;
    arrayOfObject[0] = localObject;
    localObject = this.zzaQr;
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaQE);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public void setLocale(Locale paramLocale)
  {
    this.zzaQr = paramLocale;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzyv;
    localzza = localzza.zzg("id", localObject);
    localObject = this.zzaPd;
    localzza = localzza.zzg("placeTypes", localObject);
    localObject = this.zzaQr;
    localzza = localzza.zzg("locale", localObject);
    localObject = this.mName;
    localzza = localzza.zzg("name", localObject);
    localObject = this.zzawc;
    localzza = localzza.zzg("address", localObject);
    localObject = this.zzaPe;
    localzza = localzza.zzg("phoneNumber", localObject);
    localObject = this.zzaPc;
    localzza = localzza.zzg("latlng", localObject);
    localObject = this.zzaQz;
    localzza = localzza.zzg("viewport", localObject);
    localObject = this.zzaPf;
    localzza = localzza.zzg("websiteUri", localObject);
    localObject = Boolean.valueOf(this.zzaQB);
    localzza = localzza.zzg("isPermanentlyClosed", localObject);
    localObject = Integer.valueOf(this.zzaQD);
    localzza = localzza.zzg("priceLevel", localObject);
    localObject = Long.valueOf(this.zzaQE);
    return localzza.zzg("timestampSecs", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public List zzzn()
  {
    return this.zzaQF;
  }
  
  public float zzzo()
  {
    return this.zzaQy;
  }
  
  public String zzzp()
  {
    return this.zzaQG;
  }
  
  public List zzzq()
  {
    return this.zzaQH;
  }
  
  public boolean zzzr()
  {
    return this.zzaQB;
  }
  
  public long zzzs()
  {
    return this.zzaQE;
  }
  
  public Bundle zzzt()
  {
    return this.zzaQw;
  }
  
  public String zzzu()
  {
    return this.zzaQA;
  }
  
  public PlaceLocalization zzzv()
  {
    return this.zzaQx;
  }
  
  public Place zzzw()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\PlaceImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */