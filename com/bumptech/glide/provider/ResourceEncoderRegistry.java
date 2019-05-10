package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

public class ResourceEncoderRegistry
{
  private final List encoders;
  
  public ResourceEncoderRegistry()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.encoders = localArrayList;
  }
  
  public void append(Class paramClass, ResourceEncoder paramResourceEncoder)
  {
    try
    {
      List localList = this.encoders;
      ResourceEncoderRegistry.Entry localEntry = new com/bumptech/glide/provider/ResourceEncoderRegistry$Entry;
      localEntry.<init>(paramClass, paramResourceEncoder);
      localList.add(localEntry);
      return;
    }
    finally {}
  }
  
  /* Error */
  public ResourceEncoder get(Class paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aload_0
    //   7: getfield 15	com/bumptech/glide/provider/ResourceEncoderRegistry:encoders	Ljava/util/List;
    //   10: astore 4
    //   12: aload 4
    //   14: invokeinterface 30 1 0
    //   19: istore 5
    //   21: iconst_0
    //   22: istore 6
    //   24: aconst_null
    //   25: astore 4
    //   27: iload 6
    //   29: iload 5
    //   31: if_icmpge +54 -> 85
    //   34: aload_0
    //   35: getfield 15	com/bumptech/glide/provider/ResourceEncoderRegistry:encoders	Ljava/util/List;
    //   38: astore_3
    //   39: aload_3
    //   40: iload 6
    //   42: invokeinterface 34 2 0
    //   47: astore_3
    //   48: aload_3
    //   49: checkcast 17	com/bumptech/glide/provider/ResourceEncoderRegistry$Entry
    //   52: astore_3
    //   53: aload_3
    //   54: aload_1
    //   55: invokevirtual 38	com/bumptech/glide/provider/ResourceEncoderRegistry$Entry:handles	(Ljava/lang/Class;)Z
    //   58: istore 7
    //   60: iload 7
    //   62: ifeq +12 -> 74
    //   65: aload_3
    //   66: getfield 42	com/bumptech/glide/provider/ResourceEncoderRegistry$Entry:encoder	Lcom/bumptech/glide/load/ResourceEncoder;
    //   69: astore_3
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_3
    //   73: areturn
    //   74: iload 6
    //   76: iconst_1
    //   77: iadd
    //   78: istore_2
    //   79: iload_2
    //   80: istore 6
    //   82: goto -55 -> 27
    //   85: iconst_0
    //   86: istore_2
    //   87: aconst_null
    //   88: astore_3
    //   89: goto -19 -> 70
    //   92: astore_3
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_3
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	ResourceEncoderRegistry
    //   0	97	1	paramClass	Class
    //   3	84	2	i	int
    //   5	84	3	localObject1	Object
    //   92	4	3	localObject2	Object
    //   10	16	4	localList	List
    //   19	13	5	j	int
    //   22	59	6	k	int
    //   58	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	10	92	finally
    //   12	19	92	finally
    //   34	38	92	finally
    //   40	47	92	finally
    //   48	52	92	finally
    //   54	58	92	finally
    //   65	69	92	finally
  }
  
  public void prepend(Class paramClass, ResourceEncoder paramResourceEncoder)
  {
    try
    {
      List localList = this.encoders;
      ResourceEncoderRegistry.Entry localEntry = new com/bumptech/glide/provider/ResourceEncoderRegistry$Entry;
      localEntry.<init>(paramClass, paramResourceEncoder);
      localList.add(0, localEntry);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\ResourceEncoderRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */