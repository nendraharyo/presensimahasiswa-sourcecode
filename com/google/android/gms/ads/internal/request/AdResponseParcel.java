package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class AdResponseParcel
  implements SafeParcelable
{
  public static final zzh CREATOR;
  public String body;
  public final int errorCode;
  public final int orientation;
  public final int versionCode;
  public final List zzBQ;
  public final List zzBR;
  public final long zzBU;
  private AdRequestInfoParcel zzCu;
  public final String zzEF;
  public final boolean zzHB;
  public final long zzHS;
  public final boolean zzHT;
  public final long zzHU;
  public final List zzHV;
  public final String zzHW;
  public final long zzHX;
  public final String zzHY;
  public final boolean zzHZ;
  public final String zzIa;
  public final String zzIb;
  public final boolean zzIc;
  public final boolean zzId;
  public final boolean zzIe;
  public final int zzIf;
  public LargeParcelTeleporter zzIg;
  public String zzIh;
  public String zzIi;
  public RewardItemParcel zzIj;
  public List zzIk;
  public List zzIl;
  public boolean zzIm;
  public final boolean zzuk;
  public boolean zzul;
  public boolean zzum;
  
  static
  {
    zzh localzzh = new com/google/android/gms/ads/internal/request/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  public AdResponseParcel(int paramInt)
  {
    this(16, null, null, null, paramInt, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, 0, null, null, null, false, false, null, null, null, false);
  }
  
  public AdResponseParcel(int paramInt, long paramLong)
  {
    this(16, null, null, null, paramInt, null, -1, false, -1, null, paramLong, -1, null, -1, null, false, null, null, false, false, false, true, false, 0, null, null, null, false, false, null, null, null, false);
  }
  
  AdResponseParcel(int paramInt1, String paramString1, String paramString2, List paramList1, int paramInt2, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, int paramInt4, LargeParcelTeleporter paramLargeParcelTeleporter, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean10)
  {
    this.versionCode = paramInt1;
    this.zzEF = paramString1;
    this.body = paramString2;
    if (paramList1 != null)
    {
      localObject1 = Collections.unmodifiableList(paramList1);
      this.zzBQ = ((List)localObject1);
      this.errorCode = paramInt2;
      if (paramList2 == null) {
        break label324;
      }
      localObject1 = Collections.unmodifiableList(paramList2);
      label55:
      this.zzBR = ((List)localObject1);
      this.zzHS = paramLong1;
      this.zzHT = paramBoolean1;
      this.zzHU = paramLong2;
      if (paramList3 == null) {
        break label330;
      }
    }
    label324:
    label330:
    for (Object localObject1 = Collections.unmodifiableList(paramList3);; localObject1 = null)
    {
      this.zzHV = ((List)localObject1);
      this.zzBU = paramLong3;
      this.orientation = paramInt3;
      this.zzHW = paramString3;
      this.zzHX = paramLong4;
      this.zzHY = paramString4;
      this.zzHZ = paramBoolean2;
      this.zzIa = paramString5;
      this.zzIb = paramString6;
      this.zzIc = paramBoolean3;
      this.zzuk = paramBoolean4;
      this.zzHB = paramBoolean5;
      this.zzId = paramBoolean6;
      this.zzIe = paramBoolean7;
      this.zzIf = paramInt4;
      this.zzIg = paramLargeParcelTeleporter;
      this.zzIh = paramString7;
      this.zzIi = paramString8;
      localObject1 = this.body;
      if (localObject1 == null)
      {
        localObject1 = this.zzIg;
        if (localObject1 != null)
        {
          localObject1 = this.zzIg;
          Object localObject2 = StringParcel.CREATOR;
          localObject1 = (StringParcel)((LargeParcelTeleporter)localObject1).zza((Parcelable.Creator)localObject2);
          if (localObject1 != null)
          {
            localObject2 = ((StringParcel)localObject1).zzgz();
            boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
            if (!bool)
            {
              localObject1 = ((StringParcel)localObject1).zzgz();
              this.body = ((String)localObject1);
            }
          }
        }
      }
      this.zzul = paramBoolean8;
      this.zzum = paramBoolean9;
      this.zzIj = paramRewardItemParcel;
      this.zzIk = paramList4;
      this.zzIl = paramList5;
      this.zzIm = paramBoolean10;
      return;
      localObject1 = null;
      break;
      localObject1 = null;
      break label55;
    }
  }
  
  public AdResponseParcel(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString1, String paramString2, List paramList1, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt1, String paramString3, long paramLong4, String paramString4, String paramString5, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, int paramInt2, String paramString6, boolean paramBoolean7, boolean paramBoolean8, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean9)
  {
    this(16, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt1, paramString3, paramLong4, paramString4, false, null, paramString5, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramInt2, null, null, paramString6, paramBoolean7, paramBoolean8, paramRewardItemParcel, paramList4, paramList5, paramBoolean9);
    this.zzCu = paramAdRequestInfoParcel;
  }
  
  public AdResponseParcel(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString1, String paramString2, List paramList1, List paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List paramList3, long paramLong3, int paramInt1, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, int paramInt2, String paramString7, boolean paramBoolean8, boolean paramBoolean9, RewardItemParcel paramRewardItemParcel, List paramList4, List paramList5, boolean paramBoolean10)
  {
    this(16, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt1, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, paramInt2, null, null, paramString7, paramBoolean8, paramBoolean9, paramRewardItemParcel, paramList4, paramList5, paramBoolean10);
    this.zzCu = paramAdRequestInfoParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.zzCu;
    if (localObject != null)
    {
      localObject = this.zzCu;
      int i = ((AdRequestInfoParcel)localObject).versionCode;
      int j = 9;
      if (i >= j)
      {
        localObject = this.body;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool)
        {
          localObject = new com/google/android/gms/ads/internal/request/LargeParcelTeleporter;
          StringParcel localStringParcel = new com/google/android/gms/ads/internal/request/StringParcel;
          String str = this.body;
          localStringParcel.<init>(str);
          ((LargeParcelTeleporter)localObject).<init>(localStringParcel);
          this.zzIg = ((LargeParcelTeleporter)localObject);
          bool = false;
          localObject = null;
          this.body = null;
        }
      }
    }
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\AdResponseParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */