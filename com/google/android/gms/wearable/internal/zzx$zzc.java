package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import java.io.IOException;
import java.io.InputStream;

public class zzx$zzc
  implements DataApi.GetFdForAssetResult
{
  private volatile boolean mClosed = false;
  private final Status zzUX;
  private volatile InputStream zzbsh;
  private volatile ParcelFileDescriptor zzbsx;
  
  public zzx$zzc(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.zzUX = paramStatus;
    this.zzbsx = paramParcelFileDescriptor;
  }
  
  public ParcelFileDescriptor getFd()
  {
    boolean bool = this.mClosed;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Cannot access the file descriptor after release().");
      throw localIllegalStateException;
    }
    return this.zzbsx;
  }
  
  public InputStream getInputStream()
  {
    boolean bool = this.mClosed;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot access the input stream after release().");
      throw ((Throwable)localObject);
    }
    Object localObject = this.zzbsx;
    if (localObject == null) {
      bool = false;
    }
    for (localObject = null;; localObject = this.zzbsh)
    {
      return (InputStream)localObject;
      localObject = this.zzbsh;
      if (localObject == null)
      {
        localObject = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
        ParcelFileDescriptor localParcelFileDescriptor = this.zzbsx;
        ((ParcelFileDescriptor.AutoCloseInputStream)localObject).<init>(localParcelFileDescriptor);
        this.zzbsh = ((InputStream)localObject);
      }
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    Object localObject = this.zzbsx;
    if (localObject == null) {
      return;
    }
    boolean bool = this.mClosed;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("releasing an already released result.");
      throw ((Throwable)localObject);
    }
    for (;;)
    {
      try
      {
        localObject = this.zzbsh;
        if (localObject == null) {
          break label81;
        }
        localObject = this.zzbsh;
        ((InputStream)localObject).close();
        bool = true;
        this.mClosed = bool;
        bool = false;
        localObject = null;
        this.zzbsx = null;
        bool = false;
        localObject = null;
        this.zzbsh = null;
      }
      catch (IOException localIOException) {}
      break;
      label81:
      ParcelFileDescriptor localParcelFileDescriptor = this.zzbsx;
      localParcelFileDescriptor.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */