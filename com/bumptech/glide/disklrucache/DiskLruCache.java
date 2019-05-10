package com.bumptech.glide.disklrucache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class DiskLruCache
  implements Closeable
{
  static final long ANY_SEQUENCE_NUMBER = 255L;
  private static final String CLEAN = "CLEAN";
  private static final String DIRTY = "DIRTY";
  static final String JOURNAL_FILE = "journal";
  static final String JOURNAL_FILE_BACKUP = "journal.bkp";
  static final String JOURNAL_FILE_TEMP = "journal.tmp";
  static final String MAGIC = "libcore.io.DiskLruCache";
  private static final String READ = "READ";
  private static final String REMOVE = "REMOVE";
  static final String VERSION_1 = "1";
  private final int appVersion;
  private final Callable cleanupCallable;
  private final File directory;
  final ThreadPoolExecutor executorService;
  private final File journalFile;
  private final File journalFileBackup;
  private final File journalFileTmp;
  private Writer journalWriter;
  private final LinkedHashMap lruEntries;
  private long maxSize;
  private long nextSequenceNumber;
  private int redundantOpCount;
  private long size;
  private final int valueCount;
  
  private DiskLruCache(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.size = l;
    Object localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>(0, 0.75F, i);
    this.lruEntries = ((LinkedHashMap)localObject);
    this.nextSequenceNumber = l;
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    DiskLruCache.DiskLruCacheThreadFactory localDiskLruCacheThreadFactory = new com/bumptech/glide/disklrucache/DiskLruCache$DiskLruCacheThreadFactory;
    localDiskLruCacheThreadFactory.<init>(null);
    localThreadPoolExecutor.<init>(0, i, 60, localTimeUnit, localLinkedBlockingQueue, localDiskLruCacheThreadFactory);
    this.executorService = localThreadPoolExecutor;
    localObject = new com/bumptech/glide/disklrucache/DiskLruCache$1;
    ((DiskLruCache.1)localObject).<init>(this);
    this.cleanupCallable = ((Callable)localObject);
    this.directory = paramFile;
    this.appVersion = paramInt1;
    localObject = new java/io/File;
    ((File)localObject).<init>(paramFile, "journal");
    this.journalFile = ((File)localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(paramFile, "journal.tmp");
    this.journalFileTmp = ((File)localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(paramFile, "journal.bkp");
    this.journalFileBackup = ((File)localObject);
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
  }
  
  private void checkNotClosed()
  {
    Object localObject = this.journalWriter;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("cache is closed");
      throw ((Throwable)localObject);
    }
  }
  
  private void completeEdit(DiskLruCache.Editor paramEditor, boolean paramBoolean)
  {
    int i = 0;
    IllegalStateException localIllegalStateException = null;
    Object localObject3;
    Object localObject4;
    try
    {
      localObject3 = DiskLruCache.Editor.access$1500(paramEditor);
      localObject4 = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject3);
      if (localObject4 != paramEditor)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>();
        throw localIllegalStateException;
      }
    }
    finally {}
    Object localObject5;
    boolean bool2;
    if (paramBoolean)
    {
      int j = DiskLruCache.Entry.access$700((DiskLruCache.Entry)localObject3);
      if (j == 0)
      {
        j = 0;
        localObject4 = null;
        for (;;)
        {
          int m = this.valueCount;
          if (j >= m) {
            break;
          }
          localObject5 = DiskLruCache.Editor.access$1600(paramEditor);
          int n = localObject5[j];
          if (n == 0)
          {
            paramEditor.abort();
            localObject2 = new java/lang/IllegalStateException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject5 = "Newly created entry didn't create value for index ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
            localObject4 = ((StringBuilder)localObject3).append(j);
            localObject4 = ((StringBuilder)localObject4).toString();
            ((IllegalStateException)localObject2).<init>((String)localObject4);
            throw ((Throwable)localObject2);
          }
          localObject5 = ((DiskLruCache.Entry)localObject3).getDirtyFile(j);
          bool2 = ((File)localObject5).exists();
          if (!bool2)
          {
            paramEditor.abort();
            return;
          }
          j += 1;
        }
      }
    }
    int k = this.valueCount;
    long l1;
    if (i < k)
    {
      localObject4 = ((DiskLruCache.Entry)localObject3).getDirtyFile(i);
      if (paramBoolean)
      {
        bool2 = ((File)localObject4).exists();
        if (bool2)
        {
          localObject5 = ((DiskLruCache.Entry)localObject3).getCleanFile(i);
          ((File)localObject4).renameTo((File)localObject5);
          localObject4 = DiskLruCache.Entry.access$1100((DiskLruCache.Entry)localObject3);
          l1 = localObject4[i];
          long l2 = ((File)localObject5).length();
          localObject4 = DiskLruCache.Entry.access$1100((DiskLruCache.Entry)localObject3);
          localObject4[i] = l2;
          long l3 = this.size;
          l1 = l3 - l1 + l2;
          this.size = l1;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        deleteIfExists((File)localObject4);
      }
    }
    i = this.redundantOpCount + 1;
    this.redundantOpCount = i;
    i = 0;
    Object localObject2 = null;
    DiskLruCache.Entry.access$802((DiskLruCache.Entry)localObject3, null);
    boolean bool1 = DiskLruCache.Entry.access$700((DiskLruCache.Entry)localObject3) | paramBoolean;
    char c;
    long l4;
    if (bool1)
    {
      bool1 = true;
      DiskLruCache.Entry.access$702((DiskLruCache.Entry)localObject3, bool1);
      localObject2 = this.journalWriter;
      localObject4 = "CLEAN";
      ((Writer)localObject2).append((CharSequence)localObject4);
      localObject2 = this.journalWriter;
      k = 32;
      ((Writer)localObject2).append(k);
      localObject2 = this.journalWriter;
      localObject4 = DiskLruCache.Entry.access$1200((DiskLruCache.Entry)localObject3);
      ((Writer)localObject2).append((CharSequence)localObject4);
      localObject2 = this.journalWriter;
      localObject4 = ((DiskLruCache.Entry)localObject3).getLengths();
      ((Writer)localObject2).append((CharSequence)localObject4);
      localObject2 = this.journalWriter;
      c = '\n';
      ((Writer)localObject2).append(c);
      if (paramBoolean)
      {
        l4 = this.nextSequenceNumber;
        l1 = 1L + l4;
        this.nextSequenceNumber = l1;
        DiskLruCache.Entry.access$1302((DiskLruCache.Entry)localObject3, l4);
      }
    }
    for (;;)
    {
      localObject2 = this.journalWriter;
      ((Writer)localObject2).flush();
      l4 = this.size;
      long l5 = this.maxSize;
      bool1 = l4 < l5;
      if (!bool1)
      {
        bool1 = journalRebuildRequired();
        if (!bool1) {
          break;
        }
      }
      localObject2 = this.executorService;
      localObject4 = this.cleanupCallable;
      ((ThreadPoolExecutor)localObject2).submit((Callable)localObject4);
      break;
      localObject2 = this.lruEntries;
      localObject4 = DiskLruCache.Entry.access$1200((DiskLruCache.Entry)localObject3);
      ((LinkedHashMap)localObject2).remove(localObject4);
      localObject2 = this.journalWriter;
      localObject4 = "REMOVE";
      ((Writer)localObject2).append((CharSequence)localObject4);
      localObject2 = this.journalWriter;
      c = ' ';
      ((Writer)localObject2).append(c);
      localObject2 = this.journalWriter;
      localObject4 = DiskLruCache.Entry.access$1200((DiskLruCache.Entry)localObject3);
      ((Writer)localObject2).append((CharSequence)localObject4);
      localObject2 = this.journalWriter;
      c = '\n';
      ((Writer)localObject2).append(c);
    }
  }
  
  private static void deleteIfExists(File paramFile)
  {
    boolean bool = paramFile.exists();
    if (bool)
    {
      bool = paramFile.delete();
      if (!bool)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>();
        throw localIOException;
      }
    }
  }
  
  private DiskLruCache.Editor edit(String paramString, long paramLong)
  {
    Object localObject1 = null;
    for (;;)
    {
      Object localObject4;
      try
      {
        checkNotClosed();
        Object localObject2 = this.lruEntries;
        localObject2 = ((LinkedHashMap)localObject2).get(paramString);
        localObject2 = (DiskLruCache.Entry)localObject2;
        long l = -1;
        boolean bool = paramLong < l;
        if (bool) {
          if (localObject2 != null)
          {
            l = DiskLruCache.Entry.access$1300((DiskLruCache.Entry)localObject2);
            bool = l < paramLong;
            if (!bool) {}
          }
          else
          {
            localObject2 = null;
            return (DiskLruCache.Editor)localObject2;
          }
        }
        if (localObject2 == null)
        {
          localObject2 = new com/bumptech/glide/disklrucache/DiskLruCache$Entry;
          localObject1 = null;
          ((DiskLruCache.Entry)localObject2).<init>(this, paramString, null);
          localObject1 = this.lruEntries;
          ((LinkedHashMap)localObject1).put(paramString, localObject2);
          localObject1 = localObject2;
          localObject2 = new com/bumptech/glide/disklrucache/DiskLruCache$Editor;
          bool = false;
          localObject4 = null;
          ((DiskLruCache.Editor)localObject2).<init>(this, (DiskLruCache.Entry)localObject1, null);
          DiskLruCache.Entry.access$802((DiskLruCache.Entry)localObject1, (DiskLruCache.Editor)localObject2);
          localObject1 = this.journalWriter;
          localObject4 = "DIRTY";
          ((Writer)localObject1).append((CharSequence)localObject4);
          localObject1 = this.journalWriter;
          char c = ' ';
          ((Writer)localObject1).append(c);
          localObject1 = this.journalWriter;
          ((Writer)localObject1).append(paramString);
          localObject1 = this.journalWriter;
          c = '\n';
          ((Writer)localObject1).append(c);
          localObject1 = this.journalWriter;
          ((Writer)localObject1).flush();
          continue;
        }
        localObject4 = DiskLruCache.Entry.access$800(localEntry);
      }
      finally {}
      Object localObject3;
      if (localObject4 != null) {
        localObject3 = null;
      } else {
        localObject1 = localObject3;
      }
    }
  }
  
  private static String inputStreamToString(InputStream paramInputStream)
  {
    InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
    Charset localCharset = Util.UTF_8;
    localInputStreamReader.<init>(paramInputStream, localCharset);
    return Util.readFully(localInputStreamReader);
  }
  
  private boolean journalRebuildRequired()
  {
    int i = this.redundantOpCount;
    int k = 2000;
    if (i >= k)
    {
      i = this.redundantOpCount;
      LinkedHashMap localLinkedHashMap = this.lruEntries;
      int m = localLinkedHashMap.size();
      if (i < m) {}
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public static DiskLruCache open(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    long l = 0L;
    boolean bool1 = paramLong < l;
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("maxSize <= 0");
      throw ((Throwable)localObject1);
    }
    if (paramInt2 <= 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("valueCount <= 0");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new java/io/File;
    Object localObject2 = "journal.bkp";
    ((File)localObject1).<init>(paramFile, (String)localObject2);
    boolean bool2 = ((File)localObject1).exists();
    Object localObject4;
    int i;
    if (bool2)
    {
      localObject2 = new java/io/File;
      localObject4 = "journal";
      ((File)localObject2).<init>(paramFile, (String)localObject4);
      boolean bool3 = ((File)localObject2).exists();
      if (bool3) {
        ((File)localObject1).delete();
      }
    }
    else
    {
      localObject1 = new com/bumptech/glide/disklrucache/DiskLruCache;
      localObject2 = paramFile;
      i = paramInt1;
      ((DiskLruCache)localObject1).<init>(paramFile, paramInt1, paramInt2, paramLong);
      localObject2 = ((DiskLruCache)localObject1).journalFile;
      bool2 = ((File)localObject2).exists();
      if (!bool2) {
        break label273;
      }
    }
    for (;;)
    {
      try
      {
        ((DiskLruCache)localObject1).readJournal();
        ((DiskLruCache)localObject1).processJournal();
        return (DiskLruCache)localObject1;
      }
      catch (IOException localIOException)
      {
        localObject4 = System.out;
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("DiskLruCache ").append(paramFile);
        String str = " is corrupt: ";
        localObject5 = ((StringBuilder)localObject5).append(str);
        localObject3 = localIOException.getMessage();
        localObject3 = ((StringBuilder)localObject5).append((String)localObject3);
        localObject5 = ", removing";
        localObject3 = (String)localObject5;
        ((PrintStream)localObject4).println((String)localObject3);
        ((DiskLruCache)localObject1).delete();
      }
      i = 0;
      localObject4 = null;
      renameTo((File)localObject1, (File)localObject2, false);
      break;
      label273:
      paramFile.mkdirs();
      localObject1 = new com/bumptech/glide/disklrucache/DiskLruCache;
      Object localObject3 = paramFile;
      i = paramInt1;
      ((DiskLruCache)localObject1).<init>(paramFile, paramInt1, paramInt2, paramLong);
      ((DiskLruCache)localObject1).rebuildJournal();
    }
  }
  
  private void processJournal()
  {
    deleteIfExists(this.journalFileTmp);
    Object localObject = this.lruEntries.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DiskLruCache.Entry)localIterator.next();
      DiskLruCache.Editor localEditor = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject);
      int j;
      if (localEditor == null)
      {
        i = 0;
        localEditor = null;
        for (;;)
        {
          j = this.valueCount;
          if (i >= j) {
            break;
          }
          long l1 = this.size;
          long[] arrayOfLong = DiskLruCache.Entry.access$1100((DiskLruCache.Entry)localObject);
          long l2 = arrayOfLong[i];
          l1 += l2;
          this.size = l1;
          i += 1;
        }
      }
      DiskLruCache.Entry.access$802((DiskLruCache.Entry)localObject, null);
      int i = 0;
      localEditor = null;
      for (;;)
      {
        j = this.valueCount;
        if (i >= j) {
          break;
        }
        deleteIfExists(((DiskLruCache.Entry)localObject).getCleanFile(i));
        File localFile = ((DiskLruCache.Entry)localObject).getDirtyFile(i);
        deleteIfExists(localFile);
        i += 1;
      }
      localIterator.remove();
    }
  }
  
  private void readJournal()
  {
    StrictLineReader localStrictLineReader = new com/bumptech/glide/disklrucache/StrictLineReader;
    Object localObject1 = new java/io/FileInputStream;
    Object localObject3 = this.journalFile;
    ((FileInputStream)localObject1).<init>((File)localObject3);
    localObject3 = Util.US_ASCII;
    localStrictLineReader.<init>((InputStream)localObject1, (Charset)localObject3);
    Object localObject5;
    Object localObject6;
    try
    {
      localObject1 = localStrictLineReader.readLine();
      localObject3 = localStrictLineReader.readLine();
      localObject5 = localStrictLineReader.readLine();
      localObject6 = localStrictLineReader.readLine();
      String str1 = localStrictLineReader.readLine();
      Object localObject7 = "libcore.io.DiskLruCache";
      boolean bool1 = ((String)localObject7).equals(localObject1);
      if (bool1)
      {
        localObject7 = "1";
        bool1 = ((String)localObject7).equals(localObject3);
        if (bool1)
        {
          int i = this.appVersion;
          localObject7 = Integer.toString(i);
          boolean bool2 = ((String)localObject7).equals(localObject5);
          if (bool2)
          {
            int j = this.valueCount;
            localObject5 = Integer.toString(j);
            boolean bool3 = ((String)localObject5).equals(localObject6);
            if (bool3)
            {
              localObject5 = "";
              bool3 = ((String)localObject5).equals(str1);
              if (bool3) {
                break label282;
              }
            }
          }
        }
      }
      localObject5 = new java/io/IOException;
      localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      String str2 = "unexpected journal header: [";
      localObject7 = ((StringBuilder)localObject7).append(str2);
      localObject1 = ((StringBuilder)localObject7).append((String)localObject1);
      localObject7 = ", ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject7);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = ", ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject6);
      localObject3 = ", ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(str1);
      localObject3 = "]";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((IOException)localObject5).<init>((String)localObject1);
      throw ((Throwable)localObject5);
    }
    finally
    {
      Util.closeQuietly(localStrictLineReader);
    }
    label282:
    int k = 0;
    BufferedWriter localBufferedWriter = null;
    Object localObject4;
    try
    {
      for (;;)
      {
        localObject3 = localStrictLineReader.readLine();
        readJournalLine((String)localObject3);
        k += 1;
      }
      int m;
      boolean bool4;
      rebuildJournal();
    }
    catch (EOFException localEOFException)
    {
      localObject4 = this.lruEntries;
      m = ((LinkedHashMap)localObject4).size();
      k -= m;
      this.redundantOpCount = k;
      bool4 = localStrictLineReader.hasUnterminatedLine();
      if (!bool4) {}
    }
    for (;;)
    {
      Util.closeQuietly(localStrictLineReader);
      return;
      localBufferedWriter = new java/io/BufferedWriter;
      localObject4 = new java/io/OutputStreamWriter;
      localObject5 = new java/io/FileOutputStream;
      localObject6 = this.journalFile;
      boolean bool5 = true;
      ((FileOutputStream)localObject5).<init>((File)localObject6, bool5);
      localObject6 = Util.US_ASCII;
      ((OutputStreamWriter)localObject4).<init>((OutputStream)localObject5, (Charset)localObject6);
      localBufferedWriter.<init>((Writer)localObject4);
      this.journalWriter = localBufferedWriter;
    }
  }
  
  private void readJournalLine(String paramString)
  {
    int i = 32;
    int m = -1;
    int n = paramString.indexOf(i);
    Object localObject1;
    if (n == m)
    {
      localObject1 = new java/io/IOException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "unexpected journal line: " + paramString;
      ((IOException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i1 = n + 1;
    int i2 = paramString.indexOf(i, i1);
    if (i2 == m)
    {
      localObject1 = paramString.substring(i1);
      localObject2 = "REMOVE";
      i = ((String)localObject2).length();
      if (n == i)
      {
        localObject2 = "REMOVE";
        boolean bool1 = paramString.startsWith((String)localObject2);
        if (bool1)
        {
          localObject2 = this.lruEntries;
          ((LinkedHashMap)localObject2).remove(localObject1);
        }
      }
    }
    else
    {
      localObject1 = paramString.substring(i1, i2);
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      localObject1 = (DiskLruCache.Entry)this.lruEntries.get(localObject2);
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/disklrucache/DiskLruCache$Entry;
        ((DiskLruCache.Entry)localObject1).<init>(this, (String)localObject2, null);
        LinkedHashMap localLinkedHashMap = this.lruEntries;
        localLinkedHashMap.put(localObject2, localObject1);
      }
      int k;
      if (i2 != m)
      {
        localObject2 = "CLEAN";
        int j = ((String)localObject2).length();
        if (n == j)
        {
          localObject2 = "CLEAN";
          boolean bool2 = paramString.startsWith((String)localObject2);
          if (bool2)
          {
            k = i2 + 1;
            localObject2 = paramString.substring(k);
            String str = " ";
            localObject2 = ((String)localObject2).split(str);
            n = 1;
            DiskLruCache.Entry.access$702((DiskLruCache.Entry)localObject1, n);
            DiskLruCache.Entry.access$802((DiskLruCache.Entry)localObject1, null);
            DiskLruCache.Entry.access$900((DiskLruCache.Entry)localObject1, (String[])localObject2);
            break;
          }
        }
      }
      if (i2 == m)
      {
        localObject2 = "DIRTY";
        k = ((String)localObject2).length();
        if (n == k)
        {
          localObject2 = "DIRTY";
          boolean bool3 = paramString.startsWith((String)localObject2);
          if (bool3)
          {
            localObject2 = new com/bumptech/glide/disklrucache/DiskLruCache$Editor;
            ((DiskLruCache.Editor)localObject2).<init>(this, (DiskLruCache.Entry)localObject1, null);
            DiskLruCache.Entry.access$802((DiskLruCache.Entry)localObject1, (DiskLruCache.Editor)localObject2);
            break;
          }
        }
      }
      if (i2 == m)
      {
        localObject1 = "READ";
        i1 = ((String)localObject1).length();
        if (n == i1)
        {
          localObject1 = "READ";
          boolean bool4 = paramString.startsWith((String)localObject1);
          if (bool4) {
            break;
          }
        }
      }
      localObject1 = new java/io/IOException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "unexpected journal line: " + paramString;
      ((IOException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  private void rebuildJournal()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.journalWriter;
        if (localObject1 != null)
        {
          localObject1 = this.journalWriter;
          ((Writer)localObject1).close();
        }
        localObject4 = new java/io/BufferedWriter;
        localObject1 = new java/io/OutputStreamWriter;
        localObject5 = new java/io/FileOutputStream;
        localObject6 = this.journalFileTmp;
        ((FileOutputStream)localObject5).<init>((File)localObject6);
        localObject6 = Util.US_ASCII;
        ((OutputStreamWriter)localObject1).<init>((OutputStream)localObject5, (Charset)localObject6);
        ((BufferedWriter)localObject4).<init>((Writer)localObject1);
        localObject1 = "libcore.io.DiskLruCache";
        try
        {
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = "\n";
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = "1";
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = "\n";
          ((Writer)localObject4).write((String)localObject1);
          int i = this.appVersion;
          localObject1 = Integer.toString(i);
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = "\n";
          ((Writer)localObject4).write((String)localObject1);
          i = this.valueCount;
          localObject1 = Integer.toString(i);
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = "\n";
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = "\n";
          ((Writer)localObject4).write((String)localObject1);
          localObject1 = this.lruEntries;
          localObject1 = ((LinkedHashMap)localObject1).values();
          localObject5 = ((Collection)localObject1).iterator();
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject5).next();
          localObject1 = (DiskLruCache.Entry)localObject1;
          localObject6 = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject1);
          if (localObject6 != null)
          {
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            str = "DIRTY ";
            localObject6 = ((StringBuilder)localObject6).append(str);
            localObject1 = DiskLruCache.Entry.access$1200((DiskLruCache.Entry)localObject1);
            localObject1 = ((StringBuilder)localObject6).append((String)localObject1);
            c = '\n';
            localObject1 = ((StringBuilder)localObject1).append(c);
            localObject1 = ((StringBuilder)localObject1).toString();
            ((Writer)localObject4).write((String)localObject1);
            continue;
            localEntry = finally;
          }
        }
        finally
        {
          ((Writer)localObject4).close();
        }
        localObject6 = new java/lang/StringBuilder;
      }
      finally {}
      ((StringBuilder)localObject6).<init>();
      String str = "CLEAN ";
      localObject6 = ((StringBuilder)localObject6).append(str);
      str = DiskLruCache.Entry.access$1200(localEntry);
      localObject6 = ((StringBuilder)localObject6).append(str);
      localObject3 = localEntry.getLengths();
      localObject3 = ((StringBuilder)localObject6).append((String)localObject3);
      char c = '\n';
      localObject3 = ((StringBuilder)localObject3).append(c);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((Writer)localObject4).write((String)localObject3);
    }
    ((Writer)localObject4).close();
    Object localObject3 = this.journalFile;
    boolean bool1 = ((File)localObject3).exists();
    if (bool1)
    {
      localObject3 = this.journalFile;
      localObject4 = this.journalFileBackup;
      bool2 = true;
      renameTo((File)localObject3, (File)localObject4, bool2);
    }
    localObject3 = this.journalFileTmp;
    Object localObject4 = this.journalFile;
    boolean bool2 = false;
    Object localObject5 = null;
    renameTo((File)localObject3, (File)localObject4, false);
    localObject3 = this.journalFileBackup;
    ((File)localObject3).delete();
    localObject3 = new java/io/BufferedWriter;
    localObject4 = new java/io/OutputStreamWriter;
    localObject5 = new java/io/FileOutputStream;
    Object localObject6 = this.journalFile;
    boolean bool3 = true;
    ((FileOutputStream)localObject5).<init>((File)localObject6, bool3);
    localObject6 = Util.US_ASCII;
    ((OutputStreamWriter)localObject4).<init>((OutputStream)localObject5, (Charset)localObject6);
    ((BufferedWriter)localObject3).<init>((Writer)localObject4);
    this.journalWriter = ((Writer)localObject3);
  }
  
  private static void renameTo(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean) {
      deleteIfExists(paramFile2);
    }
    boolean bool = paramFile1.renameTo(paramFile2);
    if (!bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>();
      throw localIOException;
    }
  }
  
  private void trimToSize()
  {
    for (;;)
    {
      long l1 = this.size;
      long l2 = this.maxSize;
      boolean bool = l1 < l2;
      if (!bool) {
        break;
      }
      String str = (String)((Map.Entry)this.lruEntries.entrySet().iterator().next()).getKey();
      remove(str);
    }
  }
  
  public void close()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.journalWriter;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new java/util/ArrayList;
        Object localObject3 = this.lruEntries;
        localObject3 = ((LinkedHashMap)localObject3).values();
        ((ArrayList)localObject1).<init>((Collection)localObject3);
        localObject3 = ((ArrayList)localObject1).iterator();
        bool = ((Iterator)localObject3).hasNext();
        if (bool)
        {
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (DiskLruCache.Entry)localObject1;
          DiskLruCache.Editor localEditor = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject1);
          if (localEditor == null) {
            continue;
          }
          localObject1 = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject1);
          ((DiskLruCache.Editor)localObject1).abort();
          continue;
        }
        trimToSize();
      }
      finally {}
      Writer localWriter = this.journalWriter;
      localWriter.close();
      boolean bool = false;
      localWriter = null;
      this.journalWriter = null;
    }
  }
  
  public void delete()
  {
    close();
    Util.deleteContents(this.directory);
  }
  
  public DiskLruCache.Editor edit(String paramString)
  {
    return edit(paramString, -1);
  }
  
  public void flush()
  {
    try
    {
      checkNotClosed();
      trimToSize();
      Writer localWriter = this.journalWriter;
      localWriter.flush();
      return;
    }
    finally {}
  }
  
  /* Error */
  public DiskLruCache.Value get(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: invokespecial 272	com/bumptech/glide/disklrucache/DiskLruCache:checkNotClosed	()V
    //   10: aload_0
    //   11: getfield 71	com/bumptech/glide/disklrucache/DiskLruCache:lruEntries	Ljava/util/LinkedHashMap;
    //   14: astore 4
    //   16: aload 4
    //   18: aload_1
    //   19: invokevirtual 275	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   22: astore 4
    //   24: aload 4
    //   26: checkcast 163	com/bumptech/glide/disklrucache/DiskLruCache$Entry
    //   29: astore 4
    //   31: aload 4
    //   33: ifnonnull +7 -> 40
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: areturn
    //   40: aload 4
    //   42: invokestatic 172	com/bumptech/glide/disklrucache/DiskLruCache$Entry:access$700	(Lcom/bumptech/glide/disklrucache/DiskLruCache$Entry;)Z
    //   45: istore 5
    //   47: iload 5
    //   49: ifeq -13 -> 36
    //   52: aload 4
    //   54: getfield 511	com/bumptech/glide/disklrucache/DiskLruCache$Entry:cleanFiles	[Ljava/io/File;
    //   57: astore 6
    //   59: aload 6
    //   61: arraylength
    //   62: istore 7
    //   64: iconst_0
    //   65: istore 5
    //   67: aconst_null
    //   68: astore 8
    //   70: iload 5
    //   72: iload 7
    //   74: if_icmpge +31 -> 105
    //   77: aload 6
    //   79: iload 5
    //   81: aaload
    //   82: astore 9
    //   84: aload 9
    //   86: invokevirtual 202	java/io/File:exists	()Z
    //   89: istore 10
    //   91: iload 10
    //   93: ifeq -57 -> 36
    //   96: iload 5
    //   98: iconst_1
    //   99: iadd
    //   100: istore 5
    //   102: goto -32 -> 70
    //   105: aload_0
    //   106: getfield 148	com/bumptech/glide/disklrucache/DiskLruCache:redundantOpCount	I
    //   109: iconst_1
    //   110: iadd
    //   111: istore_2
    //   112: aload_0
    //   113: iload_2
    //   114: putfield 148	com/bumptech/glide/disklrucache/DiskLruCache:redundantOpCount	I
    //   117: aload_0
    //   118: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   121: astore_3
    //   122: ldc 30
    //   124: astore 8
    //   126: aload_3
    //   127: aload 8
    //   129: invokevirtual 234	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   132: pop
    //   133: aload_0
    //   134: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   137: astore_3
    //   138: bipush 32
    //   140: istore 5
    //   142: aload_3
    //   143: iload 5
    //   145: invokevirtual 238	java/io/Writer:append	(C)Ljava/io/Writer;
    //   148: pop
    //   149: aload_0
    //   150: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   153: astore_3
    //   154: aload_3
    //   155: aload_1
    //   156: invokevirtual 234	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   159: pop
    //   160: aload_0
    //   161: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   164: astore_3
    //   165: bipush 10
    //   167: istore 5
    //   169: aload_3
    //   170: iload 5
    //   172: invokevirtual 238	java/io/Writer:append	(C)Ljava/io/Writer;
    //   175: pop
    //   176: aload_0
    //   177: invokespecial 143	com/bumptech/glide/disklrucache/DiskLruCache:journalRebuildRequired	()Z
    //   180: istore_2
    //   181: iload_2
    //   182: ifeq +21 -> 203
    //   185: aload_0
    //   186: getfield 96	com/bumptech/glide/disklrucache/DiskLruCache:executorService	Ljava/util/concurrent/ThreadPoolExecutor;
    //   189: astore_3
    //   190: aload_0
    //   191: getfield 103	com/bumptech/glide/disklrucache/DiskLruCache:cleanupCallable	Ljava/util/concurrent/Callable;
    //   194: astore 8
    //   196: aload_3
    //   197: aload 8
    //   199: invokevirtual 259	java/util/concurrent/ThreadPoolExecutor:submit	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   202: pop
    //   203: new 513	com/bumptech/glide/disklrucache/DiskLruCache$Value
    //   206: astore_3
    //   207: aload 4
    //   209: invokestatic 279	com/bumptech/glide/disklrucache/DiskLruCache$Entry:access$1300	(Lcom/bumptech/glide/disklrucache/DiskLruCache$Entry;)J
    //   212: lstore 11
    //   214: aload 4
    //   216: getfield 511	com/bumptech/glide/disklrucache/DiskLruCache$Entry:cleanFiles	[Ljava/io/File;
    //   219: astore 13
    //   221: aload 4
    //   223: invokestatic 213	com/bumptech/glide/disklrucache/DiskLruCache$Entry:access$1100	(Lcom/bumptech/glide/disklrucache/DiskLruCache$Entry;)[J
    //   226: astore 14
    //   228: aload_0
    //   229: astore 8
    //   231: aload_1
    //   232: astore 6
    //   234: aload_3
    //   235: aload_0
    //   236: aload_1
    //   237: lload 11
    //   239: aload 13
    //   241: aload 14
    //   243: aconst_null
    //   244: invokespecial 516	com/bumptech/glide/disklrucache/DiskLruCache$Value:<init>	(Lcom/bumptech/glide/disklrucache/DiskLruCache;Ljava/lang/String;J[Ljava/io/File;[JLcom/bumptech/glide/disklrucache/DiskLruCache$1;)V
    //   247: goto -211 -> 36
    //   250: astore 4
    //   252: aload_0
    //   253: monitorexit
    //   254: aload 4
    //   256: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	DiskLruCache
    //   0	257	1	paramString	String
    //   1	113	2	i	int
    //   180	2	2	bool1	boolean
    //   3	232	3	localObject1	Object
    //   14	208	4	localObject2	Object
    //   250	5	4	localObject3	Object
    //   45	55	5	j	int
    //   100	44	5	k	int
    //   167	4	5	c	char
    //   57	176	6	localObject4	Object
    //   62	13	7	m	int
    //   68	162	8	localObject5	Object
    //   82	3	9	localObject6	Object
    //   89	3	10	bool2	boolean
    //   212	26	11	l	long
    //   219	21	13	arrayOfFile	File[]
    //   226	16	14	arrayOfLong	long[]
    // Exception table:
    //   from	to	target	type
    //   6	10	250	finally
    //   10	14	250	finally
    //   18	22	250	finally
    //   24	29	250	finally
    //   40	45	250	finally
    //   52	57	250	finally
    //   59	62	250	finally
    //   79	82	250	finally
    //   84	89	250	finally
    //   105	109	250	finally
    //   113	117	250	finally
    //   117	121	250	finally
    //   127	133	250	finally
    //   133	137	250	finally
    //   143	149	250	finally
    //   149	153	250	finally
    //   155	160	250	finally
    //   160	164	250	finally
    //   170	176	250	finally
    //   176	180	250	finally
    //   185	189	250	finally
    //   190	194	250	finally
    //   197	203	250	finally
    //   203	206	250	finally
    //   207	212	250	finally
    //   214	219	250	finally
    //   221	226	250	finally
    //   243	247	250	finally
  }
  
  public File getDirectory()
  {
    return this.directory;
  }
  
  public long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isClosed()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 124	com/bumptech/glide/disklrucache/DiskLruCache:journalWriter	Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +9 -> 17
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
    //   0	29	0	this	DiskLruCache
    //   6	15	1	localWriter	Writer
    //   24	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	24	finally
  }
  
  public boolean remove(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        checkNotClosed();
        Object localObject2 = this.lruEntries;
        localObject2 = ((LinkedHashMap)localObject2).get(paramString);
        localObject2 = (DiskLruCache.Entry)localObject2;
        Object localObject5;
        if (localObject2 != null)
        {
          localObject5 = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject2);
          if (localObject5 == null) {}
        }
        else
        {
          boolean bool1 = false;
          localObject2 = null;
          return bool1;
          long l1 = this.size;
          long[] arrayOfLong = DiskLruCache.Entry.access$1100((DiskLruCache.Entry)localObject2);
          long l2 = arrayOfLong[i];
          l1 -= l2;
          this.size = l1;
          localObject5 = DiskLruCache.Entry.access$1100((DiskLruCache.Entry)localObject2);
          l2 = 0L;
          localObject5[i] = l2;
          i += 1;
        }
        int k = this.valueCount;
        if (i < k)
        {
          localObject5 = ((DiskLruCache.Entry)localObject2).getCleanFile(i);
          boolean bool3 = ((File)localObject5).exists();
          if (!bool3) {
            continue;
          }
          bool3 = ((File)localObject5).delete();
          if (bool3) {
            continue;
          }
          localObject2 = new java/io/IOException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          String str = "failed to delete ";
          localObject1 = ((StringBuilder)localObject1).append(str);
          localObject1 = ((StringBuilder)localObject1).append(localObject5);
          localObject1 = ((StringBuilder)localObject1).toString();
          ((IOException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
      }
      finally {}
      int j = this.redundantOpCount + 1;
      this.redundantOpCount = j;
      Object localObject4 = this.journalWriter;
      localObject1 = "REMOVE";
      ((Writer)localObject4).append((CharSequence)localObject1);
      localObject4 = this.journalWriter;
      i = 32;
      ((Writer)localObject4).append(i);
      localObject4 = this.journalWriter;
      ((Writer)localObject4).append(paramString);
      localObject4 = this.journalWriter;
      char c = '\n';
      ((Writer)localObject4).append(c);
      localObject4 = this.lruEntries;
      ((LinkedHashMap)localObject4).remove(paramString);
      boolean bool2 = journalRebuildRequired();
      if (bool2)
      {
        localObject4 = this.executorService;
        localObject1 = this.cleanupCallable;
        ((ThreadPoolExecutor)localObject4).submit((Callable)localObject1);
      }
      bool2 = true;
    }
  }
  
  public void setMaxSize(long paramLong)
  {
    try
    {
      this.maxSize = paramLong;
      ThreadPoolExecutor localThreadPoolExecutor = this.executorService;
      Callable localCallable = this.cleanupCallable;
      localThreadPoolExecutor.submit(localCallable);
      return;
    }
    finally {}
  }
  
  public long size()
  {
    try
    {
      long l = this.size;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\DiskLruCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */