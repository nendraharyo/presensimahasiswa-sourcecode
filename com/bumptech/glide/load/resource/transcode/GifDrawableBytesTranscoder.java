package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;
import java.nio.ByteBuffer;

public class GifDrawableBytesTranscoder
  implements ResourceTranscoder
{
  public Resource transcode(Resource paramResource, Options paramOptions)
  {
    Object localObject = ((GifDrawable)paramResource.get()).getBuffer();
    BytesResource localBytesResource = new com/bumptech/glide/load/resource/bytes/BytesResource;
    localObject = ByteBufferUtil.toBytes((ByteBuffer)localObject);
    localBytesResource.<init>((byte[])localObject);
    return localBytesResource;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\GifDrawableBytesTranscoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */