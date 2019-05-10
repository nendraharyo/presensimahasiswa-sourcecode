package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;

final class VideoDecoder$ParcelFileDescriptorInitializer
  implements VideoDecoder.MediaMetadataRetrieverInitializer
{
  public void initialize(MediaMetadataRetriever paramMediaMetadataRetriever, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    FileDescriptor localFileDescriptor = paramParcelFileDescriptor.getFileDescriptor();
    paramMediaMetadataRetriever.setDataSource(localFileDescriptor);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\VideoDecoder$ParcelFileDescriptorInitializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */