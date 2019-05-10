package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.zzb;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

final class ImageManager$ImageReceiver
  extends ResultReceiver
{
  private final Uri mUri;
  private final ArrayList zzajJ;
  
  ImageManager$ImageReceiver(ImageManager paramImageManager, Uri paramUri)
  {
    super((Handler)localObject);
    this.mUri = paramUri;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzajJ = ((ArrayList)localObject);
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
    ExecutorService localExecutorService = ImageManager.zzf(this.zzajK);
    ImageManager.zzc localzzc = new com/google/android/gms/common/images/ImageManager$zzc;
    ImageManager localImageManager = this.zzajK;
    Uri localUri = this.mUri;
    localzzc.<init>(localImageManager, localUri, localParcelFileDescriptor);
    localExecutorService.execute(localzzc);
  }
  
  public void zzb(zza paramzza)
  {
    zzb.zzcD("ImageReceiver.addImageRequest() must be called in the main thread");
    this.zzajJ.add(paramzza);
  }
  
  public void zzc(zza paramzza)
  {
    zzb.zzcD("ImageReceiver.removeImageRequest() must be called in the main thread");
    this.zzajJ.remove(paramzza);
  }
  
  public void zzqm()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.common.images.LOAD_IMAGE");
    Uri localUri = this.mUri;
    localIntent.putExtra("com.google.android.gms.extras.uri", localUri);
    localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
    localIntent.putExtra("com.google.android.gms.extras.priority", 3);
    ImageManager.zzb(this.zzajK).sendBroadcast(localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager$ImageReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */