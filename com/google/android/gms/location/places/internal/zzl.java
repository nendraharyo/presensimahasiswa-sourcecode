package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;

public class zzl
  implements Parcelable.Creator
{
  static void zza(PlaceImpl paramPlaceImpl, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramPlaceImpl.getId();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    localObject = paramPlaceImpl.zzzt();
    zzb.zza(paramParcel, 2, (Bundle)localObject, false);
    localObject = paramPlaceImpl.zzzv();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramPlaceImpl.getLatLng();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    float f = paramPlaceImpl.zzzo();
    zzb.zza(paramParcel, 5, f);
    localObject = paramPlaceImpl.getViewport();
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramPlaceImpl.zzzu();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramPlaceImpl.getWebsiteUri();
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    boolean bool = paramPlaceImpl.zzzr();
    zzb.zza(paramParcel, 9, bool);
    f = paramPlaceImpl.getRating();
    zzb.zza(paramParcel, 10, f);
    int j = paramPlaceImpl.getPriceLevel();
    zzb.zzc(paramParcel, 11, j);
    long l = paramPlaceImpl.zzzs();
    zzb.zza(paramParcel, 12, l);
    localObject = paramPlaceImpl.zzzn();
    zzb.zza(paramParcel, 13, (List)localObject, false);
    localObject = paramPlaceImpl.getAddress();
    zzb.zza(paramParcel, 14, (String)localObject, false);
    localObject = paramPlaceImpl.getPhoneNumber();
    zzb.zza(paramParcel, 15, (String)localObject, false);
    localObject = paramPlaceImpl.zzzq();
    zzb.zzb(paramParcel, 17, (List)localObject, false);
    localObject = paramPlaceImpl.zzzp();
    zzb.zza(paramParcel, 16, (String)localObject, false);
    j = paramPlaceImpl.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramPlaceImpl.getName();
    zzb.zza(paramParcel, 19, (String)localObject, false);
    localObject = paramPlaceImpl.getPlaceTypes();
    zzb.zza(paramParcel, 20, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlaceImpl zzfl(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    Bundle localBundle = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    ArrayList localArrayList3 = null;
    Object localObject1 = null;
    float f1 = 0.0F;
    Object localObject2 = null;
    String str6 = null;
    Object localObject3 = null;
    boolean bool = false;
    float f2 = 0.0F;
    int k = 0;
    long l = 0L;
    Object localObject4 = null;
    Object localObject5;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 2: 
        localBundle = zza.zzr(paramParcel, m);
        break;
      case 3: 
        localObject4 = PlaceLocalization.CREATOR;
        localObject5 = (PlaceLocalization)zza.zza(paramParcel, m, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 4: 
        localObject1 = LatLng.CREATOR;
        localObject5 = (LatLng)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
        break;
      case 5: 
        f1 = zza.zzl(paramParcel, m);
        break;
      case 6: 
        localObject2 = LatLngBounds.CREATOR;
        localObject5 = (LatLngBounds)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 7: 
        str6 = zza.zzp(paramParcel, m);
        break;
      case 8: 
        localObject3 = Uri.CREATOR;
        localObject5 = (Uri)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 9: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 10: 
        f2 = zza.zzl(paramParcel, m);
        break;
      case 11: 
        k = zza.zzg(paramParcel, m);
        break;
      case 12: 
        l = zza.zzi(paramParcel, m);
        break;
      case 13: 
        localArrayList2 = zza.zzC(paramParcel, m);
        break;
      case 14: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 15: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 17: 
        localArrayList3 = zza.zzD(paramParcel, m);
        break;
      case 16: 
        str5 = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 19: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 20: 
        localArrayList1 = zza.zzC(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject6 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject6, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject6 = new com/google/android/gms/location/places/internal/PlaceImpl;
    ((PlaceImpl)localObject6).<init>(j, str1, localArrayList1, localArrayList2, localBundle, str2, str3, str4, str5, localArrayList3, (LatLng)localObject1, f1, (LatLngBounds)localObject2, str6, (Uri)localObject3, bool, f2, k, l, (PlaceLocalization)localObject4);
    return (PlaceImpl)localObject6;
  }
  
  public PlaceImpl[] zzhY(int paramInt)
  {
    return new PlaceImpl[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */