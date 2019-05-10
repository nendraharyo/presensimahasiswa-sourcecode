package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

public class EncoderRegistry
{
  private final List encoders;
  
  public EncoderRegistry()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.encoders = localArrayList;
  }
  
  public void append(Class paramClass, Encoder paramEncoder)
  {
    try
    {
      List localList = this.encoders;
      EncoderRegistry.Entry localEntry = new com/bumptech/glide/provider/EncoderRegistry$Entry;
      localEntry.<init>(paramClass, paramEncoder);
      localList.add(localEntry);
      return;
    }
    finally {}
  }
  
  /* Error */
  public Encoder getEncoder(Class paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	com/bumptech/glide/provider/EncoderRegistry:encoders	Ljava/util/List;
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface 30 1 0
    //   13: astore_3
    //   14: aload_3
    //   15: invokeinterface 36 1 0
    //   20: istore 4
    //   22: iload 4
    //   24: ifeq +36 -> 60
    //   27: aload_3
    //   28: invokeinterface 40 1 0
    //   33: astore_2
    //   34: aload_2
    //   35: checkcast 17	com/bumptech/glide/provider/EncoderRegistry$Entry
    //   38: astore_2
    //   39: aload_2
    //   40: aload_1
    //   41: invokevirtual 44	com/bumptech/glide/provider/EncoderRegistry$Entry:handles	(Ljava/lang/Class;)Z
    //   44: istore 5
    //   46: iload 5
    //   48: ifeq -34 -> 14
    //   51: aload_2
    //   52: getfield 48	com/bumptech/glide/provider/EncoderRegistry$Entry:encoder	Lcom/bumptech/glide/load/Encoder;
    //   55: astore_2
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_2
    //   59: areturn
    //   60: iconst_0
    //   61: istore 4
    //   63: aconst_null
    //   64: astore_2
    //   65: goto -9 -> 56
    //   68: astore_2
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_2
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	EncoderRegistry
    //   0	73	1	paramClass	Class
    //   6	59	2	localObject1	Object
    //   68	4	2	localObject2	Object
    //   13	15	3	localIterator	java.util.Iterator
    //   20	42	4	bool1	boolean
    //   44	3	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	68	finally
    //   7	13	68	finally
    //   14	20	68	finally
    //   27	33	68	finally
    //   34	38	68	finally
    //   40	44	68	finally
    //   51	55	68	finally
  }
  
  public void prepend(Class paramClass, Encoder paramEncoder)
  {
    try
    {
      List localList = this.encoders;
      EncoderRegistry.Entry localEntry = new com/bumptech/glide/provider/EncoderRegistry$Entry;
      localEntry.<init>(paramClass, paramEncoder);
      localList.add(0, localEntry);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\EncoderRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */