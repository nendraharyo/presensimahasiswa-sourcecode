package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.Listener;
import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzc;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.cast.internal.zzp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.internal.zza.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class zzli
  extends zzc
{
  static final String NAMESPACE = zzf.zzci("com.google.cast.games");
  private static final zzl zzaaf;
  private final List zzacA;
  private final String zzacB;
  private final Cast.CastApi zzacC;
  private final GoogleApiClient zzacD;
  private zzlj zzacE;
  private boolean zzacF;
  private GameManagerState zzacG;
  private GameManagerState zzacH;
  private String zzacI;
  private JSONObject zzacJ;
  private long zzacK;
  private GameManagerClient.Listener zzacL;
  private String zzacM;
  private final Map zzacz;
  private final SharedPreferences zzvx;
  
  static
  {
    zzl localzzl = new com/google/android/gms/cast/internal/zzl;
    localzzl.<init>("GameManagerChannel");
    zzaaf = localzzl;
  }
  
  public zzli(GoogleApiClient paramGoogleApiClient, String paramString, Cast.CastApi paramCastApi)
  {
    super((String)localObject1, (String)localObject2, null);
    localObject1 = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject1).<init>();
    this.zzacz = ((Map)localObject1);
    this.zzacF = false;
    long l = 0L;
    this.zzacK = l;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("castSessionId cannot be null.");
      throw ((Throwable)localObject1);
    }
    if (paramGoogleApiClient != null)
    {
      bool = paramGoogleApiClient.isConnected();
      if (bool)
      {
        localObject1 = Cast.API;
        bool = paramGoogleApiClient.hasConnectedApi((Api)localObject1);
        if (bool) {
          break label122;
        }
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>("googleApiClient needs to be connected and contain the Cast.API API.");
    throw ((Throwable)localObject1);
    label122:
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.zzacA = ((List)localObject1);
    this.zzacB = paramString;
    this.zzacC = paramCastApi;
    this.zzacD = paramGoogleApiClient;
    localObject1 = paramGoogleApiClient.getContext().getApplicationContext();
    localObject2 = Locale.ROOT;
    Object localObject3 = new Object[2];
    String str = ((Context)localObject1).getPackageName();
    localObject3[0] = str;
    localObject3[1] = "game_manager_channel_data";
    localObject2 = String.format((Locale)localObject2, "%s.%s", (Object[])localObject3);
    localObject1 = ((Context)localObject1).getApplicationContext().getSharedPreferences((String)localObject2, 0);
    this.zzvx = ((SharedPreferences)localObject1);
    this.zzacH = null;
    localObject1 = new com/google/android/gms/internal/zzlm;
    localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    ((zzlm)localObject1).<init>(0, 0, "", null, (Collection)localObject3, "", -1);
    this.zzacG = ((GameManagerState)localObject1);
  }
  
  private JSONObject zza(long paramLong, String paramString, int paramInt, JSONObject paramJSONObject)
  {
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject = "requestId";
      localJSONObject.put((String)localObject, paramLong);
      localObject = "type";
      localJSONObject.put((String)localObject, paramInt);
      localObject = "extraMessageData";
      localJSONObject.put((String)localObject, paramJSONObject);
      localObject = "playerId";
      localJSONObject.put((String)localObject, paramString);
      localObject = "playerToken";
      str2 = zzce(paramString);
      localJSONObject.put((String)localObject, str2);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        Object localObject = zzaaf;
        String str2 = "JSONException when trying to create a message: %s";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        String str1 = localJSONException.getMessage();
        arrayOfObject[0] = str1;
        ((zzl)localObject).zzf(str2, arrayOfObject);
        str1 = null;
      }
    }
    return localJSONObject;
  }
  
  private void zza(zzlk paramzzlk)
  {
    int i = 1;
    for (;;)
    {
      ArrayList localArrayList;
      try
      {
        int k = paramzzlk.zznY();
        if (k == i)
        {
          localObject1 = this.zzacG;
          this.zzacH = ((GameManagerState)localObject1);
          if (i != 0)
          {
            localObject2 = paramzzlk.zzod();
            if (localObject2 != null)
            {
              localObject2 = paramzzlk.zzod();
              this.zzacE = ((zzlj)localObject2);
            }
          }
          i = isInitialized();
          if (i != 0) {}
        }
        else
        {
          i = 0;
          localObject2 = null;
          continue;
        }
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject2 = paramzzlk.zzoa();
        localObject1 = ((List)localObject2).iterator();
        i = ((Iterator)localObject1).hasNext();
        if (i != 0)
        {
          localObject2 = ((Iterator)localObject1).next();
          localObject2 = (zzlo)localObject2;
          String str = ((zzlo)localObject2).getPlayerId();
          localObject5 = new com/google/android/gms/internal/zzln;
          int n = ((zzlo)localObject2).getPlayerState();
          localObject2 = ((zzlo)localObject2).getPlayerData();
          localObject6 = this.zzacz;
          boolean bool = ((Map)localObject6).containsKey(str);
          ((zzln)localObject5).<init>(str, n, (JSONObject)localObject2, bool);
          localArrayList.add(localObject5);
          continue;
        }
        localObject4 = new com/google/android/gms/internal/zzlm;
      }
      finally {}
      int m = paramzzlk.getLobbyState();
      int i1 = paramzzlk.getGameplayState();
      Object localObject5 = paramzzlk.zzob();
      JSONObject localJSONObject = paramzzlk.getGameData();
      Object localObject6 = this.zzacE;
      localObject6 = ((zzlj)localObject6).zznX();
      zzlj localzzlj = this.zzacE;
      int i2 = localzzlj.getMaxPlayers();
      ((zzlm)localObject4).<init>(m, i1, (String)localObject5, localJSONObject, localArrayList, (String)localObject6, i2);
      this.zzacG = ((GameManagerState)localObject4);
      Object localObject4 = this.zzacG;
      Object localObject1 = paramzzlk.getPlayerId();
      localObject4 = ((GameManagerState)localObject4).getPlayer((String)localObject1);
      if (localObject4 != null)
      {
        i = ((PlayerInfo)localObject4).isControllable();
        if (i != 0)
        {
          int j = paramzzlk.zznY();
          m = 2;
          if (j == m)
          {
            localObject4 = paramzzlk.getPlayerId();
            this.zzacI = ((String)localObject4);
            localObject4 = paramzzlk.getExtraMessageData();
            this.zzacJ = ((JSONObject)localObject4);
          }
        }
      }
    }
  }
  
  private void zza(String paramString, int paramInt, JSONObject paramJSONObject, zzo paramzzo)
  {
    long l1 = this.zzacK;
    long l2 = 1L + l1;
    this.zzacK = l2;
    Object localObject1 = this;
    Object localObject2 = paramString;
    Object localObject3 = zza(l2, paramString, paramInt, paramJSONObject);
    if (localObject3 == null)
    {
      l1 = -1;
      paramzzo.zza(l1, 2001, null);
      localObject3 = zzaaf;
      localObject1 = "Not sending request because it was invalid.";
      Object[] arrayOfObject = new Object[0];
      ((zzl)localObject3).zzf((String)localObject1, arrayOfObject);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/cast/internal/zzp;
      long l3 = 30000L;
      ((zzp)localObject1).<init>(l3);
      ((zzp)localObject1).zza(l2, paramzzo);
      this.zzacA.add(localObject1);
      boolean bool = true;
      zzW(bool);
      localObject1 = this.zzacC;
      localObject2 = this.zzacD;
      String str = getNamespace();
      localObject3 = ((JSONObject)localObject3).toString();
      localObject3 = ((Cast.CastApi)localObject1).sendMessage((GoogleApiClient)localObject2, str, (String)localObject3);
      localObject1 = new com/google/android/gms/internal/zzli$4;
      ((zzli.4)localObject1).<init>(this, l2);
      ((PendingResult)localObject3).setResultCallback((ResultCallback)localObject1);
    }
  }
  
  private void zzb(long paramLong, int paramInt, Object paramObject)
  {
    Object localObject = this.zzacA;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzp)localIterator.next();
      bool = ((zzp)localObject).zzc(paramLong, paramInt, paramObject);
      if (bool) {
        localIterator.remove();
      }
    }
  }
  
  private int zzbg(int paramInt)
  {
    int i = 0;
    Object[] arrayOfObject = null;
    switch (paramInt)
    {
    default: 
      zzl localzzl = zzaaf;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Unknown GameManager protocol status code: ";
      localObject = str + paramInt;
      arrayOfObject = new Object[0];
      localzzl.zzf((String)localObject, arrayOfObject);
      i = 13;
    }
    for (;;)
    {
      return i;
      i = 2151;
      continue;
      i = 2150;
      continue;
      i = 2003;
      continue;
      i = 2001;
    }
  }
  
  private void zznR()
  {
    String str;
    try
    {
      bool = isInitialized();
      if (!bool)
      {
        IllegalStateException localIllegalStateException1 = new java/lang/IllegalStateException;
        str = "Attempted to perform an operation on the GameManagerChannel before it is initialized.";
        localIllegalStateException1.<init>(str);
        throw localIllegalStateException1;
      }
    }
    finally {}
    boolean bool = isDisposed();
    if (bool)
    {
      IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
      str = "Attempted to perform an operation on the GameManagerChannel after it has been disposed.";
      localIllegalStateException2.<init>(str);
      throw localIllegalStateException2;
    }
  }
  
  private void zznS()
  {
    Object localObject1 = this.zzacL;
    if (localObject1 != null)
    {
      localObject1 = this.zzacH;
      Object localObject2;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject1 = this.zzacG;
        localObject2 = this.zzacH;
        boolean bool = localObject1.equals(localObject2);
        if (!bool)
        {
          localObject1 = this.zzacL;
          localObject2 = this.zzacG;
          localObject3 = this.zzacH;
          ((GameManagerClient.Listener)localObject1).onStateChanged((GameManagerState)localObject2, (GameManagerState)localObject3);
        }
      }
      localObject1 = this.zzacJ;
      if (localObject1 != null)
      {
        localObject1 = this.zzacI;
        if (localObject1 != null)
        {
          localObject1 = this.zzacL;
          localObject2 = this.zzacI;
          localObject3 = this.zzacJ;
          ((GameManagerClient.Listener)localObject1).onGameMessageReceived((String)localObject2, (JSONObject)localObject3);
        }
      }
    }
    this.zzacH = null;
    this.zzacI = null;
    this.zzacJ = null;
  }
  
  private void zznT()
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      localObject3 = "castSessionId";
      localObject4 = this.zzacB;
      ((JSONObject)localObject1).put((String)localObject3, localObject4);
      localObject3 = "playerTokenMap";
      localObject4 = new org/json/JSONObject;
      localObject5 = this.zzacz;
      ((JSONObject)localObject4).<init>((Map)localObject5);
      ((JSONObject)localObject1).put((String)localObject3, localObject4);
      localObject3 = this.zzvx;
      localObject3 = ((SharedPreferences)localObject3).edit();
      localObject4 = "save_data";
      localObject1 = ((JSONObject)localObject1).toString();
      localObject1 = ((SharedPreferences.Editor)localObject3).putString((String)localObject4, (String)localObject1);
      ((SharedPreferences.Editor)localObject1).commit();
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject3 = zzaaf;
        Object localObject4 = "Error while saving data: %s";
        int i = 1;
        Object localObject5 = new Object[i];
        String str = localJSONException.getMessage();
        localObject5[0] = str;
        ((zzl)localObject3).zzf((String)localObject4, (Object[])localObject5);
      }
    }
    finally {}
  }
  
  private void zznU()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.zzvx;
        Object localObject3 = "save_data";
        Object localObject4 = null;
        localObject1 = ((SharedPreferences)localObject1).getString((String)localObject3, null);
        if (localObject1 == null) {
          return;
        }
        try
        {
          localObject3 = new org/json/JSONObject;
          ((JSONObject)localObject3).<init>((String)localObject1);
          localObject1 = "castSessionId";
          localObject1 = ((JSONObject)localObject3).getString((String)localObject1);
          localObject4 = this.zzacB;
          boolean bool = ((String)localObject4).equals(localObject1);
          if (!bool) {
            continue;
          }
          localObject1 = "playerTokenMap";
          localObject3 = ((JSONObject)localObject3).getJSONObject((String)localObject1);
          localObject4 = ((JSONObject)localObject3).keys();
          bool = ((Iterator)localObject4).hasNext();
          if (bool)
          {
            localObject1 = ((Iterator)localObject4).next();
            localObject1 = (String)localObject1;
            localObject5 = this.zzacz;
            str2 = ((JSONObject)localObject3).getString((String)localObject1);
            ((Map)localObject5).put(localObject1, str2);
            continue;
          }
        }
        catch (JSONException localJSONException)
        {
          localObject3 = zzaaf;
          localObject4 = "Error while loading data: %s";
          int i = 1;
          Object localObject5 = new Object[i];
          String str2 = null;
          String str1 = localJSONException.getMessage();
          localObject5[0] = str1;
          ((zzl)localObject3).zzf((String)localObject4, (Object[])localObject5);
        }
        l = 0L;
      }
      finally {}
      long l;
      this.zzacK = l;
    }
  }
  
  /* Error */
  public void dispose()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 68	com/google/android/gms/internal/zzli:zzacF	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: iconst_0
    //   15: istore_1
    //   16: aconst_null
    //   17: astore_2
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 160	com/google/android/gms/internal/zzli:zzacG	Lcom/google/android/gms/cast/games/GameManagerState;
    //   23: iconst_0
    //   24: istore_1
    //   25: aconst_null
    //   26: astore_2
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 151	com/google/android/gms/internal/zzli:zzacH	Lcom/google/android/gms/cast/games/GameManagerState;
    //   32: iconst_0
    //   33: istore_1
    //   34: aconst_null
    //   35: astore_2
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 297	com/google/android/gms/internal/zzli:zzacI	Ljava/lang/String;
    //   41: iconst_0
    //   42: istore_1
    //   43: aconst_null
    //   44: astore_2
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 302	com/google/android/gms/internal/zzli:zzacJ	Lorg/json/JSONObject;
    //   50: iconst_1
    //   51: istore_1
    //   52: aload_0
    //   53: iload_1
    //   54: putfield 68	com/google/android/gms/internal/zzli:zzacF	Z
    //   57: aload_0
    //   58: getfield 108	com/google/android/gms/internal/zzli:zzacC	Lcom/google/android/gms/cast/Cast$CastApi;
    //   61: astore_2
    //   62: aload_0
    //   63: getfield 110	com/google/android/gms/internal/zzli:zzacD	Lcom/google/android/gms/common/api/GoogleApiClient;
    //   66: astore_3
    //   67: aload_0
    //   68: invokevirtual 335	com/google/android/gms/internal/zzli:getNamespace	()Ljava/lang/String;
    //   71: astore 4
    //   73: aload_2
    //   74: aload_3
    //   75: aload 4
    //   77: invokeinterface 460 3 0
    //   82: goto -71 -> 11
    //   85: astore_2
    //   86: getstatic 54	com/google/android/gms/internal/zzli:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   89: astore_3
    //   90: ldc_w 462
    //   93: astore 4
    //   95: iconst_1
    //   96: istore 5
    //   98: iload 5
    //   100: anewarray 130	java/lang/Object
    //   103: astore 6
    //   105: aload 6
    //   107: iconst_0
    //   108: aload_2
    //   109: aastore
    //   110: aload_3
    //   111: aload 4
    //   113: aload 6
    //   115: invokevirtual 201	com/google/android/gms/cast/internal/zzl:zzf	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: goto -107 -> 11
    //   121: astore_2
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_2
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	zzli
    //   6	48	1	bool	boolean
    //   17	57	2	localCastApi	Cast.CastApi
    //   85	24	2	localIOException	java.io.IOException
    //   121	4	2	localObject1	Object
    //   66	45	3	localObject2	Object
    //   71	41	4	str	String
    //   96	3	5	i	int
    //   103	11	6	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   57	61	85	java/io/IOException
    //   62	66	85	java/io/IOException
    //   67	71	85	java/io/IOException
    //   75	82	85	java/io/IOException
    //   2	6	121	finally
    //   19	23	121	finally
    //   28	32	121	finally
    //   37	41	121	finally
    //   46	50	121	finally
    //   53	57	121	finally
    //   57	61	121	finally
    //   62	66	121	finally
    //   67	71	121	finally
    //   75	82	121	finally
    //   86	89	121	finally
    //   98	103	121	finally
    //   108	110	121	finally
    //   113	118	121	finally
  }
  
  public GameManagerState getCurrentState()
  {
    try
    {
      zznR();
      GameManagerState localGameManagerState = this.zzacG;
      return localGameManagerState;
    }
    finally {}
  }
  
  public String getLastUsedPlayerId()
  {
    try
    {
      zznR();
      String str = this.zzacM;
      return str;
    }
    finally {}
  }
  
  public boolean isDisposed()
  {
    try
    {
      boolean bool = this.zzacF;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isInitialized()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 162	com/google/android/gms/internal/zzli:zzacE	Lcom/google/android/gms/internal/zzlj;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: aconst_null
    //   20: astore_1
    //   21: goto -8 -> 13
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	zzli
    //   6	15	1	localzzlj	zzlj
    //   24	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	24	finally
  }
  
  /* Error */
  public void sendGameMessage(String paramString, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 467	com/google/android/gms/internal/zzli:zznR	()V
    //   6: aload_0
    //   7: getfield 70	com/google/android/gms/internal/zzli:zzacK	J
    //   10: lstore_3
    //   11: lconst_1
    //   12: lload_3
    //   13: ladd
    //   14: lstore 5
    //   16: aload_0
    //   17: lload 5
    //   19: putfield 70	com/google/android/gms/internal/zzli:zzacK	J
    //   22: bipush 7
    //   24: istore 7
    //   26: aload_0
    //   27: astore 8
    //   29: aload_0
    //   30: lload 5
    //   32: aload_1
    //   33: iload 7
    //   35: aload_2
    //   36: invokespecial 307	com/google/android/gms/internal/zzli:zza	(JLjava/lang/String;ILorg/json/JSONObject;)Lorg/json/JSONObject;
    //   39: astore 9
    //   41: aload 9
    //   43: ifnonnull +6 -> 49
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_0
    //   50: getfield 108	com/google/android/gms/internal/zzli:zzacC	Lcom/google/android/gms/cast/Cast$CastApi;
    //   53: astore 8
    //   55: aload_0
    //   56: getfield 110	com/google/android/gms/internal/zzli:zzacD	Lcom/google/android/gms/common/api/GoogleApiClient;
    //   59: astore 10
    //   61: aload_0
    //   62: invokevirtual 335	com/google/android/gms/internal/zzli:getNamespace	()Ljava/lang/String;
    //   65: astore 11
    //   67: aload 9
    //   69: invokevirtual 338	org/json/JSONObject:toString	()Ljava/lang/String;
    //   72: astore 9
    //   74: aload 8
    //   76: aload 10
    //   78: aload 11
    //   80: aload 9
    //   82: invokeinterface 344 4 0
    //   87: pop
    //   88: goto -42 -> 46
    //   91: astore 9
    //   93: aload_0
    //   94: monitorexit
    //   95: aload 9
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	zzli
    //   0	98	1	paramString	String
    //   0	98	2	paramJSONObject	JSONObject
    //   10	3	3	l1	long
    //   14	17	5	l2	long
    //   24	10	7	i	int
    //   27	48	8	localObject1	Object
    //   39	42	9	localObject2	Object
    //   91	5	9	localObject3	Object
    //   59	18	10	localGoogleApiClient	GoogleApiClient
    //   65	14	11	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	91	finally
    //   6	10	91	finally
    //   17	22	91	finally
    //   35	39	91	finally
    //   49	53	91	finally
    //   55	59	91	finally
    //   61	65	91	finally
    //   67	72	91	finally
    //   80	88	91	finally
  }
  
  public PendingResult sendGameRequest(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      zznR();
      Object localObject1 = this.zzacD;
      zzli.3 local3 = new com/google/android/gms/internal/zzli$3;
      local3.<init>(this, paramString, paramJSONObject);
      localObject1 = ((GoogleApiClient)localObject1).zzb(local3);
      return (PendingResult)localObject1;
    }
    finally {}
  }
  
  public void setListener(GameManagerClient.Listener paramListener)
  {
    try
    {
      this.zzacL = paramListener;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public PendingResult zza(GameManagerClient paramGameManagerClient)
  {
    if (paramGameManagerClient == null) {
      try
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localObject3 = "gameManagerClient can't be null.";
        localIllegalArgumentException.<init>((String)localObject3);
        throw localIllegalArgumentException;
      }
      finally {}
    }
    Object localObject2 = this.zzacD;
    Object localObject3 = new com/google/android/gms/internal/zzli$1;
    ((zzli.1)localObject3).<init>(this, paramGameManagerClient);
    localObject2 = ((GoogleApiClient)localObject2).zzb((zza.zza)localObject3);
    return (PendingResult)localObject2;
  }
  
  public PendingResult zza(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    try
    {
      zznR();
      Object localObject1 = this.zzacD;
      zzli.2 local2 = new com/google/android/gms/internal/zzli$2;
      local2.<init>(this, paramInt, paramString, paramJSONObject);
      localObject1 = ((GoogleApiClient)localObject1).zzb(local2);
      return (PendingResult)localObject1;
    }
    finally {}
  }
  
  public void zzb(long paramLong, int paramInt)
  {
    zzb(paramLong, paramInt, null);
  }
  
  public String zzce(String paramString)
  {
    Object localObject1;
    if (paramString == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      try
      {
        localObject1 = this.zzacz;
        localObject1 = ((Map)localObject1).get(paramString);
        localObject1 = (String)localObject1;
      }
      finally {}
    }
  }
  
  public final void zzcf(String paramString)
  {
    int i = 1;
    Object localObject1 = zzaaf;
    Object localObject3 = "message received: %s";
    Object localObject4 = new Object[i];
    localObject4[0] = paramString;
    ((zzl)localObject1).zzb((String)localObject3, (Object[])localObject4);
    Object[] arrayOfObject;
    Object localObject5;
    Object localObject2;
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      localObject3 = zzlk.zzi((JSONObject)localObject1);
      if (localObject3 == null)
      {
        localObject1 = zzaaf;
        localObject3 = "Could not parse game manager message from string: %s";
        arrayOfObject = new Object[i];
        arrayOfObject[0] = paramString;
        ((zzl)localObject1).zzf((String)localObject3, arrayOfObject);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      boolean bool1;
      do
      {
        do
        {
          for (;;)
          {
            localObject3 = zzaaf;
            localObject4 = "Message is malformed (%s); ignoring: %s";
            int j = 2;
            localObject5 = new Object[j];
            localObject2 = localJSONException.getMessage();
            localObject5[0] = localObject2;
            localObject5[i] = paramString;
            ((zzl)localObject3).zzf((String)localObject4, (Object[])localObject5);
          }
          bool1 = isInitialized();
          if (bool1) {
            break;
          }
          localObject2 = ((zzlk)localObject3).zzod();
        } while (localObject2 == null);
        bool1 = isDisposed();
      } while (bool1);
      k = ((zzlk)localObject3).zznY();
      if (k != i) {
        break label308;
      }
    }
    int k = i;
    label175:
    Object localObject6;
    if (k != 0)
    {
      localObject4 = ((zzlk)localObject3).zzoc();
      boolean bool3 = TextUtils.isEmpty((CharSequence)localObject4);
      if (!bool3)
      {
        localObject4 = this.zzacz;
        localObject5 = ((zzlk)localObject3).getPlayerId();
        localObject6 = ((zzlk)localObject3).zzoc();
        ((Map)localObject4).put(localObject5, localObject6);
        zznT();
      }
    }
    int m = ((zzlk)localObject3).getStatusCode();
    if (m == 0) {
      zza((zzlk)localObject3);
    }
    for (;;)
    {
      i = ((zzlk)localObject3).getStatusCode();
      i = zzbg(i);
      if (k != 0)
      {
        long l = ((zzlk)localObject3).getRequestId();
        zzb(l, i, localObject3);
      }
      boolean bool2 = isInitialized();
      if ((!bool2) || (i != 0)) {
        break;
      }
      zznS();
      break;
      label308:
      bool2 = false;
      localObject2 = null;
      break label175;
      localObject4 = zzaaf;
      localObject5 = "Not updating from game message because the message contains error code: %d";
      arrayOfObject = new Object[i];
      int n = ((zzlk)localObject3).getStatusCode();
      localObject6 = Integer.valueOf(n);
      arrayOfObject[0] = localObject6;
      ((zzl)localObject4).zzf((String)localObject5, arrayOfObject);
    }
  }
  
  protected boolean zzz(long paramLong)
  {
    Object localObject1 = this.zzacA;
    Iterator localIterator1 = ((List)localObject1).iterator();
    boolean bool;
    for (;;)
    {
      bool = localIterator1.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzp)localIterator1.next();
      int i = 15;
      bool = ((zzp)localObject1).zzd(paramLong, i);
      if (bool) {
        localIterator1.remove();
      }
    }
    localIterator1 = null;
    for (;;)
    {
      synchronized (zzp.zzaeB)
      {
        localObject1 = this.zzacA;
        Iterator localIterator2 = ((List)localObject1).iterator();
        bool = localIterator2.hasNext();
        if (bool)
        {
          localObject1 = localIterator2.next();
          localObject1 = (zzp)localObject1;
          bool = ((zzp)localObject1).zzoA();
          if (!bool) {
            continue;
          }
          bool = true;
          return bool;
        }
      }
      bool = false;
      Object localObject3 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */