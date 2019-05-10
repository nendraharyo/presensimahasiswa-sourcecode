package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

class zzbp$1
  implements Callable
{
  zzbp$1(zzbp paramzzbp, ParcelFileDescriptor paramParcelFileDescriptor, byte[] paramArrayOfByte) {}
  
  public Boolean zzvt()
  {
    int i = 3;
    Object localObject1 = "WearableClient";
    bool1 = Log.isLoggable((String)localObject1, i);
    if (bool1)
    {
      localObject1 = "WearableClient";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("processAssets: writing data to FD : ");
      localObject5 = this.zzbtm;
      localObject4 = localObject5;
      Log.d((String)localObject1, (String)localObject4);
    }
    localObject4 = new android/os/ParcelFileDescriptor$AutoCloseOutputStream;
    localObject1 = this.zzbtm;
    ((ParcelFileDescriptor.AutoCloseOutputStream)localObject4).<init>((ParcelFileDescriptor)localObject1);
    for (;;)
    {
      try
      {
        localObject1 = this.zzbsP;
        ((ParcelFileDescriptor.AutoCloseOutputStream)localObject4).write((byte[])localObject1);
        ((ParcelFileDescriptor.AutoCloseOutputStream)localObject4).flush();
        localObject1 = "WearableClient";
        int j = 3;
        bool1 = Log.isLoggable((String)localObject1, j);
        if (bool1)
        {
          localObject1 = "WearableClient";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject6 = "processAssets: wrote data: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject6 = this.zzbtm;
          localObject5 = ((StringBuilder)localObject5).append(localObject6);
          localObject5 = ((StringBuilder)localObject5).toString();
          Log.d((String)localObject1, (String)localObject5);
        }
        bool1 = true;
        localObject1 = Boolean.valueOf(bool1);
        localObject5 = "WearableClient";
        m = 3;
      }
      catch (IOException localIOException1)
      {
        boolean bool2;
        Object localObject2 = "WearableClient";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = "processAssets: writing data failed: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject6 = this.zzbtm;
        localObject5 = ((StringBuilder)localObject5).append(localObject6);
        localObject5 = ((StringBuilder)localObject5).toString();
        Log.w((String)localObject2, (String)localObject5);
        localObject2 = "WearableClient";
        int k = 3;
        try
        {
          bool1 = Log.isLoggable((String)localObject2, k);
          if (bool1)
          {
            localObject2 = "WearableClient";
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = "processAssets: closing: ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = this.zzbtm;
            localObject5 = ((StringBuilder)localObject5).append(localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            Log.d((String)localObject2, (String)localObject5);
          }
          ((ParcelFileDescriptor.AutoCloseOutputStream)localObject4).close();
        }
        catch (IOException localIOException2)
        {
          boolean bool3;
          continue;
        }
        bool1 = false;
        localObject2 = Boolean.valueOf(false);
        continue;
      }
      finally
      {
        Object localObject6;
        Object localObject7;
        localObject5 = "WearableClient";
        int m = 3;
        try
        {
          bool3 = Log.isLoggable((String)localObject5, m);
          if (bool3)
          {
            localObject5 = "WearableClient";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            localObject7 = "processAssets: closing: ";
            localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
            localObject7 = this.zzbtm;
            localObject6 = ((StringBuilder)localObject6).append(localObject7);
            localObject6 = ((StringBuilder)localObject6).toString();
            Log.d((String)localObject5, (String)localObject6);
          }
          ((ParcelFileDescriptor.AutoCloseOutputStream)localObject4).close();
        }
        catch (IOException localIOException3)
        {
          continue;
        }
      }
      try
      {
        bool2 = Log.isLoggable((String)localObject5, m);
        if (bool2)
        {
          localObject5 = "WearableClient";
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject7 = "processAssets: closing: ";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          localObject7 = this.zzbtm;
          localObject6 = ((StringBuilder)localObject6).append(localObject7);
          localObject6 = ((StringBuilder)localObject6).toString();
          Log.d((String)localObject5, (String)localObject6);
        }
        ((ParcelFileDescriptor.AutoCloseOutputStream)localObject4).close();
      }
      catch (IOException localIOException4) {}
    }
    return (Boolean)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbp$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */