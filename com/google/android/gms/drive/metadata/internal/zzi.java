package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.zzx;

public class zzi
{
  private String zzasR;
  
  private zzi(String paramString)
  {
    String str = paramString.toLowerCase();
    this.zzasR = str;
  }
  
  public static zzi zzdd(String paramString)
  {
    boolean bool;
    zzi localzzi;
    if (paramString != null)
    {
      bool = paramString.isEmpty();
      if (bool) {}
    }
    else
    {
      bool = true;
      zzx.zzac(bool);
      if (paramString != null) {
        break label36;
      }
      bool = false;
      localzzi = null;
    }
    for (;;)
    {
      return localzzi;
      bool = false;
      localzzi = null;
      break;
      label36:
      localzzi = new com/google/android/gms/drive/metadata/internal/zzi;
      localzzi.<init>(paramString);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    String str = null;
    if (paramObject == null) {}
    for (;;)
    {
      return bool;
      if (paramObject == this)
      {
        bool = true;
      }
      else
      {
        Object localObject = paramObject.getClass();
        Class localClass = getClass();
        if (localObject == localClass)
        {
          paramObject = (zzi)paramObject;
          str = this.zzasR;
          localObject = ((zzi)paramObject).zzasR;
          bool = str.equals(localObject);
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.zzasR.hashCode();
  }
  
  public boolean isFolder()
  {
    return this.zzasR.equals("application/vnd.google-apps.folder");
  }
  
  public String toString()
  {
    return this.zzasR;
  }
  
  public boolean zztH()
  {
    boolean bool = zztI();
    if (!bool)
    {
      bool = isFolder();
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean zztI()
  {
    return this.zzasR.startsWith("application/vnd.google-apps");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */