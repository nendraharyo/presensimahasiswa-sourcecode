package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

public final class AdRequestParcel
  implements SafeParcelable
{
  public static final zzg CREATOR;
  public final Bundle extras;
  public final int versionCode;
  public final long zztC;
  public final int zztD;
  public final List zztE;
  public final boolean zztF;
  public final int zztG;
  public final boolean zztH;
  public final String zztI;
  public final SearchAdRequestParcel zztJ;
  public final Location zztK;
  public final String zztL;
  public final Bundle zztM;
  public final Bundle zztN;
  public final List zztO;
  public final String zztP;
  public final String zztQ;
  public final boolean zztR;
  
  static
  {
    zzg localzzg = new com/google/android/gms/ads/internal/client/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  public AdRequestParcel(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, SearchAdRequestParcel paramSearchAdRequestParcel, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List paramList2, String paramString3, String paramString4, boolean paramBoolean3)
  {
    this.versionCode = paramInt1;
    this.zztC = paramLong;
    if (paramBundle1 == null)
    {
      paramBundle1 = new android/os/Bundle;
      paramBundle1.<init>();
    }
    this.extras = paramBundle1;
    this.zztD = paramInt2;
    this.zztE = paramList1;
    this.zztF = paramBoolean1;
    this.zztG = paramInt3;
    this.zztH = paramBoolean2;
    this.zztI = paramString1;
    this.zztJ = paramSearchAdRequestParcel;
    this.zztK = paramLocation;
    this.zztL = paramString2;
    this.zztM = paramBundle2;
    this.zztN = paramBundle3;
    this.zztO = paramList2;
    this.zztP = paramString3;
    this.zztQ = paramString4;
    this.zztR = paramBoolean3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof AdRequestParcel;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (AdRequestParcel)paramObject;
      int i = this.versionCode;
      int m = ((AdRequestParcel)paramObject).versionCode;
      if (i == m)
      {
        long l1 = this.zztC;
        long l2 = ((AdRequestParcel)paramObject).zztC;
        boolean bool3 = l1 < l2;
        if (!bool3)
        {
          Object localObject1 = this.extras;
          Object localObject2 = ((AdRequestParcel)paramObject).extras;
          bool3 = zzw.equal(localObject1, localObject2);
          if (bool3)
          {
            int j = this.zztD;
            m = ((AdRequestParcel)paramObject).zztD;
            if (j == m)
            {
              localObject1 = this.zztE;
              localObject2 = ((AdRequestParcel)paramObject).zztE;
              boolean bool4 = zzw.equal(localObject1, localObject2);
              if (bool4)
              {
                bool4 = this.zztF;
                boolean bool6 = ((AdRequestParcel)paramObject).zztF;
                if (bool4 == bool6)
                {
                  int k = this.zztG;
                  int n = ((AdRequestParcel)paramObject).zztG;
                  if (k == n)
                  {
                    boolean bool5 = this.zztH;
                    boolean bool7 = ((AdRequestParcel)paramObject).zztH;
                    if (bool5 == bool7)
                    {
                      localObject1 = this.zztI;
                      localObject2 = ((AdRequestParcel)paramObject).zztI;
                      bool5 = zzw.equal(localObject1, localObject2);
                      if (bool5)
                      {
                        localObject1 = this.zztJ;
                        localObject2 = ((AdRequestParcel)paramObject).zztJ;
                        bool5 = zzw.equal(localObject1, localObject2);
                        if (bool5)
                        {
                          localObject1 = this.zztK;
                          localObject2 = ((AdRequestParcel)paramObject).zztK;
                          bool5 = zzw.equal(localObject1, localObject2);
                          if (bool5)
                          {
                            localObject1 = this.zztL;
                            localObject2 = ((AdRequestParcel)paramObject).zztL;
                            bool5 = zzw.equal(localObject1, localObject2);
                            if (bool5)
                            {
                              localObject1 = this.zztM;
                              localObject2 = ((AdRequestParcel)paramObject).zztM;
                              bool5 = zzw.equal(localObject1, localObject2);
                              if (bool5)
                              {
                                localObject1 = this.zztN;
                                localObject2 = ((AdRequestParcel)paramObject).zztN;
                                bool5 = zzw.equal(localObject1, localObject2);
                                if (bool5)
                                {
                                  localObject1 = this.zztO;
                                  localObject2 = ((AdRequestParcel)paramObject).zztO;
                                  bool5 = zzw.equal(localObject1, localObject2);
                                  if (bool5)
                                  {
                                    localObject1 = this.zztP;
                                    localObject2 = ((AdRequestParcel)paramObject).zztP;
                                    bool5 = zzw.equal(localObject1, localObject2);
                                    if (bool5)
                                    {
                                      localObject1 = this.zztQ;
                                      localObject2 = ((AdRequestParcel)paramObject).zztQ;
                                      bool5 = zzw.equal(localObject1, localObject2);
                                      if (bool5)
                                      {
                                        bool5 = this.zztR;
                                        bool7 = ((AdRequestParcel)paramObject).zztR;
                                        if (bool5 == bool7) {
                                          bool1 = true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[18];
    Object localObject = Integer.valueOf(this.versionCode);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zztC);
    arrayOfObject[1] = localObject;
    localObject = this.extras;
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zztD);
    arrayOfObject[3] = localObject;
    localObject = this.zztE;
    arrayOfObject[4] = localObject;
    localObject = Boolean.valueOf(this.zztF);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.zztG);
    arrayOfObject[6] = localObject;
    localObject = Boolean.valueOf(this.zztH);
    arrayOfObject[7] = localObject;
    localObject = this.zztI;
    arrayOfObject[8] = localObject;
    localObject = this.zztJ;
    arrayOfObject[9] = localObject;
    localObject = this.zztK;
    arrayOfObject[10] = localObject;
    localObject = this.zztL;
    arrayOfObject[11] = localObject;
    localObject = this.zztM;
    arrayOfObject[12] = localObject;
    localObject = this.zztN;
    arrayOfObject[13] = localObject;
    localObject = this.zztO;
    arrayOfObject[14] = localObject;
    localObject = this.zztP;
    arrayOfObject[15] = localObject;
    localObject = this.zztQ;
    arrayOfObject[16] = localObject;
    localObject = Boolean.valueOf(this.zztR);
    arrayOfObject[17] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\AdRequestParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */