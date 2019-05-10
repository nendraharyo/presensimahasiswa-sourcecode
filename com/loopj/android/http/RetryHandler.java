package com.loopj.android.http;

import android.os.SystemClock;
import b.a.a.a.b.c.l;
import b.a.a.a.b.k;
import b.a.a.a.n.e;
import b.a.a.a.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;

class RetryHandler
  implements k
{
  private static final HashSet exceptionBlacklist;
  private static final HashSet exceptionWhitelist;
  private final int maxRetries;
  private final int retrySleepTimeMS;
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    exceptionWhitelist = localHashSet;
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    exceptionBlacklist = localHashSet;
    exceptionWhitelist.add(z.class);
    exceptionWhitelist.add(UnknownHostException.class);
    exceptionWhitelist.add(SocketException.class);
    exceptionBlacklist.add(InterruptedIOException.class);
    exceptionBlacklist.add(SSLException.class);
  }
  
  public RetryHandler(int paramInt1, int paramInt2)
  {
    this.maxRetries = paramInt1;
    this.retrySleepTimeMS = paramInt2;
  }
  
  static void addClassToBlacklist(Class paramClass)
  {
    exceptionBlacklist.add(paramClass);
  }
  
  static void addClassToWhitelist(Class paramClass)
  {
    exceptionWhitelist.add(paramClass);
  }
  
  protected boolean isInList(HashSet paramHashSet, Throwable paramThrowable)
  {
    Iterator localIterator = paramHashSet.iterator();
    Class localClass;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localClass = (Class)localIterator.next();
      bool = localClass.isInstance(paramThrowable);
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localClass = null;
    }
  }
  
  public boolean retryRequest(IOException paramIOException, int paramInt, e parame)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = (Boolean)parame.a("http.request_sent");
    boolean bool3;
    if (localObject != null)
    {
      bool3 = ((Boolean)localObject).booleanValue();
      if (bool3)
      {
        bool3 = bool1;
        int j = this.maxRetries;
        if (paramInt <= j) {
          break label90;
        }
        bool1 = false;
      }
    }
    for (;;)
    {
      if (!bool1) {
        break label142;
      }
      localObject = (l)parame.a("http.request");
      if (localObject != null) {
        break label142;
      }
      return bool2;
      bool3 = false;
      localObject = null;
      break;
      label90:
      HashSet localHashSet = exceptionWhitelist;
      boolean bool4 = isInList(localHashSet, paramIOException);
      if (!bool4)
      {
        localHashSet = exceptionBlacklist;
        bool4 = isInList(localHashSet, paramIOException);
        if (bool4) {
          bool1 = false;
        } else if (bool3) {}
      }
    }
    label142:
    if (bool1)
    {
      int i = this.retrySleepTimeMS;
      long l = i;
      SystemClock.sleep(l);
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      paramIOException.printStackTrace();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RetryHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */