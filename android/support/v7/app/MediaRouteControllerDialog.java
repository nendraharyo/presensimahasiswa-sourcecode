package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.a;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.attr;
import android.support.v7.mediarouter.R.id;
import android.support.v7.mediarouter.R.layout;
import android.support.v7.mediarouter.R.string;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MediaRouteControllerDialog
  extends AlertDialog
{
  private static final String TAG = "MediaRouteControllerDialog";
  private static final int VOLUME_UPDATE_DELAY_MILLIS = 250;
  private ImageView mArtView;
  private boolean mAttachedToWindow;
  private final MediaRouteControllerDialog.MediaRouterCallback mCallback;
  private View mControlView;
  private MediaRouteControllerDialog.MediaControllerCallback mControllerCallback;
  private boolean mCreated;
  private MediaDescriptionCompat mDescription;
  private Button mDisconnectButton;
  private MediaControllerCompat mMediaController;
  private Drawable mMediaRouteConnectingDrawable;
  private Drawable mMediaRouteOnDrawable;
  private ImageButton mPlayPauseButton;
  private final MediaRouter.RouteInfo mRoute;
  private TextView mRouteNameView;
  private final MediaRouter mRouter;
  private ImageButton mSettingsButton;
  private PlaybackStateCompat mState;
  private Button mStopCastingButton;
  private TextView mSubtitleView;
  private TextView mTitleView;
  private boolean mVolumeControlEnabled = true;
  private LinearLayout mVolumeLayout;
  private SeekBar mVolumeSlider;
  private boolean mVolumeSliderTouched;
  
  public MediaRouteControllerDialog(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteControllerDialog(Context paramContext, int paramInt)
  {
    super((Context)localObject, paramInt);
    localObject = getContext();
    MediaRouteControllerDialog.MediaControllerCallback localMediaControllerCallback = new android/support/v7/app/MediaRouteControllerDialog$MediaControllerCallback;
    localMediaControllerCallback.<init>(this, null);
    this.mControllerCallback = localMediaControllerCallback;
    localObject = MediaRouter.getInstance((Context)localObject);
    this.mRouter = ((MediaRouter)localObject);
    localObject = new android/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;
    ((MediaRouteControllerDialog.MediaRouterCallback)localObject).<init>(this, null);
    this.mCallback = ((MediaRouteControllerDialog.MediaRouterCallback)localObject);
    localObject = this.mRouter.getSelectedRoute();
    this.mRoute = ((MediaRouter.RouteInfo)localObject);
    localObject = this.mRouter.getMediaSessionToken();
    setMediaSession((MediaSessionCompat.Token)localObject);
  }
  
  private Drawable getIconDrawable()
  {
    Object localObject = this.mRoute;
    boolean bool = ((MediaRouter.RouteInfo)localObject).isConnecting();
    int i;
    if (bool)
    {
      localObject = this.mMediaRouteConnectingDrawable;
      if (localObject == null)
      {
        localObject = getContext();
        i = R.attr.mediaRouteConnectingDrawable;
        localObject = MediaRouterThemeHelper.getThemeDrawable((Context)localObject, i);
        this.mMediaRouteConnectingDrawable = ((Drawable)localObject);
      }
    }
    for (localObject = this.mMediaRouteConnectingDrawable;; localObject = this.mMediaRouteOnDrawable)
    {
      return (Drawable)localObject;
      localObject = this.mMediaRouteOnDrawable;
      if (localObject == null)
      {
        localObject = getContext();
        i = R.attr.mediaRouteOnDrawable;
        localObject = MediaRouterThemeHelper.getThemeDrawable((Context)localObject, i);
        this.mMediaRouteOnDrawable = ((Drawable)localObject);
      }
    }
  }
  
  private boolean isVolumeControlAvailable()
  {
    int i = 1;
    boolean bool = this.mVolumeControlEnabled;
    if (bool)
    {
      MediaRouter.RouteInfo localRouteInfo = this.mRoute;
      int j = localRouteInfo.getVolumeHandling();
      if (j != i) {}
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private void setMediaSession(MediaSessionCompat.Token paramToken)
  {
    localPlaybackStateCompat = null;
    MediaControllerCompat localMediaControllerCompat = this.mMediaController;
    if (localMediaControllerCompat != null)
    {
      localMediaControllerCompat = this.mMediaController;
      localObject2 = this.mControllerCallback;
      localMediaControllerCompat.b((MediaControllerCompat.a)localObject2);
      this.mMediaController = null;
    }
    if (paramToken == null) {}
    for (;;)
    {
      return;
      boolean bool = this.mAttachedToWindow;
      if (bool) {}
      try
      {
        localMediaControllerCompat = new android/support/v4/media/session/MediaControllerCompat;
        localObject2 = getContext();
        localMediaControllerCompat.<init>((Context)localObject2, paramToken);
        this.mMediaController = localMediaControllerCompat;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          localObject2 = "MediaRouteControllerDialog";
          String str = "Error creating media controller in setMediaSession.";
          Log.e((String)localObject2, str, localRemoteException);
          continue;
          Object localObject1 = this.mMediaController.c();
          continue;
          localObject1 = ((MediaMetadataCompat)localObject1).a();
          continue;
          localObject1 = this.mMediaController;
          localPlaybackStateCompat = ((MediaControllerCompat)localObject1).b();
        }
      }
      localMediaControllerCompat = this.mMediaController;
      if (localMediaControllerCompat != null)
      {
        localMediaControllerCompat = this.mMediaController;
        localObject2 = this.mControllerCallback;
        localMediaControllerCompat.a((MediaControllerCompat.a)localObject2);
      }
      localMediaControllerCompat = this.mMediaController;
      if (localMediaControllerCompat != null) {
        break;
      }
      bool = false;
      localMediaControllerCompat = null;
      if (localMediaControllerCompat != null) {
        break label179;
      }
      bool = false;
      localMediaControllerCompat = null;
      this.mDescription = localMediaControllerCompat;
      localMediaControllerCompat = this.mMediaController;
      if (localMediaControllerCompat != null) {
        break label187;
      }
      this.mState = localPlaybackStateCompat;
      update();
    }
  }
  
  private boolean update()
  {
    long l1 = 0L;
    int i = 0;
    Object localObject1 = null;
    int k = 1;
    int m = 8;
    boolean bool2 = false;
    Object localObject2 = this.mRoute;
    boolean bool3 = ((MediaRouter.RouteInfo)localObject2).isSelected();
    if (bool3)
    {
      localObject2 = this.mRoute;
      bool3 = ((MediaRouter.RouteInfo)localObject2).isDefault();
      if (!bool3) {}
    }
    else
    {
      dismiss();
    }
    do
    {
      return bool2;
      bool3 = this.mCreated;
    } while (!bool3);
    updateVolume();
    localObject2 = this.mRouteNameView;
    Object localObject3 = this.mRoute.getName();
    ((TextView)localObject2).setText((CharSequence)localObject3);
    localObject2 = this.mRoute;
    bool3 = ((MediaRouter.RouteInfo)localObject2).canDisconnect();
    label127:
    label153:
    label223:
    label240:
    label256:
    MediaDescriptionCompat localMediaDescriptionCompat;
    label267:
    boolean bool5;
    label283:
    int n;
    label396:
    label433:
    label473:
    int i1;
    int j;
    if (bool3)
    {
      localObject2 = this.mDisconnectButton;
      ((Button)localObject2).setVisibility(0);
      localObject2 = this.mRoute.getSettingsIntent();
      if (localObject2 == null) {
        break label581;
      }
      localObject2 = this.mSettingsButton;
      ((ImageButton)localObject2).setVisibility(0);
      localObject2 = this.mControlView;
      if (localObject2 == null)
      {
        localObject2 = this.mDescription;
        if (localObject2 == null) {
          break label597;
        }
        localObject2 = this.mDescription.c();
        if (localObject2 == null) {
          break label597;
        }
        localObject2 = this.mArtView;
        localObject3 = this.mDescription.c();
        ((ImageView)localObject2).setImageBitmap((Bitmap)localObject3);
        localObject2 = this.mArtView;
        ((ImageView)localObject2).setVisibility(0);
        localObject2 = this.mDescription;
        if (localObject2 != null) {
          break label683;
        }
        bool3 = false;
        localObject2 = null;
        boolean bool4 = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool4) {
          break label695;
        }
        bool4 = k;
        localMediaDescriptionCompat = this.mDescription;
        if (localMediaDescriptionCompat != null) {
          break label704;
        }
        bool5 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool5) {
          break label716;
        }
        bool5 = k;
        if ((bool4) || (bool5)) {
          break label725;
        }
        localObject2 = this.mTitleView;
        i = R.string.mr_media_route_controller_no_info_available;
        ((TextView)localObject2).setText(i);
        this.mTitleView.setEnabled(false);
        this.mTitleView.setVisibility(0);
        localObject2 = this.mSubtitleView;
        ((TextView)localObject2).setVisibility(m);
        localObject2 = this.mState;
        if (localObject2 == null) {
          break label954;
        }
        localObject2 = this.mState;
        n = ((PlaybackStateCompat)localObject2).a();
        i = 6;
        if (n != i)
        {
          localObject2 = this.mState;
          n = ((PlaybackStateCompat)localObject2).a();
          i = 3;
          if (n != i) {
            break label825;
          }
        }
        n = k;
        localObject1 = this.mState;
        long l2 = ((PlaybackStateCompat)localObject1).b();
        long l3 = 516L;
        l2 &= l3;
        boolean bool1 = l2 < l1;
        if (!bool1) {
          break label834;
        }
        bool1 = k;
        localObject3 = this.mState;
        l2 = ((PlaybackStateCompat)localObject3).b();
        l3 = 514L;
        l2 &= l3;
        bool4 = l2 < l1;
        if (!bool4) {
          break label842;
        }
        bool4 = k;
        if ((n == 0) || (!bool4)) {
          break label851;
        }
        this.mPlayPauseButton.setVisibility(0);
        localObject2 = this.mPlayPauseButton;
        localObject1 = getContext();
        i1 = R.attr.mediaRoutePauseDrawable;
        j = MediaRouterThemeHelper.getThemeResource((Context)localObject1, i1);
        ((ImageButton)localObject2).setImageResource(j);
        localObject2 = this.mPlayPauseButton;
        localObject1 = getContext().getResources();
        i1 = R.string.mr_media_route_controller_pause;
        localObject1 = ((Resources)localObject1).getText(i1);
        ((ImageButton)localObject2).setContentDescription((CharSequence)localObject1);
      }
    }
    for (;;)
    {
      bool2 = k;
      break;
      localObject2 = this.mDisconnectButton;
      ((Button)localObject2).setVisibility(m);
      break label127;
      label581:
      localObject2 = this.mSettingsButton;
      ((ImageButton)localObject2).setVisibility(m);
      break label153;
      label597:
      localObject2 = this.mDescription;
      if (localObject2 != null)
      {
        localObject2 = this.mDescription.d();
        if (localObject2 != null)
        {
          localObject2 = this.mArtView;
          localObject3 = this.mDescription.d();
          ((ImageView)localObject2).setImageURI((Uri)localObject3);
          localObject2 = this.mArtView;
          ((ImageView)localObject2).setVisibility(0);
          break label223;
        }
      }
      this.mArtView.setImageDrawable(null);
      localObject2 = this.mArtView;
      ((ImageView)localObject2).setVisibility(m);
      break label223;
      label683:
      localObject2 = this.mDescription.a();
      break label240;
      label695:
      i1 = 0;
      localObject3 = null;
      break label256;
      label704:
      localObject1 = this.mDescription.b();
      break label267;
      label716:
      bool5 = false;
      localMediaDescriptionCompat = null;
      break label283;
      label725:
      this.mTitleView.setText((CharSequence)localObject2);
      localObject2 = this.mTitleView;
      ((TextView)localObject2).setEnabled(i1);
      TextView localTextView = this.mTitleView;
      if (i1 != 0)
      {
        n = 0;
        localObject2 = null;
        label764:
        localTextView.setVisibility(n);
        localObject2 = this.mSubtitleView;
        ((TextView)localObject2).setText((CharSequence)localObject1);
        localObject1 = this.mSubtitleView;
        if (!bool5) {
          break label818;
        }
        n = 0;
        localObject2 = null;
      }
      for (;;)
      {
        ((TextView)localObject1).setVisibility(n);
        break;
        n = m;
        break label764;
        label818:
        n = m;
      }
      label825:
      n = 0;
      localObject2 = null;
      break label396;
      label834:
      j = 0;
      localObject1 = null;
      break label433;
      label842:
      int i2 = 0;
      localObject3 = null;
      break label473;
      label851:
      if ((n == 0) && (j != 0))
      {
        this.mPlayPauseButton.setVisibility(0);
        localObject2 = this.mPlayPauseButton;
        localObject1 = getContext();
        i2 = R.attr.mediaRoutePlayDrawable;
        j = MediaRouterThemeHelper.getThemeResource((Context)localObject1, i2);
        ((ImageButton)localObject2).setImageResource(j);
        localObject2 = this.mPlayPauseButton;
        localObject1 = getContext().getResources();
        i2 = R.string.mr_media_route_controller_play;
        localObject1 = ((Resources)localObject1).getText(i2);
        ((ImageButton)localObject2).setContentDescription((CharSequence)localObject1);
      }
      else
      {
        localObject2 = this.mPlayPauseButton;
        ((ImageButton)localObject2).setVisibility(m);
        continue;
        label954:
        localObject2 = this.mPlayPauseButton;
        ((ImageButton)localObject2).setVisibility(m);
      }
    }
  }
  
  private void updateVolume()
  {
    boolean bool = this.mVolumeSliderTouched;
    Object localObject;
    int i;
    if (!bool)
    {
      bool = isVolumeControlAvailable();
      if (!bool) {
        break label67;
      }
      this.mVolumeLayout.setVisibility(0);
      localObject = this.mVolumeSlider;
      i = this.mRoute.getVolumeMax();
      ((SeekBar)localObject).setMax(i);
      localObject = this.mVolumeSlider;
      MediaRouter.RouteInfo localRouteInfo = this.mRoute;
      i = localRouteInfo.getVolume();
      ((SeekBar)localObject).setProgress(i);
    }
    for (;;)
    {
      return;
      label67:
      localObject = this.mVolumeLayout;
      i = 8;
      ((LinearLayout)localObject).setVisibility(i);
    }
  }
  
  public View getMediaControlView()
  {
    return this.mControlView;
  }
  
  public MediaSessionCompat.Token getMediaSession()
  {
    Object localObject = this.mMediaController;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mMediaController.d()) {
      return (MediaSessionCompat.Token)localObject;
    }
  }
  
  public MediaRouter.RouteInfo getRoute()
  {
    return this.mRoute;
  }
  
  public boolean isVolumeControlEnabled()
  {
    return this.mVolumeControlEnabled;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mAttachedToWindow = true;
    Object localObject = this.mRouter;
    MediaRouteSelector localMediaRouteSelector = MediaRouteSelector.EMPTY;
    MediaRouteControllerDialog.MediaRouterCallback localMediaRouterCallback = this.mCallback;
    ((MediaRouter)localObject).addCallback(localMediaRouteSelector, localMediaRouterCallback, 2);
    localObject = this.mRouter.getMediaSessionToken();
    setMediaSession((MediaSessionCompat.Token)localObject);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = R.layout.mr_media_route_controller_material_dialog_b;
    setContentView(i);
    Object localObject1 = new android/support/v7/app/MediaRouteControllerDialog$ClickListener;
    ((MediaRouteControllerDialog.ClickListener)localObject1).<init>(this, null);
    i = R.id.disconnect;
    Object localObject2 = (Button)findViewById(i);
    this.mDisconnectButton = ((Button)localObject2);
    this.mDisconnectButton.setOnClickListener((View.OnClickListener)localObject1);
    i = R.id.stop;
    localObject2 = (Button)findViewById(i);
    this.mStopCastingButton = ((Button)localObject2);
    this.mStopCastingButton.setOnClickListener((View.OnClickListener)localObject1);
    i = R.id.settings;
    localObject2 = (ImageButton)findViewById(i);
    this.mSettingsButton = ((ImageButton)localObject2);
    this.mSettingsButton.setOnClickListener((View.OnClickListener)localObject1);
    i = R.id.art;
    localObject2 = (ImageView)findViewById(i);
    this.mArtView = ((ImageView)localObject2);
    i = R.id.title;
    localObject2 = (TextView)findViewById(i);
    this.mTitleView = ((TextView)localObject2);
    i = R.id.subtitle;
    localObject2 = (TextView)findViewById(i);
    this.mSubtitleView = ((TextView)localObject2);
    i = R.id.play_pause;
    localObject2 = (ImageButton)findViewById(i);
    this.mPlayPauseButton = ((ImageButton)localObject2);
    this.mPlayPauseButton.setOnClickListener((View.OnClickListener)localObject1);
    i = R.id.route_name;
    localObject2 = (TextView)findViewById(i);
    this.mRouteNameView = ((TextView)localObject2);
    i = R.id.media_route_volume_layout;
    localObject2 = (LinearLayout)findViewById(i);
    this.mVolumeLayout = ((LinearLayout)localObject2);
    i = R.id.media_route_volume_slider;
    localObject2 = (SeekBar)findViewById(i);
    this.mVolumeSlider = ((SeekBar)localObject2);
    localObject2 = this.mVolumeSlider;
    localObject1 = new android/support/v7/app/MediaRouteControllerDialog$1;
    ((MediaRouteControllerDialog.1)localObject1).<init>(this);
    ((SeekBar)localObject2).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)localObject1);
    this.mCreated = true;
    boolean bool = update();
    if (bool)
    {
      localObject2 = onCreateMediaControlView(paramBundle);
      this.mControlView = ((View)localObject2);
      int j = R.id.media_route_control_frame;
      localObject2 = (FrameLayout)findViewById(j);
      localObject1 = this.mControlView;
      if (localObject1 != null)
      {
        int k = R.id.default_control_frame;
        localObject1 = ((FrameLayout)localObject2).findViewById(k);
        int m = 8;
        ((View)localObject1).setVisibility(m);
        localObject1 = this.mControlView;
        ((FrameLayout)localObject2).addView((View)localObject1);
      }
    }
  }
  
  public View onCreateMediaControlView(Bundle paramBundle)
  {
    return null;
  }
  
  public void onDetachedFromWindow()
  {
    MediaRouter localMediaRouter = this.mRouter;
    MediaRouteControllerDialog.MediaRouterCallback localMediaRouterCallback = this.mCallback;
    localMediaRouter.removeCallback(localMediaRouterCallback);
    setMediaSession(null);
    this.mAttachedToWindow = false;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 25;
    int j = 1;
    int k;
    if (paramInt != i)
    {
      k = 24;
      if (paramInt != k) {}
    }
    else
    {
      MediaRouter.RouteInfo localRouteInfo = this.mRoute;
      if (paramInt == i)
      {
        k = -1;
        localRouteInfo.requestUpdateVolume(k);
      }
    }
    for (;;)
    {
      return j;
      k = j;
      break;
      j = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 25;
    if (paramInt != i)
    {
      i = 24;
      if (paramInt != i) {
        break label20;
      }
    }
    label20:
    boolean bool;
    for (i = 1;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return i;
    }
  }
  
  public void setVolumeControlEnabled(boolean paramBoolean)
  {
    boolean bool = this.mVolumeControlEnabled;
    if (bool != paramBoolean)
    {
      this.mVolumeControlEnabled = paramBoolean;
      bool = this.mCreated;
      if (bool) {
        updateVolume();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteControllerDialog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */