package com.crashlytics.android.core;

import android.app.ActivityManager.RunningAppProcessInfo;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class SessionProtobufHelper
{
  private static final String SIGNAL_DEFAULT = "0";
  private static final ByteString SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8("0");
  private static final ByteString UNITY_PLATFORM_BYTE_STRING = ByteString.copyFromUtf8("Unity");
  
  private static int getBinaryImageSize(ByteString paramByteString1, ByteString paramByteString2)
  {
    long l = 0L;
    int i = CodedOutputStream.computeUInt64Size(1, l);
    int j = 0 + i;
    i = CodedOutputStream.computeUInt64Size(2, l);
    j += i;
    i = CodedOutputStream.computeBytesSize(3, paramByteString1);
    j += i;
    if (paramByteString2 != null)
    {
      i = CodedOutputStream.computeBytesSize(4, paramByteString2);
      j += i;
    }
    return j;
  }
  
  private static int getDeviceIdentifierSize(IdManager.DeviceIdentifierType paramDeviceIdentifierType, String paramString)
  {
    int i = paramDeviceIdentifierType.protobufIndex;
    int j = CodedOutputStream.computeEnumSize(1, i);
    ByteString localByteString = ByteString.copyFromUtf8(paramString);
    i = CodedOutputStream.computeBytesSize(2, localByteString);
    return j + i;
  }
  
  private static int getEventAppCustomAttributeSize(String paramString1, String paramString2)
  {
    ByteString localByteString1 = ByteString.copyFromUtf8(paramString1);
    int i = CodedOutputStream.computeBytesSize(1, localByteString1);
    int j = 2;
    if (paramString2 == null) {
      paramString2 = "";
    }
    ByteString localByteString2 = ByteString.copyFromUtf8(paramString2);
    j = CodedOutputStream.computeBytesSize(j, localByteString2);
    return i + j;
  }
  
  private static int getEventAppExecutionExceptionSize(TrimmedThrowableData paramTrimmedThrowableData, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    ByteString localByteString = ByteString.copyFromUtf8(paramTrimmedThrowableData.className);
    int k = CodedOutputStream.computeBytesSize(i, localByteString) + 0;
    Object localObject = paramTrimmedThrowableData.localizedMessage;
    int m;
    if (localObject != null)
    {
      m = 3;
      localObject = ByteString.copyFromUtf8((String)localObject);
      n = CodedOutputStream.computeBytesSize(m, (ByteString)localObject);
      k += n;
    }
    StackTraceElement[] arrayOfStackTraceElement = paramTrimmedThrowableData.stacktrace;
    int i1 = arrayOfStackTraceElement.length;
    int n = 0;
    localObject = null;
    while (n < i1)
    {
      StackTraceElement localStackTraceElement = arrayOfStackTraceElement[n];
      m = getFrameSize(localStackTraceElement, i);
      int i2 = CodedOutputStream.computeTagSize(4);
      int i3 = CodedOutputStream.computeRawVarint32Size(m);
      i2 += i3;
      m = m + i2 + k;
      n += 1;
      k = m;
    }
    localObject = paramTrimmedThrowableData.cause;
    if (localObject != null)
    {
      if (paramInt1 >= paramInt2) {
        break label212;
      }
      j = paramInt1 + 1;
      j = getEventAppExecutionExceptionSize((TrimmedThrowableData)localObject, j, paramInt2);
      n = CodedOutputStream.computeTagSize(6);
      m = CodedOutputStream.computeRawVarint32Size(j);
      n += m;
      j += n;
      k += j;
    }
    for (;;)
    {
      return k;
      label212:
      while (localObject != null)
      {
        localObject = ((TrimmedThrowableData)localObject).cause;
        j += 1;
      }
      n = 7;
      j = CodedOutputStream.computeUInt32Size(n, j);
      k += j;
    }
  }
  
  private static int getEventAppExecutionSignalSize()
  {
    ByteString localByteString = SIGNAL_DEFAULT_BYTE_STRING;
    int i = CodedOutputStream.computeBytesSize(1, localByteString);
    int j = 0 + i;
    localByteString = SIGNAL_DEFAULT_BYTE_STRING;
    i = CodedOutputStream.computeBytesSize(2, localByteString);
    j += i;
    i = CodedOutputStream.computeUInt64Size(3, 0L);
    return j + i;
  }
  
  private static int getEventAppExecutionSize(TrimmedThrowableData paramTrimmedThrowableData, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List paramList, int paramInt, ByteString paramByteString1, ByteString paramByteString2)
  {
    int i = getThreadSize(paramThread, paramArrayOfStackTraceElement, 4, true);
    int j = CodedOutputStream.computeTagSize(1);
    int k = CodedOutputStream.computeRawVarint32Size(i);
    j += k;
    i = i + j + 0;
    k = paramArrayOfThread.length;
    int m = 0;
    StackTraceElement[] arrayOfStackTraceElement = null;
    j = i;
    for (i = 0; i < k; i = m)
    {
      Thread localThread = paramArrayOfThread[i];
      arrayOfStackTraceElement = (StackTraceElement[])paramList.get(i);
      m = getThreadSize(localThread, arrayOfStackTraceElement, 0, false);
      int n = CodedOutputStream.computeTagSize(1);
      int i1 = CodedOutputStream.computeRawVarint32Size(m);
      n += i1;
      m += n;
      j += m;
      m = i + 1;
    }
    m = getEventAppExecutionExceptionSize(paramTrimmedThrowableData, 1, paramInt);
    i = CodedOutputStream.computeTagSize(2);
    k = CodedOutputStream.computeRawVarint32Size(m);
    i += k;
    m = m + i + j;
    i = getEventAppExecutionSignalSize();
    j = CodedOutputStream.computeTagSize(3);
    k = CodedOutputStream.computeRawVarint32Size(i);
    j += k;
    i += j;
    m += i;
    i = getBinaryImageSize(paramByteString1, paramByteString2);
    j = CodedOutputStream.computeTagSize(3);
    k = CodedOutputStream.computeRawVarint32Size(i);
    j += k;
    i += j;
    return m + i;
  }
  
  private static int getEventAppSize(TrimmedThrowableData paramTrimmedThrowableData, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List paramList, int paramInt1, ByteString paramByteString1, ByteString paramByteString2, Map paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2)
  {
    Object localObject1 = null;
    int i = getEventAppExecutionSize(paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramByteString1, paramByteString2);
    int j = CodedOutputStream.computeTagSize(1);
    int k = CodedOutputStream.computeRawVarint32Size(i);
    j += k;
    i += j;
    int m = 0 + i;
    int n;
    if (paramMap != null)
    {
      Object localObject2 = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      for (j = m;; j = n)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        localObject1 = (String)((Map.Entry)localObject1).getValue();
        n = getEventAppCustomAttributeSize((String)localObject2, (String)localObject1);
        i = CodedOutputStream.computeTagSize(2);
        int i2 = CodedOutputStream.computeRawVarint32Size(n);
        i += i2;
        n = n + i + j;
      }
    }
    int i1;
    for (i = j;; i = i1)
    {
      if (paramRunningAppProcessInfo != null)
      {
        j = 3;
        n = paramRunningAppProcessInfo.importance;
        k = 100;
        if (n != k) {
          n = 1;
        }
      }
      for (i1 = CodedOutputStream.computeBoolSize(j, n) + i;; i1 = i)
      {
        i = CodedOutputStream.computeUInt32Size(4, paramInt2);
        return i1 + i;
        i1 = 0;
        localObject1 = null;
        break;
      }
    }
  }
  
  private static int getEventDeviceSize(Float paramFloat, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    int i = 0;
    if (paramFloat != null)
    {
      float f = paramFloat.floatValue();
      j = CodedOutputStream.computeFloatSize(1, f);
      i = 0 + j;
    }
    int j = CodedOutputStream.computeSInt32Size(2, paramInt1);
    i += j;
    j = CodedOutputStream.computeBoolSize(3, paramBoolean);
    i += j;
    j = CodedOutputStream.computeUInt32Size(4, paramInt2);
    i += j;
    j = CodedOutputStream.computeUInt64Size(5, paramLong1);
    i += j;
    j = CodedOutputStream.computeUInt64Size(6, paramLong2);
    return i + j;
  }
  
  private static int getEventLogSize(ByteString paramByteString)
  {
    return CodedOutputStream.computeBytesSize(1, paramByteString);
  }
  
  private static int getFrameSize(StackTraceElement paramStackTraceElement, boolean paramBoolean)
  {
    int i = 2;
    int j = 1;
    boolean bool2 = paramStackTraceElement.isNativeMethod();
    long l;
    int m;
    int n;
    if (bool2)
    {
      l = Math.max(paramStackTraceElement.getLineNumber(), 0);
      m = CodedOutputStream.computeUInt64Size(j, l) + 0;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = paramStackTraceElement.getClassName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(".");
      localObject2 = paramStackTraceElement.getMethodName();
      localObject1 = ByteString.copyFromUtf8((String)localObject2);
      j = CodedOutputStream.computeBytesSize(i, (ByteString)localObject1);
      m += j;
      localObject1 = paramStackTraceElement.getFileName();
      if (localObject1 != null)
      {
        localObject2 = ByteString.copyFromUtf8(paramStackTraceElement.getFileName());
        j = CodedOutputStream.computeBytesSize(3, (ByteString)localObject2);
        m += j;
      }
      boolean bool1 = paramStackTraceElement.isNativeMethod();
      if (bool1) {
        break label220;
      }
      k = paramStackTraceElement.getLineNumber();
      if (k <= 0) {
        break label220;
      }
      n = paramStackTraceElement.getLineNumber();
      l = n;
      k = CodedOutputStream.computeUInt64Size(4, l);
      m += k;
    }
    label220:
    for (int k = m;; k = m)
    {
      n = 5;
      if (paramBoolean) {}
      for (m = i;; m = 0)
      {
        return CodedOutputStream.computeUInt32Size(n, m) + k;
        l = 0L;
        m = CodedOutputStream.computeUInt64Size(k, l) + 0;
        break;
      }
    }
  }
  
  private static int getSessionAppOrgSize(ByteString paramByteString)
  {
    int i = CodedOutputStream.computeBytesSize(1, paramByteString);
    return 0 + i;
  }
  
  private static int getSessionAppSize(ByteString paramByteString1, ByteString paramByteString2, ByteString paramByteString3, ByteString paramByteString4, ByteString paramByteString5, int paramInt, ByteString paramByteString6)
  {
    int i = CodedOutputStream.computeBytesSize(1, paramByteString1);
    int j = 0 + i;
    i = CodedOutputStream.computeBytesSize(2, paramByteString3);
    j += i;
    i = CodedOutputStream.computeBytesSize(3, paramByteString4);
    j += i;
    i = getSessionAppOrgSize(paramByteString2);
    int k = CodedOutputStream.computeTagSize(5);
    int m = CodedOutputStream.computeRawVarint32Size(i);
    k += m;
    i += k;
    j += i;
    i = CodedOutputStream.computeBytesSize(6, paramByteString5);
    j += i;
    if (paramByteString6 != null)
    {
      ByteString localByteString = UNITY_PLATFORM_BYTE_STRING;
      i = CodedOutputStream.computeBytesSize(8, localByteString);
      j += i;
      i = CodedOutputStream.computeBytesSize(9, paramByteString6);
      j += i;
    }
    i = CodedOutputStream.computeEnumSize(10, paramInt);
    return j + i;
  }
  
  private static int getSessionDeviceSize(int paramInt1, ByteString paramByteString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map paramMap, int paramInt3, ByteString paramByteString2, ByteString paramByteString3)
  {
    int i = 0;
    Object localObject1 = null;
    int k = CodedOutputStream.computeEnumSize(3, paramInt1) + 0;
    if (paramByteString1 == null)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      i += k;
      k = CodedOutputStream.computeUInt32Size(5, paramInt2);
      i += k;
      k = CodedOutputStream.computeUInt64Size(6, paramLong1);
      i += k;
      k = CodedOutputStream.computeUInt64Size(7, paramLong2);
      i += k;
      k = CodedOutputStream.computeBoolSize(10, paramBoolean);
      i += k;
      if (paramMap == null) {
        break;
      }
      Object localObject2 = paramMap.entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      for (m = i;; m = j)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (IdManager.DeviceIdentifierType)((Map.Entry)localObject1).getKey();
        localObject1 = (String)((Map.Entry)localObject1).getValue();
        j = getDeviceIdentifierSize((IdManager.DeviceIdentifierType)localObject2, (String)localObject1);
        k = CodedOutputStream.computeTagSize(11);
        int n = CodedOutputStream.computeRawVarint32Size(j);
        k += n;
        j = j + k + m;
      }
      j = CodedOutputStream.computeBytesSize(4, paramByteString1);
    }
    int m = j;
    int j = CodedOutputStream.computeUInt32Size(12, paramInt3);
    k = m + j;
    if (paramByteString2 == null)
    {
      j = 0;
      localObject1 = null;
      k += j;
      if (paramByteString3 != null) {
        break label294;
      }
      j = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return j + k;
      j = CodedOutputStream.computeBytesSize(13, paramByteString2);
      break;
      label294:
      j = CodedOutputStream.computeBytesSize(14, paramByteString3);
    }
  }
  
  private static int getSessionEventSize(long paramLong1, String paramString, TrimmedThrowableData paramTrimmedThrowableData, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List paramList, int paramInt1, Map paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2, ByteString paramByteString1, ByteString paramByteString2, Float paramFloat, int paramInt3, boolean paramBoolean, long paramLong2, long paramLong3, ByteString paramByteString3)
  {
    int i = CodedOutputStream.computeUInt64Size(1, paramLong1);
    int j = 0 + i;
    Object localObject = ByteString.copyFromUtf8(paramString);
    i = CodedOutputStream.computeBytesSize(2, (ByteString)localObject);
    int k = j + i;
    localObject = paramArrayOfStackTraceElement;
    j = getEventAppSize(paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramByteString1, paramByteString2, paramMap, paramRunningAppProcessInfo, paramInt2);
    i = CodedOutputStream.computeTagSize(3);
    int m = CodedOutputStream.computeRawVarint32Size(j);
    i += m;
    j += i;
    int i1 = k + j;
    i = paramInt3;
    boolean bool = paramBoolean;
    int i2 = paramInt2;
    j = getEventDeviceSize(paramFloat, paramInt3, paramBoolean, paramInt2, paramLong2, paramLong3);
    i = CodedOutputStream.computeTagSize(5);
    int n = CodedOutputStream.computeRawVarint32Size(j);
    i += n;
    j = j + i + i1;
    if (paramByteString3 != null)
    {
      i = getEventLogSize(paramByteString3);
      n = CodedOutputStream.computeTagSize(6);
      i2 = CodedOutputStream.computeRawVarint32Size(i);
      n += i2;
      i += n;
      j += i;
    }
    return j;
  }
  
  private static int getSessionOSSize(ByteString paramByteString1, ByteString paramByteString2, boolean paramBoolean)
  {
    int i = 3;
    int j = CodedOutputStream.computeEnumSize(1, i);
    int k = 0 + j;
    j = CodedOutputStream.computeBytesSize(2, paramByteString1);
    k += j;
    j = CodedOutputStream.computeBytesSize(i, paramByteString2);
    k += j;
    j = CodedOutputStream.computeBoolSize(4, paramBoolean);
    return k + j;
  }
  
  private static int getThreadSize(Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt, boolean paramBoolean)
  {
    ByteString localByteString = ByteString.copyFromUtf8(paramThread.getName());
    int i = CodedOutputStream.computeBytesSize(1, localByteString);
    int j = CodedOutputStream.computeUInt32Size(2, paramInt) + i;
    int k = paramArrayOfStackTraceElement.length;
    i = 0;
    while (i < k)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      int m = getFrameSize(localStackTraceElement, paramBoolean);
      int n = CodedOutputStream.computeTagSize(3);
      int i1 = CodedOutputStream.computeRawVarint32Size(m);
      n += i1;
      m += n;
      j += m;
      i += 1;
    }
    return j;
  }
  
  private static ByteString stringToByteString(String paramString)
  {
    if (paramString == null) {}
    for (ByteString localByteString = null;; localByteString = ByteString.copyFromUtf8(paramString)) {
      return localByteString;
    }
  }
  
  public static void writeBeginSession(CodedOutputStream paramCodedOutputStream, String paramString1, String paramString2, long paramLong)
  {
    ByteString localByteString = ByteString.copyFromUtf8(paramString2);
    paramCodedOutputStream.writeBytes(1, localByteString);
    localByteString = ByteString.copyFromUtf8(paramString1);
    paramCodedOutputStream.writeBytes(2, localByteString);
    paramCodedOutputStream.writeUInt64(3, paramLong);
  }
  
  private static void writeFrame(CodedOutputStream paramCodedOutputStream, int paramInt, StackTraceElement paramStackTraceElement, boolean paramBoolean)
  {
    int i = 4;
    int j = 2;
    int k = 1;
    paramCodedOutputStream.writeTag(paramInt, j);
    int m = getFrameSize(paramStackTraceElement, paramBoolean);
    paramCodedOutputStream.writeRawVarint32(m);
    boolean bool1 = paramStackTraceElement.isNativeMethod();
    long l;
    int i1;
    if (bool1)
    {
      int n = Math.max(paramStackTraceElement.getLineNumber(), 0);
      l = n;
      paramCodedOutputStream.writeUInt64(k, l);
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = paramStackTraceElement.getClassName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(".");
      localObject2 = paramStackTraceElement.getMethodName();
      localObject1 = ByteString.copyFromUtf8((String)localObject2);
      paramCodedOutputStream.writeBytes(j, (ByteString)localObject1);
      localObject1 = paramStackTraceElement.getFileName();
      if (localObject1 != null)
      {
        n = 3;
        localObject2 = ByteString.copyFromUtf8(paramStackTraceElement.getFileName());
        paramCodedOutputStream.writeBytes(n, (ByteString)localObject2);
      }
      boolean bool2 = paramStackTraceElement.isNativeMethod();
      if (!bool2)
      {
        i1 = paramStackTraceElement.getLineNumber();
        if (i1 > 0)
        {
          i1 = paramStackTraceElement.getLineNumber();
          l = i1;
          paramCodedOutputStream.writeUInt64(i, l);
        }
      }
      i1 = 5;
      if (!paramBoolean) {
        break label224;
      }
    }
    for (;;)
    {
      paramCodedOutputStream.writeUInt32(i1, i);
      return;
      l = 0L;
      paramCodedOutputStream.writeUInt64(k, l);
      break;
      label224:
      i = 0;
    }
  }
  
  public static void writeSessionApp(CodedOutputStream paramCodedOutputStream, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6)
  {
    ByteString localByteString1 = ByteString.copyFromUtf8(paramString1);
    ByteString localByteString2 = ByteString.copyFromUtf8(paramString2);
    ByteString localByteString3 = ByteString.copyFromUtf8(paramString3);
    ByteString localByteString4 = ByteString.copyFromUtf8(paramString4);
    ByteString localByteString5 = ByteString.copyFromUtf8(paramString5);
    if (paramString6 != null) {}
    for (ByteString localByteString6 = ByteString.copyFromUtf8(paramString6);; localByteString6 = null)
    {
      int i = 2;
      paramCodedOutputStream.writeTag(7, i);
      int j = paramInt;
      j = getSessionAppSize(localByteString1, localByteString2, localByteString3, localByteString4, localByteString5, paramInt, localByteString6);
      paramCodedOutputStream.writeRawVarint32(j);
      j = 1;
      paramCodedOutputStream.writeBytes(j, localByteString1);
      paramCodedOutputStream.writeBytes(2, localByteString3);
      paramCodedOutputStream.writeBytes(3, localByteString4);
      int k = 2;
      paramCodedOutputStream.writeTag(5, k);
      int m = getSessionAppOrgSize(localByteString2);
      paramCodedOutputStream.writeRawVarint32(m);
      paramCodedOutputStream.writeBytes(1, localByteString2);
      m = 6;
      paramCodedOutputStream.writeBytes(m, localByteString5);
      if (localByteString6 != null)
      {
        localByteString2 = UNITY_PLATFORM_BYTE_STRING;
        paramCodedOutputStream.writeBytes(8, localByteString2);
        m = 9;
        paramCodedOutputStream.writeBytes(m, localByteString6);
      }
      paramCodedOutputStream.writeEnum(10, paramInt);
      return;
    }
  }
  
  public static void writeSessionDevice(CodedOutputStream paramCodedOutputStream, int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map paramMap, int paramInt3, String paramString2, String paramString3)
  {
    Object localObject1 = stringToByteString(paramString1);
    ByteString localByteString1 = stringToByteString(paramString3);
    ByteString localByteString2 = stringToByteString(paramString2);
    paramCodedOutputStream.writeTag(9, 2);
    int i = paramInt1;
    int j = getSessionDeviceSize(paramInt1, (ByteString)localObject1, paramInt2, paramLong1, paramLong2, paramBoolean, paramMap, paramInt3, localByteString2, localByteString1);
    paramCodedOutputStream.writeRawVarint32(j);
    paramCodedOutputStream.writeEnum(3, paramInt1);
    paramCodedOutputStream.writeBytes(4, (ByteString)localObject1);
    paramCodedOutputStream.writeUInt32(5, paramInt2);
    paramCodedOutputStream.writeUInt64(6, paramLong1);
    paramCodedOutputStream.writeUInt64(7, paramLong2);
    j = 10;
    paramCodedOutputStream.writeBool(j, paramBoolean);
    Object localObject2 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Map.Entry)localIterator.next();
      paramCodedOutputStream.writeTag(11, 2);
      IdManager.DeviceIdentifierType localDeviceIdentifierType = (IdManager.DeviceIdentifierType)((Map.Entry)localObject2).getKey();
      localObject1 = (String)((Map.Entry)localObject2).getValue();
      i = getDeviceIdentifierSize(localDeviceIdentifierType, (String)localObject1);
      paramCodedOutputStream.writeRawVarint32(i);
      int m = 1;
      localDeviceIdentifierType = (IdManager.DeviceIdentifierType)((Map.Entry)localObject2).getKey();
      i = localDeviceIdentifierType.protobufIndex;
      paramCodedOutputStream.writeEnum(m, i);
      i = 2;
      localObject2 = ByteString.copyFromUtf8((String)((Map.Entry)localObject2).getValue());
      paramCodedOutputStream.writeBytes(i, (ByteString)localObject2);
    }
    int k = 12;
    paramCodedOutputStream.writeUInt32(k, paramInt3);
    if (localByteString2 != null)
    {
      k = 13;
      paramCodedOutputStream.writeBytes(k, localByteString2);
    }
    if (localByteString1 != null)
    {
      k = 14;
      paramCodedOutputStream.writeBytes(k, localByteString1);
    }
  }
  
  public static void writeSessionEvent(CodedOutputStream paramCodedOutputStream, long paramLong1, String paramString1, TrimmedThrowableData paramTrimmedThrowableData, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List paramList, Map paramMap, LogFileManager paramLogFileManager, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt1, String paramString2, String paramString3, Float paramFloat, int paramInt2, boolean paramBoolean, long paramLong2, long paramLong3)
  {
    ByteString localByteString1 = ByteString.copyFromUtf8(paramString2);
    if (paramString3 == null) {}
    Object localObject1;
    for (ByteString localByteString2 = null;; localByteString2 = ByteString.copyFromUtf8((String)localObject1))
    {
      ByteString localByteString3 = paramLogFileManager.getByteStringForLog();
      if (localByteString3 == null)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        localObject3 = "No log data to include with this event.";
        ((Logger)localObject1).d((String)localObject2, (String)localObject3);
      }
      paramLogFileManager.clearLog();
      paramCodedOutputStream.writeTag(10, 2);
      int i = getSessionEventSize(paramLong1, paramString1, paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, 8, paramMap, paramRunningAppProcessInfo, paramInt1, localByteString1, localByteString2, paramFloat, paramInt2, paramBoolean, paramLong2, paramLong3, localByteString3);
      paramCodedOutputStream.writeRawVarint32(i);
      paramCodedOutputStream.writeUInt64(1, paramLong1);
      Object localObject2 = ByteString.copyFromUtf8(paramString1);
      paramCodedOutputStream.writeBytes(2, (ByteString)localObject2);
      writeSessionEventApp(paramCodedOutputStream, paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, 8, localByteString1, localByteString2, paramMap, paramRunningAppProcessInfo, paramInt1);
      localObject2 = paramCodedOutputStream;
      Object localObject3 = paramFloat;
      writeSessionEventDevice(paramCodedOutputStream, paramFloat, paramInt2, paramBoolean, paramInt1, paramLong2, paramLong3);
      writeSessionEventLog(paramCodedOutputStream, localByteString3);
      return;
      localObject2 = "";
      localObject1 = paramString3.replace("-", (CharSequence)localObject2);
    }
  }
  
  private static void writeSessionEventApp(CodedOutputStream paramCodedOutputStream, TrimmedThrowableData paramTrimmedThrowableData, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List paramList, int paramInt1, ByteString paramByteString1, ByteString paramByteString2, Map paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2)
  {
    int i = 3;
    paramCodedOutputStream.writeTag(i, 2);
    int j = getEventAppSize(paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramByteString1, paramByteString2, paramMap, paramRunningAppProcessInfo, paramInt2);
    paramCodedOutputStream.writeRawVarint32(j);
    writeSessionEventAppExecution(paramCodedOutputStream, paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramByteString1, paramByteString2);
    if (paramMap != null)
    {
      boolean bool = paramMap.isEmpty();
      if (!bool) {
        writeSessionEventAppCustomAttributes(paramCodedOutputStream, paramMap);
      }
    }
    if (paramRunningAppProcessInfo != null)
    {
      k = paramRunningAppProcessInfo.importance;
      int n = 100;
      if (k == n) {
        break label124;
      }
    }
    label124:
    int m;
    for (int k = 1;; m = 0)
    {
      paramCodedOutputStream.writeBool(i, k);
      paramCodedOutputStream.writeUInt32(4, paramInt2);
      return;
    }
  }
  
  private static void writeSessionEventAppCustomAttributes(CodedOutputStream paramCodedOutputStream, Map paramMap)
  {
    int i = 2;
    Object localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      paramCodedOutputStream.writeTag(i, i);
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      String str = (String)((Map.Entry)localObject1).getValue();
      int j = getEventAppCustomAttributeSize((String)localObject2, str);
      paramCodedOutputStream.writeRawVarint32(j);
      int k = 1;
      localObject2 = ByteString.copyFromUtf8((String)((Map.Entry)localObject1).getKey());
      paramCodedOutputStream.writeBytes(k, (ByteString)localObject2);
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      if (localObject1 == null) {
        localObject1 = "";
      }
      localObject1 = ByteString.copyFromUtf8((String)localObject1);
      paramCodedOutputStream.writeBytes(i, (ByteString)localObject1);
    }
  }
  
  private static void writeSessionEventAppExecution(CodedOutputStream paramCodedOutputStream, TrimmedThrowableData paramTrimmedThrowableData, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List paramList, int paramInt, ByteString paramByteString1, ByteString paramByteString2)
  {
    paramCodedOutputStream.writeTag(1, 2);
    int i = getEventAppExecutionSize(paramTrimmedThrowableData, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt, paramByteString1, paramByteString2);
    paramCodedOutputStream.writeRawVarint32(i);
    writeThread(paramCodedOutputStream, paramThread, paramArrayOfStackTraceElement, 4, true);
    int j = paramArrayOfThread.length;
    i = 0;
    StackTraceElement[] arrayOfStackTraceElement = null;
    int k = 0;
    ByteString localByteString = null;
    while (k < j)
    {
      Thread localThread = paramArrayOfThread[k];
      arrayOfStackTraceElement = (StackTraceElement[])paramList.get(k);
      writeThread(paramCodedOutputStream, localThread, arrayOfStackTraceElement, 0, false);
      i = k + 1;
      k = i;
    }
    writeSessionEventAppExecutionException(paramCodedOutputStream, paramTrimmedThrowableData, 1, paramInt, 2);
    paramCodedOutputStream.writeTag(3, 2);
    i = getEventAppExecutionSignalSize();
    paramCodedOutputStream.writeRawVarint32(i);
    localByteString = SIGNAL_DEFAULT_BYTE_STRING;
    paramCodedOutputStream.writeBytes(1, localByteString);
    localByteString = SIGNAL_DEFAULT_BYTE_STRING;
    paramCodedOutputStream.writeBytes(2, localByteString);
    paramCodedOutputStream.writeUInt64(3, 0L);
    k = 2;
    paramCodedOutputStream.writeTag(4, k);
    i = getBinaryImageSize(paramByteString1, paramByteString2);
    paramCodedOutputStream.writeRawVarint32(i);
    paramCodedOutputStream.writeUInt64(1, 0L);
    long l = 0L;
    paramCodedOutputStream.writeUInt64(2, l);
    i = 3;
    paramCodedOutputStream.writeBytes(i, paramByteString1);
    if (paramByteString2 != null)
    {
      i = 4;
      paramCodedOutputStream.writeBytes(i, paramByteString2);
    }
  }
  
  private static void writeSessionEventAppExecutionException(CodedOutputStream paramCodedOutputStream, TrimmedThrowableData paramTrimmedThrowableData, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 1;
    paramCodedOutputStream.writeTag(paramInt3, 2);
    int k = getEventAppExecutionExceptionSize(paramTrimmedThrowableData, j, paramInt2);
    paramCodedOutputStream.writeRawVarint32(k);
    Object localObject = ByteString.copyFromUtf8(paramTrimmedThrowableData.className);
    paramCodedOutputStream.writeBytes(j, (ByteString)localObject);
    localObject = paramTrimmedThrowableData.localizedMessage;
    int m;
    if (localObject != null)
    {
      m = 3;
      localObject = ByteString.copyFromUtf8((String)localObject);
      paramCodedOutputStream.writeBytes(m, (ByteString)localObject);
    }
    StackTraceElement[] arrayOfStackTraceElement = paramTrimmedThrowableData.stacktrace;
    int n = arrayOfStackTraceElement.length;
    k = 0;
    localObject = null;
    while (k < n)
    {
      StackTraceElement localStackTraceElement = arrayOfStackTraceElement[k];
      int i1 = 4;
      writeFrame(paramCodedOutputStream, i1, localStackTraceElement, j);
      k += 1;
    }
    localObject = paramTrimmedThrowableData.cause;
    if (localObject != null)
    {
      if (paramInt1 >= paramInt2) {
        break label164;
      }
      i = paramInt1 + 1;
      m = 6;
      writeSessionEventAppExecutionException(paramCodedOutputStream, (TrimmedThrowableData)localObject, i, paramInt2, m);
    }
    for (;;)
    {
      return;
      label164:
      while (localObject != null)
      {
        localObject = ((TrimmedThrowableData)localObject).cause;
        i += 1;
      }
      k = 7;
      paramCodedOutputStream.writeUInt32(k, i);
    }
  }
  
  private static void writeSessionEventDevice(CodedOutputStream paramCodedOutputStream, Float paramFloat, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    int i = 5;
    int j = 2;
    paramCodedOutputStream.writeTag(i, j);
    int k = getEventDeviceSize(paramFloat, paramInt1, paramBoolean, paramInt2, paramLong1, paramLong2);
    paramCodedOutputStream.writeRawVarint32(k);
    if (paramFloat != null)
    {
      k = 1;
      float f = paramFloat.floatValue();
      paramCodedOutputStream.writeFloat(k, f);
    }
    paramCodedOutputStream.writeSInt32(j, paramInt1);
    paramCodedOutputStream.writeBool(3, paramBoolean);
    paramCodedOutputStream.writeUInt32(4, paramInt2);
    paramCodedOutputStream.writeUInt64(i, paramLong1);
    paramCodedOutputStream.writeUInt64(6, paramLong2);
  }
  
  private static void writeSessionEventLog(CodedOutputStream paramCodedOutputStream, ByteString paramByteString)
  {
    if (paramByteString != null)
    {
      int i = 2;
      paramCodedOutputStream.writeTag(6, i);
      int j = getEventLogSize(paramByteString);
      paramCodedOutputStream.writeRawVarint32(j);
      j = 1;
      paramCodedOutputStream.writeBytes(j, paramByteString);
    }
  }
  
  public static void writeSessionOS(CodedOutputStream paramCodedOutputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 3;
    int j = 2;
    ByteString localByteString1 = ByteString.copyFromUtf8(paramString1);
    ByteString localByteString2 = ByteString.copyFromUtf8(paramString2);
    paramCodedOutputStream.writeTag(8, j);
    int k = getSessionOSSize(localByteString1, localByteString2, paramBoolean);
    paramCodedOutputStream.writeRawVarint32(k);
    paramCodedOutputStream.writeEnum(1, i);
    paramCodedOutputStream.writeBytes(j, localByteString1);
    paramCodedOutputStream.writeBytes(i, localByteString2);
    paramCodedOutputStream.writeBool(4, paramBoolean);
  }
  
  public static void writeSessionUser(CodedOutputStream paramCodedOutputStream, String paramString1, String paramString2, String paramString3)
  {
    int i = 3;
    int j = 1;
    int k = 2;
    if (paramString1 == null) {
      paramString1 = "";
    }
    ByteString localByteString1 = ByteString.copyFromUtf8(paramString1);
    ByteString localByteString2 = stringToByteString(paramString2);
    ByteString localByteString3 = stringToByteString(paramString3);
    int m = CodedOutputStream.computeBytesSize(j, localByteString1);
    int n = 0 + m;
    if (paramString2 != null)
    {
      m = CodedOutputStream.computeBytesSize(k, localByteString2);
      n += m;
    }
    if (paramString3 != null)
    {
      m = CodedOutputStream.computeBytesSize(i, localByteString3);
      n += m;
    }
    m = 6;
    paramCodedOutputStream.writeTag(m, k);
    paramCodedOutputStream.writeRawVarint32(n);
    paramCodedOutputStream.writeBytes(j, localByteString1);
    if (paramString2 != null) {
      paramCodedOutputStream.writeBytes(k, localByteString2);
    }
    if (paramString3 != null) {
      paramCodedOutputStream.writeBytes(i, localByteString3);
    }
  }
  
  private static void writeThread(CodedOutputStream paramCodedOutputStream, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt, boolean paramBoolean)
  {
    int i = 2;
    int j = 1;
    paramCodedOutputStream.writeTag(j, i);
    int k = getThreadSize(paramThread, paramArrayOfStackTraceElement, paramInt, paramBoolean);
    paramCodedOutputStream.writeRawVarint32(k);
    ByteString localByteString = ByteString.copyFromUtf8(paramThread.getName());
    paramCodedOutputStream.writeBytes(j, localByteString);
    paramCodedOutputStream.writeUInt32(i, paramInt);
    j = paramArrayOfStackTraceElement.length;
    k = 0;
    localByteString = null;
    while (k < j)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[k];
      int m = 3;
      writeFrame(paramCodedOutputStream, m, localStackTraceElement, paramBoolean);
      k += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\SessionProtobufHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */