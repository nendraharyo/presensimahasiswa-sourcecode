package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

final class Util
{
  static final Charset US_ASCII = Charset.forName("US-ASCII");
  static final Charset UTF_8 = Charset.forName("UTF-8");
  
  static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static void deleteContents(File paramFile)
  {
    Object localObject = paramFile.listFiles();
    if (localObject == null)
    {
      localIOException = new java/io/IOException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "not a readable directory: " + paramFile;
      localIOException.<init>((String)localObject);
      throw localIOException;
    }
    int i = localObject.length;
    int j = 0;
    IOException localIOException = null;
    while (j < i)
    {
      File localFile = localObject[j];
      boolean bool = localFile.isDirectory();
      if (bool) {
        deleteContents(localFile);
      }
      bool = localFile.delete();
      if (!bool)
      {
        localIOException = new java/io/IOException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "failed to delete file: " + localFile;
        localIOException.<init>((String)localObject);
        throw localIOException;
      }
      j += 1;
    }
  }
  
  static String readFully(Reader paramReader)
  {
    try
    {
      StringWriter localStringWriter = new java/io/StringWriter;
      localStringWriter.<init>();
      int i = 1024;
      char[] arrayOfChar = new char[i];
      for (;;)
      {
        int j = paramReader.read(arrayOfChar);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        localStringWriter.write(arrayOfChar, 0, j);
      }
      str = ((StringWriter)localObject).toString();
    }
    finally
    {
      paramReader.close();
    }
    String str;
    paramReader.close();
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\Util.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */