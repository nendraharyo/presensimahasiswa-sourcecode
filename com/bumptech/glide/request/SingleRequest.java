package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.h.k.a;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.Engine.LoadStatus;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.List;
import java.util.Map;

public final class SingleRequest
  implements Request, ResourceCallback, SizeReadyCallback, FactoryPools.Poolable
{
  private static final String GLIDE_TAG = "Glide";
  private static final boolean IS_VERBOSE_LOGGABLE = Log.isLoggable("Request", 2);
  private static final k.a POOL;
  private static final String TAG = "Request";
  private TransitionFactory animationFactory;
  private Context context;
  private Engine engine;
  private Drawable errorDrawable;
  private Drawable fallbackDrawable;
  private GlideContext glideContext;
  private int height;
  private boolean isCallingCallbacks;
  private Engine.LoadStatus loadStatus;
  private Object model;
  private int overrideHeight;
  private int overrideWidth;
  private Drawable placeholderDrawable;
  private Priority priority;
  private RequestCoordinator requestCoordinator;
  private List requestListeners;
  private RequestOptions requestOptions;
  private Resource resource;
  private long startTime;
  private final StateVerifier stateVerifier;
  private SingleRequest.Status status;
  private final String tag;
  private Target target;
  private RequestListener targetListener;
  private Class transcodeClass;
  private int width;
  
  static
  {
    SingleRequest.1 local1 = new com/bumptech/glide/request/SingleRequest$1;
    local1.<init>();
    POOL = FactoryPools.simple(150, local1);
  }
  
  SingleRequest()
  {
    boolean bool = IS_VERBOSE_LOGGABLE;
    int i;
    if (bool) {
      i = super.hashCode();
    }
    for (Object localObject = String.valueOf(i);; localObject = null)
    {
      this.tag = ((String)localObject);
      localObject = StateVerifier.newInstance();
      this.stateVerifier = ((StateVerifier)localObject);
      return;
      i = 0;
    }
  }
  
  private void assertNotCallingCallbacks()
  {
    boolean bool = this.isCallingCallbacks;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
      throw localIllegalStateException;
    }
  }
  
  private boolean canNotifyCleared()
  {
    RequestCoordinator localRequestCoordinator = this.requestCoordinator;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.requestCoordinator;
      bool = localRequestCoordinator.canNotifyCleared(this);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequestCoordinator = null;
    }
  }
  
  private boolean canNotifyStatusChanged()
  {
    RequestCoordinator localRequestCoordinator = this.requestCoordinator;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.requestCoordinator;
      bool = localRequestCoordinator.canNotifyStatusChanged(this);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequestCoordinator = null;
    }
  }
  
  private boolean canSetResource()
  {
    RequestCoordinator localRequestCoordinator = this.requestCoordinator;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.requestCoordinator;
      bool = localRequestCoordinator.canSetImage(this);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequestCoordinator = null;
    }
  }
  
  private void cancel()
  {
    assertNotCallingCallbacks();
    this.stateVerifier.throwIfRecycled();
    this.target.removeCallback(this);
    Engine.LoadStatus localLoadStatus = this.loadStatus;
    if (localLoadStatus != null)
    {
      this.loadStatus.cancel();
      localLoadStatus = null;
      this.loadStatus = null;
    }
  }
  
  private Drawable getErrorDrawable()
  {
    Object localObject = this.errorDrawable;
    if (localObject == null)
    {
      localObject = this.requestOptions.getErrorPlaceholder();
      this.errorDrawable = ((Drawable)localObject);
      localObject = this.errorDrawable;
      if (localObject == null)
      {
        localObject = this.requestOptions;
        int i = ((RequestOptions)localObject).getErrorId();
        if (i > 0)
        {
          i = this.requestOptions.getErrorId();
          localObject = loadDrawable(i);
          this.errorDrawable = ((Drawable)localObject);
        }
      }
    }
    return this.errorDrawable;
  }
  
  private Drawable getFallbackDrawable()
  {
    Object localObject = this.fallbackDrawable;
    if (localObject == null)
    {
      localObject = this.requestOptions.getFallbackDrawable();
      this.fallbackDrawable = ((Drawable)localObject);
      localObject = this.fallbackDrawable;
      if (localObject == null)
      {
        localObject = this.requestOptions;
        int i = ((RequestOptions)localObject).getFallbackId();
        if (i > 0)
        {
          i = this.requestOptions.getFallbackId();
          localObject = loadDrawable(i);
          this.fallbackDrawable = ((Drawable)localObject);
        }
      }
    }
    return this.fallbackDrawable;
  }
  
  private Drawable getPlaceholderDrawable()
  {
    Object localObject = this.placeholderDrawable;
    if (localObject == null)
    {
      localObject = this.requestOptions.getPlaceholderDrawable();
      this.placeholderDrawable = ((Drawable)localObject);
      localObject = this.placeholderDrawable;
      if (localObject == null)
      {
        localObject = this.requestOptions;
        int i = ((RequestOptions)localObject).getPlaceholderId();
        if (i > 0)
        {
          i = this.requestOptions.getPlaceholderId();
          localObject = loadDrawable(i);
          this.placeholderDrawable = ((Drawable)localObject);
        }
      }
    }
    return this.placeholderDrawable;
  }
  
  private void init(Context paramContext, GlideContext paramGlideContext, Object paramObject, Class paramClass, RequestOptions paramRequestOptions, int paramInt1, int paramInt2, Priority paramPriority, Target paramTarget, RequestListener paramRequestListener, List paramList, RequestCoordinator paramRequestCoordinator, Engine paramEngine, TransitionFactory paramTransitionFactory)
  {
    this.context = paramContext;
    this.glideContext = paramGlideContext;
    this.model = paramObject;
    this.transcodeClass = paramClass;
    this.requestOptions = paramRequestOptions;
    this.overrideWidth = paramInt1;
    this.overrideHeight = paramInt2;
    this.priority = paramPriority;
    this.target = paramTarget;
    this.targetListener = paramRequestListener;
    this.requestListeners = paramList;
    this.requestCoordinator = paramRequestCoordinator;
    this.engine = paramEngine;
    this.animationFactory = paramTransitionFactory;
    SingleRequest.Status localStatus = SingleRequest.Status.PENDING;
    this.status = localStatus;
  }
  
  private boolean isFirstReadyResource()
  {
    RequestCoordinator localRequestCoordinator = this.requestCoordinator;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.requestCoordinator;
      bool = localRequestCoordinator.isAnyResourceSet();
      if (bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequestCoordinator = null;
    }
  }
  
  private static boolean listenerCountEquals(SingleRequest paramSingleRequest1, SingleRequest paramSingleRequest2)
  {
    boolean bool = false;
    List localList1 = paramSingleRequest1.requestListeners;
    int i;
    List localList2;
    int j;
    if (localList1 == null)
    {
      i = 0;
      localList1 = null;
      localList2 = paramSingleRequest2.requestListeners;
      if (localList2 != null) {
        break label60;
      }
      j = 0;
      localList2 = null;
    }
    for (;;)
    {
      if (i == j) {
        bool = true;
      }
      return bool;
      localList1 = paramSingleRequest1.requestListeners;
      i = localList1.size();
      break;
      label60:
      localList2 = paramSingleRequest2.requestListeners;
      j = localList2.size();
    }
  }
  
  private Drawable loadDrawable(int paramInt)
  {
    Resources.Theme localTheme = this.requestOptions.getTheme();
    if (localTheme != null) {}
    for (localTheme = this.requestOptions.getTheme();; localTheme = this.context.getTheme()) {
      return DrawableDecoderCompat.getDrawable(this.glideContext, paramInt, localTheme);
    }
  }
  
  private void logV(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(paramString).append(" this: ");
    String str = this.tag;
    localObject = str;
    Log.v("Request", (String)localObject);
  }
  
  private static int maybeApplySizeMultiplier(int paramInt, float paramFloat)
  {
    int i = -1 << -1;
    float f = -0.0F;
    if (paramInt == i) {}
    for (;;)
    {
      return paramInt;
      f = paramInt * paramFloat;
      paramInt = Math.round(f);
    }
  }
  
  private void notifyLoadFailed()
  {
    RequestCoordinator localRequestCoordinator = this.requestCoordinator;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.requestCoordinator;
      localRequestCoordinator.onRequestFailed(this);
    }
  }
  
  private void notifyLoadSuccess()
  {
    RequestCoordinator localRequestCoordinator = this.requestCoordinator;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.requestCoordinator;
      localRequestCoordinator.onRequestSuccess(this);
    }
  }
  
  public static SingleRequest obtain(Context paramContext, GlideContext paramGlideContext, Object paramObject, Class paramClass, RequestOptions paramRequestOptions, int paramInt1, int paramInt2, Priority paramPriority, Target paramTarget, RequestListener paramRequestListener, List paramList, RequestCoordinator paramRequestCoordinator, Engine paramEngine, TransitionFactory paramTransitionFactory)
  {
    SingleRequest localSingleRequest = (SingleRequest)POOL.acquire();
    if (localSingleRequest == null)
    {
      localSingleRequest = new com/bumptech/glide/request/SingleRequest;
      localSingleRequest.<init>();
    }
    localSingleRequest.init(paramContext, paramGlideContext, paramObject, paramClass, paramRequestOptions, paramInt1, paramInt2, paramPriority, paramTarget, paramRequestListener, paramList, paramRequestCoordinator, paramEngine, paramTransitionFactory);
    return localSingleRequest;
  }
  
  /* Error */
  private void onLoadFailed(GlideException paramGlideException, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 115	com/bumptech/glide/request/SingleRequest:stateVerifier	Lcom/bumptech/glide/util/pool/StateVerifier;
    //   6: invokevirtual 145	com/bumptech/glide/util/pool/StateVerifier:throwIfRecycled	()V
    //   9: aload_0
    //   10: getfield 197	com/bumptech/glide/request/SingleRequest:glideContext	Lcom/bumptech/glide/GlideContext;
    //   13: astore 4
    //   15: aload 4
    //   17: invokevirtual 290	com/bumptech/glide/GlideContext:getLogLevel	()I
    //   20: istore 5
    //   22: iload 5
    //   24: iload_2
    //   25: if_icmpgt +130 -> 155
    //   28: ldc 17
    //   30: astore 6
    //   32: new 246	java/lang/StringBuilder
    //   35: astore 7
    //   37: aload 7
    //   39: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   42: aload 7
    //   44: ldc_w 292
    //   47: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: astore 7
    //   52: aload_0
    //   53: getfield 199	com/bumptech/glide/request/SingleRequest:model	Ljava/lang/Object;
    //   56: astore 8
    //   58: aload 7
    //   60: aload 8
    //   62: invokevirtual 295	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   65: ldc_w 297
    //   68: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: astore 7
    //   73: aload_0
    //   74: getfield 299	com/bumptech/glide/request/SingleRequest:width	I
    //   77: istore 9
    //   79: aload 7
    //   81: iload 9
    //   83: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   86: ldc_w 304
    //   89: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: astore 7
    //   94: aload_0
    //   95: getfield 306	com/bumptech/glide/request/SingleRequest:height	I
    //   98: istore 9
    //   100: aload 7
    //   102: iload 9
    //   104: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   107: astore 7
    //   109: ldc_w 308
    //   112: astore 8
    //   114: aload 7
    //   116: aload 8
    //   118: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 257	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: astore 7
    //   126: aload 6
    //   128: aload 7
    //   130: aload_1
    //   131: invokestatic 312	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   134: pop
    //   135: iconst_4
    //   136: istore 10
    //   138: iload 5
    //   140: iload 10
    //   142: if_icmpgt +13 -> 155
    //   145: ldc 17
    //   147: astore 4
    //   149: aload_1
    //   150: aload 4
    //   152: invokevirtual 318	com/bumptech/glide/load/engine/GlideException:logRootCauses	(Ljava/lang/String;)V
    //   155: iconst_0
    //   156: istore 5
    //   158: aload_0
    //   159: aconst_null
    //   160: putfield 155	com/bumptech/glide/request/SingleRequest:loadStatus	Lcom/bumptech/glide/load/engine/Engine$LoadStatus;
    //   163: getstatic 321	com/bumptech/glide/request/SingleRequest$Status:FAILED	Lcom/bumptech/glide/request/SingleRequest$Status;
    //   166: astore 4
    //   168: aload_0
    //   169: aload 4
    //   171: putfield 222	com/bumptech/glide/request/SingleRequest:status	Lcom/bumptech/glide/request/SingleRequest$Status;
    //   174: aload_0
    //   175: iload_3
    //   176: putfield 117	com/bumptech/glide/request/SingleRequest:isCallingCallbacks	Z
    //   179: aload_0
    //   180: getfield 211	com/bumptech/glide/request/SingleRequest:requestListeners	Ljava/util/List;
    //   183: astore 4
    //   185: aload 4
    //   187: ifnull +98 -> 285
    //   190: aload_0
    //   191: getfield 211	com/bumptech/glide/request/SingleRequest:requestListeners	Ljava/util/List;
    //   194: astore 4
    //   196: aload 4
    //   198: invokeinterface 325 1 0
    //   203: astore 7
    //   205: iconst_0
    //   206: istore 10
    //   208: aconst_null
    //   209: astore 6
    //   211: aload 7
    //   213: invokeinterface 330 1 0
    //   218: istore 5
    //   220: iload 5
    //   222: ifeq +69 -> 291
    //   225: aload 7
    //   227: invokeinterface 333 1 0
    //   232: astore 4
    //   234: aload 4
    //   236: checkcast 335	com/bumptech/glide/request/RequestListener
    //   239: astore 4
    //   241: aload_0
    //   242: getfield 199	com/bumptech/glide/request/SingleRequest:model	Ljava/lang/Object;
    //   245: astore 8
    //   247: aload_0
    //   248: getfield 147	com/bumptech/glide/request/SingleRequest:target	Lcom/bumptech/glide/request/target/Target;
    //   251: astore 11
    //   253: aload_0
    //   254: invokespecial 338	com/bumptech/glide/request/SingleRequest:isFirstReadyResource	()Z
    //   257: istore 12
    //   259: aload 4
    //   261: aload_1
    //   262: aload 8
    //   264: aload 11
    //   266: iload 12
    //   268: invokeinterface 342 5 0
    //   273: istore 5
    //   275: iload 10
    //   277: iload 5
    //   279: ior
    //   280: istore 10
    //   282: goto -71 -> 211
    //   285: iconst_0
    //   286: istore 10
    //   288: aconst_null
    //   289: astore 6
    //   291: aload_0
    //   292: getfield 209	com/bumptech/glide/request/SingleRequest:targetListener	Lcom/bumptech/glide/request/RequestListener;
    //   295: astore 4
    //   297: aload 4
    //   299: ifnull +77 -> 376
    //   302: aload_0
    //   303: getfield 209	com/bumptech/glide/request/SingleRequest:targetListener	Lcom/bumptech/glide/request/RequestListener;
    //   306: astore 4
    //   308: aload_0
    //   309: getfield 199	com/bumptech/glide/request/SingleRequest:model	Ljava/lang/Object;
    //   312: astore 7
    //   314: aload_0
    //   315: getfield 147	com/bumptech/glide/request/SingleRequest:target	Lcom/bumptech/glide/request/target/Target;
    //   318: astore 8
    //   320: aload_0
    //   321: invokespecial 338	com/bumptech/glide/request/SingleRequest:isFirstReadyResource	()Z
    //   324: istore 13
    //   326: aload 4
    //   328: aload_1
    //   329: aload 7
    //   331: aload 8
    //   333: iload 13
    //   335: invokeinterface 342 5 0
    //   340: istore 5
    //   342: iload 5
    //   344: ifeq +32 -> 376
    //   347: iload_3
    //   348: istore 5
    //   350: iload 5
    //   352: iload 10
    //   354: ior
    //   355: istore 5
    //   357: iload 5
    //   359: ifne +7 -> 366
    //   362: aload_0
    //   363: invokespecial 345	com/bumptech/glide/request/SingleRequest:setErrorPlaceholder	()V
    //   366: aload_0
    //   367: iconst_0
    //   368: putfield 117	com/bumptech/glide/request/SingleRequest:isCallingCallbacks	Z
    //   371: aload_0
    //   372: invokespecial 348	com/bumptech/glide/request/SingleRequest:notifyLoadFailed	()V
    //   375: return
    //   376: iconst_0
    //   377: istore 5
    //   379: aconst_null
    //   380: astore 4
    //   382: goto -32 -> 350
    //   385: astore 4
    //   387: aload_0
    //   388: iconst_0
    //   389: putfield 117	com/bumptech/glide/request/SingleRequest:isCallingCallbacks	Z
    //   392: aload 4
    //   394: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	395	0	this	SingleRequest
    //   0	395	1	paramGlideException	GlideException
    //   0	395	2	paramInt	int
    //   1	347	3	i	int
    //   13	368	4	localObject1	Object
    //   385	8	4	localObject2	Object
    //   20	137	5	j	int
    //   218	160	5	k	int
    //   30	260	6	str	String
    //   35	295	7	localObject3	Object
    //   56	276	8	localObject4	Object
    //   77	26	9	m	int
    //   136	219	10	n	int
    //   251	14	11	localTarget	Target
    //   257	10	12	bool1	boolean
    //   324	10	13	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   179	183	385	finally
    //   190	194	385	finally
    //   196	203	385	finally
    //   211	218	385	finally
    //   225	232	385	finally
    //   234	239	385	finally
    //   241	245	385	finally
    //   247	251	385	finally
    //   253	257	385	finally
    //   266	273	385	finally
    //   291	295	385	finally
    //   302	306	385	finally
    //   308	312	385	finally
    //   314	318	385	finally
    //   320	324	385	finally
    //   333	340	385	finally
    //   362	366	385	finally
  }
  
  /* Error */
  private void onResourceReady(Resource paramResource, Object paramObject, DataSource paramDataSource)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: invokespecial 338	com/bumptech/glide/request/SingleRequest:isFirstReadyResource	()Z
    //   7: istore 5
    //   9: getstatic 351	com/bumptech/glide/request/SingleRequest$Status:COMPLETE	Lcom/bumptech/glide/request/SingleRequest$Status;
    //   12: astore 6
    //   14: aload_0
    //   15: aload 6
    //   17: putfield 222	com/bumptech/glide/request/SingleRequest:status	Lcom/bumptech/glide/request/SingleRequest$Status;
    //   20: aload_0
    //   21: aload_1
    //   22: putfield 353	com/bumptech/glide/request/SingleRequest:resource	Lcom/bumptech/glide/load/engine/Resource;
    //   25: aload_0
    //   26: getfield 197	com/bumptech/glide/request/SingleRequest:glideContext	Lcom/bumptech/glide/GlideContext;
    //   29: astore 6
    //   31: aload 6
    //   33: invokevirtual 290	com/bumptech/glide/GlideContext:getLogLevel	()I
    //   36: istore 7
    //   38: iconst_3
    //   39: istore 8
    //   41: iload 7
    //   43: iload 8
    //   45: if_icmpgt +171 -> 216
    //   48: ldc 17
    //   50: astore 6
    //   52: new 246	java/lang/StringBuilder
    //   55: astore 9
    //   57: aload 9
    //   59: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   62: aload 9
    //   64: ldc_w 356
    //   67: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: astore 9
    //   72: aload_2
    //   73: invokevirtual 360	java/lang/Object:getClass	()Ljava/lang/Class;
    //   76: invokevirtual 365	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   79: astore 10
    //   81: aload 9
    //   83: aload 10
    //   85: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc_w 367
    //   91: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_3
    //   95: invokevirtual 295	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   98: ldc_w 369
    //   101: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: astore 9
    //   106: aload_0
    //   107: getfield 199	com/bumptech/glide/request/SingleRequest:model	Ljava/lang/Object;
    //   110: astore 10
    //   112: aload 9
    //   114: aload 10
    //   116: invokevirtual 295	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   119: ldc_w 297
    //   122: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: astore 9
    //   127: aload_0
    //   128: getfield 299	com/bumptech/glide/request/SingleRequest:width	I
    //   131: istore 11
    //   133: aload 9
    //   135: iload 11
    //   137: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   140: ldc_w 304
    //   143: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: astore 9
    //   148: aload_0
    //   149: getfield 306	com/bumptech/glide/request/SingleRequest:height	I
    //   152: istore 11
    //   154: aload 9
    //   156: iload 11
    //   158: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   161: ldc_w 371
    //   164: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: astore 9
    //   169: aload_0
    //   170: getfield 373	com/bumptech/glide/request/SingleRequest:startTime	J
    //   173: lstore 12
    //   175: lload 12
    //   177: invokestatic 379	com/bumptech/glide/util/LogTime:getElapsedMillis	(J)D
    //   180: dstore 14
    //   182: aload 9
    //   184: dload 14
    //   186: invokevirtual 382	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   189: astore 9
    //   191: ldc_w 384
    //   194: astore 10
    //   196: aload 9
    //   198: aload 10
    //   200: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 257	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: astore 9
    //   208: aload 6
    //   210: aload 9
    //   212: invokestatic 387	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   215: pop
    //   216: aload_0
    //   217: iload 4
    //   219: putfield 117	com/bumptech/glide/request/SingleRequest:isCallingCallbacks	Z
    //   222: aload_0
    //   223: getfield 211	com/bumptech/glide/request/SingleRequest:requestListeners	Ljava/util/List;
    //   226: astore 6
    //   228: aload 6
    //   230: ifnull +93 -> 323
    //   233: aload_0
    //   234: getfield 211	com/bumptech/glide/request/SingleRequest:requestListeners	Ljava/util/List;
    //   237: astore 6
    //   239: aload 6
    //   241: invokeinterface 325 1 0
    //   246: astore 16
    //   248: iconst_0
    //   249: istore 17
    //   251: aload 16
    //   253: invokeinterface 330 1 0
    //   258: istore 7
    //   260: iload 7
    //   262: ifeq +64 -> 326
    //   265: aload 16
    //   267: invokeinterface 333 1 0
    //   272: astore 6
    //   274: aload 6
    //   276: checkcast 335	com/bumptech/glide/request/RequestListener
    //   279: astore 6
    //   281: aload_0
    //   282: getfield 199	com/bumptech/glide/request/SingleRequest:model	Ljava/lang/Object;
    //   285: astore 10
    //   287: aload_0
    //   288: getfield 147	com/bumptech/glide/request/SingleRequest:target	Lcom/bumptech/glide/request/target/Target;
    //   291: astore 18
    //   293: aload_2
    //   294: astore 9
    //   296: aload 6
    //   298: aload_2
    //   299: aload 10
    //   301: aload 18
    //   303: aload_3
    //   304: iload 5
    //   306: invokeinterface 391 6 0
    //   311: istore 7
    //   313: iload 17
    //   315: iload 7
    //   317: ior
    //   318: istore 17
    //   320: goto -69 -> 251
    //   323: iconst_0
    //   324: istore 17
    //   326: aload_0
    //   327: getfield 209	com/bumptech/glide/request/SingleRequest:targetListener	Lcom/bumptech/glide/request/RequestListener;
    //   330: astore 6
    //   332: aload 6
    //   334: ifnull +106 -> 440
    //   337: aload_0
    //   338: getfield 209	com/bumptech/glide/request/SingleRequest:targetListener	Lcom/bumptech/glide/request/RequestListener;
    //   341: astore 6
    //   343: aload_0
    //   344: getfield 199	com/bumptech/glide/request/SingleRequest:model	Ljava/lang/Object;
    //   347: astore 10
    //   349: aload_0
    //   350: getfield 147	com/bumptech/glide/request/SingleRequest:target	Lcom/bumptech/glide/request/target/Target;
    //   353: astore 18
    //   355: aload_2
    //   356: astore 9
    //   358: aload 6
    //   360: aload_2
    //   361: aload 10
    //   363: aload 18
    //   365: aload_3
    //   366: iload 5
    //   368: invokeinterface 391 6 0
    //   373: istore 7
    //   375: iload 7
    //   377: ifeq +63 -> 440
    //   380: iload 4
    //   382: istore 7
    //   384: iload 7
    //   386: iload 17
    //   388: ior
    //   389: istore 7
    //   391: iload 7
    //   393: ifne +37 -> 430
    //   396: aload_0
    //   397: getfield 215	com/bumptech/glide/request/SingleRequest:animationFactory	Lcom/bumptech/glide/request/transition/TransitionFactory;
    //   400: astore 6
    //   402: aload 6
    //   404: aload_3
    //   405: iload 5
    //   407: invokeinterface 397 3 0
    //   412: astore 6
    //   414: aload_0
    //   415: getfield 147	com/bumptech/glide/request/SingleRequest:target	Lcom/bumptech/glide/request/target/Target;
    //   418: astore 9
    //   420: aload 9
    //   422: aload_2
    //   423: aload 6
    //   425: invokeinterface 400 3 0
    //   430: aload_0
    //   431: iconst_0
    //   432: putfield 117	com/bumptech/glide/request/SingleRequest:isCallingCallbacks	Z
    //   435: aload_0
    //   436: invokespecial 403	com/bumptech/glide/request/SingleRequest:notifyLoadSuccess	()V
    //   439: return
    //   440: iconst_0
    //   441: istore 7
    //   443: aconst_null
    //   444: astore 6
    //   446: goto -62 -> 384
    //   449: astore 6
    //   451: aload_0
    //   452: iconst_0
    //   453: putfield 117	com/bumptech/glide/request/SingleRequest:isCallingCallbacks	Z
    //   456: aload 6
    //   458: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	459	0	this	SingleRequest
    //   0	459	1	paramResource	Resource
    //   0	459	2	paramObject	Object
    //   0	459	3	paramDataSource	DataSource
    //   1	380	4	bool1	boolean
    //   7	399	5	bool2	boolean
    //   12	433	6	localObject1	Object
    //   449	8	6	localObject2	Object
    //   36	10	7	i	int
    //   258	184	7	bool3	boolean
    //   39	7	8	j	int
    //   55	366	9	localObject3	Object
    //   79	283	10	localObject4	Object
    //   131	26	11	k	int
    //   173	3	12	l	long
    //   180	5	14	d	double
    //   246	20	16	localIterator	java.util.Iterator
    //   249	140	17	bool4	boolean
    //   291	73	18	localTarget	Target
    // Exception table:
    //   from	to	target	type
    //   222	226	449	finally
    //   233	237	449	finally
    //   239	246	449	finally
    //   251	258	449	finally
    //   265	272	449	finally
    //   274	279	449	finally
    //   281	285	449	finally
    //   287	291	449	finally
    //   304	311	449	finally
    //   326	330	449	finally
    //   337	341	449	finally
    //   343	347	449	finally
    //   349	353	449	finally
    //   366	373	449	finally
    //   396	400	449	finally
    //   405	412	449	finally
    //   414	418	449	finally
    //   423	430	449	finally
  }
  
  private void releaseResource(Resource paramResource)
  {
    this.engine.release(paramResource);
    this.resource = null;
  }
  
  private void setErrorPlaceholder()
  {
    boolean bool = canNotifyStatusChanged();
    if (!bool) {}
    for (;;)
    {
      return;
      bool = false;
      Drawable localDrawable = null;
      Object localObject = this.model;
      if (localObject == null) {
        localDrawable = getFallbackDrawable();
      }
      if (localDrawable == null) {
        localDrawable = getErrorDrawable();
      }
      if (localDrawable == null) {
        localDrawable = getPlaceholderDrawable();
      }
      localObject = this.target;
      ((Target)localObject).onLoadFailed(localDrawable);
    }
  }
  
  public void begin()
  {
    assertNotCallingCallbacks();
    this.stateVerifier.throwIfRecycled();
    long l1 = LogTime.getLogTime();
    this.startTime = l1;
    Object localObject1 = this.model;
    Object localObject2;
    if (localObject1 == null)
    {
      int i = this.overrideWidth;
      m = this.overrideHeight;
      boolean bool1 = Util.isValidDimensions(i, m);
      if (bool1)
      {
        j = this.overrideWidth;
        this.width = j;
        j = this.overrideHeight;
        this.height = j;
      }
      localObject1 = getFallbackDrawable();
      if (localObject1 == null)
      {
        j = 5;
        localObject2 = new com/bumptech/glide/load/engine/GlideException;
        String str = "Received null model";
        ((GlideException)localObject2).<init>(str);
        onLoadFailed((GlideException)localObject2, j);
      }
    }
    for (;;)
    {
      return;
      j = 3;
      break;
      localObject1 = this.status;
      localObject2 = SingleRequest.Status.RUNNING;
      if (localObject1 == localObject2)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("Cannot restart a running request");
        throw ((Throwable)localObject1);
      }
      localObject1 = this.status;
      localObject2 = SingleRequest.Status.COMPLETE;
      if (localObject1 != localObject2) {
        break label188;
      }
      localObject1 = this.resource;
      localObject2 = DataSource.MEMORY_CACHE;
      onResourceReady((Resource)localObject1, (DataSource)localObject2);
    }
    label188:
    localObject1 = SingleRequest.Status.WAITING_FOR_SIZE;
    this.status = ((SingleRequest.Status)localObject1);
    int j = this.overrideWidth;
    int m = this.overrideHeight;
    boolean bool2 = Util.isValidDimensions(j, m);
    if (bool2)
    {
      int k = this.overrideWidth;
      m = this.overrideHeight;
      onSizeReady(k, m);
    }
    for (;;)
    {
      localObject1 = this.status;
      localObject2 = SingleRequest.Status.RUNNING;
      if (localObject1 != localObject2)
      {
        localObject1 = this.status;
        localObject2 = SingleRequest.Status.WAITING_FOR_SIZE;
        if (localObject1 != localObject2) {}
      }
      else
      {
        bool3 = canNotifyStatusChanged();
        if (bool3)
        {
          localObject1 = this.target;
          localObject2 = getPlaceholderDrawable();
          ((Target)localObject1).onLoadStarted((Drawable)localObject2);
        }
      }
      boolean bool3 = IS_VERBOSE_LOGGABLE;
      if (!bool3) {
        break;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "finished run method in ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      long l2 = this.startTime;
      double d = LogTime.getElapsedMillis(l2);
      localObject1 = d;
      logV((String)localObject1);
      break;
      localObject1 = this.target;
      ((Target)localObject1).getSize(this);
    }
  }
  
  public void clear()
  {
    Util.assertMainThread();
    assertNotCallingCallbacks();
    this.stateVerifier.throwIfRecycled();
    Object localObject1 = this.status;
    Object localObject2 = SingleRequest.Status.CLEARED;
    if (localObject1 == localObject2) {}
    for (;;)
    {
      return;
      cancel();
      localObject1 = this.resource;
      if (localObject1 != null)
      {
        localObject1 = this.resource;
        releaseResource((Resource)localObject1);
      }
      boolean bool = canNotifyCleared();
      if (bool)
      {
        localObject1 = this.target;
        localObject2 = getPlaceholderDrawable();
        ((Target)localObject1).onLoadCleared((Drawable)localObject2);
      }
      localObject1 = SingleRequest.Status.CLEARED;
      this.status = ((SingleRequest.Status)localObject1);
    }
  }
  
  public StateVerifier getVerifier()
  {
    return this.stateVerifier;
  }
  
  public boolean isCleared()
  {
    SingleRequest.Status localStatus1 = this.status;
    SingleRequest.Status localStatus2 = SingleRequest.Status.CLEARED;
    boolean bool;
    if (localStatus1 == localStatus2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localStatus1 = null;
    }
  }
  
  public boolean isComplete()
  {
    SingleRequest.Status localStatus1 = this.status;
    SingleRequest.Status localStatus2 = SingleRequest.Status.COMPLETE;
    boolean bool;
    if (localStatus1 == localStatus2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localStatus1 = null;
    }
  }
  
  public boolean isEquivalentTo(Request paramRequest)
  {
    boolean bool1 = false;
    boolean bool2 = paramRequest instanceof SingleRequest;
    if (bool2)
    {
      paramRequest = (SingleRequest)paramRequest;
      int i = this.overrideWidth;
      int j = paramRequest.overrideWidth;
      if (i == j)
      {
        i = this.overrideHeight;
        j = paramRequest.overrideHeight;
        if (i == j)
        {
          Object localObject1 = this.model;
          Object localObject2 = paramRequest.model;
          boolean bool3 = Util.bothModelsNullEquivalentOrEquals(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = this.transcodeClass;
            localObject2 = paramRequest.transcodeClass;
            bool3 = localObject1.equals(localObject2);
            if (bool3)
            {
              localObject1 = this.requestOptions;
              localObject2 = paramRequest.requestOptions;
              bool3 = ((RequestOptions)localObject1).equals(localObject2);
              if (bool3)
              {
                localObject1 = this.priority;
                localObject2 = paramRequest.priority;
                if (localObject1 == localObject2)
                {
                  bool3 = listenerCountEquals(this, paramRequest);
                  if (bool3) {
                    bool1 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public boolean isFailed()
  {
    SingleRequest.Status localStatus1 = this.status;
    SingleRequest.Status localStatus2 = SingleRequest.Status.FAILED;
    boolean bool;
    if (localStatus1 == localStatus2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localStatus1 = null;
    }
  }
  
  public boolean isResourceSet()
  {
    return isComplete();
  }
  
  public boolean isRunning()
  {
    SingleRequest.Status localStatus1 = this.status;
    SingleRequest.Status localStatus2 = SingleRequest.Status.RUNNING;
    boolean bool;
    if (localStatus1 != localStatus2)
    {
      localStatus1 = this.status;
      localStatus2 = SingleRequest.Status.WAITING_FOR_SIZE;
      if (localStatus1 != localStatus2) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localStatus1 = null;
    }
  }
  
  public void onLoadFailed(GlideException paramGlideException)
  {
    onLoadFailed(paramGlideException, 5);
  }
  
  public void onResourceReady(Resource paramResource, DataSource paramDataSource)
  {
    this.stateVerifier.throwIfRecycled();
    boolean bool = false;
    Object localObject1 = null;
    this.loadStatus = null;
    Object localObject2;
    Object localObject3;
    if (paramResource == null)
    {
      localObject1 = new com/bumptech/glide/load/engine/GlideException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Expected to receive a Resource<R> with an object of ");
      localObject3 = this.transcodeClass;
      localObject2 = ((StringBuilder)localObject2).append(localObject3);
      localObject3 = " inside, but instead got null.";
      localObject2 = (String)localObject3;
      ((GlideException)localObject1).<init>((String)localObject2);
      onLoadFailed((GlideException)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = paramResource.get();
      if (localObject2 != null)
      {
        localObject1 = this.transcodeClass;
        localObject3 = localObject2.getClass();
        bool = ((Class)localObject1).isAssignableFrom((Class)localObject3);
        if (bool) {}
      }
      else
      {
        releaseResource(paramResource);
        localObject3 = new com/bumptech/glide/load/engine/GlideException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Expected to receive an object of ");
        Object localObject4 = this.transcodeClass;
        localObject1 = ((StringBuilder)localObject1).append(localObject4);
        localObject4 = ((StringBuilder)localObject1).append(" but instead got ");
        if (localObject2 != null)
        {
          localObject1 = localObject2.getClass();
          label197:
          localObject1 = ((StringBuilder)localObject4).append(localObject1).append("{").append(localObject2).append("} inside Resource{").append(paramResource);
          localObject4 = ((StringBuilder)localObject1).append("}.");
          if (localObject2 == null) {
            break label283;
          }
        }
        label283:
        for (localObject1 = "";; localObject1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.")
        {
          localObject1 = (String)localObject1;
          ((GlideException)localObject3).<init>((String)localObject1);
          onLoadFailed((GlideException)localObject3);
          break;
          localObject1 = "";
          break label197;
        }
      }
      bool = canSetResource();
      if (!bool)
      {
        releaseResource(paramResource);
        localObject1 = SingleRequest.Status.COMPLETE;
        this.status = ((SingleRequest.Status)localObject1);
      }
      else
      {
        onResourceReady(paramResource, localObject2, paramDataSource);
      }
    }
  }
  
  public void onSizeReady(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.stateVerifier;
    ((StateVerifier)localObject1).throwIfRecycled();
    boolean bool1 = IS_VERBOSE_LOGGABLE;
    long l;
    double d;
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Got onSizeReady in ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      l = this.startTime;
      d = LogTime.getElapsedMillis(l);
      localObject1 = d;
      logV((String)localObject1);
    }
    localObject1 = this.status;
    Object localObject2 = SingleRequest.Status.WAITING_FOR_SIZE;
    if (localObject1 != localObject2) {}
    for (;;)
    {
      return;
      localObject1 = SingleRequest.Status.RUNNING;
      this.status = ((SingleRequest.Status)localObject1);
      localObject1 = this.requestOptions;
      float f = ((RequestOptions)localObject1).getSizeMultiplier();
      int j = maybeApplySizeMultiplier(paramInt1, f);
      this.width = j;
      int i = maybeApplySizeMultiplier(paramInt2, f);
      this.height = i;
      boolean bool2 = IS_VERBOSE_LOGGABLE;
      if (bool2)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "finished setup for calling load in ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        l = this.startTime;
        d = LogTime.getElapsedMillis(l);
        localObject1 = d;
        logV((String)localObject1);
      }
      localObject1 = this.engine;
      localObject2 = this.glideContext;
      Object localObject3 = this.model;
      Key localKey = this.requestOptions.getSignature();
      int k = this.width;
      int m = this.height;
      Class localClass1 = this.requestOptions.getResourceClass();
      Class localClass2 = this.transcodeClass;
      Priority localPriority = this.priority;
      DiskCacheStrategy localDiskCacheStrategy = this.requestOptions.getDiskCacheStrategy();
      Map localMap = this.requestOptions.getTransformations();
      RequestOptions localRequestOptions1 = this.requestOptions;
      boolean bool3 = localRequestOptions1.isTransformationRequired();
      RequestOptions localRequestOptions2 = this.requestOptions;
      boolean bool4 = localRequestOptions2.isScaleOnlyOrNoTransform();
      Options localOptions = this.requestOptions.getOptions();
      boolean bool5 = this.requestOptions.isMemoryCacheable();
      boolean bool6 = this.requestOptions.getUseUnlimitedSourceGeneratorsPool();
      boolean bool7 = this.requestOptions.getUseAnimationPool();
      boolean bool8 = this.requestOptions.getOnlyRetrieveFromCache();
      localObject1 = ((Engine)localObject1).load((GlideContext)localObject2, localObject3, localKey, k, m, localClass1, localClass2, localPriority, localDiskCacheStrategy, localMap, bool3, bool4, localOptions, bool5, bool6, bool7, bool8, this);
      this.loadStatus = ((Engine.LoadStatus)localObject1);
      localObject1 = this.status;
      localObject2 = SingleRequest.Status.RUNNING;
      if (localObject1 != localObject2)
      {
        bool2 = false;
        f = 0.0F;
        localObject1 = null;
        this.loadStatus = null;
      }
      bool2 = IS_VERBOSE_LOGGABLE;
      if (bool2)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "finished onSizeReady in ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        l = this.startTime;
        d = LogTime.getElapsedMillis(l);
        localObject1 = d;
        logV((String)localObject1);
      }
    }
  }
  
  public void recycle()
  {
    int i = -1;
    assertNotCallingCallbacks();
    this.context = null;
    this.glideContext = null;
    this.model = null;
    this.transcodeClass = null;
    this.requestOptions = null;
    this.overrideWidth = i;
    this.overrideHeight = i;
    this.target = null;
    this.requestListeners = null;
    this.targetListener = null;
    this.requestCoordinator = null;
    this.animationFactory = null;
    this.loadStatus = null;
    this.errorDrawable = null;
    this.placeholderDrawable = null;
    this.fallbackDrawable = null;
    this.width = i;
    this.height = i;
    POOL.release(this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\SingleRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */