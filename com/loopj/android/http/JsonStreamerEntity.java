package com.loopj.android.http;

import android.text.TextUtils;
import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.k.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonStreamerEntity
  implements k
{
  private static final int BUFFER_SIZE = 4096;
  private static final UnsupportedOperationException ERR_UNSUPPORTED;
  private static final e HEADER_GZIP_ENCODING;
  private static final e HEADER_JSON_CONTENT;
  private static final byte[] JSON_FALSE;
  private static final byte[] JSON_NULL;
  private static final byte[] JSON_TRUE;
  private static final String LOG_TAG = "JsonStreamerEntity";
  private static final byte[] STREAM_CONTENTS;
  private static final byte[] STREAM_NAME;
  private static final byte[] STREAM_TYPE;
  private final byte[] buffer;
  private final e contentEncoding;
  private final byte[] elapsedField;
  private final Map jsonParams;
  private final ResponseHandlerInterface progressHandler;
  
  static
  {
    Object localObject = new java/lang/UnsupportedOperationException;
    ((UnsupportedOperationException)localObject).<init>("Unsupported operation in this implementation.");
    ERR_UNSUPPORTED = (UnsupportedOperationException)localObject;
    JSON_TRUE = "true".getBytes();
    JSON_FALSE = "false".getBytes();
    JSON_NULL = "null".getBytes();
    STREAM_NAME = escape("name");
    STREAM_TYPE = escape("type");
    STREAM_CONTENTS = escape("contents");
    localObject = new b/a/a/a/k/b;
    ((b)localObject).<init>("Content-Type", "application/json");
    HEADER_JSON_CONTENT = (e)localObject;
    localObject = new b/a/a/a/k/b;
    ((b)localObject).<init>("Content-Encoding", "gzip");
    HEADER_GZIP_ENCODING = (e)localObject;
  }
  
  public JsonStreamerEntity(ResponseHandlerInterface paramResponseHandlerInterface, boolean paramBoolean, String paramString)
  {
    int i = 4096;
    Object localObject = new byte[i];
    this.buffer = ((byte[])localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.jsonParams = ((Map)localObject);
    this.progressHandler = paramResponseHandlerInterface;
    boolean bool;
    if (paramBoolean)
    {
      localObject = HEADER_GZIP_ENCODING;
      this.contentEncoding = ((e)localObject);
      bool = TextUtils.isEmpty(paramString);
      if (!bool) {
        break label87;
      }
    }
    for (;;)
    {
      this.elapsedField = arrayOfByte;
      return;
      bool = false;
      localObject = null;
      break;
      label87:
      arrayOfByte = escape(paramString);
    }
  }
  
  private void endMetaData(OutputStream paramOutputStream)
  {
    paramOutputStream.write(34);
  }
  
  static byte[] escape(String paramString)
  {
    char c1 = '"';
    if (paramString == null) {}
    StringBuilder localStringBuilder;
    for (Object localObject = JSON_NULL;; localObject = localStringBuilder.toString().getBytes())
    {
      return (byte[])localObject;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(128);
      localStringBuilder.append(c1);
      int i = paramString.length();
      int j = -1;
      int k = j + 1;
      if (k < i)
      {
        j = paramString.charAt(k);
        String str;
        int i4;
        switch (j)
        {
        default: 
          int m = 31;
          if (j > m)
          {
            int n = 127;
            if (j >= n)
            {
              int i1 = 159;
              if (j <= i1) {}
            }
            else
            {
              int i2 = 8192;
              if (j < i2) {
                break;
              }
              int i3 = 8447;
              if (j > i3) {
                break;
              }
            }
          }
          str = Integer.toHexString(j);
          localStringBuilder.append("\\u");
          j = str.length();
          i4 = 4 - j;
          j = 0;
          localObject = null;
        case 34: 
          while (j < i4)
          {
            char c2 = '0';
            localStringBuilder.append(c2);
            j += 1;
            continue;
            localObject = "\\\"";
            localStringBuilder.append((String)localObject);
          }
        }
        for (;;)
        {
          j = k;
          break;
          localObject = "\\\\";
          localStringBuilder.append((String)localObject);
          continue;
          localObject = "\\b";
          localStringBuilder.append((String)localObject);
          continue;
          localObject = "\\f";
          localStringBuilder.append((String)localObject);
          continue;
          localObject = "\\n";
          localStringBuilder.append((String)localObject);
          continue;
          localObject = "\\r";
          localStringBuilder.append((String)localObject);
          continue;
          localObject = "\\t";
          localStringBuilder.append((String)localObject);
          continue;
          localObject = Locale.US;
          localObject = str.toUpperCase((Locale)localObject);
          localStringBuilder.append((String)localObject);
          continue;
          localStringBuilder.append(j);
        }
      }
      localStringBuilder.append(c1);
    }
  }
  
  private void writeMetaData(OutputStream paramOutputStream, String paramString1, String paramString2)
  {
    int i = 44;
    int j = 58;
    byte[] arrayOfByte = STREAM_NAME;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(j);
    arrayOfByte = escape(paramString1);
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(i);
    arrayOfByte = STREAM_TYPE;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(j);
    arrayOfByte = escape(paramString2);
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(i);
    arrayOfByte = STREAM_CONTENTS;
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.write(j);
    paramOutputStream.write(34);
  }
  
  private void writeToFromFile(OutputStream paramOutputStream, RequestParams.FileWrapper paramFileWrapper)
  {
    String str1 = paramFileWrapper.file.getName();
    String str2 = paramFileWrapper.contentType;
    writeMetaData(paramOutputStream, str1, str2);
    long l1 = 0L;
    File localFile = paramFileWrapper.file;
    long l2 = localFile.length();
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    Object localObject1 = paramFileWrapper.file;
    localFileInputStream.<init>((File)localObject1);
    localObject1 = new com/loopj/android/http/Base64OutputStream;
    int i = 18;
    ((Base64OutputStream)localObject1).<init>(paramOutputStream, i);
    for (;;)
    {
      Object localObject2 = this.buffer;
      i = localFileInputStream.read((byte[])localObject2);
      int j = -1;
      if (i == j) {
        break;
      }
      byte[] arrayOfByte = this.buffer;
      ((Base64OutputStream)localObject1).write(arrayOfByte, 0, i);
      long l3 = i;
      l1 += l3;
      localObject2 = this.progressHandler;
      ((ResponseHandlerInterface)localObject2).sendProgressMessage(l1, l2);
    }
    AsyncHttpClient.silentCloseOutputStream((OutputStream)localObject1);
    endMetaData(paramOutputStream);
    AsyncHttpClient.silentCloseInputStream(localFileInputStream);
  }
  
  private void writeToFromStream(OutputStream paramOutputStream, RequestParams.StreamWrapper paramStreamWrapper)
  {
    Object localObject1 = paramStreamWrapper.name;
    Object localObject2 = paramStreamWrapper.contentType;
    writeMetaData(paramOutputStream, (String)localObject1, (String)localObject2);
    localObject1 = new com/loopj/android/http/Base64OutputStream;
    int i = 18;
    ((Base64OutputStream)localObject1).<init>(paramOutputStream, i);
    for (;;)
    {
      localObject2 = paramStreamWrapper.inputStream;
      byte[] arrayOfByte = this.buffer;
      i = ((InputStream)localObject2).read(arrayOfByte);
      int j = -1;
      if (i == j) {
        break;
      }
      arrayOfByte = this.buffer;
      ((Base64OutputStream)localObject1).write(arrayOfByte, 0, i);
    }
    AsyncHttpClient.silentCloseOutputStream((OutputStream)localObject1);
    endMetaData(paramOutputStream);
    boolean bool = paramStreamWrapper.autoClose;
    if (bool)
    {
      localObject1 = paramStreamWrapper.inputStream;
      AsyncHttpClient.silentCloseInputStream((InputStream)localObject1);
    }
  }
  
  public void addPart(String paramString, Object paramObject)
  {
    this.jsonParams.put(paramString, paramObject);
  }
  
  public void consumeContent() {}
  
  public InputStream getContent()
  {
    throw ERR_UNSUPPORTED;
  }
  
  public e getContentEncoding()
  {
    return this.contentEncoding;
  }
  
  public long getContentLength()
  {
    return -1;
  }
  
  public e getContentType()
  {
    return HEADER_JSON_CONTENT;
  }
  
  public boolean isChunked()
  {
    return false;
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    int i = 125;
    int j = 123;
    int k = 58;
    int m = 44;
    if (paramOutputStream == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Output stream cannot be null.");
      throw ((Throwable)localObject1);
    }
    long l1 = System.currentTimeMillis();
    Object localObject1 = this.contentEncoding;
    int n;
    float f;
    if (localObject1 != null)
    {
      localObject1 = new java/util/zip/GZIPOutputStream;
      n = 4096;
      f = 5.74E-42F;
      ((GZIPOutputStream)localObject1).<init>(paramOutputStream, n);
      paramOutputStream = (OutputStream)localObject1;
    }
    paramOutputStream.write(j);
    localObject1 = this.jsonParams;
    Object localObject4 = ((Map)localObject1).keySet();
    int i1 = ((Set)localObject4).size();
    if (i1 > 0)
    {
      boolean bool1 = false;
      localObject1 = null;
      Iterator localIterator = ((Set)localObject4).iterator();
      n = 0;
      localObject4 = null;
      f = 0.0F;
      bool1 = localIterator.hasNext();
      if (bool1)
      {
        localObject1 = (String)localIterator.next();
        j = n + 1;
        for (;;)
        {
          try
          {
            localObject4 = this.jsonParams;
            localObject4 = ((Map)localObject4).get(localObject1);
            localObject1 = escape((String)localObject1);
            paramOutputStream.write((byte[])localObject1);
            int i2 = 58;
            paramOutputStream.write(i2);
            if (localObject4 == null)
            {
              localObject1 = JSON_NULL;
              paramOutputStream.write((byte[])localObject1);
              localObject1 = this.elapsedField;
              if ((localObject1 != null) || (j < i1)) {
                paramOutputStream.write(m);
              }
              n = j;
              break;
            }
            boolean bool2 = localObject4 instanceof RequestParams.FileWrapper;
            if (!bool2)
            {
              boolean bool4 = localObject4 instanceof RequestParams.StreamWrapper;
              if (!bool4) {
                break label360;
              }
            }
            int i4 = 123;
            paramOutputStream.write(i4);
            if (bool2)
            {
              localObject1 = (RequestParams.FileWrapper)localObject4;
              writeToFromFile(paramOutputStream, (RequestParams.FileWrapper)localObject1);
              int i3 = 125;
              paramOutputStream.write(i3);
              continue;
            }
            localObject4 = (RequestParams.StreamWrapper)localObject4;
          }
          finally
          {
            localObject4 = this.elapsedField;
            if ((localObject4 != null) || (j < i1)) {
              paramOutputStream.write(m);
            }
          }
          writeToFromStream(paramOutputStream, (RequestParams.StreamWrapper)localObject4);
          continue;
          label360:
          boolean bool3 = localObject4 instanceof JsonValueInterface;
          if (bool3)
          {
            localObject4 = (JsonValueInterface)localObject4;
            localObject3 = ((JsonValueInterface)localObject4).getEscapedJsonValue();
            paramOutputStream.write((byte[])localObject3);
          }
          else
          {
            bool3 = localObject4 instanceof JSONObject;
            if (bool3)
            {
              localObject3 = localObject4.toString();
              localObject3 = ((String)localObject3).getBytes();
              paramOutputStream.write((byte[])localObject3);
            }
            else
            {
              bool3 = localObject4 instanceof JSONArray;
              if (bool3)
              {
                localObject3 = localObject4.toString();
                localObject3 = ((String)localObject3).getBytes();
                paramOutputStream.write((byte[])localObject3);
              }
              else
              {
                bool3 = localObject4 instanceof Boolean;
                if (bool3)
                {
                  localObject4 = (Boolean)localObject4;
                  bool3 = ((Boolean)localObject4).booleanValue();
                  if (bool3) {}
                  for (localObject3 = JSON_TRUE;; localObject3 = JSON_FALSE)
                  {
                    paramOutputStream.write((byte[])localObject3);
                    break;
                  }
                }
                bool3 = localObject4 instanceof Long;
                if (bool3)
                {
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>();
                  localObject4 = (Number)localObject4;
                  long l2 = ((Number)localObject4).longValue();
                  localObject3 = ((StringBuilder)localObject3).append(l2);
                  localObject4 = "";
                  localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                  localObject3 = ((StringBuilder)localObject3).toString();
                  localObject3 = ((String)localObject3).getBytes();
                  paramOutputStream.write((byte[])localObject3);
                }
                else
                {
                  bool3 = localObject4 instanceof Double;
                  if (bool3)
                  {
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject4 = (Number)localObject4;
                    double d1 = ((Number)localObject4).doubleValue();
                    localObject3 = ((StringBuilder)localObject3).append(d1);
                    localObject4 = "";
                    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                    localObject3 = ((StringBuilder)localObject3).toString();
                    localObject3 = ((String)localObject3).getBytes();
                    paramOutputStream.write((byte[])localObject3);
                  }
                  else
                  {
                    bool3 = localObject4 instanceof Float;
                    if (bool3)
                    {
                      localObject3 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject3).<init>();
                      localObject4 = (Number)localObject4;
                      f = ((Number)localObject4).floatValue();
                      localObject3 = ((StringBuilder)localObject3).append(f);
                      localObject4 = "";
                      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                      localObject3 = ((StringBuilder)localObject3).toString();
                      localObject3 = ((String)localObject3).getBytes();
                      paramOutputStream.write((byte[])localObject3);
                    }
                    else
                    {
                      bool3 = localObject4 instanceof Integer;
                      if (bool3)
                      {
                        localObject3 = new java/lang/StringBuilder;
                        ((StringBuilder)localObject3).<init>();
                        localObject4 = (Number)localObject4;
                        n = ((Number)localObject4).intValue();
                        localObject3 = ((StringBuilder)localObject3).append(n);
                        localObject4 = "";
                        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                        localObject3 = ((StringBuilder)localObject3).toString();
                        localObject3 = ((String)localObject3).getBytes();
                        paramOutputStream.write((byte[])localObject3);
                      }
                      else
                      {
                        localObject3 = localObject4.toString();
                        localObject3 = escape((String)localObject3);
                        paramOutputStream.write((byte[])localObject3);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      long l3 = System.currentTimeMillis() - l1;
      Object localObject5 = this.elapsedField;
      if (localObject5 != null)
      {
        localObject5 = this.elapsedField;
        paramOutputStream.write((byte[])localObject5);
        paramOutputStream.write(k);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append(l3);
        str1 = "";
        localObject5 = str1.getBytes();
        paramOutputStream.write((byte[])localObject5);
      }
      localObject5 = AsyncHttpClient.log;
      String str1 = "JsonStreamerEntity";
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = "Uploaded JSON in ";
      localStringBuilder = localStringBuilder.append(str2);
      long l4 = 1000L;
      l3 /= l4;
      double d2 = Math.floor(l3);
      Object localObject3 = localStringBuilder.append(d2);
      localObject4 = " seconds";
      localObject3 = (String)localObject4;
      ((LogInterface)localObject5).i(str1, (String)localObject3);
    }
    paramOutputStream.write(i);
    paramOutputStream.flush();
    AsyncHttpClient.silentCloseOutputStream(paramOutputStream);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\JsonStreamerEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */