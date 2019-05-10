package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Toast;
import id.ac.ugm.presensi.presensimahasiswa.utils.Activities.c.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class d
{
  private static final String a = d.class.getSimpleName();
  private final MifareClassic b;
  private SparseArray c;
  private int d;
  private int e;
  private int f;
  private ArrayList g;
  
  private d(Tag paramTag)
  {
    Object localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.c = ((SparseArray)localObject);
    this.d = 0;
    int i = -1;
    this.e = i;
    this.f = 0;
    try
    {
      localObject = MifareClassic.get(paramTag);
      this.b = ((MifareClassic)localObject);
      return;
    }
    catch (Exception localException)
    {
      Log.e(a, "Could not create Open Card reader for theprovided tag (even after patching it).");
      throw localException;
    }
  }
  
  public static Tag a(Tag paramTag)
  {
    if (paramTag == null) {
      paramTag = null;
    }
    for (;;)
    {
      return paramTag;
      String[] arrayOfString = paramTag.getTechList();
      Parcel localParcel = Parcel.obtain();
      paramTag.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      int i = localParcel.readInt();
      int j = 0;
      Object localObject1 = new byte[0];
      if (i >= 0)
      {
        localObject1 = new byte[i];
        localParcel.readByteArray((byte[])localObject1);
      }
      Object localObject2 = localObject1;
      j = localParcel.readInt();
      int[] arrayOfInt = new int[j];
      localParcel.readIntArray(arrayOfInt);
      localObject1 = Bundle.CREATOR;
      localObject1 = (Bundle[])localParcel.createTypedArray((Parcelable.Creator)localObject1);
      int k = localParcel.readInt();
      int m = localParcel.readInt();
      IBinder localIBinder;
      int n;
      int i1;
      short s;
      label138:
      String str1;
      String str2;
      boolean bool2;
      String str3;
      if (m == 0)
      {
        localIBinder = localParcel.readStrongBinder();
        localParcel.recycle();
        n = -1;
        i1 = -1;
        s = 0;
        i2 = 1;
        i3 = 0;
        localParcel = null;
        int i4 = arrayOfString.length;
        if (i3 >= i4) {
          break label323;
        }
        str1 = arrayOfString[i3];
        str2 = NfcA.class.getName();
        boolean bool1 = str1.equals(str2);
        if (!bool1) {
          break label289;
        }
        int i5 = -1;
        if (n == i5) {
          n = i3;
        }
        str1 = localObject1[i3];
        if (str1 != null)
        {
          str1 = localObject1[i3];
          str2 = "sak";
          bool2 = str1.containsKey(str2);
          if (bool2)
          {
            str3 = localObject1[i3];
            str1 = "sak";
            i2 = str3.getShort(str1) | s;
            s = (short)i2;
            if (n != i3) {
              break label280;
            }
            i2 = 1;
          }
        }
      }
      for (;;)
      {
        i3 += 1;
        break label138;
        localIBinder = null;
        break;
        label280:
        i2 = 0;
        str3 = null;
        continue;
        label289:
        str1 = arrayOfString[i3];
        str2 = MifareClassic.class.getName();
        bool2 = str1.equals(str2);
        if (bool2) {
          i1 = i3;
        }
      }
      label323:
      int i3 = 0;
      localParcel = null;
      if (i2 == 0)
      {
        localParcel = localObject1[n];
        str3 = "sak";
        localParcel.putShort(str3, s);
        i3 = 1;
      }
      int i2 = -1;
      if (n != i2)
      {
        i2 = -1;
        if (i1 != i2)
        {
          str3 = localObject1[i1];
          if (str3 == null)
          {
            localParcel = localObject1[n];
            localObject1[i1] = localParcel;
            i3 = 1;
          }
        }
      }
      if (i3 != 0)
      {
        localParcel = Parcel.obtain();
        i2 = localObject2.length;
        localParcel.writeInt(i2);
        localParcel.writeByteArray((byte[])localObject2);
        i = arrayOfInt.length;
        localParcel.writeInt(i);
        localParcel.writeIntArray(arrayOfInt);
        i = 0;
        localObject2 = null;
        localParcel.writeTypedArray((Parcelable[])localObject1, 0);
        localParcel.writeInt(k);
        localParcel.writeInt(m);
        if (m == 0) {
          localParcel.writeStrongBinder(localIBinder);
        }
        j = 0;
        localParcel.setDataPosition(0);
        localObject1 = (Tag)Tag.CREATOR.createFromParcel(localParcel);
        localParcel.recycle();
        paramTag = (Tag)localObject1;
      }
    }
  }
  
  private boolean a(byte[] paramArrayOfByte)
  {
    int i = 2;
    int j = 1;
    int m = (byte)((paramArrayOfByte[j] & 0x80) >>> 7);
    int n = (byte)((paramArrayOfByte[i] & 0x8) >>> 3);
    i = (byte)((paramArrayOfByte[i] & 0x80) >>> 7);
    if (((m == 0) && (n == 0) && (i == 0)) || ((n == j) && (i == 0)) || ((n == 0) && (i == j))) {}
    for (;;)
    {
      return j;
      int k = 0;
    }
  }
  
  public static d b(Tag paramTag)
  {
    Object localObject = null;
    d locald;
    if (paramTag != null)
    {
      locald = new id/ac/ugm/presensi/presensimahasiswa/utils/d;
      locald.<init>(paramTag);
      boolean bool = locald.c();
      if (bool) {
        break label28;
      }
    }
    for (;;)
    {
      return (d)localObject;
      locald = null;
      label28:
      localObject = locald;
    }
  }
  
  private boolean b(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    Object localObject = Common.b();
    str2 = c.a.f.toString();
    boolean bool1 = true;
    boolean bool2 = ((SharedPreferences)localObject).getBoolean(str2, bool1);
    if (!paramBoolean) {}
    for (;;)
    {
      try
      {
        localObject = this.b;
        bool3 = ((MifareClassic)localObject).authenticateSectorWithKeyA(paramInt, paramArrayOfByte);
        if ((bool2) && (!bool3))
        {
          localObject = this.b;
          bool3 = ((MifareClassic)localObject).authenticateSectorWithKeyA(paramInt, paramArrayOfByte);
        }
      }
      catch (IOException localIOException)
      {
        String str1 = a;
        str2 = "Error authenticating with tag.";
        Log.d(str1, str2);
        boolean bool3 = false;
        str1 = null;
        continue;
      }
      return bool3;
      localObject = this.b;
      bool3 = ((MifareClassic)localObject).authenticateSectorWithKeyB(paramInt, paramArrayOfByte);
      if ((bool2) && (!bool3))
      {
        localObject = this.b;
        bool3 = ((MifareClassic)localObject).authenticateSectorWithKeyB(paramInt, paramArrayOfByte);
      }
    }
  }
  
  public int a()
  {
    int i = 2;
    int m = -1;
    int n = 1;
    int i1 = this.d;
    int i3 = 3;
    if (i1 == i3)
    {
      i1 = 6;
      this.d = i1;
    }
    Object localObject1 = this.g;
    Object localObject3;
    boolean bool4;
    boolean bool5;
    byte[][] arrayOfByte;
    boolean[] arrayOfBoolean;
    Object localObject4;
    if (localObject1 != null)
    {
      i1 = this.e;
      if (i1 != m)
      {
        i1 = this.d;
        i3 = this.e + 1;
        if (i1 == i3)
        {
          i1 = this.f;
          this.d = i1;
          localObject1 = new android/util/SparseArray;
          ((SparseArray)localObject1).<init>();
          this.c = ((SparseArray)localObject1);
        }
        localObject1 = Common.b();
        localObject3 = c.a.a.toString();
        bool4 = ((SharedPreferences)localObject1).getBoolean((String)localObject3, false);
        localObject1 = Common.b();
        localObject3 = c.a.f.toString();
        bool5 = ((SharedPreferences)localObject1).getBoolean((String)localObject3, n);
        arrayOfByte = new byte[i][];
        arrayOfBoolean = new boolean[i];
        boolean[] tmp167_165 = arrayOfBoolean;
        tmp167_165[0] = 0;
        tmp167_165[1] = 0;
        i3 = 0;
        localObject3 = null;
        localObject1 = this.g;
        i1 = ((ArrayList)localObject1).size();
        if (i3 >= i1) {
          break label726;
        }
        localObject1 = (byte[])this.g.get(i3);
        i = 0;
        localObject4 = null;
      }
    }
    for (;;)
    {
      try
      {
        i = arrayOfBoolean[0];
        int i4;
        if (i == 0)
        {
          localObject4 = this.b;
          i4 = this.d;
          bool1 = ((MifareClassic)localObject4).authenticateSectorWithKeyA(i4, (byte[])localObject1);
          if ((bool5) && (!bool1))
          {
            localObject4 = this.b;
            i4 = this.d;
            bool1 = ((MifareClassic)localObject4).authenticateSectorWithKeyA(i4, (byte[])localObject1);
          }
          if (bool1)
          {
            bool1 = false;
            localObject4 = null;
            arrayOfByte[0] = localObject1;
            bool1 = false;
            localObject4 = null;
            i4 = 1;
            arrayOfBoolean[0] = i4;
          }
        }
        boolean bool1 = true;
        int j = arrayOfBoolean[bool1];
        if (j == 0)
        {
          localObject4 = this.b;
          i4 = this.d;
          boolean bool2 = ((MifareClassic)localObject4).authenticateSectorWithKeyB(i4, (byte[])localObject1);
          if ((bool5) && (!bool2))
          {
            localObject4 = this.b;
            i4 = this.d;
            bool2 = ((MifareClassic)localObject4).authenticateSectorWithKeyB(i4, (byte[])localObject1);
          }
          if (bool2)
          {
            bool2 = true;
            arrayOfByte[bool2] = localObject1;
            i1 = 1;
            bool2 = true;
            arrayOfBoolean[i1] = bool2;
          }
        }
        i1 = arrayOfBoolean[0];
        if (i1 == 0) {
          break label691;
        }
        i1 = arrayOfBoolean[n];
        if (i1 == 0) {
          break label691;
        }
        i1 = 0;
        localObject1 = null;
        if (i1 == 0)
        {
          i3 = arrayOfBoolean[0];
          if (i3 == 0)
          {
            i3 = arrayOfBoolean[n];
            if (i3 == 0) {}
          }
          else
          {
            localObject3 = this.c;
            int k = this.d;
            ((SparseArray)localObject3).put(k, arrayOfByte);
            i3 = arrayOfBoolean[0];
            if (i3 != 0)
            {
              localObject3 = this.g;
              localObject4 = arrayOfByte[0];
              ((ArrayList)localObject3).remove(localObject4);
              localObject3 = this.g;
              localObject4 = arrayOfByte[0];
              ((ArrayList)localObject3).add(0, localObject4);
            }
            i3 = arrayOfBoolean[n];
            if (i3 != 0)
            {
              localObject3 = this.g;
              localObject4 = arrayOfByte[n];
              ((ArrayList)localObject3).remove(localObject4);
              localObject3 = this.g;
              byte[] arrayOfByte1 = arrayOfByte[n];
              ((ArrayList)localObject3).add(0, arrayOfByte1);
            }
          }
        }
        i3 = this.d + 1;
        this.d = i3;
        if (i1 == 0) {
          break label710;
        }
        this.d = 0;
        localObject1 = null;
        this.c = null;
        i1 = m;
        return i1;
      }
      catch (Exception localException)
      {
        str = a;
        localObject4 = "Error while building next key map part";
        Log.d(str, (String)localObject4);
        if (!bool4) {
          break label685;
        }
      }
      String str = a;
      localObject4 = "Auto reconnect is enabled";
      Log.d(str, (String)localObject4);
      label652:
      boolean bool3 = e();
      if (bool3) {
        break;
      }
      long l = 500L;
      try
      {
        Thread.sleep(l);
        try
        {
          f();
        }
        catch (IOException localIOException) {}
        break label652;
        label685:
        bool3 = n;
        continue;
        label691:
        i2 = i3 + 1;
        i3 = i2;
        break;
        i2 = n;
        continue;
        label710:
        i2 = this.d + -1;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      label726:
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public SparseArray a(SparseArray paramSparseArray)
  {
    int i = 1;
    int j;
    SparseArray localSparseArray1;
    SparseArray localSparseArray2;
    if (paramSparseArray != null)
    {
      j = paramSparseArray.size();
      if (j > 0)
      {
        localSparseArray1 = new android/util/SparseArray;
        j = paramSparseArray.size();
        localSparseArray1.<init>(j);
        int k = 0;
        for (;;)
        {
          j = paramSparseArray.size();
          if (k < j)
          {
            j = 2;
            Object localObject1 = new String[j][];
            try
            {
              Object localObject2 = paramSparseArray.valueAt(k);
              localObject2 = (byte[][])localObject2;
              int m = 0;
              String[] arrayOfString = null;
              localObject2 = localObject2[0];
              int n;
              boolean bool;
              if (localObject2 != null)
              {
                m = 0;
                arrayOfString = null;
                n = paramSparseArray.keyAt(k);
                localObject2 = paramSparseArray.valueAt(k);
                localObject2 = (byte[][])localObject2;
                bool = false;
                localObject2 = localObject2[0];
                bool = false;
                localObject2 = a(n, (byte[])localObject2, false);
                localObject1[0] = localObject2;
              }
              localObject2 = paramSparseArray.valueAt(k);
              localObject2 = (byte[][])localObject2;
              m = 1;
              localObject2 = localObject2[m];
              if (localObject2 != null)
              {
                m = 1;
                n = paramSparseArray.keyAt(k);
                localObject2 = paramSparseArray.valueAt(k);
                localObject2 = (byte[][])localObject2;
                bool = true;
                localObject2 = localObject2[bool];
                bool = true;
                localObject2 = a(n, (byte[])localObject2, bool);
                localObject1[m] = localObject2;
              }
              localObject2 = localObject1[0];
              if (localObject2 == null)
              {
                localObject2 = localObject1[i];
                if (localObject2 == null) {}
              }
              else
              {
                j = paramSparseArray.keyAt(k);
                arrayOfString = localObject1[0];
                localObject1 = localObject1[i];
                localObject1 = a(arrayOfString, (String[])localObject1);
                localSparseArray1.put(j, localObject1);
              }
              j = k + 1;
              k = j;
            }
            catch (TagLostException localTagLostException)
            {
              j = 0;
              localSparseArray2 = null;
            }
          }
        }
      }
    }
    for (;;)
    {
      return localSparseArray2;
      localSparseArray2 = localSparseArray1;
      continue;
      j = 0;
      localSparseArray2 = null;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      i = d();
      if ((paramInt2 < i) && (paramInt1 <= paramInt2))
      {
        this.f = paramInt1;
        this.e = paramInt2;
        i = paramInt2 + 1;
        this.d = i;
      }
    }
    for (int i = 1;; i = 0) {
      return i;
    }
  }
  
  public boolean a(File[] paramArrayOfFile, Context paramContext)
  {
    int i = 1;
    boolean bool1 = false;
    ArrayList localArrayList = null;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int k = paramArrayOfFile.length;
    int m = 0;
    int i1;
    if (m < k)
    {
      File localFile = paramArrayOfFile[m];
      String[] arrayOfString = Common.a(localFile, false, paramContext);
      if (arrayOfString != null)
      {
        int n = arrayOfString.length;
        i1 = 0;
        localFile = null;
        for (;;)
        {
          if (i1 < n)
          {
            Object localObject = arrayOfString[i1];
            String str = "";
            boolean bool2 = ((String)localObject).equals(str);
            if (!bool2)
            {
              int i2 = ((String)localObject).length();
              int i3 = 12;
              if (i2 == i3)
              {
                str = "[0-9A-Fa-f]+";
                boolean bool3 = ((String)localObject).matches(str);
                if (!bool3) {}
              }
            }
            try
            {
              localObject = Common.b((String)localObject);
              localHashSet.add(localObject);
              i1 += 1;
            }
            catch (OutOfMemoryError localOutOfMemoryError)
            {
              i1 = 2131689750;
              Toast localToast = Toast.makeText(paramContext, i1, i);
              localToast.show();
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      i1 = m + 1;
      m = i1;
      break;
      int j = localHashSet.size();
      if (j > 0)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>(localHashSet);
        this.g = localArrayList;
      }
      j = i;
    }
  }
  
  public String[] a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 20;
    int j = 16;
    int k = 12;
    boolean bool2 = b(paramInt, paramArrayOfByte, paramBoolean);
    Object localObject2;
    Object localObject3;
    int n;
    int m;
    Object localObject4;
    if (bool2)
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject3 = this.b;
      n = ((MifareClassic)localObject3).sectorToBlock(paramInt);
      m = n + 4;
      localObject4 = this.b;
      int i1 = ((MifareClassic)localObject4).getSize();
      int i2 = 4096;
      if (i1 == i2)
      {
        i1 = 31;
        if (paramInt > i1) {
          m = n + 16;
        }
      }
      i1 = n;
      for (;;)
      {
        if (i1 < m) {
          try
          {
            localObject5 = this.b;
            localObject5 = ((MifareClassic)localObject5).readBlock(i1);
            i2 = localObject5.length;
            if (i2 < j)
            {
              localObject5 = new java/io/IOException;
              ((IOException)localObject5).<init>();
              throw ((Throwable)localObject5);
            }
          }
          catch (TagLostException localTagLostException)
          {
            throw localTagLostException;
            i2 = localObject5.length;
            if (i2 > j)
            {
              i2 = 16;
              localObject5 = Arrays.copyOf((byte[])localObject5, i2);
            }
            Object localObject5 = Common.a((byte[])localObject5);
            ((ArrayList)localObject2).add(localObject5);
            n = i1 + 1;
            i1 = n;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              String str1 = a;
              Object localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject6 = ((StringBuilder)localObject6).append("(Recoverable) Error while reading block ").append(i1);
              String str2 = " from tag.";
              localObject6 = str2;
              Log.d(str1, (String)localObject6);
            }
          }
        }
      }
      m = ((ArrayList)localObject2).size();
      localObject3 = new String[m];
      localObject3 = (String[])((ArrayList)localObject2).toArray((Object[])localObject3);
      n = localObject3.length + -1;
      if (!paramBoolean)
      {
        localObject1 = Common.b(localObject3[n].substring(k, i));
        bool1 = a((byte[])localObject1);
        if (bool1)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = Common.a(paramArrayOfByte);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = localObject3[n];
          int i3 = 32;
          localObject4 = ((String)localObject4).substring(k, i3);
          localObject1 = (String)localObject4;
          localObject3[n] = localObject1;
        }
      }
    }
    for (;;)
    {
      return (String[])localObject3;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = Common.a(paramArrayOfByte);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = localObject3[n].substring(k, i);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = "------------";
      localObject1 = (String)localObject4;
      localObject3[n] = localObject1;
      continue;
      localObject4 = localObject3[0];
      localObject2 = "--------------------------------";
      boolean bool3 = ((String)localObject4).equals(localObject2);
      if (bool3)
      {
        m = 0;
        localObject3 = null;
      }
      else
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("------------");
        localObject4 = localObject3[n].substring(k, i);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject4 = Common.a(paramArrayOfByte);
        localObject1 = (String)localObject4;
        localObject3[n] = localObject1;
        continue;
        m = 0;
        localObject3 = null;
      }
    }
  }
  
  public String[] a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i = 0;
    String[] arrayOfString = null;
    int j = 20;
    boolean bool1 = false;
    Object localObject1 = null;
    int k;
    if ((paramArrayOfString1 != null) || (paramArrayOfString2 != null))
    {
      if ((paramArrayOfString1 == null) || (paramArrayOfString2 == null)) {
        break label49;
      }
      k = paramArrayOfString1.length;
      int m = paramArrayOfString2.length;
      if (k == m) {
        break label49;
      }
    }
    for (;;)
    {
      return arrayOfString;
      label49:
      Object localObject2;
      label74:
      String str1;
      String str2;
      boolean bool3;
      if (paramArrayOfString1 != null)
      {
        i = paramArrayOfString1.length;
        k = i;
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        i = 0;
        arrayOfString = null;
        int n = k + -1;
        if (i >= n) {
          break label223;
        }
        if (paramArrayOfString1 == null) {
          break label153;
        }
        str1 = paramArrayOfString1[i];
        if (str1 == null) {
          break label153;
        }
        str1 = paramArrayOfString1[i];
        str2 = "--------------------------------";
        bool3 = str1.equals(str2);
        if (bool3) {
          break label153;
        }
        str1 = paramArrayOfString1[i];
        ((ArrayList)localObject2).add(str1);
      }
      for (;;)
      {
        i += 1;
        break label74;
        i = paramArrayOfString2.length;
        k = i;
        break;
        label153:
        if (paramArrayOfString2 != null)
        {
          str1 = paramArrayOfString2[i];
          if (str1 != null)
          {
            str1 = paramArrayOfString2[i];
            str2 = "--------------------------------";
            bool3 = str1.equals(str2);
            if (!bool3)
            {
              str1 = paramArrayOfString2[i];
              ((ArrayList)localObject2).add(str1);
              continue;
            }
          }
        }
        str1 = "--------------------------------";
        ((ArrayList)localObject2).add(str1);
      }
      label223:
      i = ((ArrayList)localObject2).size() + 1;
      arrayOfString = new String[i];
      arrayOfString = (String[])((ArrayList)localObject2).toArray(arrayOfString);
      k += -1;
      if (paramArrayOfString1 != null)
      {
        localObject2 = paramArrayOfString1[k];
        if (localObject2 != null)
        {
          localObject2 = paramArrayOfString1[k];
          str1 = "--------------------------------";
          boolean bool2 = ((String)localObject2).equals(str1);
          if (!bool2)
          {
            localObject2 = paramArrayOfString1[k];
            arrayOfString[k] = localObject2;
            if (paramArrayOfString2 == null) {
              continue;
            }
            localObject2 = paramArrayOfString2[k];
            if (localObject2 == null) {
              continue;
            }
            localObject2 = paramArrayOfString2[k];
            str1 = "--------------------------------";
            bool2 = ((String)localObject2).equals(str1);
            if (bool2) {
              continue;
            }
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            str1 = arrayOfString[k];
            localObject1 = str1.substring(0, j);
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject2 = paramArrayOfString2[k].substring(j);
            localObject1 = (String)localObject2;
            arrayOfString[k] = localObject1;
            continue;
          }
        }
      }
      if (paramArrayOfString2 != null)
      {
        localObject1 = paramArrayOfString2[k];
        if (localObject1 != null)
        {
          localObject1 = paramArrayOfString2[k];
          localObject2 = "--------------------------------";
          bool1 = ((String)localObject1).equals(localObject2);
          if (!bool1)
          {
            localObject1 = paramArrayOfString2[k];
            arrayOfString[k] = localObject1;
            continue;
          }
        }
      }
      localObject1 = "--------------------------------";
      arrayOfString[k] = localObject1;
    }
  }
  
  public SparseArray b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    MifareClassic localMifareClassic = this.b;
    boolean bool;
    if (localMifareClassic != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMifareClassic = null;
    }
  }
  
  public int d()
  {
    Object localObject = Common.b();
    String str = c.a.c.toString();
    int i = 0;
    boolean bool = ((SharedPreferences)localObject).getBoolean(str, false);
    if (bool)
    {
      localObject = Common.b();
      str = c.a.d.toString();
      i = 16;
    }
    for (int j = ((SharedPreferences)localObject).getInt(str, i);; j = ((MifareClassic)localObject).getSectorCount())
    {
      return j;
      localObject = this.b;
    }
  }
  
  public boolean e()
  {
    return this.b.isConnected();
  }
  
  public void f()
  {
    try
    {
      MifareClassic localMifareClassic = this.b;
      localMifareClassic.connect();
      return;
    }
    catch (IOException localIOException)
    {
      Log.d(a, "Error while connecting to tag.");
      throw localIOException;
    }
  }
  
  public void g()
  {
    try
    {
      MifareClassic localMifareClassic = this.b;
      localMifareClassic.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = a;
        String str2 = "Error on closing tag.";
        Log.d(str1, str2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */