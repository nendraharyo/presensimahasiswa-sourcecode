package org.apache.http.params;

import java.util.Set;

public abstract class AbstractHttpParams
  implements HttpParams, HttpParamsNames
{
  public boolean getBooleanParameter(String paramString, boolean paramBoolean)
  {
    Object localObject = getParameter(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramBoolean;
      localObject = (Boolean)localObject;
      paramBoolean = ((Boolean)localObject).booleanValue();
    }
  }
  
  public double getDoubleParameter(String paramString, double paramDouble)
  {
    Object localObject = getParameter(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramDouble;
      localObject = (Double)localObject;
      paramDouble = ((Double)localObject).doubleValue();
    }
  }
  
  public int getIntParameter(String paramString, int paramInt)
  {
    Object localObject = getParameter(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramInt;
      localObject = (Integer)localObject;
      paramInt = ((Integer)localObject).intValue();
    }
  }
  
  public long getLongParameter(String paramString, long paramLong)
  {
    Object localObject = getParameter(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return paramLong;
      localObject = (Long)localObject;
      paramLong = ((Long)localObject).longValue();
    }
  }
  
  public Set getNames()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean isParameterFalse(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = getBooleanParameter(paramString, false);
    if (!bool2) {
      bool1 = true;
    }
    return bool1;
  }
  
  public boolean isParameterTrue(String paramString)
  {
    return getBooleanParameter(paramString, false);
  }
  
  public HttpParams setBooleanParameter(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Boolean localBoolean = Boolean.TRUE;; localBoolean = Boolean.FALSE)
    {
      setParameter(paramString, localBoolean);
      return this;
    }
  }
  
  public HttpParams setDoubleParameter(String paramString, double paramDouble)
  {
    Double localDouble = Double.valueOf(paramDouble);
    setParameter(paramString, localDouble);
    return this;
  }
  
  public HttpParams setIntParameter(String paramString, int paramInt)
  {
    Integer localInteger = Integer.valueOf(paramInt);
    setParameter(paramString, localInteger);
    return this;
  }
  
  public HttpParams setLongParameter(String paramString, long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    setParameter(paramString, localLong);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\AbstractHttpParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */