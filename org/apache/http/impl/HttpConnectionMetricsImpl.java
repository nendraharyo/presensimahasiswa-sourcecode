package org.apache.http.impl;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.io.HttpTransportMetrics;

public class HttpConnectionMetricsImpl
  implements HttpConnectionMetrics
{
  public static final String RECEIVED_BYTES_COUNT = "http.received-bytes-count";
  public static final String REQUEST_COUNT = "http.request-count";
  public static final String RESPONSE_COUNT = "http.response-count";
  public static final String SENT_BYTES_COUNT = "http.sent-bytes-count";
  private final HttpTransportMetrics inTransportMetric;
  private Map metricsCache;
  private final HttpTransportMetrics outTransportMetric;
  private long requestCount;
  private long responseCount;
  
  public HttpConnectionMetricsImpl(HttpTransportMetrics paramHttpTransportMetrics1, HttpTransportMetrics paramHttpTransportMetrics2)
  {
    this.requestCount = l;
    this.responseCount = l;
    this.inTransportMetric = paramHttpTransportMetrics1;
    this.outTransportMetric = paramHttpTransportMetrics2;
  }
  
  public Object getMetric(String paramString)
  {
    Object localObject = this.metricsCache;
    if (localObject != null) {}
    for (localObject = this.metricsCache.get(paramString);; localObject = null)
    {
      String str;
      boolean bool;
      long l;
      if (localObject == null)
      {
        str = "http.request-count";
        bool = str.equals(paramString);
        if (!bool) {
          break label53;
        }
        l = this.requestCount;
        localObject = Long.valueOf(l);
      }
      for (;;)
      {
        return localObject;
        label53:
        str = "http.response-count";
        bool = str.equals(paramString);
        if (bool)
        {
          l = this.responseCount;
          localObject = Long.valueOf(l);
        }
        else
        {
          str = "http.received-bytes-count";
          bool = str.equals(paramString);
          if (bool)
          {
            localObject = this.inTransportMetric;
            if (localObject != null)
            {
              l = this.inTransportMetric.getBytesTransferred();
              localObject = Long.valueOf(l);
            }
            else
            {
              localObject = null;
            }
          }
          else
          {
            str = "http.sent-bytes-count";
            bool = str.equals(paramString);
            if (bool)
            {
              localObject = this.outTransportMetric;
              if (localObject != null)
              {
                l = this.outTransportMetric.getBytesTransferred();
                localObject = Long.valueOf(l);
              }
              else
              {
                localObject = null;
              }
            }
          }
        }
      }
    }
  }
  
  public long getReceivedBytesCount()
  {
    HttpTransportMetrics localHttpTransportMetrics = this.inTransportMetric;
    if (localHttpTransportMetrics != null) {
      localHttpTransportMetrics = this.inTransportMetric;
    }
    for (long l = localHttpTransportMetrics.getBytesTransferred();; l = -1) {
      return l;
    }
  }
  
  public long getRequestCount()
  {
    return this.requestCount;
  }
  
  public long getResponseCount()
  {
    return this.responseCount;
  }
  
  public long getSentBytesCount()
  {
    HttpTransportMetrics localHttpTransportMetrics = this.outTransportMetric;
    if (localHttpTransportMetrics != null) {
      localHttpTransportMetrics = this.outTransportMetric;
    }
    for (long l = localHttpTransportMetrics.getBytesTransferred();; l = -1) {
      return l;
    }
  }
  
  public void incrementRequestCount()
  {
    long l = this.requestCount + 1L;
    this.requestCount = l;
  }
  
  public void incrementResponseCount()
  {
    long l = this.responseCount + 1L;
    this.responseCount = l;
  }
  
  public void reset()
  {
    long l = 0L;
    HttpTransportMetrics localHttpTransportMetrics = this.outTransportMetric;
    if (localHttpTransportMetrics != null)
    {
      localHttpTransportMetrics = this.outTransportMetric;
      localHttpTransportMetrics.reset();
    }
    localHttpTransportMetrics = this.inTransportMetric;
    if (localHttpTransportMetrics != null)
    {
      localHttpTransportMetrics = this.inTransportMetric;
      localHttpTransportMetrics.reset();
    }
    this.requestCount = l;
    this.responseCount = l;
    this.metricsCache = null;
  }
  
  public void setMetric(String paramString, Object paramObject)
  {
    Object localObject = this.metricsCache;
    if (localObject == null)
    {
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
      this.metricsCache = ((Map)localObject);
    }
    this.metricsCache.put(paramString, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\HttpConnectionMetricsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */