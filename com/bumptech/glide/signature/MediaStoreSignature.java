package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public class MediaStoreSignature
  implements Key
{
  private final long dateModified;
  private final String mimeType;
  private final int orientation;
  
  public MediaStoreSignature(String paramString, long paramLong, int paramInt)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.mimeType = paramString;
    this.dateModified = paramLong;
    this.orientation = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      Object localObject1;
      Object localObject2;
      if (paramObject != null)
      {
        localObject1 = getClass();
        localObject2 = paramObject.getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      paramObject = (MediaStoreSignature)paramObject;
      long l1 = this.dateModified;
      long l2 = ((MediaStoreSignature)paramObject).dateModified;
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        bool1 = false;
      }
      else
      {
        int i = this.orientation;
        int j = ((MediaStoreSignature)paramObject).orientation;
        if (i != j)
        {
          bool1 = false;
        }
        else
        {
          localObject1 = this.mimeType;
          localObject2 = ((MediaStoreSignature)paramObject).mimeType;
          boolean bool3 = ((String)localObject1).equals(localObject2);
          if (!bool3) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.mimeType.hashCode() * 31;
    long l1 = this.dateModified;
    long l2 = this.dateModified >>> 32;
    int j = (int)(l1 ^ l2);
    i = (i + j) * 31;
    j = this.orientation;
    return i + j;
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    Object localObject = ByteBuffer.allocate(12);
    long l = this.dateModified;
    localObject = ((ByteBuffer)localObject).putLong(l);
    int i = this.orientation;
    localObject = ((ByteBuffer)localObject).putInt(i).array();
    paramMessageDigest.update((byte[])localObject);
    localObject = this.mimeType;
    Charset localCharset = CHARSET;
    localObject = ((String)localObject).getBytes(localCharset);
    paramMessageDigest.update((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\signature\MediaStoreSignature.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */