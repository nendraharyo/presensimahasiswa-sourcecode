package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;

public final class GifOptions
{
  public static final Option DECODE_FORMAT;
  public static final Option DISABLE_ANIMATION;
  
  static
  {
    Object localObject = DecodeFormat.DEFAULT;
    DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat", localObject);
    localObject = Boolean.valueOf(false);
    DISABLE_ANIMATION = Option.memory("com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation", localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */