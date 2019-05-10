package com.loopj.android.http;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class SimpleMultipartEntity$FilePart
{
  public final File file;
  public final byte[] header;
  
  public SimpleMultipartEntity$FilePart(SimpleMultipartEntity paramSimpleMultipartEntity, String paramString1, File paramFile, String paramString2)
  {
    Object localObject = paramFile.getName();
    localObject = createHeader(paramString1, (String)localObject, paramString2);
    this.header = ((byte[])localObject);
    this.file = paramFile;
  }
  
  public SimpleMultipartEntity$FilePart(SimpleMultipartEntity paramSimpleMultipartEntity, String paramString1, File paramFile, String paramString2, String paramString3)
  {
    boolean bool = TextUtils.isEmpty(paramString3);
    if (bool) {
      paramString3 = paramFile.getName();
    }
    byte[] arrayOfByte = createHeader(paramString1, paramString3, paramString2);
    this.header = arrayOfByte;
    this.file = paramFile;
  }
  
  private byte[] createHeader(String paramString1, String paramString2, String paramString3)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    try
    {
      Object localObject = this.this$0;
      localObject = SimpleMultipartEntity.access$000((SimpleMultipartEntity)localObject);
      localByteArrayOutputStream.write((byte[])localObject);
      localObject = this.this$0;
      localObject = SimpleMultipartEntity.access$100((SimpleMultipartEntity)localObject, paramString1, paramString2);
      localByteArrayOutputStream.write((byte[])localObject);
      localObject = this.this$0;
      localObject = SimpleMultipartEntity.access$200((SimpleMultipartEntity)localObject, paramString3);
      localByteArrayOutputStream.write((byte[])localObject);
      localObject = SimpleMultipartEntity.access$300();
      localByteArrayOutputStream.write((byte[])localObject);
      localObject = SimpleMultipartEntity.access$400();
      localByteArrayOutputStream.write((byte[])localObject);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        LogInterface localLogInterface = AsyncHttpClient.log;
        String str1 = "SimpleMultipartEntity";
        String str2 = "createHeader ByteArrayOutputStream exception";
        localLogInterface.e(str1, str2, localIOException);
      }
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public long getTotalLength()
  {
    long l1 = this.file.length();
    long l2 = SimpleMultipartEntity.access$400().length;
    l1 += l2;
    l2 = this.header.length;
    return l1 + l2;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Object localObject1 = this.header;
    paramOutputStream.write((byte[])localObject1);
    localObject1 = this.this$0;
    long l1 = this.header.length;
    SimpleMultipartEntity.access$500((SimpleMultipartEntity)localObject1, l1);
    localObject1 = new java/io/FileInputStream;
    Object localObject2 = this.file;
    ((FileInputStream)localObject1).<init>((File)localObject2);
    int i = 4096;
    localObject2 = new byte[i];
    for (;;)
    {
      int j = ((FileInputStream)localObject1).read((byte[])localObject2);
      int k = -1;
      if (j == k) {
        break;
      }
      k = 0;
      paramOutputStream.write((byte[])localObject2, 0, j);
      SimpleMultipartEntity localSimpleMultipartEntity = this.this$0;
      long l2 = j;
      SimpleMultipartEntity.access$500(localSimpleMultipartEntity, l2);
    }
    localObject2 = SimpleMultipartEntity.access$400();
    paramOutputStream.write((byte[])localObject2);
    localObject2 = this.this$0;
    l1 = SimpleMultipartEntity.access$400().length;
    SimpleMultipartEntity.access$500((SimpleMultipartEntity)localObject2, l1);
    paramOutputStream.flush();
    AsyncHttpClient.silentCloseInputStream((InputStream)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\SimpleMultipartEntity$FilePart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */