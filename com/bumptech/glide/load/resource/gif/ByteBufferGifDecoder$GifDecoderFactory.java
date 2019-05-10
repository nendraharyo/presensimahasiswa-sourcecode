package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import java.nio.ByteBuffer;

class ByteBufferGifDecoder$GifDecoderFactory
{
  GifDecoder build(GifDecoder.BitmapProvider paramBitmapProvider, GifHeader paramGifHeader, ByteBuffer paramByteBuffer, int paramInt)
  {
    StandardGifDecoder localStandardGifDecoder = new com/bumptech/glide/gifdecoder/StandardGifDecoder;
    localStandardGifDecoder.<init>(paramBitmapProvider, paramGifHeader, paramByteBuffer, paramInt);
    return localStandardGifDecoder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\ByteBufferGifDecoder$GifDecoderFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */