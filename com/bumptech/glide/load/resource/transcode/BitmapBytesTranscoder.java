package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class BitmapBytesTranscoder
  implements ResourceTranscoder
{
  private final Bitmap.CompressFormat compressFormat;
  private final int quality;
  
  public BitmapBytesTranscoder()
  {
    this(localCompressFormat, 100);
  }
  
  public BitmapBytesTranscoder(Bitmap.CompressFormat paramCompressFormat, int paramInt)
  {
    this.compressFormat = paramCompressFormat;
    this.quality = paramInt;
  }
  
  public Resource transcode(Resource paramResource, Options paramOptions)
  {
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    Object localObject2 = (Bitmap)paramResource.get();
    Bitmap.CompressFormat localCompressFormat = this.compressFormat;
    int i = this.quality;
    ((Bitmap)localObject2).compress(localCompressFormat, i, (OutputStream)localObject1);
    paramResource.recycle();
    localObject2 = new com/bumptech/glide/load/resource/bytes/BytesResource;
    localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
    ((BytesResource)localObject2).<init>((byte[])localObject1);
    return (Resource)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\BitmapBytesTranscoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */