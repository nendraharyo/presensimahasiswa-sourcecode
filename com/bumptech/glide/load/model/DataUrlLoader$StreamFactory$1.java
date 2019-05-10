package com.bumptech.glide.load.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class DataUrlLoader$StreamFactory$1
  implements DataUrlLoader.DataDecoder
{
  DataUrlLoader$StreamFactory$1(DataUrlLoader.StreamFactory paramStreamFactory) {}
  
  public void close(InputStream paramInputStream)
  {
    paramInputStream.close();
  }
  
  public InputStream decode(String paramString)
  {
    Object localObject1 = "data:image";
    boolean bool1 = paramString.startsWith((String)localObject1);
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Not a valid image data URL.");
      throw ((Throwable)localObject1);
    }
    int i = paramString.indexOf(',');
    int j = -1;
    if (i == j)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Missing comma in data URL.");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = paramString.substring(0, i);
    String str = ";base64";
    boolean bool2 = ((String)localObject2).endsWith(str);
    if (!bool2)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Not a base64 image data URL.");
      throw ((Throwable)localObject1);
    }
    i += 1;
    localObject1 = Base64.decode(paramString.substring(i), 0);
    localObject2 = new java/io/ByteArrayInputStream;
    ((ByteArrayInputStream)localObject2).<init>((byte[])localObject1);
    return (InputStream)localObject2;
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\DataUrlLoader$StreamFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */