package org.apache.http.entity.mime;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.util.Args;

public class MultipartEntityBuilder
{
  private static final String DEFAULT_SUBTYPE = "form-data";
  private static final char[] MULTIPART_CHARS = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private List bodyParts;
  private String boundary;
  private Charset charset;
  private HttpMultipartMode mode;
  private String subType = "form-data";
  
  MultipartEntityBuilder()
  {
    HttpMultipartMode localHttpMultipartMode = HttpMultipartMode.STRICT;
    this.mode = localHttpMultipartMode;
    this.boundary = null;
    this.charset = null;
    this.bodyParts = null;
  }
  
  public static MultipartEntityBuilder create()
  {
    MultipartEntityBuilder localMultipartEntityBuilder = new org/apache/http/entity/mime/MultipartEntityBuilder;
    localMultipartEntityBuilder.<init>();
    return localMultipartEntityBuilder;
  }
  
  private String generateBoundary()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Random localRandom = new java/util/Random;
    localRandom.<init>();
    int i = localRandom.nextInt(11) + 30;
    int j = 0;
    while (j < i)
    {
      char[] arrayOfChar1 = MULTIPART_CHARS;
      char[] arrayOfChar2 = MULTIPART_CHARS;
      int k = arrayOfChar2.length;
      k = localRandom.nextInt(k);
      char c = arrayOfChar1[k];
      localStringBuilder.append(c);
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  private String generateContentType(String paramString, Charset paramCharset)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "multipart/form-data; boundary=";
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    if (paramCharset != null)
    {
      localStringBuilder.append("; charset=");
      str = paramCharset.name();
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public MultipartEntityBuilder addBinaryBody(String paramString, File paramFile)
  {
    ContentType localContentType = ContentType.DEFAULT_BINARY;
    if (paramFile != null) {}
    for (String str = paramFile.getName();; str = null) {
      return addBinaryBody(paramString, paramFile, localContentType, str);
    }
  }
  
  public MultipartEntityBuilder addBinaryBody(String paramString1, File paramFile, ContentType paramContentType, String paramString2)
  {
    FileBody localFileBody = new org/apache/http/entity/mime/content/FileBody;
    localFileBody.<init>(paramFile, paramContentType, paramString2);
    return addPart(paramString1, localFileBody);
  }
  
  public MultipartEntityBuilder addBinaryBody(String paramString, InputStream paramInputStream)
  {
    ContentType localContentType = ContentType.DEFAULT_BINARY;
    return addBinaryBody(paramString, paramInputStream, localContentType, null);
  }
  
  public MultipartEntityBuilder addBinaryBody(String paramString1, InputStream paramInputStream, ContentType paramContentType, String paramString2)
  {
    InputStreamBody localInputStreamBody = new org/apache/http/entity/mime/content/InputStreamBody;
    localInputStreamBody.<init>(paramInputStream, paramContentType, paramString2);
    return addPart(paramString1, localInputStreamBody);
  }
  
  public MultipartEntityBuilder addBinaryBody(String paramString, byte[] paramArrayOfByte)
  {
    ContentType localContentType = ContentType.DEFAULT_BINARY;
    return addBinaryBody(paramString, paramArrayOfByte, localContentType, null);
  }
  
  public MultipartEntityBuilder addBinaryBody(String paramString1, byte[] paramArrayOfByte, ContentType paramContentType, String paramString2)
  {
    ByteArrayBody localByteArrayBody = new org/apache/http/entity/mime/content/ByteArrayBody;
    localByteArrayBody.<init>(paramArrayOfByte, paramContentType, paramString2);
    return addPart(paramString1, localByteArrayBody);
  }
  
  public MultipartEntityBuilder addPart(String paramString, ContentBody paramContentBody)
  {
    Args.notNull(paramString, "Name");
    Args.notNull(paramContentBody, "Content body");
    FormBodyPart localFormBodyPart = new org/apache/http/entity/mime/FormBodyPart;
    localFormBodyPart.<init>(paramString, paramContentBody);
    return addPart(localFormBodyPart);
  }
  
  MultipartEntityBuilder addPart(FormBodyPart paramFormBodyPart)
  {
    if (paramFormBodyPart == null) {}
    for (;;)
    {
      return this;
      Object localObject = this.bodyParts;
      if (localObject == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.bodyParts = ((List)localObject);
      }
      localObject = this.bodyParts;
      ((List)localObject).add(paramFormBodyPart);
    }
  }
  
  public MultipartEntityBuilder addTextBody(String paramString1, String paramString2)
  {
    ContentType localContentType = ContentType.DEFAULT_TEXT;
    return addTextBody(paramString1, paramString2, localContentType);
  }
  
  public MultipartEntityBuilder addTextBody(String paramString1, String paramString2, ContentType paramContentType)
  {
    StringBody localStringBody = new org/apache/http/entity/mime/content/StringBody;
    localStringBody.<init>(paramString2, paramContentType);
    return addPart(paramString1, localStringBody);
  }
  
  public HttpEntity build()
  {
    return buildEntity();
  }
  
  MultipartFormEntity buildEntity()
  {
    Object localObject1 = this.subType;
    Charset localCharset;
    String str;
    label33:
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = this.subType;
      localCharset = this.charset;
      str = this.boundary;
      if (str == null) {
        break label178;
      }
      str = this.boundary;
      localObject2 = this.bodyParts;
      if (localObject2 == null) {
        break label186;
      }
      localObject2 = new java/util/ArrayList;
      localObject3 = this.bodyParts;
      ((ArrayList)localObject2).<init>((Collection)localObject3);
      label62:
      localObject3 = this.mode;
      if (localObject3 == null) {
        break label194;
      }
      localObject3 = this.mode;
      label79:
      int[] arrayOfInt = MultipartEntityBuilder.1.$SwitchMap$org$apache$http$entity$mime$HttpMultipartMode;
      int i = ((HttpMultipartMode)localObject3).ordinal();
      i = arrayOfInt[i];
      switch (i)
      {
      default: 
        localObject3 = new org/apache/http/entity/mime/HttpStrictMultipart;
        ((HttpStrictMultipart)localObject3).<init>((String)localObject1, localCharset, str, (List)localObject2);
        localObject1 = localObject3;
      }
    }
    for (;;)
    {
      localObject2 = new org/apache/http/entity/mime/MultipartFormEntity;
      str = generateContentType(str, localCharset);
      long l = ((AbstractMultipartForm)localObject1).getTotalLength();
      ((MultipartFormEntity)localObject2).<init>((AbstractMultipartForm)localObject1, str, l);
      return (MultipartFormEntity)localObject2;
      localObject1 = "form-data";
      break;
      label178:
      str = generateBoundary();
      break label33;
      label186:
      localObject2 = Collections.emptyList();
      break label62;
      label194:
      localObject3 = HttpMultipartMode.STRICT;
      break label79;
      localObject3 = new org/apache/http/entity/mime/HttpBrowserCompatibleMultipart;
      ((HttpBrowserCompatibleMultipart)localObject3).<init>((String)localObject1, localCharset, str, (List)localObject2);
      localObject1 = localObject3;
      continue;
      localObject3 = new org/apache/http/entity/mime/HttpRFC6532Multipart;
      ((HttpRFC6532Multipart)localObject3).<init>((String)localObject1, localCharset, str, (List)localObject2);
      localObject1 = localObject3;
    }
  }
  
  public MultipartEntityBuilder setBoundary(String paramString)
  {
    this.boundary = paramString;
    return this;
  }
  
  public MultipartEntityBuilder setCharset(Charset paramCharset)
  {
    this.charset = paramCharset;
    return this;
  }
  
  public MultipartEntityBuilder setLaxMode()
  {
    HttpMultipartMode localHttpMultipartMode = HttpMultipartMode.BROWSER_COMPATIBLE;
    this.mode = localHttpMultipartMode;
    return this;
  }
  
  public MultipartEntityBuilder setMode(HttpMultipartMode paramHttpMultipartMode)
  {
    this.mode = paramHttpMultipartMode;
    return this;
  }
  
  public MultipartEntityBuilder setStrictMode()
  {
    HttpMultipartMode localHttpMultipartMode = HttpMultipartMode.STRICT;
    this.mode = localHttpMultipartMode;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\MultipartEntityBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */