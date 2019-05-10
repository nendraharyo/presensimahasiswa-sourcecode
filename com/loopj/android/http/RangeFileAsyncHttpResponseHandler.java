package com.loopj.android.http;

import b.a.a.a.af;
import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class RangeFileAsyncHttpResponseHandler
  extends FileAsyncHttpResponseHandler
{
  private static final String LOG_TAG = "RangeFileAsyncHttpRH";
  private boolean append = false;
  private long current = 0L;
  
  public RangeFileAsyncHttpResponseHandler(File paramFile)
  {
    super(paramFile);
  }
  
  protected byte[] getResponseData(k paramk)
  {
    if (paramk != null)
    {
      InputStream localInputStream = paramk.getContent();
      long l1 = paramk.getContentLength();
      long l2 = this.current;
      l1 += l2;
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      Object localObject1 = getTargetFile();
      boolean bool1 = this.append;
      localFileOutputStream.<init>((File)localObject1, bool1);
      if (localInputStream != null)
      {
        int j = 4096;
        try
        {
          localObject1 = new byte[j];
          for (;;)
          {
            long l3 = this.current;
            bool1 = l3 < l1;
            if (!bool1) {
              break;
            }
            int i = localInputStream.read((byte[])localObject1);
            int k = -1;
            if (i == k) {
              break;
            }
            Thread localThread = Thread.currentThread();
            boolean bool2 = localThread.isInterrupted();
            if (bool2) {
              break;
            }
            l3 = this.current;
            long l4 = i;
            l3 += l4;
            this.current = l3;
            bool2 = false;
            localThread = null;
            localFileOutputStream.write((byte[])localObject1, 0, i);
            l3 = this.current;
            sendProgressMessage(l3, l1);
          }
          localInputStream.close();
        }
        finally
        {
          localInputStream.close();
          localFileOutputStream.flush();
          localFileOutputStream.close();
        }
        localFileOutputStream.flush();
        localFileOutputStream.close();
      }
    }
    return null;
  }
  
  public void sendResponseMessage(s params)
  {
    String str = null;
    Object localObject1 = Thread.currentThread();
    boolean bool1 = ((Thread)localObject1).isInterrupted();
    int n;
    int i;
    if (!bool1)
    {
      localObject1 = params.a();
      int j = ((af)localObject1).b();
      n = 416;
      if (j != n) {
        break label87;
      }
      localObject2 = Thread.currentThread();
      boolean bool2 = ((Thread)localObject2).isInterrupted();
      if (!bool2)
      {
        i = ((af)localObject1).b();
        localObject2 = params.getAllHeaders();
        sendSuccessMessage(i, (e[])localObject2, null);
      }
    }
    label87:
    Object localObject3;
    Object localObject4;
    boolean bool4;
    do
    {
      for (;;)
      {
        return;
        int k = ((af)localObject1).b();
        n = 300;
        if (k < n) {
          break;
        }
        localObject2 = Thread.currentThread();
        boolean bool3 = ((Thread)localObject2).isInterrupted();
        if (!bool3)
        {
          int m = ((af)localObject1).b();
          localObject3 = params.getAllHeaders();
          localObject4 = new b/a/a/a/b/l;
          int i1 = ((af)localObject1).b();
          localObject1 = ((af)localObject1).c();
          ((b.a.a.a.b.l)localObject4).<init>(i1, (String)localObject1);
          sendFailureMessage(m, (e[])localObject3, null, (Throwable)localObject4);
        }
      }
      localObject2 = Thread.currentThread();
      bool4 = ((Thread)localObject2).isInterrupted();
    } while (bool4);
    Object localObject2 = params.getFirstHeader("Content-Range");
    if (localObject2 == null)
    {
      bool4 = false;
      localObject2 = null;
      this.append = false;
      long l = 0L;
      this.current = l;
    }
    for (;;)
    {
      i = ((af)localObject1).b();
      localObject2 = params.getAllHeaders();
      localObject3 = params.b();
      localObject3 = getResponseData((k)localObject3);
      sendSuccessMessage(i, (e[])localObject2, (byte[])localObject3);
      break;
      localObject3 = AsyncHttpClient.log;
      localObject4 = "RangeFileAsyncHttpRH";
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = "Content-Range: ";
      localStringBuilder = localStringBuilder.append(str);
      localObject2 = ((e)localObject2).d();
      localObject2 = (String)localObject2;
      ((LogInterface)localObject3).v((String)localObject4, (String)localObject2);
    }
  }
  
  public void updateRequestHeaders(b.a.a.a.b.c.l paraml)
  {
    Object localObject1 = this.file;
    boolean bool = ((File)localObject1).exists();
    if (bool)
    {
      localObject1 = this.file;
      bool = ((File)localObject1).canWrite();
      if (bool)
      {
        localObject1 = this.file;
        l1 = ((File)localObject1).length();
        this.current = l1;
      }
    }
    long l1 = this.current;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      bool = true;
      this.append = bool;
      localObject1 = "Range";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("bytes=");
      l2 = this.current;
      localObject2 = ((StringBuilder)localObject2).append(l2);
      String str = "-";
      localObject2 = str;
      paraml.setHeader((String)localObject1, (String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RangeFileAsyncHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */