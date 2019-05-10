package org.apache.http.client.entity;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.SerializableEntity;
import org.apache.http.entity.StringEntity;

public class EntityBuilder
{
  private byte[] binary;
  private boolean chunked;
  private String contentEncoding;
  private ContentType contentType;
  private File file;
  private boolean gzipCompress;
  private List parameters;
  private Serializable serializable;
  private InputStream stream;
  private String text;
  
  private void clearContent()
  {
    this.text = null;
    this.binary = null;
    this.stream = null;
    this.parameters = null;
    this.serializable = null;
    this.file = null;
  }
  
  public static EntityBuilder create()
  {
    EntityBuilder localEntityBuilder = new org/apache/http/client/entity/EntityBuilder;
    localEntityBuilder.<init>();
    return localEntityBuilder;
  }
  
  private ContentType getContentOrDefault(ContentType paramContentType)
  {
    ContentType localContentType = this.contentType;
    if (localContentType != null) {
      paramContentType = this.contentType;
    }
    return paramContentType;
  }
  
  public HttpEntity build()
  {
    Object localObject1 = this.text;
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = new org/apache/http/entity/StringEntity;
      localObject2 = this.text;
      localObject3 = ContentType.DEFAULT_TEXT;
      localObject3 = getContentOrDefault((ContentType)localObject3);
      ((StringEntity)localObject1).<init>((String)localObject2, (ContentType)localObject3);
    }
    for (;;)
    {
      localObject2 = ((AbstractHttpEntity)localObject1).getContentType();
      if (localObject2 != null)
      {
        localObject2 = this.contentType;
        if (localObject2 != null)
        {
          localObject2 = this.contentType.toString();
          ((AbstractHttpEntity)localObject1).setContentType((String)localObject2);
        }
      }
      localObject2 = this.contentEncoding;
      ((AbstractHttpEntity)localObject1).setContentEncoding((String)localObject2);
      boolean bool = this.chunked;
      ((AbstractHttpEntity)localObject1).setChunked(bool);
      bool = this.gzipCompress;
      if (bool)
      {
        localObject2 = new org/apache/http/client/entity/GzipCompressingEntity;
        ((GzipCompressingEntity)localObject2).<init>((HttpEntity)localObject1);
        localObject1 = localObject2;
      }
      return (HttpEntity)localObject1;
      localObject1 = this.binary;
      if (localObject1 != null)
      {
        localObject1 = new org/apache/http/entity/ByteArrayEntity;
        localObject2 = this.binary;
        localObject3 = ContentType.DEFAULT_BINARY;
        localObject3 = getContentOrDefault((ContentType)localObject3);
        ((ByteArrayEntity)localObject1).<init>((byte[])localObject2, (ContentType)localObject3);
      }
      else
      {
        localObject1 = this.stream;
        if (localObject1 != null)
        {
          localObject1 = new org/apache/http/entity/InputStreamEntity;
          localObject2 = this.stream;
          long l = 1L;
          ContentType localContentType = ContentType.DEFAULT_BINARY;
          localContentType = getContentOrDefault(localContentType);
          ((InputStreamEntity)localObject1).<init>((InputStream)localObject2, l, localContentType);
        }
        else
        {
          localObject1 = this.parameters;
          if (localObject1 != null)
          {
            localObject2 = new org/apache/http/client/entity/UrlEncodedFormEntity;
            localObject3 = this.parameters;
            localObject1 = this.contentType;
            if (localObject1 != null) {}
            for (localObject1 = this.contentType.getCharset();; localObject1 = null)
            {
              ((UrlEncodedFormEntity)localObject2).<init>((Iterable)localObject3, (Charset)localObject1);
              localObject1 = localObject2;
              break;
            }
          }
          localObject1 = this.serializable;
          if (localObject1 != null)
          {
            localObject1 = new org/apache/http/entity/SerializableEntity;
            localObject2 = this.serializable;
            ((SerializableEntity)localObject1).<init>((Serializable)localObject2);
            localObject2 = ContentType.DEFAULT_BINARY.toString();
            ((AbstractHttpEntity)localObject1).setContentType((String)localObject2);
          }
          else
          {
            localObject1 = this.file;
            if (localObject1 != null)
            {
              localObject1 = new org/apache/http/entity/FileEntity;
              localObject2 = this.file;
              localObject3 = ContentType.DEFAULT_BINARY;
              localObject3 = getContentOrDefault((ContentType)localObject3);
              ((FileEntity)localObject1).<init>((File)localObject2, (ContentType)localObject3);
            }
            else
            {
              localObject1 = new org/apache/http/entity/BasicHttpEntity;
              ((BasicHttpEntity)localObject1).<init>();
            }
          }
        }
      }
    }
  }
  
  public EntityBuilder chunked()
  {
    this.chunked = true;
    return this;
  }
  
  public byte[] getBinary()
  {
    return this.binary;
  }
  
  public String getContentEncoding()
  {
    return this.contentEncoding;
  }
  
  public ContentType getContentType()
  {
    return this.contentType;
  }
  
  public File getFile()
  {
    return this.file;
  }
  
  public List getParameters()
  {
    return this.parameters;
  }
  
  public Serializable getSerializable()
  {
    return this.serializable;
  }
  
  public InputStream getStream()
  {
    return this.stream;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public EntityBuilder gzipCompress()
  {
    this.gzipCompress = true;
    return this;
  }
  
  public boolean isChunked()
  {
    return this.chunked;
  }
  
  public boolean isGzipCompress()
  {
    return this.gzipCompress;
  }
  
  public EntityBuilder setBinary(byte[] paramArrayOfByte)
  {
    clearContent();
    this.binary = paramArrayOfByte;
    return this;
  }
  
  public EntityBuilder setContentEncoding(String paramString)
  {
    this.contentEncoding = paramString;
    return this;
  }
  
  public EntityBuilder setContentType(ContentType paramContentType)
  {
    this.contentType = paramContentType;
    return this;
  }
  
  public EntityBuilder setFile(File paramFile)
  {
    clearContent();
    this.file = paramFile;
    return this;
  }
  
  public EntityBuilder setParameters(List paramList)
  {
    clearContent();
    this.parameters = paramList;
    return this;
  }
  
  public EntityBuilder setParameters(NameValuePair... paramVarArgs)
  {
    List localList = Arrays.asList(paramVarArgs);
    return setParameters(localList);
  }
  
  public EntityBuilder setSerializable(Serializable paramSerializable)
  {
    clearContent();
    this.serializable = paramSerializable;
    return this;
  }
  
  public EntityBuilder setStream(InputStream paramInputStream)
  {
    clearContent();
    this.stream = paramInputStream;
    return this;
  }
  
  public EntityBuilder setText(String paramString)
  {
    clearContent();
    this.text = paramString;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\entity\EntityBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */