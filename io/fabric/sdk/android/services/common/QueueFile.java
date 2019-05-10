package io.fabric.sdk.android.services.common;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFile
  implements Closeable
{
  static final int HEADER_LENGTH = 16;
  private static final int INITIAL_LENGTH = 4096;
  private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
  private final byte[] buffer;
  private int elementCount;
  int fileLength;
  private QueueFile.Element first;
  private QueueFile.Element last;
  private final RandomAccessFile raf;
  
  public QueueFile(File paramFile)
  {
    Object localObject = new byte[16];
    this.buffer = ((byte[])localObject);
    boolean bool = paramFile.exists();
    if (!bool) {
      initialize(paramFile);
    }
    localObject = open(paramFile);
    this.raf = ((RandomAccessFile)localObject);
    readHeader();
  }
  
  QueueFile(RandomAccessFile paramRandomAccessFile)
  {
    byte[] arrayOfByte = new byte[16];
    this.buffer = arrayOfByte;
    this.raf = paramRandomAccessFile;
    readHeader();
  }
  
  private void expandIfNecessary(int paramInt)
  {
    int i = paramInt + 4;
    int j = remainingBytes();
    if (j >= i) {
      return;
    }
    int m = this.fileLength;
    do
    {
      j += m;
      m <<= 1;
    } while (j < i);
    setLength(m);
    j = this.last.position + 4;
    QueueFile.Element localElement1 = this.last;
    i = localElement1.length;
    j += i;
    i = wrapPosition(j);
    Object localObject = this.first;
    j = ((QueueFile.Element)localObject).position;
    int n;
    if (i < j)
    {
      localObject = this.raf.getChannel();
      n = this.fileLength;
      long l1 = n;
      ((FileChannel)localObject).position(l1);
      int i1 = i + -4;
      l1 = i1;
      long l2 = ((FileChannel)localObject).transferTo(16, l1, (WritableByteChannel)localObject);
      l1 = i1;
      boolean bool = l2 < l1;
      if (bool)
      {
        AssertionError localAssertionError = new java/lang/AssertionError;
        localAssertionError.<init>("Copied insufficient number of bytes!");
        throw localAssertionError;
      }
    }
    localObject = this.last;
    int k = ((QueueFile.Element)localObject).position;
    localElement1 = this.first;
    i = localElement1.position;
    QueueFile.Element localElement2;
    if (k < i)
    {
      k = this.fileLength;
      i = this.last.position;
      k = k + i + -16;
      i = this.elementCount;
      n = this.first.position;
      writeHeader(m, i, n, k);
      localElement1 = new io/fabric/sdk/android/services/common/QueueFile$Element;
      localElement2 = this.last;
      n = localElement2.length;
      localElement1.<init>(k, n);
      this.last = localElement1;
    }
    for (;;)
    {
      this.fileLength = m;
      break;
      k = this.elementCount;
      localElement1 = this.first;
      i = localElement1.position;
      localElement2 = this.last;
      n = localElement2.position;
      writeHeader(m, k, i, n);
    }
  }
  
  private static void initialize(File paramFile)
  {
    Object localObject1 = new java/io/File;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = paramFile.getPath();
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    localObject4 = ".tmp";
    localObject3 = (String)localObject4;
    ((File)localObject1).<init>((String)localObject3);
    localObject3 = open((File)localObject1);
    long l = 4096L;
    try
    {
      ((RandomAccessFile)localObject3).setLength(l);
      l = 0L;
      ((RandomAccessFile)localObject3).seek(l);
      int i = 16;
      localObject4 = new byte[i];
      int j = 4;
      int[] arrayOfInt = new int[j];
      int[] tmp85_83 = arrayOfInt;
      int[] tmp86_85 = tmp85_83;
      int[] tmp86_85 = tmp85_83;
      tmp86_85[0] = 'က';
      tmp86_85[1] = 0;
      tmp86_85[2] = 0;
      tmp86_85[3] = 0;
      writeInts((byte[])localObject4, arrayOfInt);
      ((RandomAccessFile)localObject3).write((byte[])localObject4);
      ((RandomAccessFile)localObject3).close();
      boolean bool = ((File)localObject1).renameTo(paramFile);
      if (!bool)
      {
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("Rename failed!");
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      ((RandomAccessFile)localObject3).close();
    }
  }
  
  private static Object nonNull(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>(paramString);
      throw localNullPointerException;
    }
    return paramObject;
  }
  
  private static RandomAccessFile open(File paramFile)
  {
    RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
    localRandomAccessFile.<init>(paramFile, "rwd");
    return localRandomAccessFile;
  }
  
  private QueueFile.Element readElement(int paramInt)
  {
    Object localObject;
    if (paramInt == 0) {
      localObject = QueueFile.Element.NULL;
    }
    for (;;)
    {
      return (QueueFile.Element)localObject;
      localObject = this.raf;
      long l = paramInt;
      ((RandomAccessFile)localObject).seek(l);
      localObject = new io/fabric/sdk/android/services/common/QueueFile$Element;
      RandomAccessFile localRandomAccessFile = this.raf;
      int i = localRandomAccessFile.readInt();
      ((QueueFile.Element)localObject).<init>(paramInt, i);
    }
  }
  
  private void readHeader()
  {
    this.raf.seek(0L);
    Object localObject1 = this.raf;
    Object localObject2 = this.buffer;
    ((RandomAccessFile)localObject1).readFully((byte[])localObject2);
    localObject1 = this.buffer;
    int i = 0;
    localObject2 = null;
    int j = readInt((byte[])localObject1, 0);
    this.fileLength = j;
    long l1 = this.fileLength;
    RandomAccessFile localRandomAccessFile = this.raf;
    long l2 = localRandomAccessFile.length();
    boolean bool = l1 < l2;
    if (bool)
    {
      localObject1 = new java/io/IOException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("File is truncated. Expected length: ");
      int m = this.fileLength;
      localObject2 = ((StringBuilder)localObject2).append(m).append(", Actual length: ");
      l2 = this.raf.length();
      localObject2 = l2;
      ((IOException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int k = readInt(this.buffer, 4);
    this.elementCount = k;
    k = readInt(this.buffer, 8);
    i = readInt(this.buffer, 12);
    localObject1 = readElement(k);
    this.first = ((QueueFile.Element)localObject1);
    localObject1 = readElement(i);
    this.last = ((QueueFile.Element)localObject1);
  }
  
  private static int readInt(byte[] paramArrayOfByte, int paramInt)
  {
    int i = (paramArrayOfByte[paramInt] & 0xFF) << 24;
    int j = paramInt + 1;
    j = (paramArrayOfByte[j] & 0xFF) << 16;
    i += j;
    j = paramInt + 2;
    j = (paramArrayOfByte[j] & 0xFF) << 8;
    i += j;
    j = paramInt + 3;
    j = paramArrayOfByte[j] & 0xFF;
    return i + j;
  }
  
  private int remainingBytes()
  {
    int i = this.fileLength;
    int j = usedBytes();
    return i - j;
  }
  
  private void ringRead(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = wrapPosition(paramInt1);
    int j = i + paramInt3;
    int k = this.fileLength;
    long l1;
    RandomAccessFile localRandomAccessFile2;
    if (j <= k)
    {
      RandomAccessFile localRandomAccessFile1 = this.raf;
      l1 = i;
      localRandomAccessFile1.seek(l1);
      localRandomAccessFile2 = this.raf;
      localRandomAccessFile2.readFully(paramArrayOfByte, paramInt2, paramInt3);
    }
    for (;;)
    {
      return;
      j = this.fileLength - i;
      RandomAccessFile localRandomAccessFile3 = this.raf;
      long l2 = i;
      localRandomAccessFile3.seek(l2);
      this.raf.readFully(paramArrayOfByte, paramInt2, j);
      localRandomAccessFile2 = this.raf;
      l1 = 16;
      localRandomAccessFile2.seek(l1);
      localRandomAccessFile2 = this.raf;
      k = paramInt2 + j;
      j = paramInt3 - j;
      localRandomAccessFile2.readFully(paramArrayOfByte, k, j);
    }
  }
  
  private void ringWrite(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = wrapPosition(paramInt1);
    int j = i + paramInt3;
    int k = this.fileLength;
    long l1;
    RandomAccessFile localRandomAccessFile2;
    if (j <= k)
    {
      RandomAccessFile localRandomAccessFile1 = this.raf;
      l1 = i;
      localRandomAccessFile1.seek(l1);
      localRandomAccessFile2 = this.raf;
      localRandomAccessFile2.write(paramArrayOfByte, paramInt2, paramInt3);
    }
    for (;;)
    {
      return;
      j = this.fileLength - i;
      RandomAccessFile localRandomAccessFile3 = this.raf;
      long l2 = i;
      localRandomAccessFile3.seek(l2);
      this.raf.write(paramArrayOfByte, paramInt2, j);
      localRandomAccessFile2 = this.raf;
      l1 = 16;
      localRandomAccessFile2.seek(l1);
      localRandomAccessFile2 = this.raf;
      k = paramInt2 + j;
      j = paramInt3 - j;
      localRandomAccessFile2.write(paramArrayOfByte, k, j);
    }
  }
  
  private void setLength(int paramInt)
  {
    RandomAccessFile localRandomAccessFile = this.raf;
    long l = paramInt;
    localRandomAccessFile.setLength(l);
    this.raf.getChannel().force(true);
  }
  
  private int wrapPosition(int paramInt)
  {
    int i = this.fileLength;
    if (paramInt < i) {}
    for (;;)
    {
      return paramInt;
      i = paramInt + 16;
      int j = this.fileLength;
      paramInt = i - j;
    }
  }
  
  private void writeHeader(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = this.buffer;
    Object localObject2 = new int[4];
    localObject2[0] = paramInt1;
    localObject2[1] = paramInt2;
    localObject2[2] = paramInt3;
    localObject2[3] = paramInt4;
    writeInts((byte[])localObject1, (int[])localObject2);
    this.raf.seek(0L);
    localObject1 = this.raf;
    localObject2 = this.buffer;
    ((RandomAccessFile)localObject1).write((byte[])localObject2);
  }
  
  private static void writeInt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = (byte)(paramInt2 >> 24);
    paramArrayOfByte[paramInt1] = i;
    i = paramInt1 + 1;
    int j = (byte)(paramInt2 >> 16);
    paramArrayOfByte[i] = j;
    i = paramInt1 + 2;
    j = (byte)(paramInt2 >> 8);
    paramArrayOfByte[i] = j;
    i = paramInt1 + 3;
    j = (byte)paramInt2;
    paramArrayOfByte[i] = j;
  }
  
  private static void writeInts(byte[] paramArrayOfByte, int... paramVarArgs)
  {
    int i = 0;
    int j = paramVarArgs.length;
    int k = 0;
    while (i < j)
    {
      int m = paramVarArgs[i];
      writeInt(paramArrayOfByte, k, m);
      k += 4;
      i += 1;
    }
  }
  
  public void add(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    add(paramArrayOfByte, 0, i);
  }
  
  public void add(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject1 = "buffer";
    try
    {
      nonNull(paramArrayOfByte, (String)localObject1);
      i = paramInt1 | paramInt2;
      if (i >= 0)
      {
        i = paramArrayOfByte.length - paramInt1;
        if (paramInt2 <= i) {}
      }
      else
      {
        localObject1 = new java/lang/IndexOutOfBoundsException;
        ((IndexOutOfBoundsException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    expandIfNecessary(paramInt2);
    boolean bool = isEmpty();
    QueueFile.Element localElement;
    Object localObject3;
    int j;
    int k;
    int m;
    if (bool)
    {
      i = 16;
      localElement = new io/fabric/sdk/android/services/common/QueueFile$Element;
      localElement.<init>(i, paramInt2);
      localObject3 = this.buffer;
      j = 0;
      byte[] arrayOfByte = null;
      writeInt((byte[])localObject3, 0, paramInt2);
      i = localElement.position;
      arrayOfByte = this.buffer;
      k = 0;
      m = 4;
      ringWrite(i, arrayOfByte, 0, m);
      i = localElement.position + 4;
      ringWrite(i, paramArrayOfByte, paramInt1, paramInt2);
      if (!bool) {
        break label286;
      }
    }
    for (int i = localElement.position;; i = ((QueueFile.Element)localObject3).position)
    {
      j = this.fileLength;
      k = this.elementCount + 1;
      m = localElement.position;
      writeHeader(j, k, i, m);
      this.last = localElement;
      i = this.elementCount + 1;
      this.elementCount = i;
      if (bool)
      {
        localObject3 = this.last;
        this.first = ((QueueFile.Element)localObject3);
      }
      return;
      localObject3 = this.last;
      i = ((QueueFile.Element)localObject3).position + 4;
      localElement = this.last;
      int n = localElement.length;
      i += n;
      i = wrapPosition(i);
      break;
      label286:
      localObject3 = this.first;
    }
  }
  
  public void clear()
  {
    int i = 4096;
    int j = 4096;
    try
    {
      writeHeader(j, 0, 0, 0);
      j = 0;
      QueueFile.Element localElement = null;
      this.elementCount = 0;
      localElement = QueueFile.Element.NULL;
      this.first = localElement;
      localElement = QueueFile.Element.NULL;
      this.last = localElement;
      j = this.fileLength;
      if (j > i)
      {
        j = 4096;
        setLength(j);
      }
      j = 4096;
      this.fileLength = j;
      return;
    }
    finally {}
  }
  
  public void close()
  {
    try
    {
      RandomAccessFile localRandomAccessFile = this.raf;
      localRandomAccessFile.close();
      return;
    }
    finally {}
  }
  
  public void forEach(QueueFile.ElementReader paramElementReader)
  {
    try
    {
      QueueFile.Element localElement1 = this.first;
      int i = localElement1.position;
      int j = 0;
      localElement1 = null;
      for (;;)
      {
        int k = this.elementCount;
        if (j >= k) {
          break;
        }
        QueueFile.Element localElement2 = readElement(i);
        QueueFile.ElementInputStream localElementInputStream = new io/fabric/sdk/android/services/common/QueueFile$ElementInputStream;
        int m = 0;
        localElementInputStream.<init>(this, localElement2, null);
        m = localElement2.length;
        paramElementReader.read(localElementInputStream, m);
        k = localElement2.position + 4;
        i = localElement2.length + k;
        i = wrapPosition(i);
        j += 1;
      }
      return;
    }
    finally {}
  }
  
  public boolean hasSpaceFor(int paramInt1, int paramInt2)
  {
    int i = usedBytes() + 4 + paramInt1;
    if (i <= paramInt2) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  /* Error */
  public boolean isEmpty()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 123	io/fabric/sdk/android/services/common/QueueFile:elementCount	I
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: aconst_null
    //   20: astore_2
    //   21: goto -8 -> 13
    //   24: astore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_2
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	QueueFile
    //   6	10	1	i	int
    //   18	1	1	j	int
    //   20	1	2	localObject1	Object
    //   24	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	24	finally
  }
  
  public void peek(QueueFile.ElementReader paramElementReader)
  {
    try
    {
      int i = this.elementCount;
      if (i > 0)
      {
        QueueFile.ElementInputStream localElementInputStream = new io/fabric/sdk/android/services/common/QueueFile$ElementInputStream;
        QueueFile.Element localElement = this.first;
        localElementInputStream.<init>(this, localElement, null);
        localElement = this.first;
        int j = localElement.length;
        paramElementReader.read(localElementInputStream, j);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public byte[] peek()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 249	io/fabric/sdk/android/services/common/QueueFile:isEmpty	()Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +11 -> 19
    //   11: iconst_0
    //   12: istore_1
    //   13: aconst_null
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: areturn
    //   19: aload_0
    //   20: getfield 97	io/fabric/sdk/android/services/common/QueueFile:first	Lio/fabric/sdk/android/services/common/QueueFile$Element;
    //   23: astore_2
    //   24: aload_2
    //   25: getfield 95	io/fabric/sdk/android/services/common/QueueFile$Element:length	I
    //   28: istore_3
    //   29: iload_3
    //   30: newarray <illegal type>
    //   32: astore_2
    //   33: aload_0
    //   34: getfield 97	io/fabric/sdk/android/services/common/QueueFile:first	Lio/fabric/sdk/android/services/common/QueueFile$Element;
    //   37: astore 4
    //   39: aload 4
    //   41: getfield 92	io/fabric/sdk/android/services/common/QueueFile$Element:position	I
    //   44: iconst_4
    //   45: iadd
    //   46: istore 5
    //   48: aload_0
    //   49: iload 5
    //   51: aload_2
    //   52: iconst_0
    //   53: iload_3
    //   54: invokespecial 75	io/fabric/sdk/android/services/common/QueueFile:ringRead	(I[BII)V
    //   57: goto -42 -> 15
    //   60: astore_2
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_2
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	QueueFile
    //   6	7	1	bool	boolean
    //   14	38	2	localObject1	Object
    //   60	4	2	localObject2	Object
    //   28	26	3	i	int
    //   37	3	4	localElement	QueueFile.Element
    //   46	4	5	j	int
    // Exception table:
    //   from	to	target	type
    //   2	6	60	finally
    //   19	23	60	finally
    //   24	28	60	finally
    //   29	32	60	finally
    //   33	37	60	finally
    //   39	44	60	finally
    //   53	57	60	finally
  }
  
  public void remove()
  {
    try
    {
      boolean bool = isEmpty();
      if (bool)
      {
        NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
        localNoSuchElementException.<init>();
        throw localNoSuchElementException;
      }
    }
    finally {}
    int i = this.elementCount;
    int j = 1;
    if (i == j) {
      clear();
    }
    for (;;)
    {
      return;
      QueueFile.Element localElement1 = this.first;
      i = localElement1.position + 4;
      Object localObject2 = this.first;
      j = ((QueueFile.Element)localObject2).length;
      i += j;
      i = wrapPosition(i);
      localObject2 = this.buffer;
      int k = 0;
      QueueFile.Element localElement2 = null;
      int m = 4;
      ringRead(i, (byte[])localObject2, 0, m);
      localObject2 = this.buffer;
      k = 0;
      localElement2 = null;
      j = readInt((byte[])localObject2, 0);
      k = this.fileLength;
      m = this.elementCount + -1;
      QueueFile.Element localElement3 = this.last;
      int n = localElement3.position;
      writeHeader(k, m, i, n);
      k = this.elementCount + -1;
      this.elementCount = k;
      localElement2 = new io/fabric/sdk/android/services/common/QueueFile$Element;
      localElement2.<init>(i, j);
      this.first = localElement2;
    }
  }
  
  public int size()
  {
    try
    {
      int i = this.elementCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = getClass().getSimpleName();
    localStringBuilder.append((String)localObject1).append('[');
    localObject1 = localStringBuilder.append("fileLength=");
    int i = this.fileLength;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", size=");
    i = this.elementCount;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", first=");
    localObject2 = this.first;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = localStringBuilder.append(", last=");
    localObject2 = this.last;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = ", element lengths=[";
    localStringBuilder.append((String)localObject1);
    try
    {
      localObject1 = new io/fabric/sdk/android/services/common/QueueFile$1;
      ((QueueFile.1)localObject1).<init>(this, localStringBuilder);
      forEach((QueueFile.ElementReader)localObject1);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject2 = LOGGER;
        Level localLevel = Level.WARNING;
        String str = "read error";
        ((Logger)localObject2).log(localLevel, str, localIOException);
      }
    }
    localStringBuilder.append("]]");
    return localStringBuilder.toString();
  }
  
  public int usedBytes()
  {
    int i = this.elementCount;
    if (i == 0) {
      i = 16;
    }
    for (;;)
    {
      return i;
      QueueFile.Element localElement1 = this.last;
      i = localElement1.position;
      QueueFile.Element localElement2 = this.first;
      int j = localElement2.position;
      if (i >= j)
      {
        localElement1 = this.last;
        i = localElement1.position;
        j = this.first.position;
        i = i - j + 4;
        localElement2 = this.last;
        j = localElement2.length;
        i = i + j + 16;
      }
      else
      {
        localElement1 = this.last;
        i = localElement1.position + 4;
        j = this.last.length;
        i += j;
        j = this.fileLength;
        i += j;
        localElement2 = this.first;
        j = localElement2.position;
        i -= j;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\QueueFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */