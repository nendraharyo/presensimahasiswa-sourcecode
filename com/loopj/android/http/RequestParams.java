package com.loopj.android.http;

import b.a.a.a.b.b.a;
import b.a.a.a.b.f.e;
import b.a.a.a.k;
import b.a.a.a.k.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RequestParams
  implements Serializable
{
  public static final String APPLICATION_JSON = "application/json";
  public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
  protected static final String LOG_TAG = "RequestParams";
  protected boolean autoCloseInputStreams;
  protected String contentEncoding;
  protected String elapsedFieldInJsonStreamer;
  protected final ConcurrentHashMap fileArrayParams;
  protected final ConcurrentHashMap fileParams;
  protected boolean forceMultipartEntity;
  protected boolean isRepeatable;
  protected final ConcurrentHashMap streamParams;
  protected final ConcurrentHashMap urlParams;
  protected final ConcurrentHashMap urlParamsWithObjects;
  protected boolean useJsonStreamer;
  
  public RequestParams()
  {
    this(null);
  }
  
  public RequestParams(String paramString1, String paramString2)
  {
    this(local1);
  }
  
  public RequestParams(Map paramMap)
  {
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.urlParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.streamParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.fileParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.fileArrayParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.urlParamsWithObjects = ((ConcurrentHashMap)localObject);
    boolean bool = false;
    this.forceMultipartEntity = false;
    this.elapsedFieldInJsonStreamer = "_elapsed";
    localObject = "UTF-8";
    this.contentEncoding = ((String)localObject);
    if (paramMap != null)
    {
      localObject = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        put(str, (String)localObject);
      }
    }
  }
  
  public RequestParams(Object... paramVarArgs)
  {
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.urlParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.streamParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.fileParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.fileArrayParams = ((ConcurrentHashMap)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.urlParamsWithObjects = ((ConcurrentHashMap)localObject);
    this.forceMultipartEntity = false;
    this.elapsedFieldInJsonStreamer = "_elapsed";
    localObject = "UTF-8";
    this.contentEncoding = ((String)localObject);
    int j = paramVarArgs.length;
    int k = j % 2;
    if (k != 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Supplied arguments must be even");
      throw localIllegalArgumentException;
    }
    while (i < j)
    {
      String str1 = String.valueOf(paramVarArgs[i]);
      int m = i + 1;
      String str2 = String.valueOf(paramVarArgs[m]);
      put(str1, str2);
      i += 2;
    }
  }
  
  private k createFormEntity()
  {
    try
    {
      locala = new b/a/a/a/b/b/a;
      localObject2 = getParamsList();
      str1 = this.contentEncoding;
      locala.<init>((List)localObject2, str1);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        a locala;
        Object localObject2 = AsyncHttpClient.log;
        String str1 = "RequestParams";
        String str2 = "createFormEntity failed";
        ((LogInterface)localObject2).e(str1, str2, localUnsupportedEncodingException);
        Object localObject1 = null;
      }
    }
    return locala;
  }
  
  private k createJsonStreamerEntity(ResponseHandlerInterface paramResponseHandlerInterface)
  {
    JsonStreamerEntity localJsonStreamerEntity = new com/loopj/android/http/JsonStreamerEntity;
    Object localObject1 = this.fileParams;
    boolean bool1 = ((ConcurrentHashMap)localObject1).isEmpty();
    if (bool1)
    {
      localObject1 = this.streamParams;
      bool1 = ((ConcurrentHashMap)localObject1).isEmpty();
      if (bool1) {}
    }
    else
    {
      bool1 = true;
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = this.elapsedFieldInJsonStreamer;
      localJsonStreamerEntity.<init>(paramResponseHandlerInterface, bool1, (String)localObject2);
      localObject1 = this.urlParams.entrySet();
      localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        localObject1 = ((Map.Entry)localObject1).getValue();
        localJsonStreamerEntity.addPart((String)localObject2, localObject1);
      }
      bool1 = false;
      localObject1 = null;
    }
    localObject1 = this.urlParamsWithObjects.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      localJsonStreamerEntity.addPart((String)localObject2, localObject1);
    }
    localObject1 = this.fileParams.entrySet();
    localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      localJsonStreamerEntity.addPart((String)localObject2, localObject1);
    }
    localObject1 = this.streamParams.entrySet();
    localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = (RequestParams.StreamWrapper)((Map.Entry)localObject1).getValue();
      InputStream localInputStream = ((RequestParams.StreamWrapper)localObject2).inputStream;
      if (localInputStream != null)
      {
        localObject1 = (String)((Map.Entry)localObject1).getKey();
        localInputStream = ((RequestParams.StreamWrapper)localObject2).inputStream;
        String str1 = ((RequestParams.StreamWrapper)localObject2).name;
        String str2 = ((RequestParams.StreamWrapper)localObject2).contentType;
        boolean bool2 = ((RequestParams.StreamWrapper)localObject2).autoClose;
        localObject2 = RequestParams.StreamWrapper.newInstance(localInputStream, str1, str2, bool2);
        localJsonStreamerEntity.addPart((String)localObject1, localObject2);
      }
    }
    return localJsonStreamerEntity;
  }
  
  private k createMultipartEntity(ResponseHandlerInterface paramResponseHandlerInterface)
  {
    SimpleMultipartEntity localSimpleMultipartEntity = new com/loopj/android/http/SimpleMultipartEntity;
    localSimpleMultipartEntity.<init>(paramResponseHandlerInterface);
    boolean bool1 = this.isRepeatable;
    localSimpleMultipartEntity.setIsRepeatable(bool1);
    Object localObject1 = this.urlParams.entrySet();
    Object localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      localObject4 = this.contentEncoding;
      localSimpleMultipartEntity.addPartWithCharset((String)localObject3, (String)localObject1, (String)localObject4);
    }
    bool1 = false;
    Object localObject3 = this.urlParamsWithObjects;
    localObject1 = getParamsList(null, localObject3);
    localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (l)((Iterator)localObject3).next();
      localObject2 = ((l)localObject1).a();
      localObject1 = ((l)localObject1).b();
      localObject4 = this.contentEncoding;
      localSimpleMultipartEntity.addPartWithCharset((String)localObject2, (String)localObject1, (String)localObject4);
    }
    localObject1 = this.streamParams.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    Object localObject5;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = (RequestParams.StreamWrapper)((Map.Entry)localObject1).getValue();
      localObject4 = ((RequestParams.StreamWrapper)localObject3).inputStream;
      if (localObject4 != null)
      {
        localObject1 = (String)((Map.Entry)localObject1).getKey();
        localObject4 = ((RequestParams.StreamWrapper)localObject3).name;
        localObject5 = ((RequestParams.StreamWrapper)localObject3).inputStream;
        localObject3 = ((RequestParams.StreamWrapper)localObject3).contentType;
        localSimpleMultipartEntity.addPart((String)localObject1, (String)localObject4, (InputStream)localObject5, (String)localObject3);
      }
    }
    localObject1 = this.fileParams.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = (RequestParams.FileWrapper)((Map.Entry)localObject1).getValue();
      localObject1 = (String)((Map.Entry)localObject1).getKey();
      localObject4 = ((RequestParams.FileWrapper)localObject3).file;
      localObject5 = ((RequestParams.FileWrapper)localObject3).contentType;
      localObject3 = ((RequestParams.FileWrapper)localObject3).customFileName;
      localSimpleMultipartEntity.addPart((String)localObject1, (File)localObject4, (String)localObject5, (String)localObject3);
    }
    localObject1 = this.fileArrayParams.entrySet();
    Object localObject4 = ((Set)localObject1).iterator();
    bool1 = ((Iterator)localObject4).hasNext();
    if (bool1)
    {
      localObject1 = (Map.Entry)((Iterator)localObject4).next();
      localObject3 = (List)((Map.Entry)localObject1).getValue();
      localObject5 = ((List)localObject3).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject5).hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = (RequestParams.FileWrapper)((Iterator)localObject5).next();
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        File localFile = ((RequestParams.FileWrapper)localObject3).file;
        String str = ((RequestParams.FileWrapper)localObject3).contentType;
        localObject3 = ((RequestParams.FileWrapper)localObject3).customFileName;
        localSimpleMultipartEntity.addPart((String)localObject2, localFile, str, (String)localObject3);
      }
    }
    return localSimpleMultipartEntity;
  }
  
  private List getParamsList(String paramString, Object paramObject)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    int k = paramObject instanceof Map;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (k != 0)
    {
      paramObject = (Map)paramObject;
      localObject2 = new java/util/ArrayList;
      Object localObject3 = ((Map)paramObject).keySet();
      ((ArrayList)localObject2).<init>((Collection)localObject3);
      int i2 = ((List)localObject2).size();
      if (i2 > 0)
      {
        localObject3 = ((List)localObject2).get(0);
        boolean bool3 = localObject3 instanceof Comparable;
        if (bool3) {
          Collections.sort((List)localObject2);
        }
      }
      localObject3 = ((List)localObject2).iterator();
      do
      {
        boolean bool4;
        do
        {
          k = ((Iterator)localObject3).hasNext();
          if (k == 0) {
            break;
          }
          localObject2 = ((Iterator)localObject3).next();
          bool4 = localObject2 instanceof String;
        } while (!bool4);
        localObject4 = ((Map)paramObject).get(localObject2);
      } while (localObject4 == null);
      if (paramString == null) {}
      for (localObject2 = (String)localObject2;; localObject2 = String.format((Locale)localObject5, (String)localObject6, (Object[])localObject7))
      {
        localObject2 = getParamsList((String)localObject2, localObject4);
        localLinkedList.addAll((Collection)localObject2);
        break;
        localObject5 = Locale.US;
        localObject6 = "%s[%s]";
        localObject7 = new Object[i];
        localObject7[0] = paramString;
        localObject7[j] = localObject2;
      }
    }
    k = paramObject instanceof List;
    if (k != 0)
    {
      paramObject = (List)paramObject;
      int i3 = ((List)paramObject).size();
      k = 0;
      localObject2 = null;
      while (k < i3)
      {
        localObject4 = Locale.US;
        localObject6 = new Object[i];
        localObject6[0] = paramString;
        localObject7 = Integer.valueOf(k);
        localObject6[j] = localObject7;
        localObject4 = String.format((Locale)localObject4, "%s[%d]", (Object[])localObject6);
        localObject5 = ((List)paramObject).get(k);
        localObject4 = getParamsList((String)localObject4, localObject5);
        localLinkedList.addAll((Collection)localObject4);
        int m;
        k += 1;
      }
    }
    int n = paramObject instanceof Object[];
    if (n != 0)
    {
      paramObject = (Object[])paramObject;
      int i4 = paramObject.length;
      n = 0;
      localObject2 = null;
      while (n < i4)
      {
        localObject4 = Locale.US;
        localObject6 = new Object[i];
        localObject6[0] = paramString;
        localObject7 = Integer.valueOf(n);
        localObject6[j] = localObject7;
        localObject4 = String.format((Locale)localObject4, "%s[%d]", (Object[])localObject6);
        localObject5 = paramObject[n];
        localObject4 = getParamsList((String)localObject4, localObject5);
        localLinkedList.addAll((Collection)localObject4);
        int i1;
        n += 1;
      }
    }
    boolean bool2 = paramObject instanceof Set;
    if (bool2)
    {
      paramObject = (Set)paramObject;
      localObject2 = ((Set)paramObject).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject2).next();
        localObject1 = getParamsList(paramString, localObject1);
        localLinkedList.addAll((Collection)localObject1);
      }
    }
    Object localObject2 = new b/a/a/a/k/l;
    localObject1 = paramObject.toString();
    ((l)localObject2).<init>(paramString, (String)localObject1);
    localLinkedList.add(localObject2);
    return localLinkedList;
  }
  
  public void add(String paramString1, String paramString2)
  {
    Object localObject;
    boolean bool;
    if ((paramString1 != null) && (paramString2 != null))
    {
      localObject = this.urlParamsWithObjects.get(paramString1);
      if (localObject == null)
      {
        localObject = new java/util/HashSet;
        ((HashSet)localObject).<init>();
        put(paramString1, localObject);
      }
      bool = localObject instanceof List;
      if (!bool) {
        break label60;
      }
      localObject = (List)localObject;
      ((List)localObject).add(paramString2);
    }
    for (;;)
    {
      return;
      label60:
      bool = localObject instanceof Set;
      if (bool)
      {
        localObject = (Set)localObject;
        ((Set)localObject).add(paramString2);
      }
    }
  }
  
  public k getEntity(ResponseHandlerInterface paramResponseHandlerInterface)
  {
    boolean bool = this.useJsonStreamer;
    Object localObject;
    if (bool) {
      localObject = createJsonStreamerEntity(paramResponseHandlerInterface);
    }
    for (;;)
    {
      return (k)localObject;
      bool = this.forceMultipartEntity;
      if (!bool)
      {
        localObject = this.streamParams;
        bool = ((ConcurrentHashMap)localObject).isEmpty();
        if (bool)
        {
          localObject = this.fileParams;
          bool = ((ConcurrentHashMap)localObject).isEmpty();
          if (bool)
          {
            localObject = this.fileArrayParams;
            bool = ((ConcurrentHashMap)localObject).isEmpty();
            if (bool)
            {
              localObject = createFormEntity();
              continue;
            }
          }
        }
      }
      localObject = createMultipartEntity(paramResponseHandlerInterface);
    }
  }
  
  protected String getParamString()
  {
    List localList = getParamsList();
    String str = this.contentEncoding;
    return e.a(localList, str);
  }
  
  protected List getParamsList()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    Object localObject1 = this.urlParams.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      l locall = new b/a/a/a/k/l;
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      locall.<init>((String)localObject2, (String)localObject1);
      localLinkedList.add(locall);
    }
    Object localObject2 = this.urlParamsWithObjects;
    localObject1 = getParamsList(null, localObject2);
    localLinkedList.addAll((Collection)localObject1);
    return localLinkedList;
  }
  
  public boolean has(String paramString)
  {
    Object localObject = this.urlParams.get(paramString);
    if (localObject == null)
    {
      localObject = this.streamParams.get(paramString);
      if (localObject == null)
      {
        localObject = this.fileParams.get(paramString);
        if (localObject == null)
        {
          localObject = this.urlParamsWithObjects.get(paramString);
          if (localObject == null)
          {
            localObject = this.fileArrayParams.get(paramString);
            if (localObject == null) {
              break label69;
            }
          }
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label69:
      bool = false;
      localObject = null;
    }
  }
  
  public void put(String paramString, int paramInt)
  {
    if (paramString != null)
    {
      ConcurrentHashMap localConcurrentHashMap = this.urlParams;
      String str = String.valueOf(paramInt);
      localConcurrentHashMap.put(paramString, str);
    }
  }
  
  public void put(String paramString, long paramLong)
  {
    if (paramString != null)
    {
      ConcurrentHashMap localConcurrentHashMap = this.urlParams;
      String str = String.valueOf(paramLong);
      localConcurrentHashMap.put(paramString, str);
    }
  }
  
  public void put(String paramString, File paramFile)
  {
    put(paramString, paramFile, null, null);
  }
  
  public void put(String paramString1, File paramFile, String paramString2)
  {
    put(paramString1, paramFile, paramString2, null);
  }
  
  public void put(String paramString1, File paramFile, String paramString2, String paramString3)
  {
    Object localObject;
    if (paramFile != null)
    {
      boolean bool = paramFile.exists();
      if (bool) {}
    }
    else
    {
      localObject = new java/io/FileNotFoundException;
      ((FileNotFoundException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    if (paramString1 != null)
    {
      localObject = this.fileParams;
      RequestParams.FileWrapper localFileWrapper = new com/loopj/android/http/RequestParams$FileWrapper;
      localFileWrapper.<init>(paramFile, paramString2, paramString3);
      ((ConcurrentHashMap)localObject).put(paramString1, localFileWrapper);
    }
  }
  
  public void put(String paramString, InputStream paramInputStream)
  {
    put(paramString, paramInputStream, null);
  }
  
  public void put(String paramString1, InputStream paramInputStream, String paramString2)
  {
    put(paramString1, paramInputStream, paramString2, null);
  }
  
  public void put(String paramString1, InputStream paramInputStream, String paramString2, String paramString3)
  {
    boolean bool = this.autoCloseInputStreams;
    put(paramString1, paramInputStream, paramString2, paramString3, bool);
  }
  
  public void put(String paramString1, InputStream paramInputStream, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((paramString1 != null) && (paramInputStream != null))
    {
      ConcurrentHashMap localConcurrentHashMap = this.streamParams;
      RequestParams.StreamWrapper localStreamWrapper = RequestParams.StreamWrapper.newInstance(paramInputStream, paramString2, paramString3, paramBoolean);
      localConcurrentHashMap.put(paramString1, localStreamWrapper);
    }
  }
  
  public void put(String paramString, Object paramObject)
  {
    if ((paramString != null) && (paramObject != null))
    {
      ConcurrentHashMap localConcurrentHashMap = this.urlParamsWithObjects;
      localConcurrentHashMap.put(paramString, paramObject);
    }
  }
  
  public void put(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null))
    {
      ConcurrentHashMap localConcurrentHashMap = this.urlParams;
      localConcurrentHashMap.put(paramString1, paramString2);
    }
  }
  
  public void put(String paramString1, String paramString2, File paramFile)
  {
    put(paramString1, paramFile, null, paramString2);
  }
  
  public void put(String paramString, File[] paramArrayOfFile)
  {
    put(paramString, paramArrayOfFile, null, null);
  }
  
  public void put(String paramString1, File[] paramArrayOfFile, String paramString2, String paramString3)
  {
    if (paramString1 != null)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = paramArrayOfFile.length;
      int j = 0;
      Object localObject = null;
      while (j < i)
      {
        File localFile = paramArrayOfFile[j];
        if (localFile != null)
        {
          boolean bool = localFile.exists();
          if (bool) {}
        }
        else
        {
          localObject = new java/io/FileNotFoundException;
          ((FileNotFoundException)localObject).<init>();
          throw ((Throwable)localObject);
        }
        RequestParams.FileWrapper localFileWrapper = new com/loopj/android/http/RequestParams$FileWrapper;
        localFileWrapper.<init>(localFile, paramString2, paramString3);
        localArrayList.add(localFileWrapper);
        j += 1;
      }
      localObject = this.fileArrayParams;
      ((ConcurrentHashMap)localObject).put(paramString1, localArrayList);
    }
  }
  
  public void remove(String paramString)
  {
    this.urlParams.remove(paramString);
    this.streamParams.remove(paramString);
    this.fileParams.remove(paramString);
    this.urlParamsWithObjects.remove(paramString);
    this.fileArrayParams.remove(paramString);
  }
  
  public void setAutoCloseInputStreams(boolean paramBoolean)
  {
    this.autoCloseInputStreams = paramBoolean;
  }
  
  public void setContentEncoding(String paramString)
  {
    if (paramString != null) {
      this.contentEncoding = paramString;
    }
    for (;;)
    {
      return;
      LogInterface localLogInterface = AsyncHttpClient.log;
      String str1 = "RequestParams";
      String str2 = "setContentEncoding called with null attribute";
      localLogInterface.d(str1, str2);
    }
  }
  
  public void setElapsedFieldInJsonStreamer(String paramString)
  {
    this.elapsedFieldInJsonStreamer = paramString;
  }
  
  public void setForceMultipartEntityContentType(boolean paramBoolean)
  {
    this.forceMultipartEntity = paramBoolean;
  }
  
  public void setHttpEntityIsRepeatable(boolean paramBoolean)
  {
    this.isRepeatable = paramBoolean;
  }
  
  public void setUseJsonStreamer(boolean paramBoolean)
  {
    this.useJsonStreamer = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.urlParams.entrySet();
    Object localObject2 = ((Set)localObject1).iterator();
    boolean bool1;
    int j;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      j = localStringBuilder.length();
      if (j > 0)
      {
        localObject3 = "&";
        localStringBuilder.append((String)localObject3);
      }
      localObject3 = (String)((Map.Entry)localObject1).getKey();
      localStringBuilder.append((String)localObject3);
      localObject3 = "=";
      localStringBuilder.append((String)localObject3);
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      localStringBuilder.append((String)localObject1);
    }
    localObject1 = this.streamParams.entrySet();
    Object localObject3 = ((Set)localObject1).iterator();
    int k;
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      k = localStringBuilder.length();
      if (k > 0)
      {
        localObject2 = "&";
        localStringBuilder.append((String)localObject2);
      }
      localObject1 = (String)((Map.Entry)localObject1).getKey();
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append("=");
      localObject1 = "STREAM";
      localStringBuilder.append((String)localObject1);
    }
    localObject1 = this.fileParams.entrySet();
    localObject3 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      k = localStringBuilder.length();
      if (k > 0)
      {
        localObject2 = "&";
        localStringBuilder.append((String)localObject2);
      }
      localObject1 = (String)((Map.Entry)localObject1).getKey();
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append("=");
      localObject1 = "FILE";
      localStringBuilder.append((String)localObject1);
    }
    localObject1 = this.fileArrayParams.entrySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      j = localStringBuilder.length();
      if (j > 0)
      {
        localObject3 = "&";
        localStringBuilder.append((String)localObject3);
      }
      localObject3 = (String)((Map.Entry)localObject1).getKey();
      localStringBuilder.append((String)localObject3);
      localStringBuilder.append("=");
      localObject3 = localStringBuilder.append("FILES(SIZE=");
      i = ((List)((Map.Entry)localObject1).getValue()).size();
      localObject1 = ((StringBuilder)localObject3).append(i);
      localObject3 = ")";
      ((StringBuilder)localObject1).append((String)localObject3);
    }
    int i = 0;
    localObject3 = this.urlParamsWithObjects;
    localObject1 = getParamsList(null, localObject3);
    localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject3).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (l)((Iterator)localObject3).next();
      k = localStringBuilder.length();
      if (k > 0)
      {
        localObject2 = "&";
        localStringBuilder.append((String)localObject2);
      }
      localObject2 = ((l)localObject1).a();
      localStringBuilder.append((String)localObject2);
      localObject2 = "=";
      localStringBuilder.append((String)localObject2);
      localObject1 = ((l)localObject1).b();
      localStringBuilder.append((String)localObject1);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RequestParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */