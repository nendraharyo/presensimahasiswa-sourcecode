package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmr;
import java.util.Set;
import java.util.regex.Pattern;

public class DriveSpace
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final DriveSpace zzaoP;
  public static final DriveSpace zzaoQ;
  public static final DriveSpace zzaoR;
  public static final Set zzaoS;
  public static final String zzaoT;
  private static final Pattern zzaoU = Pattern.compile("[A-Z0-9_]*");
  private final String mName;
  final int mVersionCode;
  
  static
  {
    Object localObject1 = new com/google/android/gms/drive/zzg;
    ((zzg)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
    localObject1 = new com/google/android/gms/drive/DriveSpace;
    ((DriveSpace)localObject1).<init>("DRIVE");
    zzaoP = (DriveSpace)localObject1;
    localObject1 = new com/google/android/gms/drive/DriveSpace;
    ((DriveSpace)localObject1).<init>("APP_DATA_FOLDER");
    zzaoQ = (DriveSpace)localObject1;
    localObject1 = new com/google/android/gms/drive/DriveSpace;
    ((DriveSpace)localObject1).<init>("PHOTOS");
    zzaoR = (DriveSpace)localObject1;
    localObject1 = zzaoP;
    Object localObject2 = zzaoQ;
    DriveSpace localDriveSpace = zzaoR;
    zzaoS = zzmr.zza(localObject1, localObject2, localDriveSpace);
    localObject2 = zzaoS.toArray();
    zzaoT = TextUtils.join(",", (Object[])localObject2);
  }
  
  DriveSpace(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    String str = (String)zzx.zzz(paramString);
    this.mName = str;
  }
  
  private DriveSpace(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    Object localObject1;
    Object localObject2;
    boolean bool;
    if (paramObject != null)
    {
      localObject1 = paramObject.getClass();
      localObject2 = DriveSpace.class;
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      localObject1 = this.mName;
      paramObject = (DriveSpace)paramObject;
      localObject2 = ((DriveSpace)paramObject).mName;
      bool = ((String)localObject1).equals(localObject2);
    }
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public int hashCode()
  {
    int i = this.mName.hashCode();
    return 0x4A54C0DE ^ i;
  }
  
  public String toString()
  {
    return this.mName;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\DriveSpace.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */