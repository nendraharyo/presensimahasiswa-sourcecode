package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(AddPlaceRequest paramAddPlaceRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Object localObject = paramAddPlaceRequest.getName();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramAddPlaceRequest.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    localObject = paramAddPlaceRequest.getLatLng();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramAddPlaceRequest.getAddress();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAddPlaceRequest.getPlaceTypes();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (List)localObject, false);
    localObject = paramAddPlaceRequest.getPhoneNumber();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramAddPlaceRequest.getWebsiteUri();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public AddPlaceRequest zzfa(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str1 = null;
    ArrayList localArrayList = null;
    String str2 = null;
    Object localObject3 = null;
    String str3 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject3 = LatLng.CREATOR;
        localObject4 = (LatLng)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localArrayList = zza.zzC(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        localObject1 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/location/places/AddPlaceRequest;
    ((AddPlaceRequest)localObject4).<init>(j, str3, (LatLng)localObject3, str2, localArrayList, str1, (Uri)localObject1);
    return (AddPlaceRequest)localObject4;
  }
  
  public AddPlaceRequest[] zzhI(int paramInt)
  {
    return new AddPlaceRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */