package com.bumptech.glide.gifdecoder;

class GifFrame
{
  static final int DISPOSAL_BACKGROUND = 2;
  static final int DISPOSAL_NONE = 1;
  static final int DISPOSAL_PREVIOUS = 3;
  static final int DISPOSAL_UNSPECIFIED;
  int bufferFrameStart;
  int delay;
  int dispose;
  int ih;
  boolean interlace;
  int iw;
  int ix;
  int iy;
  int[] lct;
  int transIndex;
  boolean transparency;
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\gifdecoder\GifFrame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */