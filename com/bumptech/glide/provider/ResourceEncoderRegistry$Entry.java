package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceEncoder;

final class ResourceEncoderRegistry$Entry
{
  final ResourceEncoder encoder;
  private final Class resourceClass;
  
  ResourceEncoderRegistry$Entry(Class paramClass, ResourceEncoder paramResourceEncoder)
  {
    this.resourceClass = paramClass;
    this.encoder = paramResourceEncoder;
  }
  
  boolean handles(Class paramClass)
  {
    return this.resourceClass.isAssignableFrom(paramClass);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\ResourceEncoderRegistry$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */