package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

public final class EmptySignature
  implements Key
{
  private static final EmptySignature EMPTY_KEY;
  
  static
  {
    EmptySignature localEmptySignature = new com/bumptech/glide/signature/EmptySignature;
    localEmptySignature.<init>();
    EMPTY_KEY = localEmptySignature;
  }
  
  public static EmptySignature obtain()
  {
    return EMPTY_KEY;
  }
  
  public String toString()
  {
    return "EmptySignature";
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\signature\EmptySignature.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */