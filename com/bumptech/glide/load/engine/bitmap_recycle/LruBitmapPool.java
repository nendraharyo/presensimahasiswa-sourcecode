package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LruBitmapPool
  implements BitmapPool
{
  private static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.ARGB_8888;
  private static final String TAG = "LruBitmapPool";
  private final Set allowedConfigs;
  private long currentSize;
  private int evictions;
  private int hits;
  private final long initialMaxSize;
  private long maxSize;
  private int misses;
  private int puts;
  private final LruPoolStrategy strategy;
  private final LruBitmapPool.BitmapTracker tracker;
  
  public LruBitmapPool(long paramLong)
  {
    this(paramLong, localLruPoolStrategy, localSet);
  }
  
  LruBitmapPool(long paramLong, LruPoolStrategy paramLruPoolStrategy, Set paramSet)
  {
    this.initialMaxSize = paramLong;
    this.maxSize = paramLong;
    this.strategy = paramLruPoolStrategy;
    this.allowedConfigs = paramSet;
    LruBitmapPool.NullBitmapTracker localNullBitmapTracker = new com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool$NullBitmapTracker;
    localNullBitmapTracker.<init>();
    this.tracker = localNullBitmapTracker;
  }
  
  public LruBitmapPool(long paramLong, Set paramSet)
  {
    this(paramLong, localLruPoolStrategy, paramSet);
  }
  
  private static void assertNotHardwareConfig(Bitmap.Config paramConfig)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i < j) {}
    do
    {
      return;
      localObject1 = Bitmap.Config.HARDWARE;
    } while (paramConfig != localObject1);
    Object localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Cannot create a mutable Bitmap with config: " + paramConfig + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions";
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    if (paramConfig != null) {}
    for (;;)
    {
      return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      paramConfig = DEFAULT_CONFIG;
    }
  }
  
  private void dump()
  {
    String str = "LruBitmapPool";
    int i = 2;
    boolean bool = Log.isLoggable(str, i);
    if (bool) {
      dumpUnchecked();
    }
  }
  
  private void dumpUnchecked()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Hits=");
    int i = this.hits;
    localObject = ((StringBuilder)localObject).append(i).append(", misses=");
    i = this.misses;
    localObject = ((StringBuilder)localObject).append(i).append(", puts=");
    i = this.puts;
    localObject = ((StringBuilder)localObject).append(i).append(", evictions=");
    i = this.evictions;
    localObject = ((StringBuilder)localObject).append(i).append(", currentSize=");
    long l = this.currentSize;
    localObject = ((StringBuilder)localObject).append(l).append(", maxSize=");
    l = this.maxSize;
    localObject = ((StringBuilder)localObject).append(l).append("\nStrategy=");
    LruPoolStrategy localLruPoolStrategy = this.strategy;
    localObject = localLruPoolStrategy;
    Log.v("LruBitmapPool", (String)localObject);
  }
  
  private void evict()
  {
    long l = this.maxSize;
    trimToSize(l);
  }
  
  private static Set getDefaultAllowedConfigs()
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = Arrays.asList(Bitmap.Config.values());
    localHashSet.<init>((Collection)localObject);
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j)
    {
      i = 0;
      localObject = null;
      localHashSet.add(null);
    }
    i = Build.VERSION.SDK_INT;
    j = 26;
    if (i >= j)
    {
      localObject = Bitmap.Config.HARDWARE;
      localHashSet.remove(localObject);
    }
    return Collections.unmodifiableSet(localHashSet);
  }
  
  private static LruPoolStrategy getDefaultStrategy()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Object localObject;
    if (i >= j)
    {
      localObject = new com/bumptech/glide/load/engine/bitmap_recycle/SizeConfigStrategy;
      ((SizeConfigStrategy)localObject).<init>();
    }
    for (;;)
    {
      return (LruPoolStrategy)localObject;
      localObject = new com/bumptech/glide/load/engine/bitmap_recycle/AttributeStrategy;
      ((AttributeStrategy)localObject).<init>();
    }
  }
  
  /* Error */
  private Bitmap getDirtyOrNull(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_3
    //   3: invokestatic 190	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:assertNotHardwareConfig	(Landroid/graphics/Bitmap$Config;)V
    //   6: aload_0
    //   7: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   10: astore 4
    //   12: aload_3
    //   13: ifnull +227 -> 240
    //   16: aload_3
    //   17: astore 5
    //   19: aload 4
    //   21: iload_1
    //   22: iload_2
    //   23: aload 5
    //   25: invokeinterface 195 4 0
    //   30: astore 5
    //   32: aload 5
    //   34: ifnonnull +214 -> 248
    //   37: ldc 13
    //   39: astore 4
    //   41: iconst_3
    //   42: istore 6
    //   44: aload 4
    //   46: iload 6
    //   48: invokestatic 108	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   51: istore 7
    //   53: iload 7
    //   55: ifeq +72 -> 127
    //   58: ldc 13
    //   60: astore 4
    //   62: new 76	java/lang/StringBuilder
    //   65: astore 8
    //   67: aload 8
    //   69: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   72: ldc -58
    //   74: astore 9
    //   76: aload 8
    //   78: aload 9
    //   80: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: astore 8
    //   85: aload_0
    //   86: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   89: astore 9
    //   91: aload 9
    //   93: iload_1
    //   94: iload_2
    //   95: aload_3
    //   96: invokeinterface 202 4 0
    //   101: astore 9
    //   103: aload 8
    //   105: aload 9
    //   107: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: astore 8
    //   112: aload 8
    //   114: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: astore 8
    //   119: aload 4
    //   121: aload 8
    //   123: invokestatic 205	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   126: pop
    //   127: aload_0
    //   128: getfield 122	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:misses	I
    //   131: iconst_1
    //   132: iadd
    //   133: istore 7
    //   135: aload_0
    //   136: iload 7
    //   138: putfield 122	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:misses	I
    //   141: ldc 13
    //   143: astore 4
    //   145: iconst_2
    //   146: istore 6
    //   148: aload 4
    //   150: iload 6
    //   152: invokestatic 108	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   155: istore 7
    //   157: iload 7
    //   159: ifeq +72 -> 231
    //   162: ldc 13
    //   164: astore 4
    //   166: new 76	java/lang/StringBuilder
    //   169: astore 8
    //   171: aload 8
    //   173: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   176: ldc -49
    //   178: astore 9
    //   180: aload 8
    //   182: aload 9
    //   184: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: astore 8
    //   189: aload_0
    //   190: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   193: astore 9
    //   195: aload 9
    //   197: iload_1
    //   198: iload_2
    //   199: aload_3
    //   200: invokeinterface 202 4 0
    //   205: astore 9
    //   207: aload 8
    //   209: aload 9
    //   211: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: astore 8
    //   216: aload 8
    //   218: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: astore 8
    //   223: aload 4
    //   225: aload 8
    //   227: invokestatic 145	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   230: pop
    //   231: aload_0
    //   232: invokespecial 210	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:dump	()V
    //   235: aload_0
    //   236: monitorexit
    //   237: aload 5
    //   239: areturn
    //   240: getstatic 35	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:DEFAULT_CONFIG	Landroid/graphics/Bitmap$Config;
    //   243: astore 5
    //   245: goto -226 -> 19
    //   248: aload_0
    //   249: getfield 115	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:hits	I
    //   252: iconst_1
    //   253: iadd
    //   254: istore 7
    //   256: aload_0
    //   257: iload 7
    //   259: putfield 115	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:hits	I
    //   262: aload_0
    //   263: getfield 134	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:currentSize	J
    //   266: lstore 10
    //   268: aload_0
    //   269: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   272: astore 4
    //   274: aload 4
    //   276: aload 5
    //   278: invokeinterface 214 2 0
    //   283: istore 7
    //   285: iload 7
    //   287: i2l
    //   288: lstore 12
    //   290: lload 10
    //   292: lload 12
    //   294: lsub
    //   295: lstore 10
    //   297: aload_0
    //   298: lload 10
    //   300: putfield 134	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:currentSize	J
    //   303: aload_0
    //   304: getfield 63	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:tracker	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool$BitmapTracker;
    //   307: astore 4
    //   309: aload 4
    //   311: aload 5
    //   313: invokeinterface 219 2 0
    //   318: aload 5
    //   320: invokestatic 222	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:normalize	(Landroid/graphics/Bitmap;)V
    //   323: goto -182 -> 141
    //   326: astore 5
    //   328: aload_0
    //   329: monitorexit
    //   330: aload 5
    //   332: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	this	LruBitmapPool
    //   0	333	1	paramInt1	int
    //   0	333	2	paramInt2	int
    //   0	333	3	paramConfig	Bitmap.Config
    //   10	300	4	localObject1	Object
    //   17	302	5	localObject2	Object
    //   326	5	5	localObject3	Object
    //   42	109	6	i	int
    //   51	3	7	bool1	boolean
    //   133	4	7	j	int
    //   155	3	7	bool2	boolean
    //   254	32	7	k	int
    //   65	161	8	localObject4	Object
    //   74	136	9	localObject5	Object
    //   266	33	10	l1	long
    //   288	5	12	l2	long
    // Exception table:
    //   from	to	target	type
    //   2	6	326	finally
    //   6	10	326	finally
    //   23	30	326	finally
    //   46	51	326	finally
    //   62	65	326	finally
    //   67	72	326	finally
    //   78	83	326	finally
    //   85	89	326	finally
    //   95	101	326	finally
    //   105	110	326	finally
    //   112	117	326	finally
    //   121	127	326	finally
    //   127	131	326	finally
    //   136	141	326	finally
    //   150	155	326	finally
    //   166	169	326	finally
    //   171	176	326	finally
    //   182	187	326	finally
    //   189	193	326	finally
    //   199	205	326	finally
    //   209	214	326	finally
    //   216	221	326	finally
    //   225	231	326	finally
    //   231	235	326	finally
    //   240	243	326	finally
    //   248	252	326	finally
    //   257	262	326	finally
    //   262	266	326	finally
    //   268	272	326	finally
    //   276	283	326	finally
    //   298	303	326	finally
    //   303	307	326	finally
    //   311	318	326	finally
    //   318	323	326	finally
  }
  
  private static void maybeSetPreMultiplied(Bitmap paramBitmap)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j)
    {
      i = 1;
      paramBitmap.setPremultiplied(i);
    }
  }
  
  private static void normalize(Bitmap paramBitmap)
  {
    paramBitmap.setHasAlpha(true);
    maybeSetPreMultiplied(paramBitmap);
  }
  
  /* Error */
  private void trimToSize(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 134	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:currentSize	J
    //   6: lstore_3
    //   7: lload_3
    //   8: lload_1
    //   9: lcmp
    //   10: istore 5
    //   12: iload 5
    //   14: ifle +71 -> 85
    //   17: aload_0
    //   18: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   21: astore 6
    //   23: aload 6
    //   25: invokeinterface 237 1 0
    //   30: astore 6
    //   32: aload 6
    //   34: ifnonnull +54 -> 88
    //   37: ldc 13
    //   39: astore 6
    //   41: iconst_5
    //   42: istore 7
    //   44: aload 6
    //   46: iload 7
    //   48: invokestatic 108	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   51: istore 5
    //   53: iload 5
    //   55: ifeq +23 -> 78
    //   58: ldc 13
    //   60: astore 6
    //   62: ldc -16
    //   64: astore 8
    //   66: aload 6
    //   68: aload 8
    //   70: invokestatic 243	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: aload_0
    //   75: invokespecial 111	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:dumpUnchecked	()V
    //   78: lconst_0
    //   79: lstore_3
    //   80: aload_0
    //   81: lload_3
    //   82: putfield 134	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:currentSize	J
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: aload_0
    //   89: getfield 63	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:tracker	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool$BitmapTracker;
    //   92: astore 8
    //   94: aload 8
    //   96: aload 6
    //   98: invokeinterface 219 2 0
    //   103: aload_0
    //   104: getfield 134	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:currentSize	J
    //   107: lstore 9
    //   109: aload_0
    //   110: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   113: astore 8
    //   115: aload 8
    //   117: aload 6
    //   119: invokeinterface 214 2 0
    //   124: istore 7
    //   126: iload 7
    //   128: i2l
    //   129: lstore 11
    //   131: lload 9
    //   133: lload 11
    //   135: lsub
    //   136: lstore 9
    //   138: aload_0
    //   139: lload 9
    //   141: putfield 134	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:currentSize	J
    //   144: aload_0
    //   145: getfield 130	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:evictions	I
    //   148: iconst_1
    //   149: iadd
    //   150: istore 7
    //   152: aload_0
    //   153: iload 7
    //   155: putfield 130	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:evictions	I
    //   158: ldc 13
    //   160: astore 8
    //   162: iconst_3
    //   163: istore 13
    //   165: aload 8
    //   167: iload 13
    //   169: invokestatic 108	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   172: istore 7
    //   174: iload 7
    //   176: ifeq +71 -> 247
    //   179: ldc 13
    //   181: astore 8
    //   183: new 76	java/lang/StringBuilder
    //   186: astore 14
    //   188: aload 14
    //   190: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   193: ldc -11
    //   195: astore 15
    //   197: aload 14
    //   199: aload 15
    //   201: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: astore 14
    //   206: aload_0
    //   207: getfield 56	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:strategy	Lcom/bumptech/glide/load/engine/bitmap_recycle/LruPoolStrategy;
    //   210: astore 15
    //   212: aload 15
    //   214: aload 6
    //   216: invokeinterface 248 2 0
    //   221: astore 15
    //   223: aload 14
    //   225: aload 15
    //   227: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: astore 14
    //   232: aload 14
    //   234: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: astore 14
    //   239: aload 8
    //   241: aload 14
    //   243: invokestatic 205	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   246: pop
    //   247: aload_0
    //   248: invokespecial 210	com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool:dump	()V
    //   251: aload 6
    //   253: invokevirtual 251	android/graphics/Bitmap:recycle	()V
    //   256: goto -254 -> 2
    //   259: astore 6
    //   261: aload_0
    //   262: monitorexit
    //   263: aload 6
    //   265: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	LruBitmapPool
    //   0	266	1	paramLong	long
    //   6	76	3	l1	long
    //   10	44	5	bool1	boolean
    //   21	231	6	localObject1	Object
    //   259	5	6	localObject2	Object
    //   42	112	7	i	int
    //   172	3	7	bool2	boolean
    //   64	176	8	localObject3	Object
    //   107	33	9	l2	long
    //   129	5	11	l3	long
    //   163	5	13	j	int
    //   186	56	14	localObject4	Object
    //   195	31	15	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	259	finally
    //   17	21	259	finally
    //   23	30	259	finally
    //   46	51	259	finally
    //   68	74	259	finally
    //   74	78	259	finally
    //   81	85	259	finally
    //   88	92	259	finally
    //   96	103	259	finally
    //   103	107	259	finally
    //   109	113	259	finally
    //   117	124	259	finally
    //   139	144	259	finally
    //   144	148	259	finally
    //   153	158	259	finally
    //   167	172	259	finally
    //   183	186	259	finally
    //   188	193	259	finally
    //   199	204	259	finally
    //   206	210	259	finally
    //   214	221	259	finally
    //   225	230	259	finally
    //   232	237	259	finally
    //   241	247	259	finally
    //   247	251	259	finally
    //   251	256	259	finally
  }
  
  public void clearMemory()
  {
    String str1 = "LruBitmapPool";
    int i = 3;
    boolean bool = Log.isLoggable(str1, i);
    if (bool)
    {
      str1 = "LruBitmapPool";
      String str2 = "clearMemory";
      Log.d(str1, str2);
    }
    trimToSize(0L);
  }
  
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = getDirtyOrNull(paramInt1, paramInt2, paramConfig);
    if (localBitmap != null) {
      localBitmap.eraseColor(0);
    }
    for (;;)
    {
      return localBitmap;
      localBitmap = createBitmap(paramInt1, paramInt2, paramConfig);
    }
  }
  
  public Bitmap getDirty(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = getDirtyOrNull(paramInt1, paramInt2, paramConfig);
    if (localBitmap == null) {
      localBitmap = createBitmap(paramInt1, paramInt2, paramConfig);
    }
    return localBitmap;
  }
  
  public long getMaxSize()
  {
    return this.maxSize;
  }
  
  public void put(Bitmap paramBitmap)
  {
    Object localObject3;
    if (paramBitmap == null) {
      try
      {
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localObject3 = "Bitmap must not be null";
        localNullPointerException.<init>((String)localObject3);
        throw localNullPointerException;
      }
      finally {}
    }
    boolean bool1 = paramBitmap.isRecycled();
    if (bool1)
    {
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = "Cannot pool recycled bitmap";
      ((IllegalStateException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    bool1 = paramBitmap.isMutable();
    long l1;
    long l2;
    if (bool1)
    {
      localObject2 = this.strategy;
      int i = ((LruPoolStrategy)localObject2).getSize(paramBitmap);
      l1 = i;
      l2 = this.maxSize;
      bool2 = l1 < l2;
      if (!bool2)
      {
        localObject2 = this.allowedConfigs;
        localObject3 = paramBitmap.getConfig();
        bool2 = ((Set)localObject2).contains(localObject3);
        if (bool2) {
          break label274;
        }
      }
    }
    Object localObject2 = "LruBitmapPool";
    int k = 2;
    boolean bool2 = Log.isLoggable((String)localObject2, k);
    Object localObject4;
    if (bool2)
    {
      localObject2 = "LruBitmapPool";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "Reject bitmap from pool, bitmap: ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = this.strategy;
      localObject4 = ((LruPoolStrategy)localObject4).logBitmap(paramBitmap);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = ", is mutable: ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      boolean bool4 = paramBitmap.isMutable();
      localObject3 = ((StringBuilder)localObject3).append(bool4);
      localObject4 = ", is allowed config: ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = this.allowedConfigs;
      Bitmap.Config localConfig = paramBitmap.getConfig();
      bool4 = ((Set)localObject4).contains(localConfig);
      localObject3 = ((StringBuilder)localObject3).append(bool4);
      localObject3 = ((StringBuilder)localObject3).toString();
      Log.v((String)localObject2, (String)localObject3);
    }
    paramBitmap.recycle();
    for (;;)
    {
      return;
      label274:
      localObject2 = this.strategy;
      int j = ((LruPoolStrategy)localObject2).getSize(paramBitmap);
      localObject3 = this.strategy;
      ((LruPoolStrategy)localObject3).put(paramBitmap);
      localObject3 = this.tracker;
      ((LruBitmapPool.BitmapTracker)localObject3).add(paramBitmap);
      k = this.puts + 1;
      this.puts = k;
      l2 = this.currentSize;
      l1 = j + l2;
      this.currentSize = l1;
      localObject2 = "LruBitmapPool";
      k = 2;
      boolean bool3 = Log.isLoggable((String)localObject2, k);
      if (bool3)
      {
        localObject2 = "LruBitmapPool";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Put bitmap in pool=";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = this.strategy;
        localObject4 = ((LruPoolStrategy)localObject4).logBitmap(paramBitmap);
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.v((String)localObject2, (String)localObject3);
      }
      dump();
      evict();
    }
  }
  
  public void setSizeMultiplier(float paramFloat)
  {
    try
    {
      long l = this.initialMaxSize;
      float f = (float)l * paramFloat;
      int i = Math.round(f);
      l = i;
      this.maxSize = l;
      evict();
      return;
    }
    finally {}
  }
  
  public void trimMemory(int paramInt)
  {
    String str1 = "LruBitmapPool";
    int i = 3;
    boolean bool = Log.isLoggable(str1, i);
    if (bool)
    {
      str1 = "LruBitmapPool";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "trimMemory, level=";
      localObject = str2 + paramInt;
      Log.d(str1, (String)localObject);
    }
    int j = 40;
    if (paramInt >= j) {
      clearMemory();
    }
    for (;;)
    {
      return;
      j = 20;
      if (paramInt < j)
      {
        j = 15;
        if (paramInt != j) {}
      }
      else
      {
        long l1 = getMaxSize();
        long l2 = 2;
        l1 /= l2;
        trimToSize(l1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\LruBitmapPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */