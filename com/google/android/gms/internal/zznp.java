package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.zzk;
import java.util.Collection;
import java.util.Iterator;

public class zznp
  extends zzk
{
  public static final zznp zzatS;
  
  static
  {
    zznp localzznp = new com/google/android/gms/internal/zznp;
    localzznp.<init>();
    zzatS = localzznp;
  }
  
  private zznp()
  {
    super("driveId", (Collection)localObject1, (Collection)localObject2, 4100000);
  }
  
  protected boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Object localObject = zzty();
    Iterator localIterator = ((Collection)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      bool = paramDataHolder.zzcz((String)localObject);
    } while (bool);
    boolean bool = false;
    localObject = null;
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  protected DriveId zzm(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    long l1 = paramDataHolder.zzpZ().getLong("dbInstanceId");
    Object localObject = zznm.zzatr.getName();
    localObject = paramDataHolder.zzd((String)localObject, paramInt1, paramInt2);
    String str1 = "application/vnd.google-apps.folder";
    boolean bool1 = str1.equals(localObject);
    if (bool1) {}
    for (int i = 1;; i = 0)
    {
      str1 = paramDataHolder.zzd("resourceId", paramInt1, paramInt2);
      long l2 = paramDataHolder.zzb("sqlId", paramInt1, paramInt2);
      Long localLong = Long.valueOf(l2);
      localObject = new com/google/android/gms/drive/DriveId;
      String str2 = "generated-android-null";
      boolean bool2 = str2.equals(str1);
      if (bool2) {
        str1 = null;
      }
      l2 = localLong.longValue();
      ((DriveId)localObject).<init>(str1, l2, l1, i);
      return (DriveId)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */