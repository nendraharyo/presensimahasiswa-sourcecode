package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzab;
import com.google.android.gms.drive.internal.zzat;
import com.google.android.gms.drive.internal.zzau;
import com.google.android.gms.drive.internal.zzw;
import com.google.android.gms.drive.internal.zzy;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;

public class DriveId
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int RESOURCE_TYPE_FILE = 0;
  public static final int RESOURCE_TYPE_FOLDER = 1;
  public static final int RESOURCE_TYPE_UNKNOWN = 255;
  final int mVersionCode;
  final String zzaoL;
  final long zzaoM;
  final int zzaoN;
  private volatile String zzaoO = null;
  final long zzaou;
  private volatile String zzaow = null;
  
  static
  {
    zze localzze = new com/google/android/gms/drive/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  DriveId(int paramInt1, String paramString, long paramLong1, long paramLong2, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzaoL = paramString;
    String str = "";
    boolean bool3 = str.equals(paramString);
    if (!bool3) {
      bool3 = bool1;
    }
    for (;;)
    {
      zzx.zzac(bool3);
      if (paramString == null)
      {
        long l = -1;
        bool3 = paramLong1 < l;
        if (!bool3) {}
      }
      else
      {
        bool2 = bool1;
      }
      zzx.zzac(bool2);
      this.zzaoM = paramLong1;
      this.zzaou = paramLong2;
      this.zzaoN = paramInt2;
      return;
      bool3 = false;
      str = null;
    }
  }
  
  public DriveId(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    this(1, paramString, paramLong1, paramLong2, paramInt);
  }
  
  public static DriveId decodeFromString(String paramString)
  {
    boolean bool = paramString.startsWith("DriveId:");
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Invalid DriveId: " + paramString;
    zzx.zzb(bool, localObject);
    int i = "DriveId:".length();
    return zzl(Base64.decode(paramString.substring(i), 10));
  }
  
  public static DriveId zzcW(String paramString)
  {
    long l = -1;
    zzx.zzz(paramString);
    DriveId localDriveId = new com/google/android/gms/drive/DriveId;
    localDriveId.<init>(paramString, l, l, -1);
    return localDriveId;
  }
  
  static DriveId zzl(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      IllegalArgumentException localIllegalArgumentException;
      try
      {
        zzat localzzat = zzat.zzm(paramArrayOfByte);
        Object localObject = "";
        String str1 = localzzat.zzarY;
        boolean bool = ((String)localObject).equals(str1);
        if (bool)
        {
          str2 = null;
          localObject = new com/google/android/gms/drive/DriveId;
          int i = localzzat.versionCode;
          long l1 = localzzat.zzarZ;
          long l2 = localzzat.zzarW;
          int j = localzzat.zzasa;
          ((DriveId)localObject).<init>(i, str2, l1, l2, j);
          return (DriveId)localObject;
        }
      }
      catch (zzst localzzst)
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>();
        throw localIllegalArgumentException;
      }
      String str2 = localIllegalArgumentException.zzarY;
    }
  }
  
  private byte[] zzsA()
  {
    zzau localzzau = new com/google/android/gms/drive/internal/zzau;
    localzzau.<init>();
    long l = this.zzaoM;
    localzzau.zzarZ = l;
    l = this.zzaou;
    localzzau.zzarW = l;
    return zzsu.toByteArray(localzzau);
  }
  
  public DriveFile asDriveFile()
  {
    int i = this.zzaoN;
    int j = 1;
    if (i == j)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This DriveId corresponds to a folder. Call asDriveFolder instead.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/internal/zzw;
    ((zzw)localObject).<init>(this);
    return (DriveFile)localObject;
  }
  
  public DriveFolder asDriveFolder()
  {
    int i = this.zzaoN;
    if (i == 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("This DriveId corresponds to a file. Call asDriveFile instead.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/internal/zzy;
    ((zzy)localObject).<init>(this);
    return (DriveFolder)localObject;
  }
  
  public DriveResource asDriveResource()
  {
    int i = this.zzaoN;
    int j = 1;
    Object localObject;
    if (i == j) {
      localObject = asDriveFolder();
    }
    for (;;)
    {
      return (DriveResource)localObject;
      i = this.zzaoN;
      if (i == 0)
      {
        localObject = asDriveFile();
      }
      else
      {
        localObject = new com/google/android/gms/drive/internal/zzab;
        ((zzab)localObject).<init>(this);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String encodeToString()
  {
    Object localObject = this.zzaow;
    if (localObject == null)
    {
      localObject = zzsu();
      int i = 10;
      localObject = Base64.encodeToString((byte[])localObject, i);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "DriveId:";
      localStringBuilder = localStringBuilder.append(str);
      localObject = (String)localObject;
      this.zzaow = ((String)localObject);
    }
    return this.zzaow;
  }
  
  public boolean equals(Object paramObject)
  {
    long l1 = -1;
    boolean bool1 = true;
    boolean bool2 = false;
    String str1 = null;
    boolean bool3 = paramObject instanceof DriveId;
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      paramObject = (DriveId)paramObject;
      long l2 = ((DriveId)paramObject).zzaou;
      long l3 = this.zzaou;
      bool3 = l2 < l3;
      if (!bool3)
      {
        l2 = ((DriveId)paramObject).zzaoM;
        bool3 = l2 < l1;
        String str2;
        if (!bool3)
        {
          l2 = this.zzaoM;
          bool3 = l2 < l1;
          if (!bool3)
          {
            str2 = ((DriveId)paramObject).zzaoL;
            str1 = this.zzaoL;
            bool2 = str2.equals(str1);
            continue;
          }
        }
        String str3 = this.zzaoL;
        if (str3 != null)
        {
          str3 = ((DriveId)paramObject).zzaoL;
          if (str3 != null) {}
        }
        else
        {
          l2 = ((DriveId)paramObject).zzaoM;
          l3 = this.zzaoM;
          bool3 = l2 < l3;
          if (!bool3) {}
          for (;;)
          {
            bool2 = bool1;
            break;
            bool1 = false;
            str2 = null;
          }
        }
        l2 = ((DriveId)paramObject).zzaoM;
        l3 = this.zzaoM;
        bool3 = l2 < l3;
        if (!bool3)
        {
          str3 = ((DriveId)paramObject).zzaoL;
          String str4 = this.zzaoL;
          bool3 = str3.equals(str4);
          if (bool3)
          {
            bool2 = bool1;
          }
          else
          {
            str2 = "DriveId";
            str3 = "Unexpected unequal resourceId for same DriveId object.";
            zzz.zzz(str2, str3);
          }
        }
      }
    }
  }
  
  public String getResourceId()
  {
    return this.zzaoL;
  }
  
  public int getResourceType()
  {
    return this.zzaoN;
  }
  
  public int hashCode()
  {
    long l1 = this.zzaoM;
    long l2 = -1;
    boolean bool = l1 < l2;
    Object localObject;
    if (!bool) {
      localObject = this.zzaoL;
    }
    for (int i = ((String)localObject).hashCode();; i = ((String)localObject).hashCode())
    {
      return i;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = String.valueOf(this.zzaou);
      localObject = ((StringBuilder)localObject).append(str);
      l2 = this.zzaoM;
      str = String.valueOf(l2);
      localObject = str;
    }
  }
  
  public final String toInvariantString()
  {
    Object localObject = this.zzaoO;
    if (localObject == null)
    {
      localObject = zzsA();
      int i = 10;
      localObject = Base64.encodeToString((byte[])localObject, i);
      this.zzaoO = ((String)localObject);
    }
    return this.zzaoO;
  }
  
  public String toString()
  {
    return encodeToString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  final byte[] zzsu()
  {
    zzat localzzat = new com/google/android/gms/drive/internal/zzat;
    localzzat.<init>();
    int i = this.mVersionCode;
    localzzat.versionCode = i;
    String str = this.zzaoL;
    if (str == null) {}
    for (str = "";; str = this.zzaoL)
    {
      localzzat.zzarY = str;
      long l = this.zzaoM;
      localzzat.zzarZ = l;
      l = this.zzaou;
      localzzat.zzarW = l;
      i = this.zzaoN;
      localzzat.zzasa = i;
      return zzsu.toByteArray(localzzat);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\DriveId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */