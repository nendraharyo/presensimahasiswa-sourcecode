package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(Barcode.ContactInfo paramContactInfo, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramContactInfo.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramContactInfo.name;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramContactInfo.organization;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramContactInfo.title;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramContactInfo.phones;
    zzb.zza(paramParcel, 5, (Parcelable[])localObject, paramInt, false);
    localObject = paramContactInfo.emails;
    zzb.zza(paramParcel, 6, (Parcelable[])localObject, paramInt, false);
    localObject = paramContactInfo.urls;
    zzb.zza(paramParcel, 7, (String[])localObject, false);
    localObject = paramContactInfo.addresses;
    zzb.zza(paramParcel, 8, (Parcelable[])localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public Barcode.ContactInfo zzha(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String[] arrayOfString = null;
    Object localObject3 = null;
    Object localObject4 = null;
    String str1 = null;
    String str2 = null;
    Object localObject5 = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject5 = Barcode.PersonName.CREATOR;
        localObject6 = (Barcode.PersonName)zza.zza(paramParcel, k, (Parcelable.Creator)localObject5);
        localObject5 = localObject6;
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localObject4 = Barcode.Phone.CREATOR;
        localObject6 = (Barcode.Phone[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 6: 
        localObject3 = Barcode.Email.CREATOR;
        localObject6 = (Barcode.Email[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 7: 
        arrayOfString = zza.zzB(paramParcel, k);
        break;
      case 8: 
        localObject1 = Barcode.Address.CREATOR;
        localObject6 = (Barcode.Address[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject6;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject6).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/vision/barcode/Barcode$ContactInfo;
    ((Barcode.ContactInfo)localObject6).<init>(j, (Barcode.PersonName)localObject5, str2, str1, (Barcode.Phone[])localObject4, (Barcode.Email[])localObject3, arrayOfString, (Barcode.Address[])localObject1);
    return (Barcode.ContactInfo)localObject6;
  }
  
  public Barcode.ContactInfo[] zzkx(int paramInt)
  {
    return new Barcode.ContactInfo[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */