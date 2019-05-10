package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Arrays;

public class PlusSession
  implements SafeParcelable
{
  public static final zzh CREATOR;
  private final int mVersionCode;
  private final String zzVa;
  private final String zzada;
  private final String[] zzber;
  private final String[] zzbes;
  private final String[] zzbet;
  private final String zzbeu;
  private final String zzbev;
  private final String zzbew;
  private final PlusCommonExtras zzbex;
  
  static
  {
    zzh localzzh = new com/google/android/gms/plus/internal/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  PlusSession(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5, PlusCommonExtras paramPlusCommonExtras)
  {
    this.mVersionCode = paramInt;
    this.zzVa = paramString1;
    this.zzber = paramArrayOfString1;
    this.zzbes = paramArrayOfString2;
    this.zzbet = paramArrayOfString3;
    this.zzbeu = paramString2;
    this.zzbev = paramString3;
    this.zzada = paramString4;
    this.zzbew = paramString5;
    this.zzbex = paramPlusCommonExtras;
  }
  
  public PlusSession(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, PlusCommonExtras paramPlusCommonExtras)
  {
    this.mVersionCode = 1;
    this.zzVa = paramString1;
    this.zzber = paramArrayOfString1;
    this.zzbes = paramArrayOfString2;
    this.zzbet = paramArrayOfString3;
    this.zzbeu = paramString2;
    this.zzbev = paramString3;
    this.zzada = paramString4;
    this.zzbew = null;
    this.zzbex = paramPlusCommonExtras;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof PlusSession;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (PlusSession)paramObject;
      int i = this.mVersionCode;
      int j = ((PlusSession)paramObject).mVersionCode;
      if (i == j)
      {
        Object localObject1 = this.zzVa;
        Object localObject2 = ((PlusSession)paramObject).zzVa;
        boolean bool3 = zzw.equal(localObject1, localObject2);
        if (bool3)
        {
          localObject1 = this.zzber;
          localObject2 = ((PlusSession)paramObject).zzber;
          bool3 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
          if (bool3)
          {
            localObject1 = this.zzbes;
            localObject2 = ((PlusSession)paramObject).zzbes;
            bool3 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
            if (bool3)
            {
              localObject1 = this.zzbet;
              localObject2 = ((PlusSession)paramObject).zzbet;
              bool3 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
              if (bool3)
              {
                localObject1 = this.zzbeu;
                localObject2 = ((PlusSession)paramObject).zzbeu;
                bool3 = zzw.equal(localObject1, localObject2);
                if (bool3)
                {
                  localObject1 = this.zzbev;
                  localObject2 = ((PlusSession)paramObject).zzbev;
                  bool3 = zzw.equal(localObject1, localObject2);
                  if (bool3)
                  {
                    localObject1 = this.zzada;
                    localObject2 = ((PlusSession)paramObject).zzada;
                    bool3 = zzw.equal(localObject1, localObject2);
                    if (bool3)
                    {
                      localObject1 = this.zzbew;
                      localObject2 = ((PlusSession)paramObject).zzbew;
                      bool3 = zzw.equal(localObject1, localObject2);
                      if (bool3)
                      {
                        localObject1 = this.zzbex;
                        localObject2 = ((PlusSession)paramObject).zzbex;
                        bool3 = zzw.equal(localObject1, localObject2);
                        if (bool3) {
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
  
  public String getAccountName()
  {
    return this.zzVa;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[10];
    Object localObject = Integer.valueOf(this.mVersionCode);
    arrayOfObject[0] = localObject;
    localObject = this.zzVa;
    arrayOfObject[1] = localObject;
    localObject = this.zzber;
    arrayOfObject[2] = localObject;
    localObject = this.zzbes;
    arrayOfObject[3] = localObject;
    localObject = this.zzbet;
    arrayOfObject[4] = localObject;
    localObject = this.zzbeu;
    arrayOfObject[5] = localObject;
    localObject = this.zzbev;
    arrayOfObject[6] = localObject;
    localObject = this.zzada;
    arrayOfObject[7] = localObject;
    localObject = this.zzbew;
    arrayOfObject[8] = localObject;
    localObject = this.zzbex;
    arrayOfObject[9] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Integer.valueOf(this.mVersionCode);
    localzza = localzza.zzg("versionCode", localObject);
    localObject = this.zzVa;
    localzza = localzza.zzg("accountName", localObject);
    localObject = this.zzber;
    localzza = localzza.zzg("requestedScopes", localObject);
    localObject = this.zzbes;
    localzza = localzza.zzg("visibleActivities", localObject);
    localObject = this.zzbet;
    localzza = localzza.zzg("requiredFeatures", localObject);
    localObject = this.zzbeu;
    localzza = localzza.zzg("packageNameForAuth", localObject);
    localObject = this.zzbev;
    localzza = localzza.zzg("callingPackageName", localObject);
    localObject = this.zzada;
    localzza = localzza.zzg("applicationName", localObject);
    localObject = this.zzbex.toString();
    return localzza.zzg("extra", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public String[] zzFd()
  {
    return this.zzber;
  }
  
  public String[] zzFe()
  {
    return this.zzbes;
  }
  
  public String[] zzFf()
  {
    return this.zzbet;
  }
  
  public String zzFg()
  {
    return this.zzbeu;
  }
  
  public String zzFh()
  {
    return this.zzbev;
  }
  
  public String zzFi()
  {
    return this.zzbew;
  }
  
  public PlusCommonExtras zzFj()
  {
    return this.zzbex;
  }
  
  public Bundle zzFk()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    ClassLoader localClassLoader = PlusCommonExtras.class.getClassLoader();
    localBundle.setClassLoader(localClassLoader);
    this.zzbex.zzJ(localBundle);
    return localBundle;
  }
  
  public String zznX()
  {
    return this.zzada;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\PlusSession.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */