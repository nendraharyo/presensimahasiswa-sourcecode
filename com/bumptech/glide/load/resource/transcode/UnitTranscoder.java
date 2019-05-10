package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

public class UnitTranscoder
  implements ResourceTranscoder
{
  private static final UnitTranscoder UNIT_TRANSCODER;
  
  static
  {
    UnitTranscoder localUnitTranscoder = new com/bumptech/glide/load/resource/transcode/UnitTranscoder;
    localUnitTranscoder.<init>();
    UNIT_TRANSCODER = localUnitTranscoder;
  }
  
  public static ResourceTranscoder get()
  {
    return UNIT_TRANSCODER;
  }
  
  public Resource transcode(Resource paramResource, Options paramOptions)
  {
    return paramResource;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\UnitTranscoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */