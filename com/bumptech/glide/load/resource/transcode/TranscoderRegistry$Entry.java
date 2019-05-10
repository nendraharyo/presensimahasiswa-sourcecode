package com.bumptech.glide.load.resource.transcode;

final class TranscoderRegistry$Entry
{
  private final Class fromClass;
  private final Class toClass;
  final ResourceTranscoder transcoder;
  
  TranscoderRegistry$Entry(Class paramClass1, Class paramClass2, ResourceTranscoder paramResourceTranscoder)
  {
    this.fromClass = paramClass1;
    this.toClass = paramClass2;
    this.transcoder = paramResourceTranscoder;
  }
  
  public boolean handles(Class paramClass1, Class paramClass2)
  {
    Class localClass = this.fromClass;
    boolean bool = localClass.isAssignableFrom(paramClass1);
    if (bool)
    {
      localClass = this.toClass;
      bool = paramClass2.isAssignableFrom(localClass);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClass = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\TranscoderRegistry$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */