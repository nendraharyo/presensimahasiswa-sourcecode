package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class Permission
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private String zzapk;
  private int zzapl;
  private String zzapm;
  private String zzapn;
  private int zzapo;
  private boolean zzapp;
  
  static
  {
    zzj localzzj = new com/google/android/gms/drive/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  Permission(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, int paramInt3, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzapk = paramString1;
    this.zzapl = paramInt2;
    this.zzapm = paramString2;
    this.zzapn = paramString3;
    this.zzapo = paramInt3;
    this.zzapp = paramBoolean;
  }
  
  public static boolean zzcA(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean zzcz(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    Object localObject1;
    Object localObject2;
    if (paramObject != null)
    {
      localObject1 = paramObject.getClass();
      localObject2 = getClass();
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        paramObject = (Permission)paramObject;
        localObject1 = this.zzapk;
        localObject2 = ((Permission)paramObject).zzapk;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          int i = this.zzapl;
          int j = ((Permission)paramObject).zzapl;
          if (i == j)
          {
            i = this.zzapo;
            j = ((Permission)paramObject).zzapo;
            if (i == j)
            {
              boolean bool3 = this.zzapp;
              boolean bool4 = ((Permission)paramObject).zzapp;
              if (bool3 == bool4) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int getRole()
  {
    boolean bool = zzcA(this.zzapo);
    if (!bool) {}
    for (int i = -1;; i = this.zzapo) {
      return i;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzapk;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzapl);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzapo);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.zzapp);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public String zzsO()
  {
    boolean bool = zzcz(this.zzapl);
    if (!bool) {
      bool = false;
    }
    for (String str = null;; str = this.zzapk) {
      return str;
    }
  }
  
  public int zzsP()
  {
    boolean bool = zzcz(this.zzapl);
    if (!bool) {}
    for (int i = -1;; i = this.zzapl) {
      return i;
    }
  }
  
  public String zzsQ()
  {
    return this.zzapm;
  }
  
  public String zzsR()
  {
    return this.zzapn;
  }
  
  public boolean zzsS()
  {
    return this.zzapp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\Permission.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */