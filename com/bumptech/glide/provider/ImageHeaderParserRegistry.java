package com.bumptech.glide.provider;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class ImageHeaderParserRegistry
{
  private final List parsers;
  
  public ImageHeaderParserRegistry()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.parsers = localArrayList;
  }
  
  public void add(ImageHeaderParser paramImageHeaderParser)
  {
    try
    {
      List localList = this.parsers;
      localList.add(paramImageHeaderParser);
      return;
    }
    finally {}
  }
  
  public List getParsers()
  {
    try
    {
      List localList = this.parsers;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\ImageHeaderParserRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */