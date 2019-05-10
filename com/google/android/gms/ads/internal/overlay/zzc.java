package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzmq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class zzc
  extends zzi
  implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map zzDN;
  private final zzt zzDO;
  private int zzDP = 0;
  private int zzDQ = 0;
  private MediaPlayer zzDR;
  private Uri zzDS;
  private int zzDT;
  private int zzDU;
  private int zzDV;
  private int zzDW;
  private int zzDX;
  private float zzDY = 1.0F;
  private boolean zzDZ;
  private boolean zzEa;
  private int zzEb;
  private zzh zzEc;
  
  static
  {
    int i = 1;
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzDN = (Map)localObject;
    localObject = zzDN;
    Integer localInteger = Integer.valueOf(64532);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_IO");
    localObject = zzDN;
    localInteger = Integer.valueOf(64529);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_MALFORMED");
    localObject = zzDN;
    localInteger = Integer.valueOf(64526);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_UNSUPPORTED");
    localObject = zzDN;
    localInteger = Integer.valueOf(-110);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_TIMED_OUT");
    localObject = zzDN;
    localInteger = Integer.valueOf(100);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_SERVER_DIED");
    localObject = zzDN;
    localInteger = Integer.valueOf(i);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_UNKNOWN");
    localObject = zzDN;
    localInteger = Integer.valueOf(i);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_UNKNOWN");
    localObject = zzDN;
    localInteger = Integer.valueOf(700);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    localObject = zzDN;
    localInteger = Integer.valueOf(3);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_VIDEO_RENDERING_START");
    localObject = zzDN;
    localInteger = Integer.valueOf(701);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_BUFFERING_START");
    localObject = zzDN;
    localInteger = Integer.valueOf(702);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_BUFFERING_END");
    localObject = zzDN;
    localInteger = Integer.valueOf(800);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_BAD_INTERLEAVING");
    localObject = zzDN;
    localInteger = Integer.valueOf(801);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_NOT_SEEKABLE");
    localObject = zzDN;
    localInteger = Integer.valueOf(802);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_METADATA_UPDATE");
    localObject = zzDN;
    localInteger = Integer.valueOf(901);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
    localObject = zzDN;
    localInteger = Integer.valueOf(902);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
  }
  
  public zzc(Context paramContext, zzt paramzzt)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.zzDO = paramzzt;
    this.zzDO.zza(this);
  }
  
  private void zzb(float paramFloat)
  {
    Object localObject = this.zzDR;
    if (localObject != null) {}
    for (;;)
    {
      try
      {
        localObject = this.zzDR;
        ((MediaPlayer)localObject).setVolume(paramFloat, paramFloat);
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        continue;
      }
      localObject = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().";
      zzin.zzaK((String)localObject);
    }
  }
  
  private void zzfa()
  {
    int i = 1;
    zzin.v("AdMediaPlayerView init MediaPlayer");
    Object localObject1 = getSurfaceTexture();
    Object localObject2 = this.zzDS;
    if ((localObject2 == null) || (localObject1 == null)) {}
    for (;;)
    {
      return;
      zzv(false);
      try
      {
        localObject2 = new android/media/MediaPlayer;
        ((MediaPlayer)localObject2).<init>();
        this.zzDR = ((MediaPlayer)localObject2);
        localObject2 = this.zzDR;
        ((MediaPlayer)localObject2).setOnBufferingUpdateListener(this);
        localObject2 = this.zzDR;
        ((MediaPlayer)localObject2).setOnCompletionListener(this);
        localObject2 = this.zzDR;
        ((MediaPlayer)localObject2).setOnErrorListener(this);
        localObject2 = this.zzDR;
        ((MediaPlayer)localObject2).setOnInfoListener(this);
        localObject2 = this.zzDR;
        ((MediaPlayer)localObject2).setOnPreparedListener(this);
        localObject2 = this.zzDR;
        ((MediaPlayer)localObject2).setOnVideoSizeChangedListener(this);
        int j = 0;
        localObject2 = null;
        this.zzDV = 0;
        localObject2 = this.zzDR;
        localObject3 = getContext();
        Uri localUri = this.zzDS;
        ((MediaPlayer)localObject2).setDataSource((Context)localObject3, localUri);
        localObject2 = this.zzDR;
        localObject3 = new android/view/Surface;
        ((Surface)localObject3).<init>((SurfaceTexture)localObject1);
        ((MediaPlayer)localObject2).setSurface((Surface)localObject3);
        localObject1 = this.zzDR;
        j = 3;
        ((MediaPlayer)localObject1).setAudioStreamType(j);
        localObject1 = this.zzDR;
        j = 1;
        ((MediaPlayer)localObject1).setScreenOnWhilePlaying(j);
        localObject1 = this.zzDR;
        ((MediaPlayer)localObject1).prepareAsync();
        int k = 1;
        zzw(k);
      }
      catch (IOException localIOException)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Failed to initialize MediaPlayer at ");
        Object localObject3 = this.zzDS;
        localObject2 = localObject3;
        zzin.zzd((String)localObject2, localIOException);
        MediaPlayer localMediaPlayer = this.zzDR;
        onError(localMediaPlayer, i, 0);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  private void zzfb()
  {
    boolean bool1 = zzfe();
    if (bool1)
    {
      MediaPlayer localMediaPlayer = this.zzDR;
      int i = localMediaPlayer.getCurrentPosition();
      if (i > 0)
      {
        i = this.zzDQ;
        int j = 3;
        if (i != j)
        {
          zzin.v("AdMediaPlayerView nudging MediaPlayer");
          zzb(0.0F);
          this.zzDR.start();
          localMediaPlayer = this.zzDR;
          i = localMediaPlayer.getCurrentPosition();
          Object localObject = zzr.zzbG();
          long l1 = ((zzmq)localObject).currentTimeMillis();
          boolean bool3;
          do
          {
            boolean bool2 = zzfe();
            if (!bool2) {
              break;
            }
            localObject = this.zzDR;
            int k = ((MediaPlayer)localObject).getCurrentPosition();
            if (k != i) {
              break;
            }
            localObject = zzr.zzbG();
            long l2 = ((zzmq)localObject).currentTimeMillis() - l1;
            long l3 = 250L;
            bool3 = l2 < l3;
          } while (!bool3);
          localMediaPlayer = this.zzDR;
          localMediaPlayer.pause();
          zzfj();
        }
      }
    }
  }
  
  private void zzfc()
  {
    Object localObject = zzfk();
    if (localObject != null)
    {
      int i = this.zzEa;
      if (i == 0)
      {
        int j = 2;
        int k = ((AudioManager)localObject).requestAudioFocus(this, 3, j);
        i = 1;
        if (k != i) {
          break label42;
        }
        zzfh();
      }
    }
    for (;;)
    {
      return;
      label42:
      localObject = "AdMediaPlayerView audio focus request failed";
      zzin.zzaK((String)localObject);
    }
  }
  
  private void zzfd()
  {
    zzin.v("AdMediaPlayerView abandon audio focus");
    Object localObject = zzfk();
    if (localObject != null)
    {
      int i = this.zzEa;
      if (i != 0)
      {
        int j = ((AudioManager)localObject).abandonAudioFocus(this);
        i = 1;
        if (j != i) {
          break label47;
        }
        int k = 0;
        localObject = null;
        this.zzEa = false;
      }
    }
    for (;;)
    {
      return;
      label47:
      localObject = "AdMediaPlayerView abandon audio focus failed";
      zzin.zzaK((String)localObject);
    }
  }
  
  private boolean zzfe()
  {
    int i = 1;
    MediaPlayer localMediaPlayer = this.zzDR;
    if (localMediaPlayer != null)
    {
      int j = this.zzDP;
      int k = -1;
      if (j != k)
      {
        j = this.zzDP;
        if (j != 0)
        {
          j = this.zzDP;
          if (j == i) {}
        }
      }
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private void zzfh()
  {
    zzin.v("AdMediaPlayerView audio focus gained");
    this.zzEa = true;
    zzfj();
  }
  
  private void zzfi()
  {
    zzin.v("AdMediaPlayerView audio focus lost");
    this.zzEa = false;
    zzfj();
  }
  
  private void zzfj()
  {
    boolean bool = this.zzDZ;
    float f;
    if (!bool)
    {
      bool = this.zzEa;
      if (bool)
      {
        f = this.zzDY;
        zzb(f);
      }
    }
    for (;;)
    {
      return;
      bool = false;
      f = 0.0F;
      zzb(0.0F);
    }
  }
  
  private AudioManager zzfk()
  {
    return (AudioManager)getContext().getSystemService("audio");
  }
  
  private void zzv(boolean paramBoolean)
  {
    zzin.v("AdMediaPlayerView release");
    MediaPlayer localMediaPlayer = this.zzDR;
    if (localMediaPlayer != null)
    {
      this.zzDR.reset();
      this.zzDR.release();
      localMediaPlayer = null;
      this.zzDR = null;
      zzw(0);
      if (paramBoolean)
      {
        this.zzDQ = 0;
        zzx(0);
      }
      zzfd();
    }
  }
  
  private void zzw(int paramInt)
  {
    int i = 3;
    zzt localzzt;
    if (paramInt == i)
    {
      localzzt = this.zzDO;
      localzzt.zzfO();
    }
    for (;;)
    {
      this.zzDP = paramInt;
      return;
      int j = this.zzDP;
      if ((j == i) && (paramInt != i))
      {
        localzzt = this.zzDO;
        localzzt.zzfP();
      }
    }
  }
  
  private void zzx(int paramInt)
  {
    this.zzDQ = paramInt;
  }
  
  public int getCurrentPosition()
  {
    boolean bool = zzfe();
    MediaPlayer localMediaPlayer;
    int i;
    if (bool)
    {
      localMediaPlayer = this.zzDR;
      i = localMediaPlayer.getCurrentPosition();
    }
    for (;;)
    {
      return i;
      i = 0;
      localMediaPlayer = null;
    }
  }
  
  public int getDuration()
  {
    boolean bool = zzfe();
    MediaPlayer localMediaPlayer;
    if (bool) {
      localMediaPlayer = this.zzDR;
    }
    for (int i = localMediaPlayer.getDuration();; i = -1) {
      return i;
    }
  }
  
  public int getVideoHeight()
  {
    MediaPlayer localMediaPlayer = this.zzDR;
    int i;
    if (localMediaPlayer != null)
    {
      localMediaPlayer = this.zzDR;
      i = localMediaPlayer.getVideoHeight();
    }
    for (;;)
    {
      return i;
      i = 0;
      localMediaPlayer = null;
    }
  }
  
  public int getVideoWidth()
  {
    MediaPlayer localMediaPlayer = this.zzDR;
    int i;
    if (localMediaPlayer != null)
    {
      localMediaPlayer = this.zzDR;
      i = localMediaPlayer.getVideoWidth();
    }
    for (;;)
    {
      return i;
      i = 0;
      localMediaPlayer = null;
    }
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0) {
      zzfh();
    }
    for (;;)
    {
      return;
      if (paramInt < 0) {
        zzfi();
      }
    }
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.zzDV = paramInt;
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    int i = 5;
    zzin.v("AdMediaPlayerView completion");
    zzw(i);
    zzx(i);
    Handler localHandler = zzir.zzMc;
    zzc.2 local2 = new com/google/android/gms/ads/internal/overlay/zzc$2;
    local2.<init>(this);
    localHandler.post(local2);
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    int i = -1;
    Object localObject1 = zzDN;
    Object localObject2 = Integer.valueOf(paramInt1);
    localObject1 = (String)((Map)localObject1).get(localObject2);
    localObject2 = zzDN;
    Object localObject3 = Integer.valueOf(paramInt2);
    localObject2 = (String)((Map)localObject2).get(localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    zzin.zzaK("AdMediaPlayerView MediaPlayer error: " + (String)localObject1 + ":" + (String)localObject2);
    zzw(i);
    zzx(i);
    localObject3 = zzir.zzMc;
    zzc.3 local3 = new com/google/android/gms/ads/internal/overlay/zzc$3;
    local3.<init>(this, (String)localObject1, (String)localObject2);
    ((Handler)localObject3).post(local3);
    return true;
  }
  
  public boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object localObject1 = zzDN;
    Object localObject2 = Integer.valueOf(paramInt1);
    localObject1 = (String)((Map)localObject1).get(localObject2);
    localObject2 = zzDN;
    Object localObject3 = Integer.valueOf(paramInt2);
    localObject2 = (String)((Map)localObject2).get(localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    zzin.v("AdMediaPlayerView MediaPlayer info: " + (String)localObject1 + ":" + (String)localObject2);
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    int j = -1 << -1;
    int k = getDefaultSize(this.zzDT, paramInt1);
    int m = getDefaultSize(this.zzDU, paramInt2);
    int n = this.zzDT;
    int i1;
    int i2;
    if (n > 0)
    {
      n = this.zzDU;
      if (n > 0)
      {
        i1 = View.MeasureSpec.getMode(paramInt1);
        n = View.MeasureSpec.getSize(paramInt1);
        i2 = View.MeasureSpec.getMode(paramInt2);
        m = View.MeasureSpec.getSize(paramInt2);
        if ((i1 != i) || (i2 != i)) {
          break label271;
        }
        k = this.zzDT * m;
        i = this.zzDU * n;
        if (k >= i) {
          break label219;
        }
        k = this.zzDT * m;
        n = this.zzDU;
        k /= n;
      }
    }
    for (;;)
    {
      setMeasuredDimension(k, m);
      n = Build.VERSION.SDK_INT;
      i = 16;
      if (n == i)
      {
        n = this.zzDW;
        if (n > 0)
        {
          n = this.zzDW;
          if (n != k) {}
        }
        else
        {
          n = this.zzDX;
          if (n <= 0) {
            break label206;
          }
          n = this.zzDX;
          if (n == m) {
            break label206;
          }
        }
        zzfb();
        label206:
        this.zzDW = k;
        this.zzDX = m;
      }
      return;
      label219:
      k = this.zzDT * m;
      i = this.zzDU * n;
      if (k > i)
      {
        m = this.zzDU * n;
        k = this.zzDT;
        m /= k;
        k = n;
        continue;
        label271:
        if (i1 == i)
        {
          k = this.zzDU * n;
          i = this.zzDT;
          k /= i;
          if ((i2 == j) && (k > m)) {
            k = n;
          }
        }
        else
        {
          if (i2 == i)
          {
            k = this.zzDT * m;
            i = this.zzDU;
            k /= i;
            if ((i1 != j) || (k <= n)) {
              continue;
            }
            k = n;
            continue;
          }
          i = this.zzDT;
          k = this.zzDU;
          if ((i2 == j) && (k > m))
          {
            k = this.zzDT * m;
            i = this.zzDU;
            k /= i;
          }
          for (;;)
          {
            if ((i1 != j) || (k <= n)) {
              break label461;
            }
            m = this.zzDU * n;
            k = this.zzDT;
            m /= k;
            k = n;
            break;
            m = k;
            k = i;
          }
          label461:
          continue;
        }
        m = k;
        k = n;
      }
      else
      {
        k = n;
      }
    }
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    zzin.v("AdMediaPlayerView prepared");
    zzw(2);
    this.zzDO.zzfz();
    Object localObject1 = zzir.zzMc;
    Object localObject2 = new com/google/android/gms/ads/internal/overlay/zzc$1;
    ((zzc.1)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
    int i = paramMediaPlayer.getVideoWidth();
    this.zzDT = i;
    i = paramMediaPlayer.getVideoHeight();
    this.zzDU = i;
    i = this.zzEb;
    if (i != 0)
    {
      i = this.zzEb;
      seekTo(i);
    }
    zzfb();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("AdMediaPlayerView stream dimensions: ");
    int j = this.zzDT;
    localObject1 = ((StringBuilder)localObject1).append(j);
    localObject2 = " x ";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    j = this.zzDU;
    localObject1 = j;
    zzin.zzaJ((String)localObject1);
    i = this.zzDQ;
    j = 3;
    if (i == j) {
      play();
    }
    zzfc();
    zzfj();
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    zzin.v("AdMediaPlayerView surface created");
    zzfa();
    Handler localHandler = zzir.zzMc;
    zzc.4 local4 = new com/google/android/gms/ads/internal/overlay/zzc$4;
    local4.<init>(this);
    localHandler.post(local4);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = true;
    zzin.v("AdMediaPlayerView surface destroyed");
    Object localObject = this.zzDR;
    if (localObject != null)
    {
      int i = this.zzEb;
      if (i == 0)
      {
        localObject = this.zzDR;
        i = ((MediaPlayer)localObject).getCurrentPosition();
        this.zzEb = i;
      }
    }
    localObject = zzir.zzMc;
    zzc.5 local5 = new com/google/android/gms/ads/internal/overlay/zzc$5;
    local5.<init>(this);
    ((Handler)localObject).post(local5);
    zzv(bool);
    return bool;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    int i = 1;
    MediaPlayer localMediaPlayer = null;
    String str = "AdMediaPlayerView surface changed";
    zzin.v(str);
    int j = this.zzDQ;
    int k = 3;
    if (j == k)
    {
      j = i;
      k = this.zzDT;
      if (k != paramInt1) {
        break label118;
      }
      k = this.zzDU;
      if (k != paramInt2) {
        break label118;
      }
    }
    for (;;)
    {
      localMediaPlayer = this.zzDR;
      if ((localMediaPlayer != null) && (j != 0) && (i != 0))
      {
        j = this.zzEb;
        if (j != 0)
        {
          j = this.zzEb;
          seekTo(j);
        }
        play();
      }
      return;
      j = 0;
      str = null;
      break;
      label118:
      i = 0;
    }
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.zzDO.zzb(this);
  }
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("AdMediaPlayerView size changed: ").append(paramInt1);
    String str = " x ";
    localObject = str + paramInt2;
    zzin.v((String)localObject);
    int i = paramMediaPlayer.getVideoWidth();
    this.zzDT = i;
    i = paramMediaPlayer.getVideoHeight();
    this.zzDU = i;
    i = this.zzDT;
    if (i != 0)
    {
      i = this.zzDU;
      if (i != 0) {
        requestLayout();
      }
    }
  }
  
  public void pause()
  {
    int i = 4;
    Object localObject = "AdMediaPlayerView pause";
    zzin.v((String)localObject);
    boolean bool = zzfe();
    if (bool)
    {
      localObject = this.zzDR;
      bool = ((MediaPlayer)localObject).isPlaying();
      if (bool)
      {
        this.zzDR.pause();
        zzw(i);
        localObject = zzir.zzMc;
        zzc.7 local7 = new com/google/android/gms/ads/internal/overlay/zzc$7;
        local7.<init>(this);
        ((Handler)localObject).post(local7);
      }
    }
    zzx(i);
  }
  
  public void play()
  {
    int i = 3;
    Object localObject = "AdMediaPlayerView play";
    zzin.v((String)localObject);
    boolean bool = zzfe();
    if (bool)
    {
      this.zzDR.start();
      zzw(i);
      localObject = zzir.zzMc;
      zzc.6 local6 = new com/google/android/gms/ads/internal/overlay/zzc$6;
      local6.<init>(this);
      ((Handler)localObject).post(local6);
    }
    zzx(i);
  }
  
  public void seekTo(int paramInt)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = "AdMediaPlayerView seek ";
    localObject = str + paramInt;
    zzin.v((String)localObject);
    boolean bool = zzfe();
    if (bool)
    {
      this.zzDR.seekTo(paramInt);
      bool = false;
      localObject = null;
    }
    for (this.zzEb = 0;; this.zzEb = paramInt) {
      return;
    }
  }
  
  public void setMimeType(String paramString) {}
  
  public void setVideoPath(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    setVideoURI(localUri);
  }
  
  public void setVideoURI(Uri paramUri)
  {
    this.zzDS = paramUri;
    this.zzEb = 0;
    zzfa();
    requestLayout();
    invalidate();
  }
  
  public void stop()
  {
    zzin.v("AdMediaPlayerView stop");
    MediaPlayer localMediaPlayer = this.zzDR;
    if (localMediaPlayer != null)
    {
      this.zzDR.stop();
      this.zzDR.release();
      localMediaPlayer = null;
      this.zzDR = null;
      zzw(0);
      zzx(0);
      zzfd();
    }
    this.zzDO.onStop();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getClass().getName();
    localStringBuilder = localStringBuilder.append(str).append("@");
    str = Integer.toHexString(hashCode());
    return str;
  }
  
  public void zza(float paramFloat)
  {
    this.zzDY = paramFloat;
    zzfj();
  }
  
  public void zza(zzh paramzzh)
  {
    this.zzEc = paramzzh;
  }
  
  public String zzeZ()
  {
    return "MediaPlayer";
  }
  
  public void zzff()
  {
    this.zzDZ = true;
    zzfj();
  }
  
  public void zzfg()
  {
    this.zzDZ = false;
    zzfj();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */