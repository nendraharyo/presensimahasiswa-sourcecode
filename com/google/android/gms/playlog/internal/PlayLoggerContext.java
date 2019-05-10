package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public class PlayLoggerContext
  implements SafeParcelable
{
  public static final zze CREATOR;
  public final String packageName;
  public final int versionCode;
  public final int zzbdL;
  public final int zzbdM;
  public final String zzbdN;
  public final String zzbdO;
  public final boolean zzbdP;
  public final String zzbdQ;
  public final boolean zzbdR;
  public final int zzbdS;
  
  static
  {
    zze localzze = new com/google/android/gms/playlog/internal/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  public PlayLoggerContext(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, int paramInt4)
  {
    this.versionCode = paramInt1;
    this.packageName = paramString1;
    this.zzbdL = paramInt2;
    this.zzbdM = paramInt3;
    this.zzbdN = paramString2;
    this.zzbdO = paramString3;
    this.zzbdP = paramBoolean1;
    this.zzbdQ = paramString4;
    this.zzbdR = paramBoolean2;
    this.zzbdS = paramInt4;
  }
  
  public PlayLoggerContext(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt3)
  {
    this.versionCode = i;
    String str = (String)zzx.zzz(paramString1);
    this.packageName = str;
    this.zzbdL = paramInt1;
    this.zzbdM = paramInt2;
    this.zzbdQ = paramString2;
    this.zzbdN = paramString3;
    this.zzbdO = paramString4;
    boolean bool;
    if (!paramBoolean) {
      bool = i;
    }
    for (;;)
    {
      this.zzbdP = bool;
      this.zzbdR = paramBoolean;
      this.zzbdS = paramInt3;
      return;
      bool = false;
      str = null;
    }
  }
  
  public PlayLoggerContext(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, boolean paramBoolean)
  {
    this.versionCode = 1;
    String str = (String)zzx.zzz(paramString1);
    this.packageName = str;
    this.zzbdL = paramInt1;
    this.zzbdM = paramInt2;
    this.zzbdQ = null;
    this.zzbdN = paramString2;
    this.zzbdO = paramString3;
    this.zzbdP = paramBoolean;
    this.zzbdR = false;
    this.zzbdS = 0;
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
      boolean bool2 = paramObject instanceof PlayLoggerContext;
      if (bool2)
      {
        paramObject = (PlayLoggerContext)paramObject;
        int i = this.versionCode;
        int m = ((PlayLoggerContext)paramObject).versionCode;
        if (i == m)
        {
          String str1 = this.packageName;
          String str2 = ((PlayLoggerContext)paramObject).packageName;
          boolean bool3 = str1.equals(str2);
          if (bool3)
          {
            int j = this.zzbdL;
            m = ((PlayLoggerContext)paramObject).zzbdL;
            if (j == m)
            {
              j = this.zzbdM;
              m = ((PlayLoggerContext)paramObject).zzbdM;
              if (j == m)
              {
                str1 = this.zzbdQ;
                str2 = ((PlayLoggerContext)paramObject).zzbdQ;
                boolean bool4 = zzw.equal(str1, str2);
                if (bool4)
                {
                  str1 = this.zzbdN;
                  str2 = ((PlayLoggerContext)paramObject).zzbdN;
                  bool4 = zzw.equal(str1, str2);
                  if (bool4)
                  {
                    str1 = this.zzbdO;
                    str2 = ((PlayLoggerContext)paramObject).zzbdO;
                    bool4 = zzw.equal(str1, str2);
                    if (bool4)
                    {
                      bool4 = this.zzbdP;
                      boolean bool5 = ((PlayLoggerContext)paramObject).zzbdP;
                      if (bool4 == bool5)
                      {
                        bool4 = this.zzbdR;
                        bool5 = ((PlayLoggerContext)paramObject).zzbdR;
                        if (bool4 == bool5)
                        {
                          int k = this.zzbdS;
                          int n = ((PlayLoggerContext)paramObject).zzbdS;
                          if (k == n) {
                            continue;
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
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[10];
    Object localObject = Integer.valueOf(this.versionCode);
    arrayOfObject[0] = localObject;
    localObject = this.packageName;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzbdL);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzbdM);
    arrayOfObject[3] = localObject;
    localObject = this.zzbdQ;
    arrayOfObject[4] = localObject;
    localObject = this.zzbdN;
    arrayOfObject[5] = localObject;
    localObject = this.zzbdO;
    arrayOfObject[6] = localObject;
    localObject = Boolean.valueOf(this.zzbdP);
    arrayOfObject[7] = localObject;
    localObject = Boolean.valueOf(this.zzbdR);
    arrayOfObject[8] = localObject;
    localObject = Integer.valueOf(this.zzbdS);
    arrayOfObject[9] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    char c = ',';
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("PlayLoggerContext[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("versionCode=");
    int i = this.versionCode;
    localStringBuilder2.append(i).append(c);
    localStringBuilder2 = localStringBuilder1.append("package=");
    String str = this.packageName;
    localStringBuilder2.append(str).append(c);
    localStringBuilder2 = localStringBuilder1.append("packageVersionCode=");
    i = this.zzbdL;
    localStringBuilder2.append(i).append(c);
    localStringBuilder2 = localStringBuilder1.append("logSource=");
    i = this.zzbdM;
    localStringBuilder2.append(i).append(c);
    localStringBuilder2 = localStringBuilder1.append("logSourceName=");
    str = this.zzbdQ;
    localStringBuilder2.append(str).append(c);
    localStringBuilder2 = localStringBuilder1.append("uploadAccount=");
    str = this.zzbdN;
    localStringBuilder2.append(str).append(c);
    localStringBuilder2 = localStringBuilder1.append("loggingId=");
    str = this.zzbdO;
    localStringBuilder2.append(str).append(c);
    localStringBuilder2 = localStringBuilder1.append("logAndroidId=");
    boolean bool = this.zzbdP;
    localStringBuilder2.append(bool).append(c);
    localStringBuilder2 = localStringBuilder1.append("isAnonymous=");
    bool = this.zzbdR;
    localStringBuilder2.append(bool).append(c);
    localStringBuilder2 = localStringBuilder1.append("qosTier=");
    int j = this.zzbdS;
    localStringBuilder2.append(j);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\PlayLoggerContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */