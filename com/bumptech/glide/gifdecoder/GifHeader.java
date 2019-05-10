package com.bumptech.glide.gifdecoder;

import java.util.ArrayList;
import java.util.List;

public class GifHeader
{
  public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = 255;
  public static final int NETSCAPE_LOOP_COUNT_FOREVER;
  int bgColor;
  int bgIndex;
  GifFrame currentFrame;
  int frameCount = 0;
  final List frames;
  int[] gct = null;
  boolean gctFlag;
  int gctSize;
  int height;
  int loopCount;
  int pixelAspect;
  int status = 0;
  int width;
  
  public GifHeader()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.frames = localArrayList;
    this.loopCount = -1;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public int getNumFrames()
  {
    return this.frameCount;
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public int getWidth()
  {
    return this.width;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\gifdecoder\GifHeader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */