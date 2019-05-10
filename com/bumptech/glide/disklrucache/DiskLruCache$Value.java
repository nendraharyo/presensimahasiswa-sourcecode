package com.bumptech.glide.disklrucache;

import java.io.File;
import java.io.FileInputStream;

public final class DiskLruCache$Value
{
  private final File[] files;
  private final String key;
  private final long[] lengths;
  private final long sequenceNumber;
  
  private DiskLruCache$Value(DiskLruCache paramDiskLruCache, String paramString, long paramLong, File[] paramArrayOfFile, long[] paramArrayOfLong)
  {
    this.key = paramString;
    this.sequenceNumber = paramLong;
    this.files = paramArrayOfFile;
    this.lengths = paramArrayOfLong;
  }
  
  public DiskLruCache.Editor edit()
  {
    DiskLruCache localDiskLruCache = this.this$0;
    String str = this.key;
    long l = this.sequenceNumber;
    return DiskLruCache.access$1700(localDiskLruCache, str, l);
  }
  
  public File getFile(int paramInt)
  {
    return this.files[paramInt];
  }
  
  public long getLength(int paramInt)
  {
    return this.lengths[paramInt];
  }
  
  public String getString(int paramInt)
  {
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    File localFile = this.files[paramInt];
    localFileInputStream.<init>(localFile);
    return DiskLruCache.access$1800(localFileInputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\DiskLruCache$Value.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */