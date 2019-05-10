package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;

class ResourceDecoderRegistry$Entry
{
  private final Class dataClass;
  final ResourceDecoder decoder;
  final Class resourceClass;
  
  public ResourceDecoderRegistry$Entry(Class paramClass1, Class paramClass2, ResourceDecoder paramResourceDecoder)
  {
    this.dataClass = paramClass1;
    this.resourceClass = paramClass2;
    this.decoder = paramResourceDecoder;
  }
  
  public boolean handles(Class paramClass1, Class paramClass2)
  {
    Class localClass = this.dataClass;
    boolean bool = localClass.isAssignableFrom(paramClass1);
    if (bool)
    {
      localClass = this.resourceClass;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\ResourceDecoderRegistry$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */