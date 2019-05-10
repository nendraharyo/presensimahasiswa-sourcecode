package com.crashlytics.android.core;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID
{
  private static String _clsId;
  private static final AtomicLong _sequenceNumber;
  
  static
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>(0L);
    _sequenceNumber = localAtomicLong;
  }
  
  public CLSUUID(IdManager paramIdManager)
  {
    Object localObject1 = new byte[10];
    populateTime((byte[])localObject1);
    populateSequenceNumber((byte[])localObject1);
    populatePID((byte[])localObject1);
    Object localObject2 = CommonUtils.sha1(paramIdManager.getAppInstallIdentifier());
    localObject1 = CommonUtils.hexify((byte[])localObject1);
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[4];
    String str1 = ((String)localObject1).substring(0, j);
    arrayOfObject[0] = str1;
    String str2 = ((String)localObject1).substring(j, i);
    arrayOfObject[1] = str2;
    localObject1 = ((String)localObject1).subSequence(i, 20);
    arrayOfObject[2] = localObject1;
    localObject2 = ((String)localObject2).substring(0, j);
    arrayOfObject[3] = localObject2;
    localObject1 = String.format(localLocale, "%s-%s-%s-%s", arrayOfObject);
    localObject2 = Locale.US;
    _clsId = ((String)localObject1).toUpperCase((Locale)localObject2);
  }
  
  private static byte[] convertLongToFourByteBuffer(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    int i = (int)paramLong;
    localByteBuffer.putInt(i);
    ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;
    localByteBuffer.order(localByteOrder);
    localByteBuffer.position(0);
    return localByteBuffer.array();
  }
  
  private static byte[] convertLongToTwoByteBuffer(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    short s = (short)(int)paramLong;
    localByteBuffer.putShort(s);
    ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;
    localByteBuffer.order(localByteOrder);
    localByteBuffer.position(0);
    return localByteBuffer.array();
  }
  
  private void populatePID(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = convertLongToTwoByteBuffer(Integer.valueOf(Process.myPid()).shortValue());
    int i = arrayOfByte[0];
    paramArrayOfByte[8] = i;
    int j = arrayOfByte[1];
    paramArrayOfByte[9] = j;
  }
  
  private void populateSequenceNumber(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = convertLongToTwoByteBuffer(_sequenceNumber.incrementAndGet());
    int i = arrayOfByte[0];
    paramArrayOfByte[6] = i;
    int j = arrayOfByte[1];
    paramArrayOfByte[7] = j;
  }
  
  private void populateTime(byte[] paramArrayOfByte)
  {
    long l1 = 1000L;
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new java/util/Date;
    ((Date)localObject).<init>();
    long l2 = ((Date)localObject).getTime();
    long l3 = l2 / l1;
    l2 %= l1;
    byte[] arrayOfByte = convertLongToFourByteBuffer(l3);
    int m = arrayOfByte[0];
    paramArrayOfByte[0] = m;
    m = arrayOfByte[k];
    paramArrayOfByte[k] = m;
    m = arrayOfByte[j];
    paramArrayOfByte[j] = m;
    int n = arrayOfByte[i];
    paramArrayOfByte[i] = n;
    localObject = convertLongToTwoByteBuffer(l2);
    n = localObject[0];
    paramArrayOfByte[4] = n;
    int i1 = localObject[k];
    paramArrayOfByte[5] = i1;
  }
  
  public String toString()
  {
    return _clsId;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CLSUUID.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */