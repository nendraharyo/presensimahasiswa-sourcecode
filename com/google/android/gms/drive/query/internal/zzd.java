package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(FilterHolder paramFilterHolder, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramFilterHolder.zzauk;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramFilterHolder.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramFilterHolder.zzaul;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzaum;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzaun;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzauo;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzaup;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzauq;
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzaur;
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    localObject = paramFilterHolder.zzaus;
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FilterHolder zzco(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
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
        localObject10 = ComparisonFilter.CREATOR;
        localObject11 = (ComparisonFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject10);
        localObject10 = localObject11;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject9 = FieldOnlyFilter.CREATOR;
        localObject11 = (FieldOnlyFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject9);
        localObject9 = localObject11;
        break;
      case 3: 
        localObject8 = LogicalFilter.CREATOR;
        localObject11 = (LogicalFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject8);
        localObject8 = localObject11;
        break;
      case 4: 
        localObject7 = NotFilter.CREATOR;
        localObject11 = (NotFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject7);
        localObject7 = localObject11;
        break;
      case 5: 
        localObject6 = InFilter.CREATOR;
        localObject11 = (InFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject6);
        localObject6 = localObject11;
        break;
      case 6: 
        localObject5 = MatchAllFilter.CREATOR;
        localObject11 = (MatchAllFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject5);
        localObject5 = localObject11;
        break;
      case 7: 
        localObject4 = HasFilter.CREATOR;
        localObject11 = (HasFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject11;
        break;
      case 8: 
        localObject3 = FullTextSearchFilter.CREATOR;
        localObject11 = (FullTextSearchFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject11;
        break;
      case 9: 
        localObject1 = OwnedByMeFilter.CREATOR;
        localObject11 = (OwnedByMeFilter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject11;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject11 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject11).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject11);
    }
    Object localObject11 = new com/google/android/gms/drive/query/internal/FilterHolder;
    ((FilterHolder)localObject11).<init>(j, (ComparisonFilter)localObject10, (FieldOnlyFilter)localObject9, (LogicalFilter)localObject8, (NotFilter)localObject7, (InFilter)localObject6, (MatchAllFilter)localObject5, (HasFilter)localObject4, (FullTextSearchFilter)localObject3, (OwnedByMeFilter)localObject1);
    return (FilterHolder)localObject11;
  }
  
  public FilterHolder[] zzej(int paramInt)
  {
    return new FilterHolder[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */