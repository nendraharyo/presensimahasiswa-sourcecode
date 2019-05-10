package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RegisterSectionInfo
  implements SafeParcelable
{
  public static final zzi CREATOR;
  final int mVersionCode;
  public final String name;
  public final int weight;
  public final String zzUd;
  public final boolean zzUe;
  public final boolean zzUf;
  public final String zzUg;
  public final Feature[] zzUh;
  final int[] zzUi;
  public final String zzUj;
  
  static
  {
    zzi localzzi = new com/google/android/gms/appdatasearch/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  RegisterSectionInfo(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString3, Feature[] paramArrayOfFeature, int[] paramArrayOfInt, String paramString4)
  {
    this.mVersionCode = paramInt1;
    this.name = paramString1;
    this.zzUd = paramString2;
    this.zzUe = paramBoolean1;
    this.weight = paramInt2;
    this.zzUf = paramBoolean2;
    this.zzUg = paramString3;
    this.zzUh = paramArrayOfFeature;
    this.zzUi = paramArrayOfInt;
    this.zzUj = paramString4;
  }
  
  RegisterSectionInfo(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, String paramString3, Feature[] paramArrayOfFeature, int[] paramArrayOfInt, String paramString4)
  {
    this(2, paramString1, paramString2, paramBoolean1, paramInt, paramBoolean2, paramString3, paramArrayOfFeature, paramArrayOfInt, paramString4);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\RegisterSectionInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */