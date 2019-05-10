package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.internal.zzna;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity
  implements SafeParcelable, SnapshotContents
{
  public static final SnapshotContentsEntityCreator CREATOR;
  private static final Object zzaKK;
  private final int mVersionCode;
  private Contents zzara;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzaKK = localObject;
    localObject = new com/google/android/gms/games/snapshot/SnapshotContentsEntityCreator;
    ((SnapshotContentsEntityCreator)localObject).<init>();
    CREATOR = (SnapshotContentsEntityCreator)localObject;
  }
  
  SnapshotContentsEntity(int paramInt, Contents paramContents)
  {
    this.mVersionCode = paramInt;
    this.zzara = paramContents;
  }
  
  public SnapshotContentsEntity(Contents paramContents)
  {
    this(1, paramContents);
  }
  
  private boolean zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = isClosed();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      zzx.zza(bool2, "Must provide a previously opened SnapshotContents");
      Object localObject4;
      synchronized (zzaKK)
      {
        Object localObject2 = this.zzara;
        localObject2 = ((Contents)localObject2).getParcelFileDescriptor();
        localObject4 = new java/io/FileOutputStream;
        localObject2 = ((ParcelFileDescriptor)localObject2).getFileDescriptor();
        ((FileOutputStream)localObject4).<init>((FileDescriptor)localObject2);
        localObject2 = new java/io/BufferedOutputStream;
        ((BufferedOutputStream)localObject2).<init>((OutputStream)localObject4);
        try
        {
          localObject4 = ((FileOutputStream)localObject4).getChannel();
          long l = paramInt1;
          ((FileChannel)localObject4).position(l);
          ((OutputStream)localObject2).write(paramArrayOfByte, paramInt2, paramInt3);
          if (paramBoolean)
          {
            int i = paramArrayOfByte.length;
            l = i;
            ((FileChannel)localObject4).truncate(l);
          }
          ((OutputStream)localObject2).flush();
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            String str = "SnapshotContentsEntity";
            localObject4 = "Failed to write snapshot data";
            GamesLog.zza(str, (String)localObject4, localIOException);
            bool1 = false;
            str = null;
          }
        }
        return bool1;
        bool2 = false;
        localObject2 = null;
      }
    }
  }
  
  public void close()
  {
    this.zzara = null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    boolean bool = isClosed();
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zza(bool, "Cannot mutate closed contents!");
      return this.zzara.getParcelFileDescriptor();
    }
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean isClosed()
  {
    Contents localContents = this.zzara;
    boolean bool;
    if (localContents == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localContents = null;
    }
  }
  
  public boolean modifyBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfByte.length;
    return zza(paramInt1, paramArrayOfByte, paramInt2, i, false);
  }
  
  public byte[] readFully()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = isClosed();
    if (!bool2) {
      bool1 = true;
    }
    zzx.zza(bool1, "Must provide a previously opened Snapshot");
    synchronized (zzaKK)
    {
      localObject1 = this.zzara;
      localObject1 = ((Contents)localObject1).getParcelFileDescriptor();
      Object localObject4 = new java/io/FileInputStream;
      localObject1 = ((ParcelFileDescriptor)localObject1).getFileDescriptor();
      ((FileInputStream)localObject4).<init>((FileDescriptor)localObject1);
      localObject1 = new java/io/BufferedInputStream;
      ((BufferedInputStream)localObject1).<init>((InputStream)localObject4);
      try
      {
        localObject5 = ((FileInputStream)localObject4).getChannel();
        long l = 0L;
        ((FileChannel)localObject5).position(l);
        localObject5 = null;
        localObject1 = zzna.zza((InputStream)localObject1, false);
        localObject4 = ((FileInputStream)localObject4).getChannel();
        l = 0L;
        ((FileChannel)localObject4).position(l);
        return (byte[])localObject1;
      }
      catch (IOException localIOException)
      {
        localObject4 = "SnapshotContentsEntity";
        Object localObject5 = "Failed to read snapshot data";
        GamesLog.zzb((String)localObject4, (String)localObject5, localIOException);
        throw localIOException;
      }
    }
  }
  
  public boolean writeBytes(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return zza(0, paramArrayOfByte, 0, i, true);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotContentsEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public Contents zzsx()
  {
    return this.zzara;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotContentsEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */