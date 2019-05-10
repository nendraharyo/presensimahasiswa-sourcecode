package com.loopj.android.http;

import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.k.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class SimpleMultipartEntity
  implements k
{
  private static final byte[] CR_LF = "\r\n".getBytes();
  private static final String LOG_TAG = "SimpleMultipartEntity";
  private static final char[] MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private static final String STR_CR_LF = "\r\n";
  private static final byte[] TRANSFER_ENCODING_BINARY = "Content-Transfer-Encoding: binary\r\n".getBytes();
  private final String boundary;
  private final byte[] boundaryEnd;
  private final byte[] boundaryLine;
  private long bytesWritten;
  private final List fileParts;
  private boolean isRepeatable;
  private final ByteArrayOutputStream out;
  private final ResponseHandlerInterface progressHandler;
  private long totalSize;
  
  public SimpleMultipartEntity(ResponseHandlerInterface paramResponseHandlerInterface)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.fileParts = ((List)localObject1);
    localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    this.out = ((ByteArrayOutputStream)localObject1);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Random localRandom = new java/util/Random;
    localRandom.<init>();
    int i = 0;
    localObject1 = null;
    for (;;)
    {
      int j = 30;
      if (i >= j) {
        break;
      }
      char[] arrayOfChar1 = MULTIPART_CHARS;
      char[] arrayOfChar2 = MULTIPART_CHARS;
      int k = arrayOfChar2.length;
      k = localRandom.nextInt(k);
      j = arrayOfChar1[k];
      ((StringBuilder)localObject2).append(j);
      i += 1;
    }
    localObject1 = ((StringBuilder)localObject2).toString();
    this.boundary = ((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("--");
    localObject2 = this.boundary;
    localObject1 = ((String)localObject2 + "\r\n").getBytes();
    this.boundaryLine = ((byte[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("--");
    localObject2 = this.boundary;
    localObject1 = ((String)localObject2 + "--" + "\r\n").getBytes();
    this.boundaryEnd = ((byte[])localObject1);
    this.progressHandler = paramResponseHandlerInterface;
  }
  
  private byte[] createContentDisposition(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return ("Content-Disposition: form-data; name=\"" + paramString + "\"" + "\r\n").getBytes();
  }
  
  private byte[] createContentDisposition(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return ("Content-Disposition: form-data; name=\"" + paramString1 + "\"" + "; filename=\"" + paramString2 + "\"" + "\r\n").getBytes();
  }
  
  private byte[] createContentType(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Content-Type: ");
    String str = normalizeContentType(paramString);
    return (str + "\r\n").getBytes();
  }
  
  private String normalizeContentType(String paramString)
  {
    if (paramString == null) {
      paramString = "application/octet-stream";
    }
    return paramString;
  }
  
  private void updateProgress(long paramLong)
  {
    long l1 = this.bytesWritten + paramLong;
    this.bytesWritten = l1;
    ResponseHandlerInterface localResponseHandlerInterface = this.progressHandler;
    long l2 = this.bytesWritten;
    long l3 = this.totalSize;
    localResponseHandlerInterface.sendProgressMessage(l2, l3);
  }
  
  public void addPart(String paramString, File paramFile)
  {
    addPart(paramString, paramFile, null);
  }
  
  public void addPart(String paramString1, File paramFile, String paramString2)
  {
    List localList = this.fileParts;
    SimpleMultipartEntity.FilePart localFilePart = new com/loopj/android/http/SimpleMultipartEntity$FilePart;
    String str = normalizeContentType(paramString2);
    localFilePart.<init>(this, paramString1, paramFile, str);
    localList.add(localFilePart);
  }
  
  public void addPart(String paramString1, File paramFile, String paramString2, String paramString3)
  {
    List localList = this.fileParts;
    SimpleMultipartEntity.FilePart localFilePart = new com/loopj/android/http/SimpleMultipartEntity$FilePart;
    String str = normalizeContentType(paramString2);
    localFilePart.<init>(this, paramString1, paramFile, str, paramString3);
    localList.add(localFilePart);
  }
  
  public void addPart(String paramString1, String paramString2)
  {
    addPartWithCharset(paramString1, paramString2, null);
  }
  
  public void addPart(String paramString1, String paramString2, InputStream paramInputStream, String paramString3)
  {
    Object localObject = this.out;
    byte[] arrayOfByte = this.boundaryLine;
    ((ByteArrayOutputStream)localObject).write(arrayOfByte);
    localObject = this.out;
    arrayOfByte = createContentDisposition(paramString1, paramString2);
    ((ByteArrayOutputStream)localObject).write(arrayOfByte);
    localObject = this.out;
    arrayOfByte = createContentType(paramString3);
    ((ByteArrayOutputStream)localObject).write(arrayOfByte);
    localObject = this.out;
    arrayOfByte = TRANSFER_ENCODING_BINARY;
    ((ByteArrayOutputStream)localObject).write(arrayOfByte);
    localObject = this.out;
    arrayOfByte = CR_LF;
    ((ByteArrayOutputStream)localObject).write(arrayOfByte);
    int i = 4096;
    localObject = new byte[i];
    for (;;)
    {
      int j = paramInputStream.read((byte[])localObject);
      int k = -1;
      if (j == k) {
        break;
      }
      ByteArrayOutputStream localByteArrayOutputStream = this.out;
      localByteArrayOutputStream.write((byte[])localObject, 0, j);
    }
    localObject = this.out;
    arrayOfByte = CR_LF;
    ((ByteArrayOutputStream)localObject).write(arrayOfByte);
    this.out.flush();
  }
  
  public void addPart(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = this.out;
      localObject = this.boundaryLine;
      localByteArrayOutputStream.write((byte[])localObject);
      localByteArrayOutputStream = this.out;
      localObject = createContentDisposition(paramString1);
      localByteArrayOutputStream.write((byte[])localObject);
      localByteArrayOutputStream = this.out;
      localObject = createContentType(paramString3);
      localByteArrayOutputStream.write((byte[])localObject);
      localByteArrayOutputStream = this.out;
      localObject = CR_LF;
      localByteArrayOutputStream.write((byte[])localObject);
      localByteArrayOutputStream = this.out;
      localObject = paramString2.getBytes();
      localByteArrayOutputStream.write((byte[])localObject);
      localByteArrayOutputStream = this.out;
      localObject = CR_LF;
      localByteArrayOutputStream.write((byte[])localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject = AsyncHttpClient.log;
        String str1 = "SimpleMultipartEntity";
        String str2 = "addPart ByteArrayOutputStream exception";
        ((LogInterface)localObject).e(str1, str2, localIOException);
      }
    }
  }
  
  public void addPartWithCharset(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3 == null) {
      paramString3 = "UTF-8";
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "text/plain; charset=" + paramString3;
    addPart(paramString1, paramString2, (String)localObject);
  }
  
  public void consumeContent()
  {
    boolean bool = isStreaming();
    if (bool)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("Streaming entity does not implement #consumeContent()");
      throw localUnsupportedOperationException;
    }
  }
  
  public InputStream getContent()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("getContent() is not supported. Use writeTo() instead.");
    throw localUnsupportedOperationException;
  }
  
  public e getContentEncoding()
  {
    return null;
  }
  
  public long getContentLength()
  {
    Object localObject = this.out;
    int i = ((ByteArrayOutputStream)localObject).size();
    long l1 = i;
    List localList = this.fileParts;
    Iterator localIterator = localList.iterator();
    long l2 = l1;
    boolean bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject = (SimpleMultipartEntity.FilePart)localIterator.next();
      l1 = ((SimpleMultipartEntity.FilePart)localObject).getTotalLength();
      long l3 = 0L;
      boolean bool2 = l1 < l3;
      if (!bool2) {}
    }
    int j;
    for (l1 = -1;; l1 = j + l2)
    {
      return l1;
      l1 += l2;
      l2 = l1;
      break;
      localObject = this.boundaryEnd;
      j = localObject.length;
    }
  }
  
  public e getContentType()
  {
    b localb = new b/a/a/a/k/b;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("multipart/form-data; boundary=");
    String str = this.boundary;
    localObject = str;
    localb.<init>("Content-Type", (String)localObject);
    return localb;
  }
  
  public boolean isChunked()
  {
    return false;
  }
  
  public boolean isRepeatable()
  {
    return this.isRepeatable;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void setIsRepeatable(boolean paramBoolean)
  {
    this.isRepeatable = paramBoolean;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.bytesWritten = 0L;
    long l = (int)getContentLength();
    this.totalSize = l;
    this.out.writeTo(paramOutputStream);
    int i = this.out.size();
    l = i;
    updateProgress(l);
    Object localObject = this.fileParts;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (SimpleMultipartEntity.FilePart)localIterator.next();
      ((SimpleMultipartEntity.FilePart)localObject).writeTo(paramOutputStream);
    }
    localObject = this.boundaryEnd;
    paramOutputStream.write((byte[])localObject);
    l = this.boundaryEnd.length;
    updateProgress(l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\SimpleMultipartEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */