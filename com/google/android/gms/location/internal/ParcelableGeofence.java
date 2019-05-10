package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public class ParcelableGeofence
  implements SafeParcelable, Geofence
{
  public static final zzo CREATOR;
  private final int mVersionCode;
  private final String zzEY;
  private final int zzaNC;
  private final short zzaNE;
  private final double zzaNF;
  private final double zzaNG;
  private final float zzaNH;
  private final int zzaNI;
  private final int zzaNJ;
  private final long zzaOZ;
  
  static
  {
    zzo localzzo = new com/google/android/gms/location/internal/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  public ParcelableGeofence(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    zzek(paramString);
    zze(paramFloat);
    zza(paramDouble1, paramDouble2);
    int i = zzhF(paramInt2);
    this.mVersionCode = paramInt1;
    this.zzaNE = paramShort;
    this.zzEY = paramString;
    this.zzaNF = paramDouble1;
    this.zzaNG = paramDouble2;
    this.zzaNH = paramFloat;
    this.zzaOZ = paramLong;
    this.zzaNC = i;
    this.zzaNI = paramInt3;
    this.zzaNJ = paramInt4;
  }
  
  public ParcelableGeofence(String paramString, int paramInt1, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt2, int paramInt3)
  {
    this(1, paramString, paramInt1, paramShort, paramDouble1, paramDouble2, paramFloat, paramLong, paramInt2, paramInt3);
  }
  
  private static void zza(double paramDouble1, double paramDouble2)
  {
    double d = 90.0D;
    boolean bool = paramDouble1 < d;
    IllegalArgumentException localIllegalArgumentException;
    Object localObject;
    if (!bool)
    {
      d = -90.0D;
      bool = paramDouble1 < d;
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid latitude: " + paramDouble1;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    d = 180.0D;
    bool = paramDouble2 < d;
    if (!bool)
    {
      d = -180.0D;
      bool = paramDouble2 < d;
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid longitude: " + paramDouble2;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private static void zze(float paramFloat)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "invalid radius: " + paramFloat;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private static void zzek(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      int j = 100;
      if (i <= j) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "requestId is null or too long: " + paramString;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private static int zzhF(int paramInt)
  {
    int i = paramInt & 0x7;
    if (i == 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "No supported transition specified: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return i;
  }
  
  private static String zzhG(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (String str = null;; str = "CIRCLE") {
      return str;
    }
  }
  
  public static ParcelableGeofence zzo(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    int i = paramArrayOfByte.length;
    localParcel.unmarshall(paramArrayOfByte, 0, i);
    localParcel.setDataPosition(0);
    ParcelableGeofence localParcelableGeofence = CREATOR.zzeZ(localParcel);
    localParcel.recycle();
    return localParcelableGeofence;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        boolean bool2 = paramObject instanceof ParcelableGeofence;
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (ParcelableGeofence)paramObject;
          float f1 = this.zzaNH;
          float f2 = ((ParcelableGeofence)paramObject).zzaNH;
          bool2 = f1 < f2;
          if (bool2)
          {
            bool1 = false;
          }
          else
          {
            double d1 = this.zzaNF;
            double d2 = ((ParcelableGeofence)paramObject).zzaNF;
            bool2 = d1 < d2;
            if (bool2)
            {
              bool1 = false;
            }
            else
            {
              d1 = this.zzaNG;
              d2 = ((ParcelableGeofence)paramObject).zzaNG;
              bool2 = d1 < d2;
              if (bool2)
              {
                bool1 = false;
              }
              else
              {
                int i = this.zzaNE;
                int j = ((ParcelableGeofence)paramObject).zzaNE;
                if (i != j) {
                  bool1 = false;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public long getExpirationTime()
  {
    return this.zzaOZ;
  }
  
  public double getLatitude()
  {
    return this.zzaNF;
  }
  
  public double getLongitude()
  {
    return this.zzaNG;
  }
  
  public int getNotificationResponsiveness()
  {
    return this.zzaNI;
  }
  
  public String getRequestId()
  {
    return this.zzEY;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    int i = 32;
    long l1 = Double.doubleToLongBits(this.zzaNF);
    long l2 = l1 >>> i;
    int j = (int)(l1 ^ l2) + 31;
    l2 = Double.doubleToLongBits(this.zzaNG);
    j *= 31;
    long l3 = l2 >>> i;
    int k = (int)(l2 ^ l3);
    j = (j + k) * 31;
    k = Float.floatToIntBits(this.zzaNH);
    j = (j + k) * 31;
    k = this.zzaNE;
    j = (j + k) * 31;
    k = this.zzaNC;
    return j + k;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[9];
    Object localObject = zzhG(this.zzaNE);
    arrayOfObject[0] = localObject;
    localObject = this.zzEY;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzaNC);
    arrayOfObject[2] = localObject;
    localObject = Double.valueOf(this.zzaNF);
    arrayOfObject[3] = localObject;
    localObject = Double.valueOf(this.zzaNG);
    arrayOfObject[4] = localObject;
    localObject = Float.valueOf(this.zzaNH);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.zzaNI / 1000);
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(this.zzaNJ);
    arrayOfObject[7] = localObject;
    localObject = Long.valueOf(this.zzaOZ);
    arrayOfObject[8] = localObject;
    return String.format(localLocale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
  
  public short zzyT()
  {
    return this.zzaNE;
  }
  
  public float zzyU()
  {
    return this.zzaNH;
  }
  
  public int zzyV()
  {
    return this.zzaNC;
  }
  
  public int zzyW()
  {
    return this.zzaNJ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\ParcelableGeofence.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */