package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent
  extends zzf
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final long mTimeout;
  final int mVersionCode;
  private final String zzanQ;
  private final int zzanR;
  private final List zzanS;
  private final String zzanT;
  private int zzanU;
  private final String zzanV;
  private final String zzanW;
  private final float zzanX;
  private final long zzane;
  private int zzanf;
  private final long zzanm;
  private long zzano;
  
  static
  {
    zzh localzzh = new com/google/android/gms/common/stats/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat, long paramLong3)
  {
    this.mVersionCode = paramInt1;
    this.zzane = paramLong1;
    this.zzanf = paramInt2;
    this.zzanQ = paramString1;
    this.zzanV = paramString3;
    this.zzanR = paramInt3;
    this.zzano = -1;
    this.zzanS = paramList;
    this.zzanT = paramString2;
    this.zzanm = paramLong2;
    this.zzanU = paramInt4;
    this.zzanW = paramString4;
    this.zzanX = paramFloat;
    this.mTimeout = paramLong3;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat, long paramLong3)
  {
    this(1, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat, paramLong3);
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
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public String zzrK()
  {
    return this.zzanT;
  }
  
  public long zzrL()
  {
    return this.zzano;
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
    Object localObject2 = zzrR();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("\t");
    int i = zzrT();
    localObject2 = ((StringBuilder)localObject1).append(i).append("\t");
    localObject1 = zzrU();
    if (localObject1 == null)
    {
      localObject1 = "";
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("\t");
      i = zzrV();
      localObject2 = ((StringBuilder)localObject1).append(i).append("\t");
      localObject1 = zzrS();
      if (localObject1 != null) {
        break label165;
      }
      localObject1 = "";
      label98:
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append("\t");
      localObject1 = zzrW();
      if (localObject1 != null) {
        break label173;
      }
    }
    label165:
    label173:
    for (localObject1 = "";; localObject1 = zzrW())
    {
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("\t");
      float f = zzrX();
      return f;
      List localList = zzrU();
      localObject1 = TextUtils.join(",", localList);
      break;
      localObject1 = zzrS();
      break label98;
    }
  }
  
  public String zzrR()
  {
    return this.zzanQ;
  }
  
  public String zzrS()
  {
    return this.zzanV;
  }
  
  public int zzrT()
  {
    return this.zzanR;
  }
  
  public List zzrU()
  {
    return this.zzanS;
  }
  
  public int zzrV()
  {
    return this.zzanU;
  }
  
  public String zzrW()
  {
    return this.zzanW;
  }
  
  public float zzrX()
  {
    return this.zzanX;
  }
  
  public long zzrY()
  {
    return this.mTimeout;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\WakeLockEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */