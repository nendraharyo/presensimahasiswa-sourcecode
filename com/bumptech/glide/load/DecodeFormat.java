package com.bumptech.glide.load;

public enum DecodeFormat
{
  public static final DecodeFormat DEFAULT = PREFER_ARGB_8888;
  
  static
  {
    int i = 1;
    Object localObject = new com/bumptech/glide/load/DecodeFormat;
    ((DecodeFormat)localObject).<init>("PREFER_ARGB_8888", 0);
    PREFER_ARGB_8888 = (DecodeFormat)localObject;
    localObject = new com/bumptech/glide/load/DecodeFormat;
    ((DecodeFormat)localObject).<init>("PREFER_RGB_565", i);
    PREFER_RGB_565 = (DecodeFormat)localObject;
    localObject = new DecodeFormat[2];
    DecodeFormat localDecodeFormat = PREFER_ARGB_8888;
    localObject[0] = localDecodeFormat;
    localDecodeFormat = PREFER_RGB_565;
    localObject[i] = localDecodeFormat;
    $VALUES = (DecodeFormat[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\DecodeFormat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */