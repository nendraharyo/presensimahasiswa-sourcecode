package com.bumptech.glide.load;

public enum ImageHeaderParser$ImageType
{
  private final boolean hasAlpha;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("GIF", 0, m);
    GIF = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("JPEG", m, false);
    JPEG = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("RAW", k, false);
    RAW = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("PNG_A", j, m);
    PNG_A = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("PNG", i, false);
    PNG = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("WEBP_A", 5, m);
    WEBP_A = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("WEBP", 6, false);
    WEBP = (ImageType)localObject;
    localObject = new com/bumptech/glide/load/ImageHeaderParser$ImageType;
    ((ImageType)localObject).<init>("UNKNOWN", 7, false);
    UNKNOWN = (ImageType)localObject;
    localObject = new ImageType[8];
    ImageType localImageType1 = GIF;
    localObject[0] = localImageType1;
    localImageType1 = JPEG;
    localObject[m] = localImageType1;
    localImageType1 = RAW;
    localObject[k] = localImageType1;
    localImageType1 = PNG_A;
    localObject[j] = localImageType1;
    localImageType1 = PNG;
    localObject[i] = localImageType1;
    ImageType localImageType2 = WEBP_A;
    localObject[5] = localImageType2;
    localImageType2 = WEBP;
    localObject[6] = localImageType2;
    localImageType2 = UNKNOWN;
    localObject[7] = localImageType2;
    $VALUES = (ImageType[])localObject;
  }
  
  private ImageHeaderParser$ImageType(boolean paramBoolean)
  {
    this.hasAlpha = paramBoolean;
  }
  
  public boolean hasAlpha()
  {
    return this.hasAlpha;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\ImageHeaderParser$ImageType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */