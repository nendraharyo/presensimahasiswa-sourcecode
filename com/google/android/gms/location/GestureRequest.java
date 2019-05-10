package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class GestureRequest
  implements SafeParcelable
{
  public static final zzb CREATOR;
  private static final List zzaNP;
  private static final List zzaNQ;
  private static final List zzaNR;
  private static final List zzaNS;
  private final int mVersionCode;
  private final List zzaNT;
  
  static
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    Object localObject = new Integer[19];
    Integer localInteger1 = Integer.valueOf(n);
    localObject[0] = localInteger1;
    Integer localInteger2 = Integer.valueOf(m);
    localObject[n] = localInteger2;
    localInteger2 = Integer.valueOf(k);
    localObject[m] = localInteger2;
    localInteger2 = Integer.valueOf(j);
    localObject[k] = localInteger2;
    localInteger2 = Integer.valueOf(i);
    localObject[j] = localInteger2;
    localInteger2 = Integer.valueOf(6);
    localObject[i] = localInteger2;
    localInteger1 = Integer.valueOf(7);
    localObject[6] = localInteger1;
    localInteger1 = Integer.valueOf(8);
    localObject[7] = localInteger1;
    localInteger1 = Integer.valueOf(9);
    localObject[8] = localInteger1;
    localInteger1 = Integer.valueOf(10);
    localObject[9] = localInteger1;
    localInteger1 = Integer.valueOf(11);
    localObject[10] = localInteger1;
    localInteger1 = Integer.valueOf(12);
    localObject[11] = localInteger1;
    localInteger1 = Integer.valueOf(13);
    localObject[12] = localInteger1;
    localInteger1 = Integer.valueOf(14);
    localObject[13] = localInteger1;
    localInteger1 = Integer.valueOf(15);
    localObject[14] = localInteger1;
    localInteger1 = Integer.valueOf(16);
    localObject[15] = localInteger1;
    localInteger1 = Integer.valueOf(17);
    localObject[16] = localInteger1;
    localInteger1 = Integer.valueOf(18);
    localObject[17] = localInteger1;
    localInteger1 = Integer.valueOf(19);
    localObject[18] = localInteger1;
    zzaNP = Collections.unmodifiableList(Arrays.asList((Object[])localObject));
    localObject = new Integer[n];
    localInteger1 = Integer.valueOf(n);
    localObject[0] = localInteger1;
    zzaNQ = Collections.unmodifiableList(Arrays.asList((Object[])localObject));
    localObject = new Integer[10];
    localInteger1 = Integer.valueOf(m);
    localObject[0] = localInteger1;
    localInteger2 = Integer.valueOf(j);
    localObject[n] = localInteger2;
    localInteger2 = Integer.valueOf(6);
    localObject[m] = localInteger2;
    localInteger2 = Integer.valueOf(8);
    localObject[k] = localInteger2;
    localInteger2 = Integer.valueOf(10);
    localObject[j] = localInteger2;
    localInteger2 = Integer.valueOf(12);
    localObject[i] = localInteger2;
    localInteger1 = Integer.valueOf(14);
    localObject[6] = localInteger1;
    localInteger1 = Integer.valueOf(16);
    localObject[7] = localInteger1;
    localInteger1 = Integer.valueOf(18);
    localObject[8] = localInteger1;
    localInteger1 = Integer.valueOf(19);
    localObject[9] = localInteger1;
    zzaNR = Collections.unmodifiableList(Arrays.asList((Object[])localObject));
    localObject = new Integer[8];
    localInteger1 = Integer.valueOf(k);
    localObject[0] = localInteger1;
    localInteger2 = Integer.valueOf(i);
    localObject[n] = localInteger2;
    localInteger2 = Integer.valueOf(7);
    localObject[m] = localInteger2;
    localInteger2 = Integer.valueOf(9);
    localObject[k] = localInteger2;
    localInteger2 = Integer.valueOf(11);
    localObject[j] = localInteger2;
    localInteger2 = Integer.valueOf(13);
    localObject[i] = localInteger2;
    localInteger1 = Integer.valueOf(15);
    localObject[6] = localInteger1;
    localInteger1 = Integer.valueOf(17);
    localObject[7] = localInteger1;
    zzaNS = Collections.unmodifiableList(Arrays.asList((Object[])localObject));
    localObject = new com/google/android/gms/location/zzb;
    ((zzb)localObject).<init>();
    CREATOR = (zzb)localObject;
  }
  
  GestureRequest(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaNT = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public List zzyJ()
  {
    return this.zzaNT;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\GestureRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */