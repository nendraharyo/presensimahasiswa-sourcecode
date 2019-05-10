package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.i;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.data.InputStreamRewinder.Factory;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.engine.prefill.PreFillType.Builder;
import com.bumptech.glide.load.model.AssetUriLoader.FileDescriptorFactory;
import com.bumptech.glide.load.model.AssetUriLoader.StreamFactory;
import com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory;
import com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader.Factory;
import com.bumptech.glide.load.model.DataUrlLoader.StreamFactory;
import com.bumptech.glide.load.model.FileLoader.FileDescriptorFactory;
import com.bumptech.glide.load.model.FileLoader.StreamFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader.Factory;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ResourceLoader.AssetFileDescriptorFactory;
import com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory;
import com.bumptech.glide.load.model.ResourceLoader.StreamFactory;
import com.bumptech.glide.load.model.ResourceLoader.UriFactory;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader.AssetFileDescriptorFactory;
import com.bumptech.glide.load.model.StringLoader.FileDescriptorFactory;
import com.bumptech.glide.load.model.StringLoader.StreamFactory;
import com.bumptech.glide.load.model.UnitModelLoader.Factory;
import com.bumptech.glide.load.model.UriLoader.AssetFileDescriptorFactory;
import com.bumptech.glide.load.model.UriLoader.FileDescriptorFactory;
import com.bumptech.glide.load.model.UriLoader.StreamFactory;
import com.bumptech.glide.load.model.UrlUriLoader.StreamFactory;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Factory;
import com.bumptech.glide.load.model.stream.HttpUriLoader.Factory;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader.Factory;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader.Factory;
import com.bumptech.glide.load.model.stream.UrlLoader.StreamFactory;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder.Factory;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Glide
  implements ComponentCallbacks2
{
  private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
  private static final String TAG = "Glide";
  private static volatile Glide glide;
  private static volatile boolean isInitializing;
  private final ArrayPool arrayPool;
  private final BitmapPool bitmapPool;
  private final BitmapPreFiller bitmapPreFiller;
  private final ConnectivityMonitorFactory connectivityMonitorFactory;
  private final Engine engine;
  private final GlideContext glideContext;
  private final List managers;
  private final MemoryCache memoryCache;
  private MemoryCategory memoryCategory;
  private final Registry registry;
  private final RequestManagerRetriever requestManagerRetriever;
  
  Glide(Context paramContext, Engine paramEngine, MemoryCache paramMemoryCache, BitmapPool paramBitmapPool, ArrayPool paramArrayPool, RequestManagerRetriever paramRequestManagerRetriever, ConnectivityMonitorFactory paramConnectivityMonitorFactory, int paramInt, RequestOptions paramRequestOptions, Map paramMap)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = this;
    this.managers = ((List)localObject1);
    localObject1 = MemoryCategory.NORMAL;
    this.memoryCategory = ((MemoryCategory)localObject1);
    localObject2 = paramEngine;
    Object localObject3 = this;
    this.engine = paramEngine;
    localObject2 = paramBitmapPool;
    this.bitmapPool = paramBitmapPool;
    localObject2 = paramArrayPool;
    this.arrayPool = paramArrayPool;
    localObject2 = paramMemoryCache;
    this.memoryCache = paramMemoryCache;
    localObject2 = paramRequestManagerRetriever;
    this.requestManagerRetriever = paramRequestManagerRetriever;
    localObject2 = paramConnectivityMonitorFactory;
    this.connectivityMonitorFactory = paramConnectivityMonitorFactory;
    localObject1 = paramRequestOptions.getOptions();
    Object localObject4 = Downsampler.DECODE_FORMAT;
    localObject1 = (DecodeFormat)((Options)localObject1).get((Option)localObject4);
    localObject4 = new com/bumptech/glide/load/engine/prefill/BitmapPreFiller;
    localObject2 = paramMemoryCache;
    localObject3 = paramBitmapPool;
    ((BitmapPreFiller)localObject4).<init>(paramMemoryCache, paramBitmapPool, (DecodeFormat)localObject1);
    localObject2 = this;
    this.bitmapPreFiller = ((BitmapPreFiller)localObject4);
    localObject1 = paramContext.getResources();
    localObject4 = new com/bumptech/glide/Registry;
    ((Registry)localObject4).<init>();
    this.registry = ((Registry)localObject4);
    int i = Build.VERSION.SDK_INT;
    int j = 27;
    if (i >= j)
    {
      localObject4 = this.registry;
      localObject5 = new com/bumptech/glide/load/resource/bitmap/ExifInterfaceImageHeaderParser;
      ((ExifInterfaceImageHeaderParser)localObject5).<init>();
      ((Registry)localObject4).register((ImageHeaderParser)localObject5);
    }
    localObject2 = this;
    localObject4 = this.registry;
    Object localObject5 = new com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;
    ((DefaultImageHeaderParser)localObject5).<init>();
    ((Registry)localObject4).register((ImageHeaderParser)localObject5);
    localObject4 = new com/bumptech/glide/load/resource/bitmap/Downsampler;
    localObject5 = this.registry.getImageHeaderParsers();
    Object localObject6 = ((Resources)localObject1).getDisplayMetrics();
    localObject2 = paramBitmapPool;
    localObject3 = paramArrayPool;
    ((Downsampler)localObject4).<init>((List)localObject5, (DisplayMetrics)localObject6, paramBitmapPool, paramArrayPool);
    localObject5 = new com/bumptech/glide/load/resource/gif/ByteBufferGifDecoder;
    localObject2 = this;
    localObject6 = this.registry.getImageHeaderParsers();
    localObject2 = paramContext;
    localObject3 = paramBitmapPool;
    Object localObject7 = paramArrayPool;
    ((ByteBufferGifDecoder)localObject5).<init>(paramContext, (List)localObject6, paramBitmapPool, paramArrayPool);
    localObject6 = VideoDecoder.parcel(paramBitmapPool);
    Object localObject8 = new com/bumptech/glide/load/resource/bitmap/ByteBufferBitmapDecoder;
    ((ByteBufferBitmapDecoder)localObject8).<init>((Downsampler)localObject4);
    Object localObject9 = new com/bumptech/glide/load/resource/bitmap/StreamBitmapDecoder;
    localObject2 = paramArrayPool;
    ((StreamBitmapDecoder)localObject9).<init>((Downsampler)localObject4, paramArrayPool);
    localObject4 = new com/bumptech/glide/load/resource/drawable/ResourceDrawableDecoder;
    localObject2 = paramContext;
    ((ResourceDrawableDecoder)localObject4).<init>(paramContext);
    Object localObject10 = new com/bumptech/glide/load/model/ResourceLoader$StreamFactory;
    ((ResourceLoader.StreamFactory)localObject10).<init>((Resources)localObject1);
    Object localObject11 = new com/bumptech/glide/load/model/ResourceLoader$UriFactory;
    ((ResourceLoader.UriFactory)localObject11).<init>((Resources)localObject1);
    ResourceLoader.FileDescriptorFactory localFileDescriptorFactory = new com/bumptech/glide/load/model/ResourceLoader$FileDescriptorFactory;
    localFileDescriptorFactory.<init>((Resources)localObject1);
    ResourceLoader.AssetFileDescriptorFactory localAssetFileDescriptorFactory = new com/bumptech/glide/load/model/ResourceLoader$AssetFileDescriptorFactory;
    localAssetFileDescriptorFactory.<init>((Resources)localObject1);
    Object localObject12 = new com/bumptech/glide/load/resource/bitmap/BitmapEncoder;
    localObject2 = paramArrayPool;
    ((BitmapEncoder)localObject12).<init>(paramArrayPool);
    BitmapBytesTranscoder localBitmapBytesTranscoder = new com/bumptech/glide/load/resource/transcode/BitmapBytesTranscoder;
    localBitmapBytesTranscoder.<init>();
    GifDrawableBytesTranscoder localGifDrawableBytesTranscoder = new com/bumptech/glide/load/resource/transcode/GifDrawableBytesTranscoder;
    localGifDrawableBytesTranscoder.<init>();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    localObject2 = this;
    localObject2 = this.registry;
    Object localObject13 = localObject2;
    Object localObject14 = new com/bumptech/glide/load/model/ByteBufferEncoder;
    ((ByteBufferEncoder)localObject14).<init>();
    localObject13 = ((Registry)localObject2).append(ByteBuffer.class, (Encoder)localObject14);
    localObject14 = new com/bumptech/glide/load/model/StreamEncoder;
    localObject2 = localObject14;
    localObject3 = paramArrayPool;
    ((StreamEncoder)localObject14).<init>(paramArrayPool);
    localObject13 = ((Registry)localObject13).append(InputStream.class, (Encoder)localObject14);
    localObject2 = localObject13;
    localObject3 = "Bitmap";
    localObject7 = ByteBuffer.class;
    Object localObject15 = Bitmap.class;
    localObject13 = ((Registry)localObject13).append((String)localObject3, (Class)localObject7, (Class)localObject15, (ResourceDecoder)localObject8);
    localObject2 = localObject13;
    localObject3 = "Bitmap";
    localObject7 = InputStream.class;
    localObject15 = Bitmap.class;
    localObject13 = ((Registry)localObject13).append((String)localObject3, (Class)localObject7, (Class)localObject15, (ResourceDecoder)localObject9);
    localObject2 = localObject13;
    localObject3 = "Bitmap";
    localObject7 = ParcelFileDescriptor.class;
    localObject15 = Bitmap.class;
    localObject13 = ((Registry)localObject13).append((String)localObject3, (Class)localObject7, (Class)localObject15, (ResourceDecoder)localObject6);
    Object localObject16 = VideoDecoder.asset(paramBitmapPool);
    localObject13 = ((Registry)localObject13).append("Bitmap", AssetFileDescriptor.class, Bitmap.class, (ResourceDecoder)localObject16);
    Object localObject17 = UnitModelLoader.Factory.getInstance();
    localObject13 = ((Registry)localObject13).append(Bitmap.class, Bitmap.class, (ModelLoaderFactory)localObject17);
    localObject16 = new com/bumptech/glide/load/resource/bitmap/UnitBitmapDecoder;
    ((UnitBitmapDecoder)localObject16).<init>();
    localObject13 = ((Registry)localObject13).append("Bitmap", Bitmap.class, Bitmap.class, (ResourceDecoder)localObject16);
    localObject2 = localObject13;
    localObject3 = Bitmap.class;
    localObject13 = ((Registry)localObject13).append((Class)localObject3, (ResourceEncoder)localObject12);
    localObject16 = new com/bumptech/glide/load/resource/bitmap/BitmapDrawableDecoder;
    localObject2 = localObject16;
    ((BitmapDrawableDecoder)localObject16).<init>((Resources)localObject1, (ResourceDecoder)localObject8);
    localObject8 = ((Registry)localObject13).append("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, (ResourceDecoder)localObject16);
    localObject17 = new com/bumptech/glide/load/resource/bitmap/BitmapDrawableDecoder;
    localObject2 = localObject17;
    ((BitmapDrawableDecoder)localObject17).<init>((Resources)localObject1, (ResourceDecoder)localObject9);
    localObject2 = "BitmapDrawable";
    localObject3 = InputStream.class;
    localObject7 = BitmapDrawable.class;
    localObject15 = localObject17;
    localObject8 = ((Registry)localObject8).append((String)localObject2, (Class)localObject3, (Class)localObject7, (ResourceDecoder)localObject17);
    localObject14 = new com/bumptech/glide/load/resource/bitmap/BitmapDrawableDecoder;
    localObject2 = localObject14;
    ((BitmapDrawableDecoder)localObject14).<init>((Resources)localObject1, (ResourceDecoder)localObject6);
    localObject2 = ParcelFileDescriptor.class;
    localObject3 = BitmapDrawable.class;
    localObject7 = localObject14;
    localObject6 = ((Registry)localObject8).append("BitmapDrawable", (Class)localObject2, (Class)localObject3, (ResourceDecoder)localObject14);
    localObject9 = new com/bumptech/glide/load/resource/bitmap/BitmapDrawableEncoder;
    localObject2 = paramBitmapPool;
    ((BitmapDrawableEncoder)localObject9).<init>(paramBitmapPool, (ResourceEncoder)localObject12);
    localObject6 = ((Registry)localObject6).append(BitmapDrawable.class, (ResourceEncoder)localObject9);
    localObject13 = new com/bumptech/glide/load/resource/gif/StreamGifDecoder;
    localObject2 = this;
    localObject2 = this.registry;
    Object localObject18 = localObject2;
    localObject18 = ((Registry)localObject2).getImageHeaderParsers();
    localObject2 = localObject13;
    localObject3 = localObject18;
    localObject7 = paramArrayPool;
    ((StreamGifDecoder)localObject13).<init>((List)localObject18, (ResourceDecoder)localObject5, paramArrayPool);
    localObject5 = ((Registry)localObject6).append("Gif", InputStream.class, GifDrawable.class, (ResourceDecoder)localObject13).append("Gif", ByteBuffer.class, GifDrawable.class, (ResourceDecoder)localObject5);
    localObject8 = new com/bumptech/glide/load/resource/gif/GifDrawableEncoder;
    ((GifDrawableEncoder)localObject8).<init>();
    localObject5 = ((Registry)localObject5).append(GifDrawable.class, (ResourceEncoder)localObject8);
    localObject9 = UnitModelLoader.Factory.getInstance();
    localObject5 = ((Registry)localObject5).append(GifDecoder.class, GifDecoder.class, (ModelLoaderFactory)localObject9);
    localObject12 = new com/bumptech/glide/load/resource/gif/GifFrameResourceDecoder;
    localObject2 = paramBitmapPool;
    ((GifFrameResourceDecoder)localObject12).<init>(paramBitmapPool);
    localObject5 = ((Registry)localObject5).append("Bitmap", GifDecoder.class, Bitmap.class, (ResourceDecoder)localObject12).append(Uri.class, Drawable.class, (ResourceDecoder)localObject4);
    localObject9 = new com/bumptech/glide/load/resource/bitmap/ResourceBitmapDecoder;
    ((ResourceBitmapDecoder)localObject9).<init>((ResourceDrawableDecoder)localObject4, paramBitmapPool);
    localObject4 = ((Registry)localObject5).append(Uri.class, Bitmap.class, (ResourceDecoder)localObject9);
    localObject5 = new com/bumptech/glide/load/resource/bytes/ByteBufferRewinder$Factory;
    ((ByteBufferRewinder.Factory)localObject5).<init>();
    localObject4 = ((Registry)localObject4).register((DataRewinder.Factory)localObject5);
    localObject8 = new com/bumptech/glide/load/model/ByteBufferFileLoader$Factory;
    ((ByteBufferFileLoader.Factory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(File.class, ByteBuffer.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/FileLoader$StreamFactory;
    ((FileLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(File.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/resource/file/FileDecoder;
    ((FileDecoder)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(File.class, File.class, (ResourceDecoder)localObject8);
    localObject8 = new com/bumptech/glide/load/model/FileLoader$FileDescriptorFactory;
    ((FileLoader.FileDescriptorFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(File.class, ParcelFileDescriptor.class, (ModelLoaderFactory)localObject8);
    localObject8 = UnitModelLoader.Factory.getInstance();
    localObject4 = ((Registry)localObject4).append(File.class, File.class, (ModelLoaderFactory)localObject8);
    localObject5 = new com/bumptech/glide/load/data/InputStreamRewinder$Factory;
    localObject2 = paramArrayPool;
    ((InputStreamRewinder.Factory)localObject5).<init>(paramArrayPool);
    localObject4 = ((Registry)localObject4).register((DataRewinder.Factory)localObject5);
    localObject5 = Integer.TYPE;
    localObject4 = ((Registry)localObject4).append((Class)localObject5, InputStream.class, (ModelLoaderFactory)localObject10);
    localObject5 = Integer.TYPE;
    localObject4 = ((Registry)localObject4).append((Class)localObject5, ParcelFileDescriptor.class, localFileDescriptorFactory).append(Integer.class, InputStream.class, (ModelLoaderFactory)localObject10).append(Integer.class, ParcelFileDescriptor.class, localFileDescriptorFactory).append(Integer.class, Uri.class, (ModelLoaderFactory)localObject11);
    localObject5 = Integer.TYPE;
    localObject4 = ((Registry)localObject4).append((Class)localObject5, AssetFileDescriptor.class, localAssetFileDescriptorFactory).append(Integer.class, AssetFileDescriptor.class, localAssetFileDescriptorFactory);
    localObject5 = Integer.TYPE;
    localObject4 = ((Registry)localObject4).append((Class)localObject5, Uri.class, (ModelLoaderFactory)localObject11);
    localObject8 = new com/bumptech/glide/load/model/DataUrlLoader$StreamFactory;
    ((DataUrlLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(String.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/DataUrlLoader$StreamFactory;
    ((DataUrlLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/StringLoader$StreamFactory;
    ((StringLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(String.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/StringLoader$FileDescriptorFactory;
    ((StringLoader.FileDescriptorFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(String.class, ParcelFileDescriptor.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/StringLoader$AssetFileDescriptorFactory;
    ((StringLoader.AssetFileDescriptorFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(String.class, AssetFileDescriptor.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/stream/HttpUriLoader$Factory;
    ((HttpUriLoader.Factory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/AssetUriLoader$StreamFactory;
    localObject9 = paramContext.getAssets();
    ((AssetUriLoader.StreamFactory)localObject8).<init>((AssetManager)localObject9);
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/AssetUriLoader$FileDescriptorFactory;
    localObject9 = paramContext.getAssets();
    ((AssetUriLoader.FileDescriptorFactory)localObject8).<init>((AssetManager)localObject9);
    localObject4 = ((Registry)localObject4).append(Uri.class, ParcelFileDescriptor.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/stream/MediaStoreImageThumbLoader$Factory;
    localObject2 = paramContext;
    ((MediaStoreImageThumbLoader.Factory)localObject8).<init>(paramContext);
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/stream/MediaStoreVideoThumbLoader$Factory;
    ((MediaStoreVideoThumbLoader.Factory)localObject8).<init>(paramContext);
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/UriLoader$StreamFactory;
    localObject2 = localContentResolver;
    ((UriLoader.StreamFactory)localObject8).<init>(localContentResolver);
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/UriLoader$FileDescriptorFactory;
    ((UriLoader.FileDescriptorFactory)localObject8).<init>(localContentResolver);
    localObject4 = ((Registry)localObject4).append(Uri.class, ParcelFileDescriptor.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/UriLoader$AssetFileDescriptorFactory;
    ((UriLoader.AssetFileDescriptorFactory)localObject8).<init>(localContentResolver);
    localObject4 = ((Registry)localObject4).append(Uri.class, AssetFileDescriptor.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/UrlUriLoader$StreamFactory;
    ((UrlUriLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(Uri.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/stream/UrlLoader$StreamFactory;
    ((UrlLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(URL.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/MediaStoreFileLoader$Factory;
    localObject2 = paramContext;
    ((MediaStoreFileLoader.Factory)localObject8).<init>(paramContext);
    localObject4 = ((Registry)localObject4).append(Uri.class, File.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/stream/HttpGlideUrlLoader$Factory;
    ((HttpGlideUrlLoader.Factory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(GlideUrl.class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/ByteArrayLoader$ByteBufferFactory;
    ((ByteArrayLoader.ByteBufferFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(byte[].class, ByteBuffer.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/model/ByteArrayLoader$StreamFactory;
    ((ByteArrayLoader.StreamFactory)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(byte[].class, InputStream.class, (ModelLoaderFactory)localObject8);
    localObject8 = UnitModelLoader.Factory.getInstance();
    localObject4 = ((Registry)localObject4).append(Uri.class, Uri.class, (ModelLoaderFactory)localObject8);
    localObject8 = UnitModelLoader.Factory.getInstance();
    localObject4 = ((Registry)localObject4).append(Drawable.class, Drawable.class, (ModelLoaderFactory)localObject8);
    localObject8 = new com/bumptech/glide/load/resource/drawable/UnitDrawableDecoder;
    ((UnitDrawableDecoder)localObject8).<init>();
    localObject4 = ((Registry)localObject4).append(Drawable.class, Drawable.class, (ResourceDecoder)localObject8);
    localObject8 = new com/bumptech/glide/load/resource/transcode/BitmapDrawableTranscoder;
    ((BitmapDrawableTranscoder)localObject8).<init>((Resources)localObject1);
    localObject1 = ((Registry)localObject4).register(Bitmap.class, BitmapDrawable.class, (ResourceTranscoder)localObject8).register(Bitmap.class, byte[].class, localBitmapBytesTranscoder);
    localObject6 = new com/bumptech/glide/load/resource/transcode/DrawableBytesTranscoder;
    localObject2 = paramBitmapPool;
    localObject3 = localGifDrawableBytesTranscoder;
    ((DrawableBytesTranscoder)localObject6).<init>(paramBitmapPool, localBitmapBytesTranscoder, localGifDrawableBytesTranscoder);
    localObject1 = ((Registry)localObject1).register(Drawable.class, byte[].class, (ResourceTranscoder)localObject6);
    localObject2 = localGifDrawableBytesTranscoder;
    ((Registry)localObject1).register(GifDrawable.class, byte[].class, localGifDrawableBytesTranscoder);
    localObject8 = new com/bumptech/glide/request/target/ImageViewTargetFactory;
    ((ImageViewTargetFactory)localObject8).<init>();
    localObject1 = new com/bumptech/glide/GlideContext;
    localObject2 = this;
    localObject6 = this.registry;
    localObject4 = paramContext;
    localObject5 = paramArrayPool;
    localObject9 = paramRequestOptions;
    localObject10 = paramMap;
    localObject11 = paramEngine;
    ((GlideContext)localObject1).<init>(paramContext, paramArrayPool, (Registry)localObject6, (ImageViewTargetFactory)localObject8, paramRequestOptions, paramMap, paramEngine, paramInt);
    this.glideContext = ((GlideContext)localObject1);
  }
  
  private static void checkAndInitializeGlide(Context paramContext)
  {
    boolean bool = isInitializing;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
      throw localIllegalStateException;
    }
    isInitializing = true;
    initializeGlide(paramContext);
    isInitializing = false;
  }
  
  public static Glide get(Context paramContext)
  {
    Glide localGlide = glide;
    if (localGlide == null) {}
    synchronized (Glide.class)
    {
      localGlide = glide;
      if (localGlide == null) {
        checkAndInitializeGlide(paramContext);
      }
      return glide;
    }
  }
  
  private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules()
  {
    Object localObject1 = "com.bumptech.glide.GeneratedAppGlideModuleImpl";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      i = 0;
      localObject2 = null;
      localObject2 = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject2);
      i = 0;
      localObject2 = null;
      localObject2 = new Object[0];
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      localObject1 = (GeneratedAppGlideModule)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        str = "Glide";
        int i = 5;
        bool = Log.isLoggable(str, i);
        if (bool)
        {
          str = "Glide";
          localObject2 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored";
          Log.w(str, (String)localObject2);
        }
        bool = false;
        str = null;
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;)
      {
        throwIncorrectGlideModule(localInstantiationException);
        bool = false;
        str = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        throwIncorrectGlideModule(localIllegalAccessException);
        bool = false;
        str = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        throwIncorrectGlideModule(localNoSuchMethodException);
        bool = false;
        str = null;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        throwIncorrectGlideModule(localInvocationTargetException);
        boolean bool = false;
        String str = null;
      }
    }
    return (GeneratedAppGlideModule)localObject1;
  }
  
  public static File getPhotoCacheDir(Context paramContext)
  {
    return getPhotoCacheDir(paramContext, "image_manager_disk_cache");
  }
  
  public static File getPhotoCacheDir(Context paramContext, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = paramContext.getCacheDir();
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((File)localObject2, paramString);
      boolean bool1 = ((File)localObject3).mkdirs();
      if (!bool1)
      {
        bool1 = ((File)localObject3).exists();
        if (bool1)
        {
          bool1 = ((File)localObject3).isDirectory();
          if (bool1) {
            break label61;
          }
        }
      }
    }
    for (;;)
    {
      return (File)localObject1;
      label61:
      localObject1 = localObject3;
      continue;
      localObject3 = "Glide";
      int i = 6;
      boolean bool2 = Log.isLoggable((String)localObject3, i);
      if (bool2)
      {
        localObject3 = "Glide";
        localObject2 = "default disk cache dir is null";
        Log.e((String)localObject3, (String)localObject2);
      }
    }
  }
  
  private static RequestManagerRetriever getRetriever(Context paramContext)
  {
    Preconditions.checkNotNull(paramContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    return get(paramContext).getRequestManagerRetriever();
  }
  
  public static void init(Context paramContext, GlideBuilder paramGlideBuilder)
  {
    synchronized (Glide.class)
    {
      Glide localGlide = glide;
      if (localGlide != null) {
        tearDown();
      }
      initializeGlide(paramContext, paramGlideBuilder);
      return;
    }
  }
  
  public static void init(Glide paramGlide)
  {
    synchronized (Glide.class)
    {
      Glide localGlide = glide;
      if (localGlide != null) {
        tearDown();
      }
      glide = paramGlide;
      return;
    }
  }
  
  private static void initializeGlide(Context paramContext)
  {
    GlideBuilder localGlideBuilder = new com/bumptech/glide/GlideBuilder;
    localGlideBuilder.<init>();
    initializeGlide(paramContext, localGlideBuilder);
  }
  
  private static void initializeGlide(Context paramContext, GlideBuilder paramGlideBuilder)
  {
    int i = 3;
    Context localContext = paramContext.getApplicationContext();
    GeneratedAppGlideModule localGeneratedAppGlideModule = getAnnotationGeneratedGlideModules();
    Object localObject1 = Collections.emptyList();
    if (localGeneratedAppGlideModule != null)
    {
      boolean bool1 = localGeneratedAppGlideModule.isManifestParsingEnabled();
      if (!bool1) {}
    }
    else
    {
      localObject1 = new com/bumptech/glide/module/ManifestParser;
      ((ManifestParser)localObject1).<init>(localContext);
      localObject1 = ((ManifestParser)localObject1).parse();
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      Object localObject4;
      Object localObject5;
      Object localObject6;
      if (localGeneratedAppGlideModule != null)
      {
        localObject1 = localGeneratedAppGlideModule.getExcludedModuleClasses();
        bool2 = ((Set)localObject1).isEmpty();
        if (!bool2)
        {
          localObject3 = localGeneratedAppGlideModule.getExcludedModuleClasses();
          localObject4 = ((List)localObject2).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject4).hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = (GlideModule)((Iterator)localObject4).next();
            localObject5 = localObject1.getClass();
            boolean bool3 = ((Set)localObject3).contains(localObject5);
            if (bool3)
            {
              localObject5 = "Glide";
              bool3 = Log.isLoggable((String)localObject5, i);
              if (bool3)
              {
                localObject5 = "Glide";
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>();
                String str = "AppGlideModule excludes manifest GlideModule: ";
                localObject6 = ((StringBuilder)localObject6).append(str);
                localObject1 = localObject1;
                Log.d((String)localObject5, (String)localObject1);
              }
              ((Iterator)localObject4).remove();
            }
          }
        }
      }
      localObject1 = "Glide";
      boolean bool2 = Log.isLoggable((String)localObject1, i);
      if (bool2)
      {
        localObject3 = ((List)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (GlideModule)((Iterator)localObject3).next();
          localObject4 = "Glide";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject6 = "Discovered GlideModule from manifest: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject1 = localObject1.getClass();
          localObject1 = localObject1;
          Log.d((String)localObject4, (String)localObject1);
        }
      }
      if (localGeneratedAppGlideModule != null) {}
      for (localObject1 = localGeneratedAppGlideModule.getRequestManagerFactory();; localObject1 = null)
      {
        paramGlideBuilder.setRequestManagerFactory((RequestManagerRetriever.RequestManagerFactory)localObject1);
        localObject3 = ((List)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (GlideModule)((Iterator)localObject3).next();
          ((GlideModule)localObject1).applyOptions(localContext, paramGlideBuilder);
        }
        bool2 = false;
      }
      if (localGeneratedAppGlideModule != null) {
        localGeneratedAppGlideModule.applyOptions(localContext, paramGlideBuilder);
      }
      Object localObject3 = paramGlideBuilder.build(localContext);
      localObject2 = ((List)localObject2).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (GlideModule)((Iterator)localObject2).next();
        localObject4 = ((Glide)localObject3).registry;
        ((GlideModule)localObject1).registerComponents(localContext, (Glide)localObject3, (Registry)localObject4);
      }
      if (localGeneratedAppGlideModule != null)
      {
        localObject1 = ((Glide)localObject3).registry;
        localGeneratedAppGlideModule.registerComponents(localContext, (Glide)localObject3, (Registry)localObject1);
      }
      localContext.registerComponentCallbacks((ComponentCallbacks)localObject3);
      glide = (Glide)localObject3;
      return;
    }
  }
  
  public static void tearDown()
  {
    synchronized (Glide.class)
    {
      Object localObject1 = glide;
      if (localObject1 != null)
      {
        localObject1 = glide;
        localObject1 = ((Glide)localObject1).getContext();
        localObject1 = ((Context)localObject1).getApplicationContext();
        Glide localGlide = glide;
        ((Context)localObject1).unregisterComponentCallbacks(localGlide);
        localObject1 = glide;
        localObject1 = ((Glide)localObject1).engine;
        ((Engine)localObject1).shutdown();
      }
      localObject1 = null;
      glide = null;
      return;
    }
  }
  
  private static void throwIncorrectGlideModule(Exception paramException)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", paramException);
    throw localIllegalStateException;
  }
  
  public static RequestManager with(Activity paramActivity)
  {
    return getRetriever(paramActivity).get(paramActivity);
  }
  
  public static RequestManager with(android.app.Fragment paramFragment)
  {
    return getRetriever(paramFragment.getActivity()).get(paramFragment);
  }
  
  public static RequestManager with(Context paramContext)
  {
    return getRetriever(paramContext).get(paramContext);
  }
  
  public static RequestManager with(android.support.v4.app.Fragment paramFragment)
  {
    return getRetriever(paramFragment.getActivity()).get(paramFragment);
  }
  
  public static RequestManager with(i parami)
  {
    return getRetriever(parami).get(parami);
  }
  
  public static RequestManager with(View paramView)
  {
    return getRetriever(paramView.getContext()).get(paramView);
  }
  
  public void clearDiskCache()
  {
    Util.assertBackgroundThread();
    this.engine.clearDiskCache();
  }
  
  public void clearMemory()
  {
    Util.assertMainThread();
    this.memoryCache.clearMemory();
    this.bitmapPool.clearMemory();
    this.arrayPool.clearMemory();
  }
  
  public ArrayPool getArrayPool()
  {
    return this.arrayPool;
  }
  
  public BitmapPool getBitmapPool()
  {
    return this.bitmapPool;
  }
  
  ConnectivityMonitorFactory getConnectivityMonitorFactory()
  {
    return this.connectivityMonitorFactory;
  }
  
  public Context getContext()
  {
    return this.glideContext.getBaseContext();
  }
  
  GlideContext getGlideContext()
  {
    return this.glideContext;
  }
  
  public Registry getRegistry()
  {
    return this.registry;
  }
  
  public RequestManagerRetriever getRequestManagerRetriever()
  {
    return this.requestManagerRetriever;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory()
  {
    clearMemory();
  }
  
  public void onTrimMemory(int paramInt)
  {
    trimMemory(paramInt);
  }
  
  public void preFillBitmapPool(PreFillType.Builder... paramVarArgs)
  {
    this.bitmapPreFiller.preFill(paramVarArgs);
  }
  
  void registerRequestManager(RequestManager paramRequestManager)
  {
    synchronized (this.managers)
    {
      Object localObject1 = this.managers;
      boolean bool = ((List)localObject1).contains(paramRequestManager);
      if (bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        String str = "Cannot register already registered manager";
        ((IllegalStateException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    List localList2 = this.managers;
    localList2.add(paramRequestManager);
  }
  
  boolean removeFromManagers(Target paramTarget)
  {
    synchronized (this.managers)
    {
      Object localObject1 = this.managers;
      Iterator localIterator = ((List)localObject1).iterator();
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (RequestManager)localObject1;
        bool = ((RequestManager)localObject1).untrack(paramTarget);
      } while (!bool);
      boolean bool = true;
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public MemoryCategory setMemoryCategory(MemoryCategory paramMemoryCategory)
  {
    Util.assertMainThread();
    Object localObject = this.memoryCache;
    float f = paramMemoryCategory.getMultiplier();
    ((MemoryCache)localObject).setSizeMultiplier(f);
    localObject = this.bitmapPool;
    f = paramMemoryCategory.getMultiplier();
    ((BitmapPool)localObject).setSizeMultiplier(f);
    localObject = this.memoryCategory;
    this.memoryCategory = paramMemoryCategory;
    return (MemoryCategory)localObject;
  }
  
  public void trimMemory(int paramInt)
  {
    Util.assertMainThread();
    this.memoryCache.trimMemory(paramInt);
    this.bitmapPool.trimMemory(paramInt);
    this.arrayPool.trimMemory(paramInt);
  }
  
  void unregisterRequestManager(RequestManager paramRequestManager)
  {
    synchronized (this.managers)
    {
      Object localObject1 = this.managers;
      boolean bool = ((List)localObject1).contains(paramRequestManager);
      if (!bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        String str = "Cannot unregister not yet registered manager";
        ((IllegalStateException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    List localList2 = this.managers;
    localList2.remove(paramRequestManager);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\Glide.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */