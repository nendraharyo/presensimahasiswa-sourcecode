package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;

public class PlaceImpl$zza
{
  private String mName;
  private int mVersionCode = 0;
  private LatLng zzaPc;
  private String zzaPe;
  private Uri zzaPf;
  private String zzaQA;
  private boolean zzaQB;
  private float zzaQC;
  private int zzaQD;
  private long zzaQE;
  private String zzaQG;
  private List zzaQH;
  private Bundle zzaQK;
  private List zzaQL;
  private float zzaQy;
  private LatLngBounds zzaQz;
  private String zzawc;
  private String zzyv;
  
  public zza zza(LatLng paramLatLng)
  {
    this.zzaPc = paramLatLng;
    return this;
  }
  
  public zza zza(LatLngBounds paramLatLngBounds)
  {
    this.zzaQz = paramLatLngBounds;
    return this;
  }
  
  public zza zzan(boolean paramBoolean)
  {
    this.zzaQB = paramBoolean;
    return this;
  }
  
  public zza zzem(String paramString)
  {
    this.zzyv = paramString;
    return this;
  }
  
  public zza zzen(String paramString)
  {
    this.mName = paramString;
    return this;
  }
  
  public zza zzeo(String paramString)
  {
    this.zzawc = paramString;
    return this;
  }
  
  public zza zzep(String paramString)
  {
    this.zzaPe = paramString;
    return this;
  }
  
  public zza zzf(float paramFloat)
  {
    this.zzaQy = paramFloat;
    return this;
  }
  
  public zza zzg(float paramFloat)
  {
    this.zzaQC = paramFloat;
    return this;
  }
  
  public zza zzhX(int paramInt)
  {
    this.zzaQD = paramInt;
    return this;
  }
  
  public zza zzo(Uri paramUri)
  {
    this.zzaPf = paramUri;
    return this;
  }
  
  public zza zzx(List paramList)
  {
    this.zzaQL = paramList;
    return this;
  }
  
  public zza zzy(List paramList)
  {
    this.zzaQH = paramList;
    return this;
  }
  
  public PlaceImpl zzzx()
  {
    PlaceImpl localPlaceImpl = new com/google/android/gms/location/places/internal/PlaceImpl;
    int i = this.mVersionCode;
    String str1 = this.zzyv;
    List localList1 = this.zzaQL;
    List localList2 = Collections.emptyList();
    Bundle localBundle = this.zzaQK;
    String str2 = this.mName;
    String str3 = this.zzawc;
    String str4 = this.zzaPe;
    String str5 = this.zzaQG;
    List localList3 = this.zzaQH;
    LatLng localLatLng = this.zzaPc;
    float f1 = this.zzaQy;
    LatLngBounds localLatLngBounds = this.zzaQz;
    String str6 = this.zzaQA;
    Uri localUri = this.zzaPf;
    boolean bool = this.zzaQB;
    float f2 = this.zzaQC;
    int j = this.zzaQD;
    long l = this.zzaQE;
    String str7 = this.mName;
    Object localObject = this.zzawc;
    String str8 = this.zzaPe;
    String str9 = this.zzaQG;
    List localList4 = this.zzaQH;
    localObject = PlaceLocalization.zza(str7, (String)localObject, str8, str9, localList4);
    localPlaceImpl.<init>(i, str1, localList1, localList2, localBundle, str2, str3, str4, str5, localList3, localLatLng, f1, localLatLngBounds, str6, localUri, bool, f2, j, l, (PlaceLocalization)localObject);
    return localPlaceImpl;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\PlaceImpl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */