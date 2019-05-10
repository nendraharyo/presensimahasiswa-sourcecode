package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent
  extends zzf
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final long zzane;
  private int zzanf;
  private final String zzang;
  private final String zzanh;
  private final String zzani;
  private final String zzanj;
  private final String zzank;
  private final String zzanl;
  private final long zzanm;
  private final long zzann;
  private long zzano;
  
  static
  {
    zza localzza = new com/google/android/gms/common/stats/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.mVersionCode = paramInt1;
    this.zzane = paramLong1;
    this.zzanf = paramInt2;
    this.zzang = paramString1;
    this.zzanh = paramString2;
    this.zzani = paramString3;
    this.zzanj = paramString4;
    this.zzano = -1;
    this.zzank = paramString5;
    this.zzanl = paramString6;
    this.zzanm = paramLong2;
    this.zzann = paramLong3;
  }
  
  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getEventType()
  {
    return this.zzanf;
  }
  
  public long getTimeMillis()
  {
    return this.zzane;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public String zzrF()
  {
    return this.zzang;
  }
  
  public String zzrG()
  {
    return this.zzanh;
  }
  
  public String zzrH()
  {
    return this.zzani;
  }
  
  public String zzrI()
  {
    return this.zzanj;
  }
  
  public String zzrJ()
  {
    return this.zzank;
  }
  
  public String zzrK()
  {
    return this.zzanl;
  }
  
  public long zzrL()
  {
    return this.zzano;
  }
  
  public long zzrM()
  {
    return this.zzann;
  }
  
  public long zzrN()
  {
    return this.zzanm;
  }
  
  public String zzrO()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("\t");
    Object localObject2 = zzrF();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("/");
    localObject2 = zzrG();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("\t");
    localObject2 = zzrH();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("/");
    localObject2 = zzrI();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("\t");
    localObject1 = this.zzank;
    if (localObject1 == null) {}
    for (localObject1 = "";; localObject1 = this.zzank)
    {
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("\t");
      long l = zzrM();
      return l;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\ConnectionEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */