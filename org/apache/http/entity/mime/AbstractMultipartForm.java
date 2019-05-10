package org.apache.http.entity.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;

abstract class AbstractMultipartForm
{
  private static final ByteArrayBuffer CR_LF = encode(MIME.DEFAULT_CHARSET, "\r\n");
  private static final ByteArrayBuffer FIELD_SEP = encode(MIME.DEFAULT_CHARSET, ": ");
  private static final ByteArrayBuffer TWO_DASHES = encode(MIME.DEFAULT_CHARSET, "--");
  private final String boundary;
  protected final Charset charset;
  private final String subType;
  
  public AbstractMultipartForm(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2);
  }
  
  public AbstractMultipartForm(String paramString1, Charset paramCharset, String paramString2)
  {
    Args.notNull(paramString1, "Multipart subtype");
    String str = "Multipart boundary";
    Args.notNull(paramString2, str);
    this.subType = paramString1;
    if (paramCharset != null) {}
    for (;;)
    {
      this.charset = paramCharset;
      this.boundary = paramString2;
      return;
      paramCharset = MIME.DEFAULT_CHARSET;
    }
  }
  
  private static ByteArrayBuffer encode(Charset paramCharset, String paramString)
  {
    Object localObject = CharBuffer.wrap(paramString);
    localObject = paramCharset.encode((CharBuffer)localObject);
    ByteArrayBuffer localByteArrayBuffer = new org/apache/http/util/ByteArrayBuffer;
    int i = ((ByteBuffer)localObject).remaining();
    localByteArrayBuffer.<init>(i);
    byte[] arrayOfByte = ((ByteBuffer)localObject).array();
    int j = ((ByteBuffer)localObject).position();
    int k = ((ByteBuffer)localObject).remaining();
    localByteArrayBuffer.append(arrayOfByte, j, k);
    return localByteArrayBuffer;
  }
  
  private static void writeBytes(String paramString, OutputStream paramOutputStream)
  {
    writeBytes(encode(MIME.DEFAULT_CHARSET, paramString), paramOutputStream);
  }
  
  private static void writeBytes(String paramString, Charset paramCharset, OutputStream paramOutputStream)
  {
    writeBytes(encode(paramCharset, paramString), paramOutputStream);
  }
  
  private static void writeBytes(ByteArrayBuffer paramByteArrayBuffer, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = paramByteArrayBuffer.buffer();
    int i = paramByteArrayBuffer.length();
    paramOutputStream.write(arrayOfByte, 0, i);
  }
  
  protected static void writeField(MinimalField paramMinimalField, OutputStream paramOutputStream)
  {
    writeBytes(paramMinimalField.getName(), paramOutputStream);
    writeBytes(FIELD_SEP, paramOutputStream);
    writeBytes(paramMinimalField.getBody(), paramOutputStream);
    writeBytes(CR_LF, paramOutputStream);
  }
  
  protected static void writeField(MinimalField paramMinimalField, Charset paramCharset, OutputStream paramOutputStream)
  {
    writeBytes(paramMinimalField.getName(), paramCharset, paramOutputStream);
    writeBytes(FIELD_SEP, paramOutputStream);
    writeBytes(paramMinimalField.getBody(), paramCharset, paramOutputStream);
    writeBytes(CR_LF, paramOutputStream);
  }
  
  void doWriteTo(OutputStream paramOutputStream, boolean paramBoolean)
  {
    Object localObject1 = this.charset;
    Object localObject2 = getBoundary();
    localObject2 = encode((Charset)localObject1, (String)localObject2);
    localObject1 = getBodyParts();
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (FormBodyPart)localIterator.next();
      writeBytes(TWO_DASHES, paramOutputStream);
      writeBytes((ByteArrayBuffer)localObject2, paramOutputStream);
      writeBytes(CR_LF, paramOutputStream);
      formatMultipartHeader((FormBodyPart)localObject1, paramOutputStream);
      ByteArrayBuffer localByteArrayBuffer = CR_LF;
      writeBytes(localByteArrayBuffer, paramOutputStream);
      if (paramBoolean)
      {
        localObject1 = ((FormBodyPart)localObject1).getBody();
        ((ContentBody)localObject1).writeTo(paramOutputStream);
      }
      localObject1 = CR_LF;
      writeBytes((ByteArrayBuffer)localObject1, paramOutputStream);
    }
    writeBytes(TWO_DASHES, paramOutputStream);
    writeBytes((ByteArrayBuffer)localObject2, paramOutputStream);
    writeBytes(TWO_DASHES, paramOutputStream);
    writeBytes(CR_LF, paramOutputStream);
  }
  
  protected abstract void formatMultipartHeader(FormBodyPart paramFormBodyPart, OutputStream paramOutputStream);
  
  public abstract List getBodyParts();
  
  public String getBoundary()
  {
    return this.boundary;
  }
  
  public Charset getCharset()
  {
    return this.charset;
  }
  
  public String getSubType()
  {
    return this.subType;
  }
  
  public long getTotalLength()
  {
    long l1 = 0L;
    long l2 = -1;
    Object localObject = getBodyParts();
    Iterator localIterator = ((List)localObject).iterator();
    for (long l3 = l1;; l3 = l4)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break label92;
      }
      localObject = ((FormBodyPart)localIterator.next()).getBody();
      l4 = ((ContentBody)localObject).getContentLength();
      boolean bool2 = l4 < l1;
      if (bool2) {
        break;
      }
      l4 += l3;
    }
    long l4 = l2;
    for (;;)
    {
      return l4;
      label92:
      localObject = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject).<init>();
      try
      {
        doWriteTo((OutputStream)localObject, false);
        localObject = ((ByteArrayOutputStream)localObject).toByteArray();
        int i = localObject.length;
        l4 = i + l3;
      }
      catch (IOException localIOException)
      {
        l4 = l2;
      }
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    doWriteTo(paramOutputStream, true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\AbstractMultipartForm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */