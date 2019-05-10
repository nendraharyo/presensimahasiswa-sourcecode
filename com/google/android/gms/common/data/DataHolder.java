package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class DataHolder
  implements SafeParcelable
{
  public static final zze CREATOR;
  private static final DataHolder.zza zzajq;
  boolean mClosed = false;
  private final int mVersionCode;
  private final int zzade;
  private final String[] zzaji;
  Bundle zzajj;
  private final CursorWindow[] zzajk;
  private final Bundle zzajl;
  int[] zzajm;
  int zzajn;
  private Object zzajo;
  private boolean zzajp;
  
  static
  {
    Object localObject = new com/google/android/gms/common/data/zze;
    ((zze)localObject).<init>();
    CREATOR = (zze)localObject;
    localObject = new com/google/android/gms/common/data/DataHolder$1;
    String[] arrayOfString = new String[0];
    ((DataHolder.1)localObject).<init>(arrayOfString, null);
    zzajq = (DataHolder.zza)localObject;
  }
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.zzajp = true;
    this.mVersionCode = paramInt1;
    this.zzaji = paramArrayOfString;
    this.zzajk = paramArrayOfCursorWindow;
    this.zzade = paramInt2;
    this.zzajl = paramBundle;
  }
  
  private DataHolder(DataHolder.zza paramzza, int paramInt, Bundle paramBundle)
  {
    this(arrayOfString, arrayOfCursorWindow, paramInt, paramBundle);
  }
  
  public DataHolder(String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt, Bundle paramBundle)
  {
    this.zzajp = i;
    this.mVersionCode = i;
    Object localObject = (String[])zzx.zzz(paramArrayOfString);
    this.zzaji = ((String[])localObject);
    localObject = (CursorWindow[])zzx.zzz(paramArrayOfCursorWindow);
    this.zzajk = ((CursorWindow[])localObject);
    this.zzade = paramInt;
    this.zzajl = paramBundle;
    zzqd();
  }
  
  public static DataHolder zza(int paramInt, Bundle paramBundle)
  {
    DataHolder localDataHolder = new com/google/android/gms/common/data/DataHolder;
    DataHolder.zza localzza = zzajq;
    localDataHolder.<init>(localzza, paramInt, paramBundle);
    return localDataHolder;
  }
  
  private static CursorWindow[] zza(DataHolder.zza paramzza, int paramInt)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int i = 0;
    Object localObject1 = DataHolder.zza.zza(paramzza);
    int j = localObject1.length;
    if (j == 0) {}
    label66:
    ArrayList localArrayList;
    label774:
    Object localObject2;
    for (localObject1 = new CursorWindow[0];; localObject2 = (CursorWindow[])localArrayList.toArray((Object[])localObject2))
    {
      for (;;)
      {
        return (CursorWindow[])localObject1;
        Object localObject3;
        Object localObject4;
        int i1;
        Object localObject5;
        int i2;
        if (paramInt >= 0)
        {
          localObject1 = DataHolder.zza.zzb(paramzza);
          j = ((ArrayList)localObject1).size();
          if (paramInt < j) {}
        }
        else
        {
          localObject1 = DataHolder.zza.zzb(paramzza);
          localObject3 = localObject1;
          int n = ((List)localObject3).size();
          localObject4 = new android/database/CursorWindow;
          ((CursorWindow)localObject4).<init>(false);
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localArrayList.add(localObject4);
          localObject1 = DataHolder.zza.zza(paramzza);
          j = localObject1.length;
          ((CursorWindow)localObject4).setNumColumns(j);
          i1 = 0;
          localObject5 = null;
          i2 = 0;
          if (i1 >= n) {
            break;
          }
        }
        try
        {
          boolean bool2 = ((CursorWindow)localObject4).allocRow();
          if (!bool2)
          {
            localObject1 = "DataHolder";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            localObject4 = "Allocating additional cursor window for large data set (row ";
            localObject6 = ((StringBuilder)localObject6).append((String)localObject4);
            localObject6 = ((StringBuilder)localObject6).append(i1);
            localObject4 = ")";
            localObject6 = ((StringBuilder)localObject6).append((String)localObject4);
            localObject6 = ((StringBuilder)localObject6).toString();
            Log.d((String)localObject1, (String)localObject6);
            localObject4 = new android/database/CursorWindow;
            bool2 = false;
            localObject1 = null;
            ((CursorWindow)localObject4).<init>(false);
            ((CursorWindow)localObject4).setStartPosition(i1);
            localObject1 = DataHolder.zza.zza(paramzza);
            int k = localObject1.length;
            ((CursorWindow)localObject4).setNumColumns(k);
            localArrayList.add(localObject4);
            boolean bool3 = ((CursorWindow)localObject4).allocRow();
            if (!bool3)
            {
              localObject1 = "DataHolder";
              localObject6 = "Unable to allocate row to hold data.";
              Log.e((String)localObject1, (String)localObject6);
              localArrayList.remove(localObject4);
              m = localArrayList.size();
              localObject1 = new CursorWindow[m];
              localObject1 = localArrayList.toArray((Object[])localObject1);
              localObject1 = (CursorWindow[])localObject1;
              continue;
              localObject1 = DataHolder.zza.zzb(paramzza).subList(0, paramInt);
              localObject3 = localObject1;
              break label66;
            }
          }
          localObject1 = ((List)localObject3).get(i1);
          localObject1 = (Map)localObject1;
          int i3 = 0;
          str = null;
          boolean bool4 = bool1;
          f2 = f1;
          String[] arrayOfString = DataHolder.zza.zza(paramzza);
          int i5 = arrayOfString.length;
          if ((i3 < i5) && (bool4))
          {
            localObject6 = DataHolder.zza.zza(paramzza);
            arrayOfString = localObject6[i3];
            localObject6 = ((Map)localObject1).get(arrayOfString);
            if (localObject6 == null) {
              bool4 = ((CursorWindow)localObject4).putNull(i1, i3);
            }
            for (;;)
            {
              i3 += 1;
              break;
              boolean bool6 = localObject6 instanceof String;
              if (bool6)
              {
                localObject6 = (String)localObject6;
                bool4 = ((CursorWindow)localObject4).putString((String)localObject6, i1, i3);
              }
              else
              {
                bool6 = localObject6 instanceof Long;
                long l;
                if (bool6)
                {
                  localObject6 = (Long)localObject6;
                  l = ((Long)localObject6).longValue();
                  bool4 = ((CursorWindow)localObject4).putLong(l, i1, i3);
                }
                else
                {
                  bool6 = localObject6 instanceof Integer;
                  if (bool6)
                  {
                    localObject6 = (Integer)localObject6;
                    int i4 = ((Integer)localObject6).intValue();
                    l = i4;
                    bool5 = ((CursorWindow)localObject4).putLong(l, i1, i3);
                  }
                  else
                  {
                    bool6 = localObject6 instanceof Boolean;
                    double d;
                    if (bool6)
                    {
                      localObject6 = (Boolean)localObject6;
                      bool5 = ((Boolean)localObject6).booleanValue();
                      if (bool5) {
                        l = 1L;
                      }
                      for (d = Double.MIN_VALUE;; d = 0.0D)
                      {
                        bool5 = ((CursorWindow)localObject4).putLong(l, i1, i3);
                        break;
                        l = 0L;
                      }
                    }
                    bool6 = localObject6 instanceof byte[];
                    if (bool6)
                    {
                      localObject6 = (byte[])localObject6;
                      localObject6 = (byte[])localObject6;
                      bool5 = ((CursorWindow)localObject4).putBlob((byte[])localObject6, i1, i3);
                    }
                    else
                    {
                      bool6 = localObject6 instanceof Double;
                      if (bool6)
                      {
                        localObject6 = (Double)localObject6;
                        d = ((Double)localObject6).doubleValue();
                        bool5 = ((CursorWindow)localObject4).putDouble(d, i1, i3);
                      }
                      else
                      {
                        bool6 = localObject6 instanceof Float;
                        if (!bool6) {
                          break label774;
                        }
                        localObject6 = (Float)localObject6;
                        f2 = ((Float)localObject6).floatValue();
                        d = f2;
                        bool5 = ((CursorWindow)localObject4).putDouble(d, i1, i3);
                      }
                    }
                  }
                }
              }
            }
            localObject1 = new java/lang/IllegalArgumentException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject5 = "Unsupported object for column ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
            localObject3 = ((StringBuilder)localObject3).append(arrayOfString);
            localObject5 = ": ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
            localObject6 = ((StringBuilder)localObject3).append(localObject6);
            localObject6 = ((StringBuilder)localObject6).toString();
            ((IllegalArgumentException)localObject1).<init>((String)localObject6);
            throw ((Throwable)localObject1);
          }
        }
        catch (RuntimeException localRuntimeException)
        {
          String str;
          float f2;
          boolean bool5;
          Object localObject6 = localRuntimeException;
          int i6 = localArrayList.size();
          while (i < i6)
          {
            localObject2 = (CursorWindow)localArrayList.get(i);
            ((CursorWindow)localObject2).close();
            i += 1;
            continue;
            if (!bool5)
            {
              if (i2 != 0)
              {
                localObject2 = "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.";
                localObject6 = new com/google/android/gms/common/data/DataHolder$zzb;
                ((DataHolder.zzb)localObject6).<init>((String)localObject2);
                throw ((Throwable)localObject6);
              }
              localObject2 = "DataHolder";
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              str = "Couldn't populate window data for row ";
              localObject6 = ((StringBuilder)localObject6).append(str);
              localObject6 = ((StringBuilder)localObject6).append(i1);
              str = " - allocating new window.";
              localObject6 = ((StringBuilder)localObject6).append(str);
              localObject6 = ((StringBuilder)localObject6).toString();
              Log.d((String)localObject2, (String)localObject6);
              ((CursorWindow)localObject4).freeLastRow();
              localObject6 = new android/database/CursorWindow;
              m = 0;
              localObject2 = null;
              ((CursorWindow)localObject6).<init>(false);
              ((CursorWindow)localObject6).setStartPosition(i1);
              localObject2 = DataHolder.zza.zza(paramzza);
              m = localObject2.length;
              ((CursorWindow)localObject6).setNumColumns(m);
              localArrayList.add(localObject6);
              m = i1 + -1;
              localObject5 = localObject6;
              bool5 = bool1;
              f2 = f1;
            }
            for (;;)
            {
              m += 1;
              i2 = bool5;
              localObject4 = localObject5;
              i1 = m;
              break;
              m = i1;
              bool5 = false;
              localObject6 = null;
              f2 = 0.0F;
              localObject5 = localObject4;
            }
          }
          throw ((Throwable)localObject6);
        }
      }
      int m = localArrayList.size();
      localObject2 = new CursorWindow[m];
    }
  }
  
  public static DataHolder zzbI(int paramInt)
  {
    return zza(paramInt, null);
  }
  
  private void zzg(String paramString, int paramInt)
  {
    Object localObject1 = this.zzajj;
    if (localObject1 != null)
    {
      localObject1 = this.zzajj;
      bool = ((Bundle)localObject1).containsKey(paramString);
      if (bool) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "No such column: " + paramString;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    boolean bool = isClosed();
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Buffer is closed.");
      throw ((Throwable)localObject1);
    }
    if (paramInt >= 0)
    {
      int i = this.zzajn;
      if (paramInt < i) {}
    }
    else
    {
      localObject1 = new android/database/CursorIndexOutOfBoundsException;
      int j = this.zzajn;
      ((CursorIndexOutOfBoundsException)localObject1).<init>(paramInt, j);
      throw ((Throwable)localObject1);
    }
  }
  
  public void close()
  {
    try
    {
      int i = this.mClosed;
      if (i == 0)
      {
        i = 1;
        this.mClosed = i;
        i = 0;
        Object localObject1 = null;
        for (;;)
        {
          Object localObject3 = this.zzajk;
          int k = localObject3.length;
          if (i >= k) {
            break;
          }
          localObject3 = this.zzajk;
          localObject3 = localObject3[i];
          ((CursorWindow)localObject3).close();
          int j;
          i += 1;
        }
      }
      return;
    }
    finally {}
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  /* Error */
  protected void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 51	com/google/android/gms/common/data/DataHolder:zzajp	Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifeq +128 -> 134
    //   9: aload_0
    //   10: getfield 57	com/google/android/gms/common/data/DataHolder:zzajk	[Landroid/database/CursorWindow;
    //   13: astore_2
    //   14: aload_2
    //   15: arraylength
    //   16: istore_1
    //   17: iload_1
    //   18: ifle +116 -> 134
    //   21: aload_0
    //   22: invokevirtual 270	com/google/android/gms/common/data/DataHolder:isClosed	()Z
    //   25: istore_1
    //   26: iload_1
    //   27: ifne +107 -> 134
    //   30: aload_0
    //   31: getfield 281	com/google/android/gms/common/data/DataHolder:zzajo	Ljava/lang/Object;
    //   34: astore_2
    //   35: aload_2
    //   36: ifnonnull +103 -> 139
    //   39: new 122	java/lang/StringBuilder
    //   42: astore_2
    //   43: aload_2
    //   44: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   47: ldc_w 283
    //   50: astore_3
    //   51: aload_2
    //   52: aload_3
    //   53: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: astore_2
    //   57: aload_0
    //   58: invokevirtual 284	java/lang/Object:toString	()Ljava/lang/String;
    //   61: astore_3
    //   62: aload_2
    //   63: aload_3
    //   64: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: astore_2
    //   68: aload_2
    //   69: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: astore_2
    //   73: ldc_w 286
    //   76: astore_3
    //   77: new 122	java/lang/StringBuilder
    //   80: astore 4
    //   82: aload 4
    //   84: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   87: ldc_w 288
    //   90: astore 5
    //   92: aload 4
    //   94: aload 5
    //   96: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: astore 4
    //   101: aload 4
    //   103: aload_2
    //   104: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: astore_2
    //   108: ldc -122
    //   110: astore 4
    //   112: aload_2
    //   113: aload 4
    //   115: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: astore_2
    //   124: aload_3
    //   125: aload_2
    //   126: invokestatic 153	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   129: pop
    //   130: aload_0
    //   131: invokevirtual 289	com/google/android/gms/common/data/DataHolder:close	()V
    //   134: aload_0
    //   135: invokespecial 292	java/lang/Object:finalize	()V
    //   138: return
    //   139: aload_0
    //   140: getfield 281	com/google/android/gms/common/data/DataHolder:zzajo	Ljava/lang/Object;
    //   143: astore_2
    //   144: aload_2
    //   145: invokevirtual 284	java/lang/Object:toString	()Ljava/lang/String;
    //   148: astore_2
    //   149: goto -76 -> 73
    //   152: astore_2
    //   153: aload_0
    //   154: invokespecial 292	java/lang/Object:finalize	()V
    //   157: aload_2
    //   158: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	DataHolder
    //   4	2	1	bool1	boolean
    //   16	2	1	i	int
    //   25	2	1	bool2	boolean
    //   13	136	2	localObject1	Object
    //   152	6	2	localObject2	Object
    //   50	75	3	str1	String
    //   80	34	4	localObject3	Object
    //   90	5	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	4	152	finally
    //   9	13	152	finally
    //   14	16	152	finally
    //   21	25	152	finally
    //   30	34	152	finally
    //   39	42	152	finally
    //   43	47	152	finally
    //   52	56	152	finally
    //   57	61	152	finally
    //   63	67	152	finally
    //   68	72	152	finally
    //   77	80	152	finally
    //   82	87	152	finally
    //   94	99	152	finally
    //   103	107	152	finally
    //   113	118	152	finally
    //   119	123	152	finally
    //   125	130	152	finally
    //   130	134	152	finally
    //   139	143	152	finally
    //   144	148	152	finally
  }
  
  public int getCount()
  {
    return this.zzajn;
  }
  
  public int getStatusCode()
  {
    return this.zzade;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean isClosed()
  {
    try
    {
      boolean bool = this.mClosed;
      return bool;
    }
    finally {}
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public void zza(String paramString, int paramInt1, int paramInt2, CharArrayBuffer paramCharArrayBuffer)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    localCursorWindow.copyStringToBuffer(paramInt1, i, paramCharArrayBuffer);
  }
  
  public long zzb(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    return localCursorWindow.getLong(paramInt1, i);
  }
  
  public int zzbH(int paramInt)
  {
    int i = 0;
    int j;
    if (paramInt >= 0)
    {
      j = this.zzajn;
      if (paramInt < j)
      {
        j = 1;
        zzx.zzab(j);
      }
    }
    for (;;)
    {
      int[] arrayOfInt = this.zzajm;
      j = arrayOfInt.length;
      if (i < j)
      {
        arrayOfInt = this.zzajm;
        j = arrayOfInt[i];
        if (paramInt < j) {
          i += -1;
        }
      }
      else
      {
        arrayOfInt = this.zzajm;
        j = arrayOfInt.length;
        if (i == j) {
          i += -1;
        }
        return i;
        j = 0;
        arrayOfInt = null;
        break;
      }
      i += 1;
    }
  }
  
  public int zzc(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    return localCursorWindow.getInt(paramInt1, i);
  }
  
  public boolean zzcz(String paramString)
  {
    return this.zzajj.containsKey(paramString);
  }
  
  public String zzd(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    return localCursorWindow.getString(paramInt1, i);
  }
  
  public boolean zze(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    Object localObject = this.zzajk[paramInt2];
    Bundle localBundle = this.zzajj;
    int i = localBundle.getInt(paramString);
    localObject = Long.valueOf(((CursorWindow)localObject).getLong(paramInt1, i));
    long l1 = ((Long)localObject).longValue();
    long l2 = 1L;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public float zzf(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    return localCursorWindow.getFloat(paramInt1, i);
  }
  
  public byte[] zzg(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    return localCursorWindow.getBlob(paramInt1, i);
  }
  
  public Uri zzh(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = zzd(paramString, paramInt1, paramInt2);
    if (localObject == null) {}
    for (localObject = null;; localObject = Uri.parse((String)localObject)) {
      return (Uri)localObject;
    }
  }
  
  public boolean zzi(String paramString, int paramInt1, int paramInt2)
  {
    zzg(paramString, paramInt1);
    CursorWindow localCursorWindow = this.zzajk[paramInt2];
    int i = this.zzajj.getInt(paramString);
    return localCursorWindow.isNull(paramInt1, i);
  }
  
  public Bundle zzpZ()
  {
    return this.zzajl;
  }
  
  public void zzqd()
  {
    int i = 0;
    Object localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    this.zzajj = ((Bundle)localObject1);
    int j = 0;
    localObject1 = null;
    Object localObject2;
    int k;
    Object localObject3;
    for (;;)
    {
      localObject2 = this.zzaji;
      k = localObject2.length;
      if (j >= k) {
        break;
      }
      localObject2 = this.zzajj;
      localObject3 = this.zzaji[j];
      ((Bundle)localObject2).putInt((String)localObject3, j);
      j += 1;
    }
    localObject1 = new int[this.zzajk.length];
    this.zzajm = ((int[])localObject1);
    j = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = this.zzajk;
      k = localObject2.length;
      if (i >= k) {
        break;
      }
      this.zzajm[i] = j;
      localObject2 = this.zzajk[i];
      k = ((CursorWindow)localObject2).getStartPosition();
      k = j - k;
      localObject3 = this.zzajk[i];
      int m = ((CursorWindow)localObject3).getNumRows();
      k = m - k;
      j += k;
      i += 1;
    }
    this.zzajn = j;
  }
  
  String[] zzqe()
  {
    return this.zzaji;
  }
  
  CursorWindow[] zzqf()
  {
    return this.zzajk;
  }
  
  public void zzu(Object paramObject)
  {
    this.zzajo = paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\DataHolder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */