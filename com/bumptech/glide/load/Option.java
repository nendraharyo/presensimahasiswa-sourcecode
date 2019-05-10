package com.bumptech.glide.load;

import com.bumptech.glide.util.Preconditions;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class Option
{
  private static final Option.CacheKeyUpdater EMPTY_UPDATER;
  private final Option.CacheKeyUpdater cacheKeyUpdater;
  private final Object defaultValue;
  private final String key;
  private volatile byte[] keyBytes;
  
  static
  {
    Option.1 local1 = new com/bumptech/glide/load/Option$1;
    local1.<init>();
    EMPTY_UPDATER = local1;
  }
  
  private Option(String paramString, Object paramObject, Option.CacheKeyUpdater paramCacheKeyUpdater)
  {
    Object localObject = Preconditions.checkNotEmpty(paramString);
    this.key = ((String)localObject);
    this.defaultValue = paramObject;
    localObject = (Option.CacheKeyUpdater)Preconditions.checkNotNull(paramCacheKeyUpdater);
    this.cacheKeyUpdater = ((Option.CacheKeyUpdater)localObject);
  }
  
  public static Option disk(String paramString, Option.CacheKeyUpdater paramCacheKeyUpdater)
  {
    Option localOption = new com/bumptech/glide/load/Option;
    localOption.<init>(paramString, null, paramCacheKeyUpdater);
    return localOption;
  }
  
  public static Option disk(String paramString, Object paramObject, Option.CacheKeyUpdater paramCacheKeyUpdater)
  {
    Option localOption = new com/bumptech/glide/load/Option;
    localOption.<init>(paramString, paramObject, paramCacheKeyUpdater);
    return localOption;
  }
  
  private static Option.CacheKeyUpdater emptyUpdater()
  {
    return EMPTY_UPDATER;
  }
  
  private byte[] getKeyBytes()
  {
    Object localObject = this.keyBytes;
    if (localObject == null)
    {
      localObject = this.key;
      Charset localCharset = Key.CHARSET;
      localObject = ((String)localObject).getBytes(localCharset);
      this.keyBytes = ((byte[])localObject);
    }
    return this.keyBytes;
  }
  
  public static Option memory(String paramString)
  {
    Option localOption = new com/bumptech/glide/load/Option;
    Option.CacheKeyUpdater localCacheKeyUpdater = emptyUpdater();
    localOption.<init>(paramString, null, localCacheKeyUpdater);
    return localOption;
  }
  
  public static Option memory(String paramString, Object paramObject)
  {
    Option localOption = new com/bumptech/glide/load/Option;
    Option.CacheKeyUpdater localCacheKeyUpdater = emptyUpdater();
    localOption.<init>(paramString, paramObject, localCacheKeyUpdater);
    return localOption;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof Option;
    String str1;
    if (bool)
    {
      paramObject = (Option)paramObject;
      str1 = this.key;
      String str2 = ((Option)paramObject).key;
      bool = str1.equals(str2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public Object getDefaultValue()
  {
    return this.defaultValue;
  }
  
  public int hashCode()
  {
    return this.key.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Option{key='");
    String str = this.key;
    return str + '\'' + '}';
  }
  
  public void update(Object paramObject, MessageDigest paramMessageDigest)
  {
    Option.CacheKeyUpdater localCacheKeyUpdater = this.cacheKeyUpdater;
    byte[] arrayOfByte = getKeyBytes();
    localCacheKeyUpdater.update(arrayOfByte, paramObject, paramMessageDigest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\Option.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */