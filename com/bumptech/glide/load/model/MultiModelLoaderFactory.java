package com.bumptech.glide.load.model;

import android.support.v4.h.k.a;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultiModelLoaderFactory
{
  private static final MultiModelLoaderFactory.Factory DEFAULT_FACTORY;
  private static final ModelLoader EMPTY_MODEL_LOADER;
  private final Set alreadyUsedEntries;
  private final List entries;
  private final MultiModelLoaderFactory.Factory factory;
  private final k.a throwableListPool;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/model/MultiModelLoaderFactory$Factory;
    ((MultiModelLoaderFactory.Factory)localObject).<init>();
    DEFAULT_FACTORY = (MultiModelLoaderFactory.Factory)localObject;
    localObject = new com/bumptech/glide/load/model/MultiModelLoaderFactory$EmptyModelLoader;
    ((MultiModelLoaderFactory.EmptyModelLoader)localObject).<init>();
    EMPTY_MODEL_LOADER = (ModelLoader)localObject;
  }
  
  public MultiModelLoaderFactory(k.a parama)
  {
    this(parama, localFactory);
  }
  
  MultiModelLoaderFactory(k.a parama, MultiModelLoaderFactory.Factory paramFactory)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.entries = ((List)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.alreadyUsedEntries = ((Set)localObject);
    this.throwableListPool = parama;
    this.factory = paramFactory;
  }
  
  private void add(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory, boolean paramBoolean)
  {
    MultiModelLoaderFactory.Entry localEntry = new com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry;
    localEntry.<init>(paramClass1, paramClass2, paramModelLoaderFactory);
    List localList1 = this.entries;
    List localList2;
    int i;
    if (paramBoolean)
    {
      localList2 = this.entries;
      i = localList2.size();
    }
    for (;;)
    {
      localList1.add(i, localEntry);
      return;
      i = 0;
      localList2 = null;
    }
  }
  
  private ModelLoader build(MultiModelLoaderFactory.Entry paramEntry)
  {
    return (ModelLoader)Preconditions.checkNotNull(paramEntry.factory.build(this));
  }
  
  private static ModelLoader emptyModelLoader()
  {
    return EMPTY_MODEL_LOADER;
  }
  
  private ModelLoaderFactory getFactory(MultiModelLoaderFactory.Entry paramEntry)
  {
    return paramEntry.factory;
  }
  
  void append(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    boolean bool = true;
    try
    {
      add(paramClass1, paramClass2, paramModelLoaderFactory, bool);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public ModelLoader build(Class paramClass1, Class paramClass2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_1
    //   6: istore 5
    //   8: aload_0
    //   9: monitorenter
    //   10: new 34	java/util/ArrayList
    //   13: astore 6
    //   15: aload 6
    //   17: invokespecial 35	java/util/ArrayList:<init>	()V
    //   20: aload_0
    //   21: getfield 37	com/bumptech/glide/load/model/MultiModelLoaderFactory:entries	Ljava/util/List;
    //   24: astore 7
    //   26: aload 7
    //   28: invokeinterface 86 1 0
    //   33: astore 8
    //   35: iconst_0
    //   36: istore 9
    //   38: aconst_null
    //   39: astore 7
    //   41: aload 8
    //   43: invokeinterface 92 1 0
    //   48: istore_3
    //   49: iload_3
    //   50: ifeq +140 -> 190
    //   53: aload 8
    //   55: invokeinterface 96 1 0
    //   60: astore 4
    //   62: aload 4
    //   64: checkcast 48	com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry
    //   67: astore 4
    //   69: aload_0
    //   70: getfield 42	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   73: astore 10
    //   75: aload 10
    //   77: aload 4
    //   79: invokeinterface 102 2 0
    //   84: istore 11
    //   86: iload 11
    //   88: ifeq +10 -> 98
    //   91: iload 5
    //   93: istore 9
    //   95: goto -54 -> 41
    //   98: aload 4
    //   100: aload_1
    //   101: aload_2
    //   102: invokevirtual 106	com/bumptech/glide/load/model/MultiModelLoaderFactory$Entry:handles	(Ljava/lang/Class;Ljava/lang/Class;)Z
    //   105: istore 11
    //   107: iload 11
    //   109: ifeq -68 -> 41
    //   112: aload_0
    //   113: getfield 42	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   116: astore 10
    //   118: aload 10
    //   120: aload 4
    //   122: invokeinterface 108 2 0
    //   127: pop
    //   128: aload_0
    //   129: aload 4
    //   131: invokespecial 111	com/bumptech/glide/load/model/MultiModelLoaderFactory:build	(Lcom/bumptech/glide/load/model/MultiModelLoaderFactory$Entry;)Lcom/bumptech/glide/load/model/ModelLoader;
    //   134: astore 10
    //   136: aload 6
    //   138: aload 10
    //   140: invokeinterface 112 2 0
    //   145: pop
    //   146: aload_0
    //   147: getfield 42	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   150: astore 10
    //   152: aload 10
    //   154: aload 4
    //   156: invokeinterface 115 2 0
    //   161: pop
    //   162: goto -121 -> 41
    //   165: astore 4
    //   167: aload_0
    //   168: getfield 42	com/bumptech/glide/load/model/MultiModelLoaderFactory:alreadyUsedEntries	Ljava/util/Set;
    //   171: astore 7
    //   173: aload 7
    //   175: invokeinterface 118 1 0
    //   180: aload 4
    //   182: athrow
    //   183: astore 4
    //   185: aload_0
    //   186: monitorexit
    //   187: aload 4
    //   189: athrow
    //   190: aload 6
    //   192: invokeinterface 57 1 0
    //   197: istore_3
    //   198: iload_3
    //   199: iload 5
    //   201: if_icmple +31 -> 232
    //   204: aload_0
    //   205: getfield 46	com/bumptech/glide/load/model/MultiModelLoaderFactory:factory	Lcom/bumptech/glide/load/model/MultiModelLoaderFactory$Factory;
    //   208: astore 4
    //   210: aload_0
    //   211: getfield 44	com/bumptech/glide/load/model/MultiModelLoaderFactory:throwableListPool	Landroid/support/v4/h/k$a;
    //   214: astore 7
    //   216: aload 4
    //   218: aload 6
    //   220: aload 7
    //   222: invokevirtual 121	com/bumptech/glide/load/model/MultiModelLoaderFactory$Factory:build	(Ljava/util/List;Landroid/support/v4/h/k$a;)Lcom/bumptech/glide/load/model/MultiModelLoader;
    //   225: astore 4
    //   227: aload_0
    //   228: monitorexit
    //   229: aload 4
    //   231: areturn
    //   232: aload 6
    //   234: invokeinterface 57 1 0
    //   239: istore_3
    //   240: iload_3
    //   241: iload 5
    //   243: if_icmpne +28 -> 271
    //   246: iconst_0
    //   247: istore_3
    //   248: aconst_null
    //   249: astore 4
    //   251: aload 6
    //   253: iconst_0
    //   254: invokeinterface 125 2 0
    //   259: astore 4
    //   261: aload 4
    //   263: checkcast 78	com/bumptech/glide/load/model/ModelLoader
    //   266: astore 4
    //   268: goto -41 -> 227
    //   271: iload 9
    //   273: ifeq +11 -> 284
    //   276: invokestatic 129	com/bumptech/glide/load/model/MultiModelLoaderFactory:emptyModelLoader	()Lcom/bumptech/glide/load/model/ModelLoader;
    //   279: astore 4
    //   281: goto -54 -> 227
    //   284: new 131	com/bumptech/glide/Registry$NoModelLoaderAvailableException
    //   287: astore 4
    //   289: aload 4
    //   291: aload_1
    //   292: aload_2
    //   293: invokespecial 134	com/bumptech/glide/Registry$NoModelLoaderAvailableException:<init>	(Ljava/lang/Class;Ljava/lang/Class;)V
    //   296: aload 4
    //   298: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	299	0	this	MultiModelLoaderFactory
    //   0	299	1	paramClass1	Class
    //   0	299	2	paramClass2	Class
    //   1	49	3	bool1	boolean
    //   197	51	3	i	int
    //   3	152	4	localObject1	Object
    //   165	16	4	localObject2	Object
    //   183	5	4	localObject3	Object
    //   208	89	4	localObject4	Object
    //   6	238	5	j	int
    //   13	239	6	localArrayList	ArrayList
    //   24	197	7	localObject5	Object
    //   33	21	8	localIterator	Iterator
    //   36	236	9	k	int
    //   73	80	10	localObject6	Object
    //   84	24	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   10	13	165	finally
    //   15	20	165	finally
    //   20	24	165	finally
    //   26	33	165	finally
    //   41	48	165	finally
    //   53	60	165	finally
    //   62	67	165	finally
    //   69	73	165	finally
    //   77	84	165	finally
    //   101	105	165	finally
    //   112	116	165	finally
    //   120	128	165	finally
    //   129	134	165	finally
    //   138	146	165	finally
    //   146	150	165	finally
    //   154	162	165	finally
    //   190	197	165	finally
    //   204	208	165	finally
    //   210	214	165	finally
    //   220	225	165	finally
    //   232	239	165	finally
    //   253	259	165	finally
    //   261	266	165	finally
    //   276	279	165	finally
    //   284	287	165	finally
    //   292	296	165	finally
    //   296	299	165	finally
    //   167	171	183	finally
    //   173	180	183	finally
    //   180	183	183	finally
  }
  
  List build(Class paramClass)
  {
    try
    {
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      Object localObject2 = this.entries;
      Iterator localIterator = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = localIterator.next();
        localObject2 = (MultiModelLoaderFactory.Entry)localObject2;
        Object localObject5 = this.alreadyUsedEntries;
        boolean bool2 = ((Set)localObject5).contains(localObject2);
        if (!bool2)
        {
          bool2 = ((MultiModelLoaderFactory.Entry)localObject2).handles(paramClass);
          if (bool2)
          {
            localObject5 = this.alreadyUsedEntries;
            ((Set)localObject5).add(localObject2);
            localObject5 = build((MultiModelLoaderFactory.Entry)localObject2);
            ((List)localObject1).add(localObject5);
            localObject5 = this.alreadyUsedEntries;
            ((Set)localObject5).remove(localObject2);
          }
        }
      }
      return (List)localObject1;
    }
    finally
    {
      try
      {
        localObject1 = this.alreadyUsedEntries;
        ((Set)localObject1).clear();
        throw ((Throwable)localObject3);
      }
      finally {}
    }
  }
  
  List getDataClasses(Class paramClass)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject1 = this.entries;
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (MultiModelLoaderFactory.Entry)localObject1;
        Class localClass = ((MultiModelLoaderFactory.Entry)localObject1).dataClass;
        boolean bool2 = localArrayList.contains(localClass);
        if (!bool2)
        {
          bool2 = ((MultiModelLoaderFactory.Entry)localObject1).handles(paramClass);
          if (bool2)
          {
            localObject1 = ((MultiModelLoaderFactory.Entry)localObject1).dataClass;
            localArrayList.add(localObject1);
          }
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  void prepend(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    Object localObject1 = null;
    try
    {
      add(paramClass1, paramClass2, paramModelLoaderFactory, false);
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  List remove(Class paramClass1, Class paramClass2)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject1 = this.entries;
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (MultiModelLoaderFactory.Entry)localObject1;
        boolean bool2 = ((MultiModelLoaderFactory.Entry)localObject1).handles(paramClass1, paramClass2);
        if (bool2)
        {
          localIterator.remove();
          localObject1 = getFactory((MultiModelLoaderFactory.Entry)localObject1);
          localArrayList.add(localObject1);
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  List replace(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    try
    {
      List localList = remove(paramClass1, paramClass2);
      append(paramClass1, paramClass2, paramModelLoaderFactory);
      return localList;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MultiModelLoaderFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */