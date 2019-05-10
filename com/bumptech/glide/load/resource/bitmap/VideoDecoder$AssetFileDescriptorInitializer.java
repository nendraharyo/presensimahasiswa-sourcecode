package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;

final class VideoDecoder$AssetFileDescriptorInitializer
  implements VideoDecoder.MediaMetadataRetrieverInitializer
{
  public void initialize(MediaMetadataRetriever paramMediaMetadataRetriever, AssetFileDescriptor paramAssetFileDescriptor)
  {
    FileDescriptor localFileDescriptor = paramAssetFileDescriptor.getFileDescriptor();
    long l1 = paramAssetFileDescriptor.getStartOffset();
    long l2 = paramAssetFileDescriptor.getLength();
    paramMediaMetadataRetriever.setDataSource(localFileDescriptor, l1, l2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\VideoDecoder$AssetFileDescriptorInitializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */