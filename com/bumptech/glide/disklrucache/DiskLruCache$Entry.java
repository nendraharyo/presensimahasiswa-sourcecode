package com.bumptech.glide.disklrucache;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class DiskLruCache$Entry
{
  File[] cleanFiles;
  private DiskLruCache.Editor currentEditor;
  File[] dirtyFiles;
  private final String key;
  private final long[] lengths;
  private boolean readable;
  private long sequenceNumber;
  
  private DiskLruCache$Entry(DiskLruCache paramDiskLruCache, String paramString)
  {
    this.key = paramString;
    Object localObject = new long[DiskLruCache.access$1900(paramDiskLruCache)];
    this.lengths = ((long[])localObject);
    localObject = new File[DiskLruCache.access$1900(paramDiskLruCache)];
    this.cleanFiles = ((File[])localObject);
    localObject = new File[DiskLruCache.access$1900(paramDiskLruCache)];
    this.dirtyFiles = ((File[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>(paramString);
    char c = '.';
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(c);
    int i = localStringBuilder.length();
    int j = 0;
    localObject = null;
    for (;;)
    {
      int k = DiskLruCache.access$1900(paramDiskLruCache);
      if (j >= k) {
        break;
      }
      localStringBuilder.append(j);
      File[] arrayOfFile = this.cleanFiles;
      File localFile1 = new java/io/File;
      File localFile2 = DiskLruCache.access$2000(paramDiskLruCache);
      String str = localStringBuilder.toString();
      localFile1.<init>(localFile2, str);
      arrayOfFile[j] = localFile1;
      localStringBuilder.append(".tmp");
      arrayOfFile = this.dirtyFiles;
      localFile1 = new java/io/File;
      localFile2 = DiskLruCache.access$2000(paramDiskLruCache);
      str = localStringBuilder.toString();
      localFile1.<init>(localFile2, str);
      arrayOfFile[j] = localFile1;
      localStringBuilder.setLength(i);
      j += 1;
    }
  }
  
  private IOException invalidLengths(String[] paramArrayOfString)
  {
    IOException localIOException = new java/io/IOException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("unexpected journal line: ");
    String str = Arrays.toString(paramArrayOfString);
    localObject = str;
    localIOException.<init>((String)localObject);
    throw localIOException;
  }
  
  private void setLengths(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    Object localObject = this.this$0;
    int j = DiskLruCache.access$1900((DiskLruCache)localObject);
    if (i != j) {
      throw invalidLengths(paramArrayOfString);
    }
    i = 0;
    try
    {
      for (;;)
      {
        j = paramArrayOfString.length;
        if (i >= j) {
          break;
        }
        localObject = this.lengths;
        String str = paramArrayOfString[i];
        long l = Long.parseLong(str);
        localObject[i] = l;
        i += 1;
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw invalidLengths(paramArrayOfString);
    }
  }
  
  public File getCleanFile(int paramInt)
  {
    return this.cleanFiles[paramInt];
  }
  
  public File getDirtyFile(int paramInt)
  {
    return this.dirtyFiles[paramInt];
  }
  
  public String getLengths()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    long[] arrayOfLong = this.lengths;
    int i = arrayOfLong.length;
    int j = 0;
    while (j < i)
    {
      long l = arrayOfLong[j];
      char c = ' ';
      StringBuilder localStringBuilder2 = localStringBuilder1.append(c);
      localStringBuilder2.append(l);
      j += 1;
    }
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\DiskLruCache$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */