package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;

final class EncoderRegistry$Entry
{
  private final Class dataClass;
  final Encoder encoder;
  
  EncoderRegistry$Entry(Class paramClass, Encoder paramEncoder)
  {
    this.dataClass = paramClass;
    this.encoder = paramEncoder;
  }
  
  boolean handles(Class paramClass)
  {
    return this.dataClass.isAssignableFrom(paramClass);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\EncoderRegistry$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */