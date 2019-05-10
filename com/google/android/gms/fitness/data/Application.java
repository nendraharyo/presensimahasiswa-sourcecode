package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public final class Application
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final Application zzawa;
  private final int mVersionCode;
  private final String zzTJ;
  private final String zzadc;
  private final String zzawb;
  
  static
  {
    Object localObject = new com/google/android/gms/fitness/data/Application;
    String str = String.valueOf(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    ((Application)localObject).<init>("com.google.android.gms", str, null);
    zzawa = (Application)localObject;
    localObject = new com/google/android/gms/fitness/data/zza;
    ((zza)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  Application(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    String str = (String)zzx.zzz(paramString1);
    this.zzTJ = str;
    this.zzadc = "";
    this.zzawb = paramString3;
  }
  
  public Application(String paramString1, String paramString2, String paramString3)
  {
    this(1, paramString1, "", paramString3);
  }
  
  private boolean zza(Application paramApplication)
  {
    String str1 = this.zzTJ;
    String str2 = paramApplication.zzTJ;
    boolean bool = str1.equals(str2);
    if (bool)
    {
      str1 = this.zzadc;
      str2 = paramApplication.zzadc;
      bool = zzw.equal(str1, str2);
      if (bool)
      {
        str1 = this.zzawb;
        str2 = paramApplication.zzawb;
        bool = zzw.equal(str1, str2);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public static Application zzdn(String paramString)
  {
    return zzg(paramString, null, null);
  }
  
  public static Application zzg(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = "com.google.android.gms";
    boolean bool = ((String)localObject).equals(paramString1);
    if (bool) {
      localObject = zzawa;
    }
    for (;;)
    {
      return (Application)localObject;
      localObject = new com/google/android/gms/fitness/data/Application;
      ((Application)localObject).<init>(paramString1, paramString2, paramString3);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof Application;
      if (!bool) {
        break label33;
      }
      paramObject = (Application)paramObject;
      bool = zza((Application)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String getPackageName()
  {
    return this.zzTJ;
  }
  
  public String getVersion()
  {
    return this.zzadc;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.zzTJ;
    arrayOfObject[0] = str;
    str = this.zzadc;
    arrayOfObject[1] = str;
    str = this.zzawb;
    arrayOfObject[2] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.zzTJ;
    arrayOfObject[0] = str;
    str = this.zzadc;
    arrayOfObject[1] = str;
    str = this.zzawb;
    arrayOfObject[2] = str;
    return String.format("Application{%s:%s:%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public String zzua()
  {
    return this.zzawb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Application.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */